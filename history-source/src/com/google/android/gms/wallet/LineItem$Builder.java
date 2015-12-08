// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            LineItem

public final class <init>
{

    final LineItem avc;

    public LineItem build()
    {
        return avc;
    }

    public avc setCurrencyCode(String s)
    {
        avc.auG = s;
        return this;
    }

    public avc setDescription(String s)
    {
        avc.description = s;
        return this;
    }

    public ion setQuantity(String s)
    {
        avc.auZ = s;
        return this;
    }

    public avc setRole(int i)
    {
        avc.avb = i;
        return this;
    }

    public avc setTotalPrice(String s)
    {
        avc.auF = s;
        return this;
    }

    public avc setUnitPrice(String s)
    {
        avc.ava = s;
        return this;
    }

    private (LineItem lineitem)
    {
        avc = lineitem;
        super();
    }

    avc(LineItem lineitem, avc avc1)
    {
        this(lineitem);
    }
}
