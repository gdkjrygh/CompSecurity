// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;


// Referenced classes of package org.spongycastle.asn1:
//            DERObjectIdentifier

public class ASN1ObjectIdentifier extends DERObjectIdentifier
{

    public ASN1ObjectIdentifier(String s)
    {
        super(s);
    }

    ASN1ObjectIdentifier(byte abyte0[])
    {
        super(abyte0);
    }

    public final ASN1ObjectIdentifier b(String s)
    {
        return new ASN1ObjectIdentifier((new StringBuilder()).append(super.a).append(".").append(s).toString());
    }
}
