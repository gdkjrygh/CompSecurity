// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.util.g;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.util.HttpUtil;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.skype.android.app.signin:
//            AccountsList

public class UnifiedSignInManager
{
    public static class OnApiIfExistsResult
    {

        private String jsonResult;
        private String userId;

        public String getJsonResult()
        {
            return jsonResult;
        }

        public String getUserId()
        {
            return userId;
        }

        public OnApiIfExistsResult(String s, String s1)
        {
            userId = s;
            jsonResult = s1;
        }
    }


    private static final String API_IF_EXISTS_PARAM_CLIENTVERSION = "clientVersion";
    private static final String API_IF_EXISTS_PARAM_USERNAME = "username";
    private static final String API_IF_EXISTS_PATH = "/ifexists";
    private static final String API_IF_EXISTS_REQUEST_HEADER_ACCEPT_KEY = "Accept";
    private static final String API_IF_EXISTS_REQUEST_HEADER_ACCEPT_VALUE = "application/json; ver=2.0";
    private static final String API_IF_EXISTS_TEST_ENV_SKYPE_AUTHORITY = "https://qalogin.skype.net";
    private static final Pattern REGEX_PHONE_SEPARATORS = Pattern.compile("[\\s\\(\\)]");
    private static final Pattern REGEX_POSSIBLE_EMAIL = Pattern.compile(".+@.+\\..+");
    private static final Logger logger = Logger.getLogger("UnifiedSignInManager");
    private Analytics analytics;
    private AnalyticsPersistentStorage analyticsPersistentStorage;
    private AsyncService asyncService;
    private EcsConfiguration ecsConfiguration;
    private EventBus eventBus;
    private HttpUtil httpUtil;
    private final SkyLib lib;
    private Object lock;
    private g searchResultCache;
    private long searchStartedRealtime;

    public UnifiedSignInManager(HttpUtil httputil, AsyncService asyncservice, SkyLib skylib, Analytics analytics1, AnalyticsPersistentStorage analyticspersistentstorage, EventBus eventbus, EcsConfiguration ecsconfiguration)
    {
        lock = new Object();
        eventBus = eventbus;
        httpUtil = httputil;
        asyncService = asyncservice;
        lib = skylib;
        analytics = analytics1;
        analyticsPersistentStorage = analyticspersistentstorage;
        ecsConfiguration = ecsconfiguration;
        clearSearchCache();
    }

    private void performSearch(String s)
    {
        if (!isEmailLike(s) && !isPhoneNumberLike(s)) goto _L2; else goto _L1
_L1:
        String s1 = searchAccounts(s);
_L6:
        s = new OnApiIfExistsResult(s, s1);
        if (!Thread.interrupted())
        {
            eventBus.a(s);
        }
_L4:
        return;
_L2:
        s1 = AccountsList.localSearchResult(s, true);
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        String s2 = obj.getClass().getSimpleName().toString();
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.D);
        skypetelemetryevent.put(LogAttributeName.u, s2);
        analytics.a(skypetelemetryevent);
        s = new OnApiIfExistsResult(s, null);
        if (Thread.interrupted()) goto _L4; else goto _L3
_L3:
        eventBus.a(s);
        return;
        s2;
        s = new OnApiIfExistsResult(s, null);
        if (!Thread.interrupted())
        {
            eventBus.a(s);
        }
        throw s2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private String searchAccounts(String s)
    {
        Object obj = Uri.parse(ecsConfiguration.getSkypeAuthorizeUrl()).buildUpon();
        ((android.net.Uri.Builder) (obj)).path("/ifexists");
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("username", s.toString().trim());
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("clientVersion", "20703/6.13.0.608");
        obj = httpUtil.a(((android.net.Uri.Builder) (obj)).toString());
        Object obj2 = new HashMap();
        ((HashMap) (obj2)).put("Accept", "application/json; ver=2.0");
        httpUtil.a(((java.net.HttpURLConnection) (obj)), ((java.util.Map) (obj2)));
        obj2 = httpUtil.c(((java.net.HttpURLConnection) (obj)));
        synchronized (lock)
        {
            float f = (float)(SystemClock.elapsedRealtime() - searchStartedRealtime) / 1000F;
            logger.info((new StringBuilder("Accounts Retrieved Callback | Time elapsed: ")).append(f).append("s").toString());
            searchResultCache = g.a(s, obj2);
        }
        return ((String) (obj2));
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void clearSearchCache()
    {
        synchronized (lock)
        {
            searchResultCache = g.a(null, null);
            searchStartedRealtime = 0L;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void fireSearchEventIfMissed(String s)
    {
        synchronized (lock)
        {
            if (TextUtils.equals((CharSequence)searchResultCache.a, s) && searchResultCache.b != null)
            {
                eventBus.a(new OnApiIfExistsResult((String)searchResultCache.a, (String)searchResultCache.b));
            }
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean isEmailLike(String s)
    {
        return REGEX_POSSIBLE_EMAIL.matcher(s).matches();
    }

    public boolean isPhoneNumberLike(String s)
    {
        String s1 = s;
        String s2 = s1;
        if (s != null)
        {
            s2 = REGEX_PHONE_SEPARATORS.matcher(s1).replaceAll("");
        }
        return PhoneNumberUtils.isGlobalPhoneNumber(s2);
    }

    public Future searchAccountsAsync(final String userId)
    {
        clearSearchCache();
        searchStartedRealtime = SystemClock.elapsedRealtime();
        return asyncService.a(new Runnable() {

            final UnifiedSignInManager this$0;
            final String val$userId;

            public final void run()
            {
                performSearch(userId);
            }

            
            {
                this$0 = UnifiedSignInManager.this;
                userId = s;
                super();
            }
        });
    }


}
