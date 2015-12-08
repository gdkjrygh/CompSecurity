// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzao
{

    private static MessageDigest zzoz = null;
    protected Object zznh;

    public zzao()
    {
        zznh = new Object();
    }

    protected MessageDigest zzby()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        MessageDigest messagedigest;
        if (zzoz == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        messagedigest = zzoz;
        return messagedigest;
        int i = 0;
        while (i < 2) 
        {
            MessageDigest messagedigest1;
            Exception exception;
            try
            {
                zzoz = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            finally { }
            i++;
        }
        messagedigest1 = zzoz;
        obj;
        JVM INSTR monitorexit ;
        return messagedigest1;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract byte[] zzl(String s);

}
