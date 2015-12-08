// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.dfe.api;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.toolbox.AndroidAuthenticator;
import com.google.android.common.http.UrlRules;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.PlayUtils;
import com.google.android.play.utils.config.GservicesValue;
import com.google.android.play.utils.config.PlayG;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.play.dfe.api:
//            PlayDfeApi

public final class PlayDfeApiContext
{

    final AndroidAuthenticator mAuthenticator;
    final Cache mCache;
    private final Context mContext;
    private boolean mHasPerformedInitialTokenInvalidation;
    private final Map mHeaders;
    private String mLastAuthToken;

    private PlayDfeApiContext(Context context, AndroidAuthenticator androidauthenticator, Cache cache, String s, String s1, int i, Locale locale, 
            String s2, String s3, String s4)
    {
        mHeaders = new HashMap();
        mContext = context;
        mAuthenticator = androidauthenticator;
        mCache = cache;
        mHeaders.put("X-DFE-Device-Id", Long.toHexString(((Long)PlayG.androidId.get()).longValue()));
        mHeaders.put("Accept-Language", (new StringBuilder()).append(locale.getLanguage()).append("-").append(locale.getCountry()).toString());
        if (!TextUtils.isEmpty(s2))
        {
            mHeaders.put("X-DFE-MCCMNC", s2);
        }
        if (!TextUtils.isEmpty(s3))
        {
            mHeaders.put("X-DFE-Client-Id", s3);
        }
        if (!TextUtils.isEmpty(s3))
        {
            mHeaders.put("X-DFE-Logging-Id", s4);
        }
        context = mHeaders;
        androidauthenticator = sanitizeHeaderValue(Build.DEVICE);
        cache = sanitizeHeaderValue(Build.HARDWARE);
        locale = sanitizeHeaderValue(Build.PRODUCT);
        context.put("User-Agent", String.format(Locale.US, "Android-%s/%s (api=%d,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s)", new Object[] {
            s, s1, Integer.valueOf(i), Integer.valueOf(4), Integer.valueOf(android.os.Build.VERSION.SDK_INT), androidauthenticator, cache, locale
        }));
        androidauthenticator = PlayDfeApi.BASE_URI.toString();
        context = UrlRules.getRules(mContext.getContentResolver()).matchRule(androidauthenticator);
        if (((com.google.android.common.http.UrlRules.Rule) (context)).mBlock)
        {
            context = null;
        } else
        if (((com.google.android.common.http.UrlRules.Rule) (context)).mRewrite != null)
        {
            context = (new StringBuilder()).append(((com.google.android.common.http.UrlRules.Rule) (context)).mRewrite).append(androidauthenticator.substring(((com.google.android.common.http.UrlRules.Rule) (context)).mPrefix.length())).toString();
        } else
        {
            context = androidauthenticator;
        }
        if (context == null)
        {
            throw new RuntimeException((new StringBuilder("BASE_URI blocked by UrlRules: ")).append(androidauthenticator).toString());
        }
        boolean flag;
        androidauthenticator = new URL(context);
        if (androidauthenticator.getProtocol().toLowerCase().equals("https") || androidauthenticator.getHost().toLowerCase().endsWith("corp.google.com") || androidauthenticator.getHost().startsWith("192.168.0"))
        {
            break MISSING_BLOCK_LABEL_443;
        }
        if (!androidauthenticator.getHost().startsWith("127.0.0"))
        {
            break MISSING_BLOCK_LABEL_468;
        }
        flag = PlayUtils.isTestDevice();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        return;
        androidauthenticator;
        PlayCommonLog.d((new StringBuilder("Cannot parse URL: ")).append(context).toString(), new Object[0]);
        throw new RuntimeException((new StringBuilder("Insecure URL: ")).append(context).toString());
    }

    public static PlayDfeApiContext create(Context context, String s, Cache cache, Account account)
    {
        account = new AndroidAuthenticator(context, account, (String)PlayG.authTokenType.get());
        try
        {
            Object obj = context.getPackageManager().getPackageInfo(s, 0);
            String s1 = ((PackageInfo) (obj)).versionName;
            int i = ((PackageInfo) (obj)).versionCode;
            obj = (TelephonyManager)context.getSystemService("phone");
            context = new PlayDfeApiContext(context, account, cache, s, s1, i, Locale.getDefault(), ((TelephonyManager) (obj)).getSimOperator(), (String)PlayG.clientId.get(), (String)PlayG.loggingId.get());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Can't find our own package", context);
        }
        return context;
    }

    private static String sanitizeHeaderValue(String s)
    {
        return Uri.encode(s).replace("(", "").replace(")", "");
    }

    public final Map getHeaders()
        throws AuthFailureError
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        if (!mHasPerformedInitialTokenInvalidation)
        {
            invalidateAuthToken();
            mHasPerformedInitialTokenInvalidation = true;
        }
        mLastAuthToken = mAuthenticator.getAuthToken();
        hashmap = new HashMap();
        hashmap.putAll(mHeaders);
        hashmap.put("Authorization", (new StringBuilder("GoogleLogin auth=")).append(mLastAuthToken).toString());
        this;
        JVM INSTR monitorexit ;
        return hashmap;
        Exception exception;
        exception;
        throw exception;
    }

    public final void invalidateAuthToken()
    {
        if (mLastAuthToken != null)
        {
            mAuthenticator.invalidateAuthToken(mLastAuthToken);
            mLastAuthToken = null;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[PlayDfeApiContext headers={");
        boolean flag = true;
        Iterator iterator = mHeaders.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(s).append(": ").append((String)mHeaders.get(s));
        }
        stringbuilder.append("}]");
        return stringbuilder.toString();
    }
}
