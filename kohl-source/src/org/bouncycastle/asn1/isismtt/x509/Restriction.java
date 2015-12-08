// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.DirectoryString;

public class Restriction extends ASN1Object
{

    private DirectoryString restriction;

    public Restriction(String s)
    {
        restriction = new DirectoryString(s);
    }

    private Restriction(DirectoryString directorystring)
    {
        restriction = directorystring;
    }

    public static Restriction getInstance(Object obj)
    {
        if (obj instanceof Restriction)
        {
            return (Restriction)obj;
        }
        if (obj != null)
        {
            return new Restriction(DirectoryString.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DirectoryString getRestriction()
    {
        return restriction;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return restriction.toASN1Primitive();
    }
}
