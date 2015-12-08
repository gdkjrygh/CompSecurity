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
//            f, e

public final class a
{

    static Map a = new HashMap();
    public static f c;
    public static e d;
    static String h;
    Context b;
    KeyPair e;
    public String f;
    long g;

    private a(Context context, String s)
    {
        f = "";
        b = context.getApplicationContext();
        f = s;
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
        if (c == null)
        {
            c = new f(context1);
            d = new e(context1);
        }
        h = Integer.toString(a(context1));
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
        return a(context, ((Bundle) (null)));
    }

    static f c()
    {
        return c;
    }

    static e d()
    {
        return d;
    }

    public final String a(String s, String s1)
        throws IOException
    {
        boolean flag2 = false;
        boolean flag3 = true;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        Object obj = c.a("appVersion");
        boolean flag;
        if (obj == null || !((String) (obj)).equals(h))
        {
            flag = true;
        } else
        {
            obj = c.a("lastToken");
            if (obj == null)
            {
                flag = true;
            } else
            {
                long l = Long.parseLong(((String) (obj)));
                if (System.currentTimeMillis() / 1000L - Long.valueOf(l).longValue() > 0x93a80L)
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
            obj = c.a(f, s, s1);
        }
        if (obj == null)
        {
            obj = new Bundle();
            boolean flag1 = flag3;
            if (((Bundle) (obj)).getString("ttl") != null)
            {
                flag1 = false;
            }
            if ("jwt".equals(((Bundle) (obj)).getString("type")))
            {
                flag1 = flag2;
            }
            String s2 = a(s, s1, ((Bundle) (obj)));
            Log.w("InstanceID", (new StringBuilder("token: ")).append(s2).toString());
            obj = s2;
            if (s2 != null)
            {
                obj = s2;
                if (flag1)
                {
                    c.a(f, s, s1, s2, h);
                    return s2;
                }
            }
        }
        return ((String) (obj));
    }

    public final String a(String s, String s1, Bundle bundle)
        throws IOException
    {
        if (s1 != null)
        {
            bundle.putString("scope", s1);
        }
        bundle.putString("sender", s);
        if ("".equals(f))
        {
            s1 = s;
        } else
        {
            s1 = f;
        }
        if (!bundle.containsKey("legacy.register"))
        {
            bundle.putString("subscription", s);
            bundle.putString("subtype", s1);
            bundle.putString("X-subscription", s);
            bundle.putString("X-subtype", s1);
        }
        return com.google.android.gms.iid.e.a(d.a(bundle, a()));
    }

    public final KeyPair a()
    {
        if (e == null)
        {
            e = c.d(f);
        }
        if (e == null)
        {
            g = System.currentTimeMillis();
            e = c.a(f, g);
        }
        return e;
    }

    public final void b()
    {
        g = 0L;
        f f1 = c;
        String s = f;
        f1.b((new StringBuilder()).append(s).append("|").toString());
        e = null;
    }

}
