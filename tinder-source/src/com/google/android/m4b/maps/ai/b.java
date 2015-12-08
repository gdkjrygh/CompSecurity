// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ai;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.i;
import com.google.android.m4b.maps.ay.s;
import com.google.android.m4b.maps.y.g;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.n;
import java.util.concurrent.Executors;

public class b extends i
{
    static interface a
    {

        public abstract void a();

        public abstract void a(String s1, long l);

        public abstract void b();
    }


    static final String a = com/google/android/m4b/maps/ai/b.getSimpleName();
    private final Context b;
    private final String c;
    private boolean d;
    private final String e;
    private final boolean f = true;

    b(Context context, String s1, String s2, String s3)
    {
        super(context, s3, "com.google.android.gms.maps.auth.ApiTokenService", Executors.newSingleThreadExecutor());
        d = false;
        b = context;
        c = s1;
        e = s2;
    }

    static Bundle a(b b1)
    {
        Bundle bundle = new Bundle(3);
        bundle.putString("PACKAGE_NAME", b1.e);
        bundle.putString("API_KEY", b1.c);
        bundle.putBoolean("M4B", b1.f);
        return bundle;
    }

    static String b()
    {
        return a;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return com.google.android.m4b.maps.db.a.a.a(ibinder);
    }

    final void a()
    {
        if (d)
        {
            return;
        }
        ab.a("Authorization failure.  Please see https://developers.google.com/maps/documentation/android/start for how to correctly set up the map.");
        String s2 = s.a(b.getPackageManager(), e);
        Object obj;
        String s1;
        String s3;
        if (s2 == null)
        {
            obj = null;
        } else
        {
            obj = g.a(":");
            j.a(true, "The length may not be less than 1");
            n n1 = new n(new com.google.android.m4b.maps.y.n._cls1());
            s2 = s2.toUpperCase();
            j.a(s2);
            obj = ((g) (obj)).a(new com.google.android.m4b.maps.y.n._cls2(n1, s2));
        }
        s1 = String.valueOf("In the Google Developer Console (https://console.developers.google.com)\nEnsure that the \"Google Maps Android API v2\" is enabled.\nEnsure that the following Android Key exists:\n\tAPI Key: ");
        s2 = c;
        s3 = e;
        ab.a((new StringBuilder(String.valueOf(s1).length() + 60 + String.valueOf(s2).length() + String.valueOf(obj).length() + String.valueOf(s3).length())).append(s1).append(s2).append("\n\tAndroid Application (<cert_fingerprint>;<package_name>): ").append(((String) (obj))).append(";").append(s3).toString());
        d = true;
    }

    public final void a(a a1)
    {
        j.a(a1, "callback");
        a(((com.google.android.m4b.maps.ay.i.b) (new com.google.android.m4b.maps.ay.i.b(a1) {

            private a a;
            private b b;

            private Void a(com.google.android.m4b.maps.db.a a2)
            {
                a a3;
                Object obj;
                short word0;
                Log.i(b.b(), "Sending API token request.");
                a2 = a2.a(b.a(b));
                obj = b;
                a3 = a;
                word0 = a2.getShort("ERROR_CODE", (short)-1);
                if (word0 == -1) goto _L2; else goto _L1
_L1:
                word0;
                JVM INSTR tableswitch 1 5: default 378
            //                           1 256
            //                           2 212
            //                           3 180
            //                           4 234
            //                           5 132;
                   goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
                Log.e(b.a, (new StringBuilder(49)).append("Authentication failed. Unrecognized error: ").append(word0).toString());
                ((b) (obj)).a();
                a3.b();
_L9:
                b.c();
_L10:
                return null;
_L8:
                Log.e(b.a, "Authentication failed. Timeout while trying to contact the server.");
                a3.a();
                  goto _L9
                a2;
                Log.e(b.b(), "Exception when sending the token request.", a2);
                a.a();
                b.c();
                  goto _L10
_L6:
                Log.e(b.a, "Authentication failed. API Key not found in the request.");
                ((b) (obj)).a();
                a3.b();
                  goto _L9
                a2;
                b.c();
                throw a2;
_L5:
                Log.e(b.a, "Authentication failed. Could not extract app certificate");
                ((b) (obj)).a();
                a3.b();
                  goto _L9
_L7:
                Log.e(b.a, "Authentication failed on the server.");
                ((b) (obj)).a();
                a3.b();
                  goto _L9
_L4:
                Log.e(b.a, "Authentication failed. Package names don't match.");
                ((b) (obj)).a();
                a3.b();
                  goto _L9
_L2:
                obj = a2.getString("API_TOKEN");
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_360;
                }
                long l = a2.getLong("VALIDITY_DURATION");
                Log.i(b.a, (new StringBuilder(String.valueOf(obj).length() + 57)).append("Received API Token: ").append(((String) (obj))).append(" / Expires in: ").append(l).append("ms").toString());
                a3.a(((String) (obj)), l);
                  goto _L9
                Log.e(b.a, "Missing token in service response.");
                a3.b();
                  goto _L9
            }

            public final volatile Object a(IInterface iinterface)
            {
                return a((com.google.android.m4b.maps.db.a)iinterface);
            }

            
            {
                b = b.this;
                a = a1;
                super(b.this);
            }
        })));
    }

}
