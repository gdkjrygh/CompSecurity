// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            ds, dt, dp, ll

public final class dr
{

    public static final String a;
    private static final Object b;
    private static ds c;
    private static BigInteger d;
    private static HashSet e;
    private static HashMap f;

    public static Bundle a(ll ll1, String s, Context context)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", c.a(s, context));
        s = new Bundle();
        String s1;
        for (context = f.keySet().iterator(); context.hasNext(); s.putBundle(s1, ((dt)f.get(s1)).a()))
        {
            s1 = (String)context.next();
        }

        break MISSING_BLOCK_LABEL_98;
        ll1;
        throw ll1;
        bundle.putBundle("slots", s);
        s = new ArrayList();
        for (context = e.iterator(); context.hasNext(); s.add(((dp)context.next()).d())) { }
        bundle.putParcelableArrayList("ads", s);
        ll1.a(e);
        e = new HashSet();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public static String a()
    {
        String s;
        synchronized (b)
        {
            s = d.toString();
            d = d.add(BigInteger.ONE);
        }
        return s;
    }

    public static void a(dp dp1)
    {
        synchronized (b)
        {
            e.add(dp1);
        }
    }

    public static void a(ll ll1)
    {
        synchronized (b)
        {
            e.addAll(ll1.a());
        }
    }

    public static void a(String s, dt dt1)
    {
        synchronized (b)
        {
            f.put(s, dt1);
        }
    }

    public static ds b()
    {
        ds ds1;
        synchronized (b)
        {
            ds1 = c;
        }
        return ds1;
    }

    static 
    {
        Object obj;
        byte abyte0[];
        byte abyte1[];
        int i;
        obj = UUID.randomUUID();
        abyte0 = BigInteger.valueOf(((UUID) (obj)).getLeastSignificantBits()).toByteArray();
        abyte1 = BigInteger.valueOf(((UUID) (obj)).getMostSignificantBits()).toByteArray();
        obj = (new BigInteger(1, abyte0)).toString();
        i = 0;
_L2:
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        obj1 = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj1)).update(abyte0);
        ((MessageDigest) (obj1)).update(abyte1);
        byte abyte2[] = new byte[8];
        System.arraycopy(((MessageDigest) (obj1)).digest(), 0, abyte2, 0, 8);
        obj1 = (new BigInteger(1, abyte2)).toString();
        obj = obj1;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        a = ((String) (obj));
        b = new Object();
        c = new ds(a);
        d = BigInteger.ONE;
        e = new HashSet();
        f = new HashMap();
        return;
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
          goto _L3
    }
}
