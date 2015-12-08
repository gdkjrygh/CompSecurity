// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.exception;

import java.security.cert.CertificateEncodingException;

// Referenced classes of package org.spongycastle.jce.exception:
//            ExtException

public class ExtCertificateEncodingException extends CertificateEncodingException
    implements ExtException
{

    private Throwable a;

    public Throwable getCause()
    {
        return a;
    }
}
