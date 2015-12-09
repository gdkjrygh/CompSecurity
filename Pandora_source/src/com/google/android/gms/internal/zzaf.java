// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzaf
{

    private static MessageDigest zzpw = null;
    protected Object zzoe;

    public zzaf()
    {
        zzoe = new Object();
    }

    protected MessageDigest zzbE()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        MessageDigest messagedigest;
        if (zzpw == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        messagedigest = zzpw;
        return messagedigest;
        int i = 0;
        while (i < 2) 
        {
            MessageDigest messagedigest1;
            Exception exception;
            try
            {
                zzpw = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            finally { }
            i++;
        }
        messagedigest1 = zzpw;
        obj;
        JVM INSTR monitorexit ;
        return messagedigest1;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract byte[] zzn(String s);

}
