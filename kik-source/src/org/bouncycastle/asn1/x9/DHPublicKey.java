// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

public class DHPublicKey extends ASN1Encodable
{

    private DERInteger a;

    private DHPublicKey(DERInteger derinteger)
    {
        if (derinteger == null)
        {
            throw new IllegalArgumentException("'y' cannot be null");
        } else
        {
            a = derinteger;
            return;
        }
    }

    public static DHPublicKey a(Object obj)
    {
        if (obj == null || (obj instanceof DHPublicKey))
        {
            return (DHPublicKey)obj;
        }
        if (obj instanceof DERInteger)
        {
            return new DHPublicKey((DERInteger)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid DHPublicKey: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        return a;
    }

    public final DERInteger e()
    {
        return a;
    }
}
