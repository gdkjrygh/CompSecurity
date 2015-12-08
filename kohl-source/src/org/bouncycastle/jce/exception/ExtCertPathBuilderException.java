// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;

// Referenced classes of package org.bouncycastle.jce.exception:
//            ExtException

public class ExtCertPathBuilderException extends CertPathBuilderException
    implements ExtException
{

    private Throwable cause;

    public ExtCertPathBuilderException(String s, Throwable throwable)
    {
        super(s);
        cause = throwable;
    }

    public ExtCertPathBuilderException(String s, Throwable throwable, CertPath certpath, int i)
    {
        super(s, throwable);
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }
}
