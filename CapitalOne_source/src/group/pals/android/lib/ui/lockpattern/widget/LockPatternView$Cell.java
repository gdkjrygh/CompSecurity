// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern.widget;

import java.lang.reflect.Array;

// Referenced classes of package group.pals.android.lib.ui.lockpattern.widget:
//            LockPatternView

public static class column
{

    static <init> sCells[][];
    int column;
    int row;

    private static void checkRange(int i, int j)
    {
        if (i < 0 || i > 2)
        {
            throw new IllegalArgumentException("row must be in range 0-2");
        }
        if (j < 0 || j > 2)
        {
            throw new IllegalArgumentException("column must be in range 0-2");
        } else
        {
            return;
        }
    }

    public static column of(int i, int j)
    {
        group/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
        JVM INSTR monitorenter ;
        column column1;
        checkRange(i, j);
        column1 = sCells[i][j];
        group/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
        JVM INSTR monitorexit ;
        return column1;
        Exception exception;
        exception;
        throw exception;
    }

    public int getColumn()
    {
        return column;
    }

    public int getRow()
    {
        return row;
    }

    public String toString()
    {
        return (new StringBuilder()).append("(row=").append(row).append(",clmn=").append(column).append(")").toString();
    }

    static 
    {
        sCells = (sCells[][])Array.newInstance(group/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell, new int[] {
            3, 3
        });
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                sCells[i][j] = new <init>(i, j);
            }

        }

    }

    private (int i, int j)
    {
        checkRange(i, j);
        row = i;
        column = j;
    }
}
