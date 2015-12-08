// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.token;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.util.Charsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.skype.android.app.token:
//            SkypeTokenAccess, SkypeTokenCallback

public class SkypeTokenRequest
    implements android.os.Handler.Callback, SkypeTokenAccess
{
    protected class TokenCache
    {

        private static final long ELBOW_ROOM = 0x1d4c0L;
        private static final long FIVE_MINUTES_IN_SECONDS = 300L;
        private static final long TWENTYFOUR_HOURS_IN_SECONDS = 0x15180L;
        private Account accountForToken;
        private long expirationMillis;
        final SkypeTokenRequest this$0;
        private String token;

        private long nowInSecondsPlus(long l)
        {
            return System.currentTimeMillis() / 1000L + l;
        }

        private long parseExpiration(String s)
        {
            long l1 = nowInSecondsPlus(0x15180L);
            s = s.split("\\.");
            long l = l1;
            if (s.length > 1)
            {
                try
                {
                    s = (JSONObject)(new JSONTokener(new String(Base64.decode(s[1], 0), Charsets.a))).nextValue();
                    l = s.getLong("iat");
                    l = nowInSecondsPlus(s.getLong("exp") - l);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    SkypeTokenRequest.log.info((new StringBuilder("Unable to determine token expiration:")).append(s.getMessage()).toString());
                    return l1;
                }
            }
            return l;
        }

        private void reportExpiration()
        {
            Date date = new Date(expirationMillis);
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy:MM:dd(HH:mm:ss)");
            SkypeTokenRequest.log.info((new StringBuilder("New cached Skype Token expires at: ")).append(simpledateformat.format(date)).toString());
        }

        protected String getToken()
        {
            if (!hasValidToken())
            {
                token = null;
            }
            return token;
        }

        protected boolean hasValidToken()
        {
            boolean flag;
            boolean flag1;
            if (System.currentTimeMillis() < expirationMillis)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (accountProvider.get() == accountForToken)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return flag && flag1;
        }

        public void setToken(String s, long l)
        {
            if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
            long l1 = 0L;
_L4:
            expirationMillis = 1000L * l1 - 0x1d4c0L;
            reportExpiration();
            accountForToken = accountProvider.get();
            token = s;
            return;
_L2:
            l1 = l;
            if (l <= 0L)
            {
                l1 = parseExpiration(s);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected TokenCache()
        {
            this$0 = SkypeTokenRequest.this;
            super();
            expirationMillis = -1L;
        }
    }


    private static final int MAX_RETRIES = 3;
    private static final int NOTIFY_NO_TOKEN = 3;
    private static final int NOTIFY_TOKEN_CONSUMERS = 1;
    private static final int NO_REQUEST_PENDING = -1;
    private static final int REQUEST_BUSY = -3;
    protected static final int RETRY_AFTER_EMPTY_TOKEN = 2;
    private static final int RETRY_DELAY_MILLIS = 3000;
    private static final int RETRY_PENDING = -2;
    private static final Logger log = Logger.getLogger("SkypeTokenRequest");
    private final Object CALLBACKS_LOCK = new Object();
    private final Object GET_MY_ID_LOCK = new Object();
    protected AccountProvider accountProvider;
    protected Analytics analytics;
    protected TokenCache cache;
    private Set callbacks;
    protected final Handler handler = new Handler(Looper.getMainLooper(), this);
    protected SkyLib lib;
    private final AtomicInteger requestId = new AtomicInteger(-1);
    private long requestTime;
    private final AtomicInteger retryCount = new AtomicInteger(0);

    public SkypeTokenRequest(SkyLib skylib, Analytics analytics1, AccountProvider accountprovider, EventBus eventbus)
    {
        callbacks = new HashSet();
        cache = new TokenCache();
        lib = skylib;
        analytics = analytics1;
        accountProvider = accountprovider;
        (new EventSubscriberBinder(eventbus, this)).bind();
    }

    private int getRequestIdForLogs()
    {
        return requestId.get();
    }

    private boolean isLoggedOut()
    {
        com.skype.Account.STATUS status = accountProvider.get().getStatusProp();
        return status != com.skype.Account.STATUS.LOGGED_IN && status != com.skype.Account.STATUS.LOGGED_IN_PARTIALLY;
    }

    private void reportTokenMetrics(String s)
    {
        float f = (float)(SystemClock.elapsedRealtime() - requestTime) / 1000F;
        log.info(String.format("SkypeToken request id: %d received in %5.2f seconds.", new Object[] {
            Integer.valueOf(getRequestIdForLogs()), Float.valueOf(f)
        }));
        String s1 = Analytics.a(f);
        analytics.a(AnalyticsEvent.bj, s1);
        if (TextUtils.isEmpty(s))
        {
            analytics.c(AnalyticsEvent.bn);
        }
    }

    private void requestAndStoreRequestId()
    {
        synchronized (GET_MY_ID_LOCK)
        {
            int i = requestFreshToken();
            log.info((new StringBuilder("SkypeToken request: ")).append(i).toString());
            requestId.set(i);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            notifyCallers();
            return true;

        case 2: // '\002'
            retryRequest();
            return true;

        case 3: // '\003'
            cache.setToken("", 0L);
            break;
        }
        notifyCallers();
        return true;
    }

    protected final void notifyCallers()
    {
        ArrayList arraylist;
        synchronized (CALLBACKS_LOCK)
        {
            arraylist = new ArrayList(callbacks);
            callbacks.clear();
        }
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((SkypeTokenCallback)((Iterator) (obj)).next()).onSkypeTokenRetrieved(cache.getToken())) { }
        break MISSING_BLOCK_LABEL_75;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS && isLoggedOut())
        {
            requestId.set(-1);
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAuthTokenResultWithTimeout onauthtokenresultwithtimeout)
    {
        boolean flag;
        synchronized (GET_MY_ID_LOCK)
        {
            flag = requestId.compareAndSet(onauthtokenresultwithtimeout.getRequest_id(), -3);
        }
        if (flag)
        {
            obj = onauthtokenresultwithtimeout.getToken();
            reportTokenMetrics(((String) (obj)));
            cache.setToken(((String) (obj)), onauthtokenresultwithtimeout.getExpiration());
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                break MISSING_BLOCK_LABEL_106;
            }
            if (retryCount.incrementAndGet() >= 3)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            requestId.set(-2);
            scheduleRetry();
        }
        return;
        onauthtokenresultwithtimeout;
        obj;
        JVM INSTR monitorexit ;
        throw onauthtokenresultwithtimeout;
        log.severe("Unable to acquire valid Skype token. Giving up.");
        analytics.c(AnalyticsEvent.bz);
        requestId.set(-1);
        notifyCallers();
        return;
    }

    protected int requestFreshToken()
    {
        int i = lib.requestSkypeToken();
        requestTime = SystemClock.elapsedRealtime();
        log.info((new StringBuilder("requesting SkypeToken, request id: ")).append(i).toString());
        return i;
    }

    public void requestSkypeToken(SkypeTokenCallback skypetokencallback)
    {
        synchronized (CALLBACKS_LOCK)
        {
            callbacks.add(skypetokencallback);
        }
        if (isLoggedOut())
        {
            log.severe("SkypeToken requires an active login session.");
            analytics.c(AnalyticsEvent.by);
            handler.sendMessage(handler.obtainMessage(3));
            return;
        }
        break MISSING_BLOCK_LABEL_68;
        skypetokencallback;
        obj;
        JVM INSTR monitorexit ;
        throw skypetokencallback;
        if (cache.hasValidToken())
        {
            log.info("SkypeToken found in cache");
            handler.sendMessage(handler.obtainMessage(1));
            return;
        }
        if (requestId.compareAndSet(-1, -3))
        {
            retryCount.set(0);
            requestAndStoreRequestId();
            return;
        } else
        {
            log.info((new StringBuilder("SkypeToken request in progress:")).append(getRequestIdForLogs()).toString());
            return;
        }
    }

    protected void retryRequest()
    {
        if (requestId.compareAndSet(-2, -3))
        {
            requestAndStoreRequestId();
        }
    }

    protected final void scheduleRetry()
    {
        handler.sendMessageDelayed(handler.obtainMessage(2), 3000L);
    }


}
