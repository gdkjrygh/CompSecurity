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
//            zzd, zzc

public class InstanceID
{

    static Map a = new HashMap();
    static String f;
    private static zzd g;
    private static zzc h;
    Context b;
    KeyPair c;
    String d;
    long e;

    protected InstanceID(Context context, String s, Bundle bundle)
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
            Log.w("InstanceID", (new StringBuilder()).append("Never happens: can't find own package ").append(context).toString());
            return 0;
        }
        return i;
    }

    public static InstanceID a(Context context, Bundle bundle)
    {
        com/google/android/gms/iid/InstanceID;
        JVM INSTR monitorenter ;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        String s = "";
          goto _L3
_L5:
        InstanceID instanceid;
        Context context1;
        context1 = context.getApplicationContext();
        if (g == null)
        {
            g = new zzd(context1);
            h = new zzc(context1);
        }
        f = Integer.toString(a(context1));
        instanceid = (InstanceID)a.get(s);
        context = instanceid;
        if (instanceid != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        context = new InstanceID(context1, s, bundle);
        a.put(s, context);
        com/google/android/gms/iid/InstanceID;
        JVM INSTR monitorexit ;
        return context;
_L2:
        s = bundle.getString("subtype");
          goto _L3
        context;
        throw context;
_L3:
        if (s == null)
        {
            s = "";
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

    public static InstanceID b(Context context)
    {
        return a(context, null);
    }

    public String a(String s, String s1, Bundle bundle)
    {
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        Object obj;
        if (e())
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
            bundle = b(s, s1, ((Bundle) (obj)));
            obj = bundle;
            if (bundle != null)
            {
                g.a(d, s, s1, bundle, f);
                return bundle;
            }
        }
        return ((String) (obj));
    }

    KeyPair a()
    {
        if (c == null)
        {
            c = g.c(d);
        }
        if (c == null)
        {
            e = System.currentTimeMillis();
            c = g.a(d, e);
        }
        return c;
    }

    public String b(String s, String s1, Bundle bundle)
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
        s = h.a(bundle, a());
        return h.b(s);
    }

    void b()
    {
        e = 0L;
        g.d(d);
        c = null;
    }

    zzd c()
    {
        return g;
    }

    zzc d()
    {
        return h;
    }

    boolean e()
    {
        String s = g.a("appVersion");
        long l;
        if (s != null && s.equals(f))
        {
            if ((s = g.a("lastToken")) != null && System.currentTimeMillis() / 1000L - Long.valueOf(l = Long.parseLong(s)).longValue() <= 0x93a80L)
            {
                return false;
            }
        }
        return true;
    }

}
