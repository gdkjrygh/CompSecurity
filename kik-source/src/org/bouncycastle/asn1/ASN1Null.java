// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DEROutputStream, DERObject

public abstract class ASN1Null extends ASN1Object
{

    public ASN1Null()
    {
    }

    abstract void a(DEROutputStream deroutputstream);

    final boolean a(DERObject derobject)
    {
        return derobject instanceof ASN1Null;
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
