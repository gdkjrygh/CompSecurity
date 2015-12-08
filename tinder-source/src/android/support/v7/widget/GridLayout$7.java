// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

static final class unds extends ignment
{

    public final int getAlignmentValue(View view, int i, int j)
    {
        if (view.getVisibility() == 8)
        {
            i = 0;
        } else
        {
            j = view.getBaseline();
            i = j;
            if (j == -1)
            {
                return 0x80000000;
            }
        }
        return i;
    }

    public final unds getBounds()
    {
        return new GridLayout.Bounds() {

            private int size;
            final GridLayout._cls7 this$0;

            protected int getOffset(GridLayout gridlayout, View view, GridLayout.Alignment alignment, int i, boolean flag)
            {
                return Math.max(0, super.getOffset(gridlayout, view, alignment, i, flag));
            }

            protected void include(int i, int j)
            {
                super.include(i, j);
                size = Math.max(size, i + j);
            }

            protected void reset()
            {
                super.reset();
                size = 0x80000000;
            }

            protected int size(boolean flag)
            {
                return Math.max(super.size(flag), size);
            }

            
            {
                this$0 = GridLayout._cls7.this;
                super(null);
            }
        };
    }

    final String getDebugString()
    {
        return "BASELINE";
    }

    final int getGravityOffset(View view, int i)
    {
        return 0;
    }

    unds()
    {
    }
}
