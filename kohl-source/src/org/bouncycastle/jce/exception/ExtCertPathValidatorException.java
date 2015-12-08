// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

// Referenced classes of package org.bouncycastle.jce.exception:
//            ExtException

public class ExtCertPathValidatorException extends CertPathValidatorException
    implements ExtException
{

    private Throwable cause;

    public ExtCertPathValidatorException(String s, Throwable throwable)
    {
        super(s);
        cause = throwable;
    }

    public ExtCertPathValidatorException(String s, Throwable throwable, CertPath certpath, int i)
    {
        super(s, throwable, certpath, i);
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }
}
