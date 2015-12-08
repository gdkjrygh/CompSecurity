// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ac;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

static class <init>
{

    public int after;
    public int before;
    public int flexibility;

    protected int getOffset(GridLayout gridlayout, View view, nt nt, int i, boolean flag)
    {
        return before - nt.getAlignmentValue(view, i, ac.b(gridlayout));
    }

    protected void include(int i, int j)
    {
        before = Math.max(before, i);
        after = Math.max(after, j);
    }

    protected final void include(GridLayout gridlayout, View view, after after1, after after2, int i)
    {
        flexibility = flexibility & after1.tFlexibility();
        int j = after1.tAbsoluteAlignment(after2.rizontal).getAlignmentValue(view, i, ac.b(gridlayout));
        include(j, i - j);
    }

    protected void reset()
    {
        before = 0x80000000;
        after = 0x80000000;
        flexibility = 2;
    }

    protected int size(boolean flag)
    {
        if (!flag && GridLayout.canStretch(flexibility))
        {
            return 0x186a0;
        } else
        {
            return before + after;
        }
    }

    public String toString()
    {
        return (new StringBuilder("Bounds{before=")).append(before).append(", after=").append(after).append('}').toString();
    }

    private nt()
    {
        reset();
    }

    reset(reset reset1)
    {
        this();
    }
}
