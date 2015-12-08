// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            DEREncodableVector, DEREncodable

public class ASN1EncodableVector extends DEREncodableVector
{

    Vector a;

    public ASN1EncodableVector()
    {
        a = new Vector();
    }

    public final DEREncodable a(int i)
    {
        return (DEREncodable)a.elementAt(i);
    }

    public final void a(DEREncodable derencodable)
    {
        a.addElement(derencodable);
    }
}
