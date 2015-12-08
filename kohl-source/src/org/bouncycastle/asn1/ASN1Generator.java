// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.OutputStream;

public abstract class ASN1Generator
{

    protected OutputStream _out;

    public ASN1Generator(OutputStream outputstream)
    {
        _out = outputstream;
    }

    public abstract OutputStream getRawOutputStream();
}
