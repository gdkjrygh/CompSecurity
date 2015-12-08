// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public final class cf
{

    private static final Object gL;
    public static final String hB;
    private static BigInteger hC;

    public static String al()
    {
        String s;
        synchronized (gL)
        {
            s = hC.toString();
            hC.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
        hB = ((String) (obj));
        gL = new Object();
        hC = BigInteger.ONE;
        return;
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
          goto _L3
    }
}
