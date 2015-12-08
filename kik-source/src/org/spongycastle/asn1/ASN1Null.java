// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;


// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1OutputStream

public abstract class ASN1Null extends ASN1Primitive
{

    public ASN1Null()
    {
    }

    abstract void a(ASN1OutputStream asn1outputstream);

    final boolean a(ASN1Primitive asn1primitive)
    {
        return asn1primitive instanceof ASN1Null;
    }

    public int hashCode()
    {
        return -1;
    }

    public String toString()
    {
        return "NULL";
    }
}
