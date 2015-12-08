// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Encodable

public class ASN1EncodableVector
{

    Vector a;

    public ASN1EncodableVector()
    {
        a = new Vector();
    }

    public final ASN1Encodable a(int i)
    {
        return (ASN1Encodable)a.elementAt(i);
    }

    public final void a(ASN1Encodable asn1encodable)
    {
        a.addElement(asn1encodable);
    }
}
