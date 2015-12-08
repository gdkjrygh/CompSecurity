// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            LineItem

public final class <init>
{

    final LineItem aje;

    public LineItem build()
    {
        return aje;
    }

    public aje setCurrencyCode(String s)
    {
        aje.aiI = s;
        return this;
    }

    public aje setDescription(String s)
    {
        aje.description = s;
        return this;
    }

    public ion setQuantity(String s)
    {
        aje.ajb = s;
        return this;
    }

    public aje setRole(int i)
    {
        aje.ajd = i;
        return this;
    }

    public aje setTotalPrice(String s)
    {
        aje.aiH = s;
        return this;
    }

    public aje setUnitPrice(String s)
    {
        aje.ajc = s;
        return this;
    }

    private (LineItem lineitem)
    {
        aje = lineitem;
        super();
    }

    aje(LineItem lineitem, aje aje1)
    {
        this(lineitem);
    }
}
