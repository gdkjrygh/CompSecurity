// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public final class byh
{

    public static byo a;
    public static String e;
    private static Map f = new HashMap();
    private static byn g;
    KeyPair b;
    public String c;
    long d;

    private byh(Context context, String s)
    {
        c = "";
        context.getApplicationContext();
        c = s;
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

    public static byh a(Context context, Bundle bundle)
    {
        byh;
        JVM INSTR monitorenter ;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        bundle = "";
          goto _L3
_L5:
        byh byh1;
        Context context1;
        context1 = context.getApplicationContext();
        if (a == null)
        {
            a = new byo(context1);
            g = new byn(context1);
        }
        e = Integer.toString(a(context1));
        byh1 = (byh)f.get(bundle);
        context = byh1;
        if (byh1 != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        context = new byh(context1, bundle);
        f.put(bundle, context);
        byh;
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

    static byo a()
    {
        return a;
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
        keypair[0] = (byte)((keypair[0] & 0xf) + 112);
        keypair = Base64.encodeToString(keypair, 0, 8, 11);
        return keypair;
    }

    static String a(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 11);
    }

    public static byh b(Context context)
    {
        return a(context, null);
    }

    static byn b()
    {
        return g;
    }

    public static boolean c()
    {
        String s = a.a("appVersion");
        long l;
        if (s != null && s.equals(e))
        {
            if ((s = a.a("lastToken")) != null && System.currentTimeMillis() / 1000L - Long.valueOf(l = Long.parseLong(s)).longValue() <= 0x93a80L)
            {
                return false;
            }
        }
        return true;
    }

    public final String a(String s, String s1, Bundle bundle)
    {
        bundle.putString("scope", s1);
        bundle.putString("sender", s);
        byn byn1;
        KeyPair keypair;
        if ("".equals(c))
        {
            s1 = s;
        } else
        {
            s1 = c;
        }
        if (!bundle.containsKey("legacy.register"))
        {
            bundle.putString("subscription", s);
            bundle.putString("subtype", s1);
            bundle.putString("X-subscription", s);
            bundle.putString("X-subtype", s1);
        }
        byn1 = g;
        if (b == null)
        {
            b = a.d(c);
        }
        if (b == null)
        {
            d = System.currentTimeMillis();
            b = a.a(c, d);
        }
        keypair = b;
        s1 = byn1.a(bundle, keypair);
        s = s1;
        if (s1 != null)
        {
            s = s1;
            if (s1.hasExtra("google.messenger"))
            {
                s = byn1.a(bundle, keypair);
            }
        }
        return byn.a(s);
    }

}
