// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class ao
{

    private static MessageDigest nS = null;
    protected Object mH;

    public ao()
    {
        mH = new Object();
    }

    protected MessageDigest bf()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        MessageDigest messagedigest;
        if (nS == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        messagedigest = nS;
        return messagedigest;
        int i = 0;
        while (i < 2) 
        {
            MessageDigest messagedigest1;
            Exception exception;
            try
            {
                nS = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            finally { }
            i++;
        }
        messagedigest1 = nS;
        obj;
        JVM INSTR monitorexit ;
        return messagedigest1;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract byte[] l(String s);

}
