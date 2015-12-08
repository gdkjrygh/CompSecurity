// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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
//            dk, dm, di, dl

public class dj
{

    private static final dj qJ;
    public static final String qK;
    private final Object li = new Object();
    public final String qL = br();
    private final dk qM;
    private BigInteger qN;
    private final HashSet qO = new HashSet();
    private final HashMap qP = new HashMap();

    private dj()
    {
        qN = BigInteger.ONE;
        qM = new dk(qL);
    }

    public static Bundle a(dl dl1, String s)
    {
        return qJ.b(dl1, s);
    }

    public static void b(HashSet hashset)
    {
        qJ.c(hashset);
    }

    public static dj bq()
    {
        return qJ;
    }

    private static String br()
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
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
          goto _L3
    }

    public static String bs()
    {
        return qJ.bt();
    }

    public static dk bu()
    {
        return qJ.bv();
    }

    public void a(di di1)
    {
        synchronized (li)
        {
            qO.add(di1);
        }
        return;
        di1;
        obj;
        JVM INSTR monitorexit ;
        throw di1;
    }

    public void a(String s, dm dm1)
    {
        synchronized (li)
        {
            qP.put(s, dm1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public Bundle b(dl dl1, String s)
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", qM.q(s));
        s = new Bundle();
        String s1;
        for (Iterator iterator = qP.keySet().iterator(); iterator.hasNext(); s.putBundle(s1, ((dm)qP.get(s1)).toBundle()))
        {
            s1 = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_104;
        dl1;
        obj;
        JVM INSTR monitorexit ;
        throw dl1;
        bundle.putBundle("slots", s);
        s = new ArrayList();
        for (Iterator iterator1 = qO.iterator(); iterator1.hasNext(); s.add(((di)iterator1.next()).toBundle())) { }
        bundle.putParcelableArrayList("ads", s);
        dl1.a(qO);
        qO.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public String bt()
    {
        String s;
        synchronized (li)
        {
            s = qN.toString();
            qN = qN.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public dk bv()
    {
        dk dk1;
        synchronized (li)
        {
            dk1 = qM;
        }
        return dk1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c(HashSet hashset)
    {
        synchronized (li)
        {
            qO.addAll(hashset);
        }
        return;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
    }

    static 
    {
        qJ = new dj();
        qK = qJ.qL;
    }
}
