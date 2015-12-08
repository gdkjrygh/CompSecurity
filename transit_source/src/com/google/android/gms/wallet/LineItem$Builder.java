// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            LineItem

public final class <init>
{

    final LineItem tT;

    public LineItem build()
    {
        return tT;
    }

    public tT setCurrencyCode(String s)
    {
        tT.tE = s;
        return this;
    }

    public tT setDescription(String s)
    {
        tT.description = s;
        return this;
    }

    public ion setQuantity(String s)
    {
        tT.tQ = s;
        return this;
    }

    public tT setRole(int i)
    {
        tT.tS = i;
        return this;
    }

    public tT setTotalPrice(String s)
    {
        tT.tD = s;
        return this;
    }

    public tT setUnitPrice(String s)
    {
        tT.tR = s;
        return this;
    }

    private (LineItem lineitem)
    {
        tT = lineitem;
        super();
    }

    tT(LineItem lineitem, tT tt)
    {
        this(lineitem);
    }
}
