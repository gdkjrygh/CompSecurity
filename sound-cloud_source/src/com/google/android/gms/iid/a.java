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
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.iid:
//            i, g

public final class a
{

    static Map a = new HashMap();
    static String f;
    private static i g;
    private static g h;
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
        int j;
        try
        {
            j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            (new StringBuilder("Never happens: can't find own package ")).append(context);
            return 0;
        }
        return j;
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
            g = new i(context1);
            h = new g(context1);
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

    static i b()
    {
        return g;
    }

    static g c()
    {
        return h;
    }

    private KeyPair d()
    {
        if (c == null)
        {
            c = g.d(d);
        }
        if (c == null)
        {
            e = System.currentTimeMillis();
            c = g.a(d, e);
        }
        return c;
    }

    public final void a()
    {
        e = 0L;
        i j = g;
        String s = d;
        j.b((new StringBuilder()).append(s).append("|").toString());
        c = null;
    }

    public final void a(String s, String s1, Bundle bundle)
        throws IOException
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        g.b(d, s, s1);
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putString("sender", s);
        if (s1 != null)
        {
            bundle1.putString("scope", s1);
        }
        bundle1.putString("subscription", s);
        bundle1.putString("delete", "1");
        bundle1.putString("X-delete", "1");
        if ("".equals(d))
        {
            s1 = s;
        } else
        {
            s1 = d;
        }
        bundle1.putString("subtype", s1);
        if (!"".equals(d))
        {
            s = d;
        }
        bundle1.putString("X-subtype", s);
        com.google.android.gms.iid.g.a(h.a(bundle1, d()));
    }

    public final String b(String s, String s1, Bundle bundle)
        throws IOException
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
            obj = g.a(d, s, s1);
        }
        if (obj == null)
        {
            obj = bundle;
            if (bundle == null)
            {
                obj = new Bundle();
            }
            boolean flag1 = flag3;
            if (((Bundle) (obj)).getString("ttl") != null)
            {
                flag1 = false;
            }
            if ("jwt".equals(((Bundle) (obj)).getString("type")))
            {
                flag1 = flag2;
            }
            bundle = c(s, s1, ((Bundle) (obj)));
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

    public final String c(String s, String s1, Bundle bundle)
        throws IOException
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
        return com.google.android.gms.iid.g.a(h.a(bundle, d()));
    }

}
