// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.util.Vector;

public class CertificateRequest
{

    private short a[];
    private Vector b;

    public CertificateRequest(short aword0[], Vector vector)
    {
        a = aword0;
        b = vector;
    }

    public Vector getCertificateAuthorities()
    {
        return b;
    }

    public short[] getCertificateTypes()
    {
        return a;
    }
}
