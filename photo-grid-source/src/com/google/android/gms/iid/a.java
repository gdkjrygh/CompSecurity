// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.iid:
//            l, j

public final class a
{

    static Map a = new HashMap();
    static String f;
    private static l g;
    private static j h;
    Context b;
    KeyPair c;
    String d;
    long e;

    private a(Context context, String s)
    {
        d = "";
        b = context.getApplicationContext();
        d = s;
    }

    static int a(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("InstanceID", (new StringBuilder("Never happens: can't find own package ")).append(context).toString());
            return 0;
        }
        return i;
    }

    public static a a(Context context, Bundle bundle)
    {
        com/google/android/gms/iid/a;
        JVM INSTR monitorenter ;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        bundle = "";
          goto _L3
_L5:
        a a1;
        Context context1;
        context1 = context.getApplicationContext();
        if (g == null)
        {
            g = new l(context1);
            h = new j(context1);
        }
        f = Integer.toString(a(context1));
        a1 = (a)a.get(bundle);
        context = a1;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        context = new a(context1, bundle);
        a.put(bundle, context);
        com/google/android/gms/iid/a;
        JVM INSTR monitorexit ;
        return context;
_L2:
        bundle = bundle.getString("subtype");
          goto _L3
        context;
        throw context;
_L3:
        if (bundle == null)
        {
            bundle = "";
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static String a(KeyPair keypair)
    {
        keypair = keypair.getPublic().getEncoded();
        try
        {
            keypair = MessageDigest.getInstance("SHA1").digest(keypair);
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
            return null;
        }
        keypair[0] = (byte)((keypair[0] & 0xf) + 112 & 0xff);
        keypair = Base64.encodeToString(keypair, 0, 8, 11);
        return keypair;
    }

    static String a(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 11);
    }

    public static a b(Context context)
    {
        return a(context, null);
    }

    static l b()
    {
        return g;
    }

    static j c()
    {
        return h;
    }

    public final String a(String s, String s1, Bundle bundle)
    {
        boolean flag2 = false;
        boolean flag3 = true;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        Object obj = g.a("appVersion");
        boolean flag;
        if (obj == null || !((String) (obj)).equals(f))
        {
            flag = true;
        } else
        {
            obj = g.a("lastToken");
            if (obj == null)
            {
                flag = true;
            } else
            {
                long l1 = Long.parseLong(((String) (obj)));
                if (System.currentTimeMillis() / 1000L - Long.valueOf(l1).longValue() > 0x93a80L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        }
        if (flag)
        {
            obj = null;
        } else
        {
            obj = g.a(d, s, s1);
        }
        if (obj == null)
        {
            boolean flag1 = flag3;
            if (bundle.getString("ttl") != null)
            {
                flag1 = false;
            }
            if ("jwt".equals(bundle.getString("type")))
            {
                flag1 = flag2;
            }
            bundle = b(s, s1, bundle);
            Log.w("InstanceID", (new StringBuilder("token: ")).append(bundle).toString());
            obj = bundle;
            if (bundle != null)
            {
                obj = bundle;
                if (flag1)
                {
                    g.a(d, s, s1, bundle, f);
                    return bundle;
                }
            }
        }
        return ((String) (obj));
    }

    final void a()
    {
        e = 0L;
        l l1 = g;
        String s = d;
        l1.b((new StringBuilder()).append(s).append("|").toString());
        c = null;
    }

    public final String b(String s, String s1, Bundle bundle)
    {
        if (s1 != null)
        {
            bundle.putString("scope", s1);
        }
        bundle.putString("sender", s);
        if ("".equals(d))
        {
            s1 = s;
        } else
        {
            s1 = d;
        }
        if (!bundle.containsKey("legacy.register"))
        {
            bundle.putString("subscription", s);
            bundle.putString("subtype", s1);
            bundle.putString("X-subscription", s);
            bundle.putString("X-subtype", s1);
        }
        s = h;
        if (c == null)
        {
            c = g.d(d);
        }
        if (c == null)
        {
            e = System.currentTimeMillis();
            c = g.a(d, e);
        }
        return j.a(s.a(bundle, c));
    }

}
