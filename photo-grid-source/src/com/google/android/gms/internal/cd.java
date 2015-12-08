// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class cd
{

    private static MessageDigest b = null;
    protected Object a;

    public cd()
    {
        a = new Object();
    }

    protected final MessageDigest a()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        MessageDigest messagedigest;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        messagedigest = b;
        return messagedigest;
        int i = 0;
        while (i < 2) 
        {
            MessageDigest messagedigest1;
            Exception exception;
            try
            {
                b = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            finally { }
            i++;
        }
        messagedigest1 = b;
        obj;
        JVM INSTR monitorexit ;
        return messagedigest1;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract byte[] a(String s);

}
