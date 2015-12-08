// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.cert.CRLException;

final class c extends CRLException
{

    Throwable a;

    c(String s, Throwable throwable)
    {
        super(s);
        a = throwable;
    }

    public final Throwable getCause()
    {
        return a;
    }
}
