// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Encodable

public class ASN1EncodableVector
{

    Vector v;

    public ASN1EncodableVector()
    {
        v = new Vector();
    }

    public void add(ASN1Encodable asn1encodable)
    {
        v.addElement(asn1encodable);
    }

    public ASN1Encodable get(int i)
    {
        return (ASN1Encodable)v.elementAt(i);
    }

    public int size()
    {
        return v.size();
    }
}
