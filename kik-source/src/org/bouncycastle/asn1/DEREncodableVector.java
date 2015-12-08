// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            DEREncodable

public class DEREncodableVector
{

    Vector b;

    public DEREncodableVector()
    {
        b = new Vector();
    }

    public DEREncodable a(int i)
    {
        return (DEREncodable)b.elementAt(i);
    }

    public void a(DEREncodable derencodable)
    {
        b.addElement(derencodable);
    }
}
