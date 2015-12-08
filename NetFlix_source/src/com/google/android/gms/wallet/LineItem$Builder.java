// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            LineItem

public final class <init>
{

    final LineItem aby;

    public LineItem build()
    {
        return aby;
    }

    public aby setCurrencyCode(String s)
    {
        aby.abd = s;
        return this;
    }

    public aby setDescription(String s)
    {
        aby.description = s;
        return this;
    }

    public ion setQuantity(String s)
    {
        aby.abv = s;
        return this;
    }

    public aby setRole(int i)
    {
        aby.abx = i;
        return this;
    }

    public aby setTotalPrice(String s)
    {
        aby.abc = s;
        return this;
    }

    public aby setUnitPrice(String s)
    {
        aby.abw = s;
        return this;
    }

    private (LineItem lineitem)
    {
        aby = lineitem;
        super();
    }

    aby(LineItem lineitem, aby aby1)
    {
        this(lineitem);
    }
}
