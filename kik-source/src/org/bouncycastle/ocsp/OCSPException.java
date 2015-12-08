// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;


public class OCSPException extends Exception
{

    Exception a;

    public Throwable getCause()
    {
        return a;
    }
}
