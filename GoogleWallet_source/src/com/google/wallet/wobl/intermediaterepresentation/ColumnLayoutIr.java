// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation, HasChildren

public class ColumnLayoutIr extends IntermediateRepresentation
    implements HasChildren
{
    public static class ColumnLayoutRendererLayoutParams extends HasChildren.RendererLayoutParams
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

        public ColumnLayoutRendererLayoutParams()
        {
            super(-2, -2);
        }

        public ColumnLayoutRendererLayoutParams(int i, int j, int k, int l)
        {
            this();
            column = i;
            row = j;
            columnSpan = k;
            rowSpan = l;
        }
    }


    private List children;
    private List columnWidths;

    public ColumnLayoutIr()
    {
        children = new ArrayList();
    }

    public void addChild(IntermediateRepresentation intermediaterepresentation)
    {
        children.add(intermediaterepresentation);
    }

    public List getChildren()
    {
        return new ArrayList(children);
    }

    public List getColumnWidths()
    {
        return columnWidths;
    }

    public void setColumnWidths(List list)
    {
        columnWidths = list;
    }
}
