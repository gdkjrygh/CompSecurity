// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.DERInteger;

public class CRLNumber extends DERInteger
{

    public CRLNumber(BigInteger biginteger)
    {
        super(biginteger);
    }

    public String toString()
    {
        return (new StringBuilder("CRLNumber: ")).append(f()).toString();
    }
}
