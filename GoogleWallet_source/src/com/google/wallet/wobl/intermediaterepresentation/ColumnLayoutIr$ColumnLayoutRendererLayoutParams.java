// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;


// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            ColumnLayoutIr

public static class rowSpan extends rowSpan
{

    private int column;
    private int columnSpan;
    private int row;
    private int rowSpan;

    public int getColumn()
    {
        return column;
    }

    public int getColumnSpan()
    {
        return columnSpan;
    }

    public int getRow()
    {
        return row;
    }

    public int getRowSpan()
    {
        return rowSpan;
    }

    public ()
    {
        super(-2, -2);
    }

    public (int i, int j, int k, int l)
    {
        this();
        column = i;
        row = j;
        columnSpan = k;
        rowSpan = l;
    }
}
