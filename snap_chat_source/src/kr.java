// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import org.apache.commons.lang3.StringUtils;

public final class kr
{

    private static kr d = new kr();
    public String a;
    public String b;
    public final IN c;
    private final GoogleApiClient e;
    private final Context f;

    private kr()
    {
        this(SnapchatApplication.get().getApplicationContext(), new IN(), (new com.google.android.gms.common.api.GoogleApiClient.Builder(SnapchatApplication.get().getApplicationContext())).addApi(SafetyNet.API).build());
    }

    private kr(Context context, IN in, GoogleApiClient googleapiclient)
    {
        a = null;
        b = null;
        f = context;
        c = in;
        e = googleapiclient;
    }

    static Context a(kr kr1)
    {
        return kr1.f;
    }

    public static kr a()
    {
        return d;
    }

    static String b(kr kr1)
    {
        return kr1.a;
    }

    static String c(kr kr1)
    {
        kr1.a = null;
        return null;
    }

    static String d(kr kr1)
    {
        kr1.b = null;
        return null;
    }

    static GoogleApiClient e(kr kr1)
    {
        return kr1.e;
    }

    public final transient String a(String as[])
    {
        if (!e.blockingConnect().isSuccess() || !e.isConnected())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        byte abyte0[] = MessageDigest.getInstance("SHA-256").digest(StringUtils.join(as, "|").getBytes("UTF-8"));
        as = (String)c.a(new Callable(abyte0, as) {

            private byte a[];
            private String b[];
            private kr c;

            public final Object call()
            {
                EasyMetric easymetric = new EasyMetric("SAFETYNET_ATTEST");
                easymetric.b();
                com.google.android.gms.safetynet.SafetyNetApi.AttestationResult attestationresult = (com.google.android.gms.safetynet.SafetyNetApi.AttestationResult)SafetyNet.SafetyNetApi.attest(kr.e(c), a).await();
                Status status = attestationresult.getStatus();
                String s;
                if (b == null || b.length == 0)
                {
                    s = null;
                } else
                {
                    s = b[b.length - 1];
                }
                easymetric.a("success", Boolean.valueOf(status.isSuccess())).a("path", s).b(true);
                if (status.isSuccess())
                {
                    return attestationresult.getJwsResult();
                } else
                {
                    throw new IOException();
                }
            }

            
            {
                c = kr.this;
                a = abyte0;
                b = as;
                super();
            }
        }, 10000L).call();
        Timber.c("GoogleAuthManager", (new StringBuilder("getSignedAttestation: ")).append(as).toString(), new Object[0]);
        return as;
        Exception exception;
        exception;
        as = "ie";
_L2:
        Timber.e("GoogleAuthManager", (new StringBuilder("getSignedAttestation Exception: ")).append(exception.getMessage()).toString(), new Object[0]);
        return as;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        return "ie";
    }

    public final String b()
    {
        String s;
        Account aaccount[];
        int i;
        int j;
        aaccount = AccountManager.get(f).getAccountsByType("com.google");
        s = "ng";
        j = aaccount.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        s = aaccount[i].name;
        a = (String)c.a(new Callable(s) {

            private String a;
            private kr b;

            public final Object call()
            {
                return GoogleAuthUtil.getToken(kr.a(b), a, "audience:server:client_id:694893979329-l59f3phl42et9clpoo296d8raqoljl6p.apps.googleusercontent.com");
            }

            
            {
                b = kr.this;
                a = s;
                super();
            }
        }).call();
        Timber.c("GoogleAuthManager", (new StringBuilder("getGoogleOauthToken: ")).append(a).toString(), new Object[0]);
        b = null;
        s = a;
        return s;
        Object obj;
        obj;
        Timber.e("GoogleAuthManager", (new StringBuilder("getGoogleOauthToken IOException: ")).append(((IOException) (obj)).getMessage()).toString(), new Object[0]);
        throw obj;
        obj;
        Timber.e("GoogleAuthManager", (new StringBuilder("getGoogleOauthToken GooglePlayServicesAvailabilityException: ")).append(((GooglePlayServicesAvailabilityException) (obj)).getMessage()).toString(), new Object[0]);
        b = ((GooglePlayServicesAvailabilityException) (obj)).getMessage();
        return "pe";
        obj;
        Timber.e("GoogleAuthManager", (new StringBuilder("getGoogleOauthToken UserRecoverableAuthException: ")).append(((UserRecoverableAuthException) (obj)).getMessage()).toString(), new Object[0]);
        b = ((UserRecoverableAuthException) (obj)).getMessage();
        i++;
        obj = "ue";
        continue; /* Loop/switch isn't completed */
        obj;
        Timber.e("GoogleAuthManager", (new StringBuilder("getGoogleOauthToken GoogleAuthException: ")).append(((Exception) (obj)).getMessage()).toString(), new Object[0]);
        b = ((Exception) (obj)).getMessage();
        return "ae";
        if (true) goto _L2; else goto _L1
_L1:
    }


    // Unreferenced inner class kr$1

/* anonymous class */
    public final class _cls1
        implements Callable
    {

        private kr a;

        public final Object call()
        {
            GoogleAuthUtil.clearToken(kr.a(a), kr.b(a));
            Timber.c("GoogleAuthManager", (new StringBuilder("clearGoogleOauthToken: ")).append(kr.b(a)).toString(), new Object[0]);
            kr.c(a);
            kr.d(a);
            return null;
        }

            public 
            {
                a = kr.this;
                super();
            }
    }

}
