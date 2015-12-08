// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Encodable, DERTags, DEROutputStream

public abstract class DERObject extends ASN1Encodable
    implements DERTags
{

    public DERObject()
    {
    }

    abstract void a(DEROutputStream deroutputstream);

    public final DERObject d()
    {
        return this;
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
