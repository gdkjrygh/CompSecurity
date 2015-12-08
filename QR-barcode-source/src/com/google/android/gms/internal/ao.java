// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class ao
{

    private static MessageDigest nI = null;
    protected Object mw;

    public ao()
    {
        mw = new Object();
    }

    protected MessageDigest ba()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        MessageDigest messagedigest;
        if (nI == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        messagedigest = nI;
        return messagedigest;
        int i = 0;
        while (i < 2) 
        {
            MessageDigest messagedigest1;
            Exception exception;
            try
            {
                nI = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            finally { }
            i++;
        }
        messagedigest1 = nI;
        obj;
        JVM INSTR monitorexit ;
        return messagedigest1;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract byte[] l(String s);

}
