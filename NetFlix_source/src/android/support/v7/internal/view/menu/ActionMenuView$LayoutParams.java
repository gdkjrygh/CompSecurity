// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuView

public static class isOverflowButton extends android.widget.nMenuView.LayoutParams
{

    public int cellsUsed;
    public boolean expandable;
    public boolean expanded;
    public int extraPixels;
    public boolean isOverflowButton;
    public boolean preventEdgeOffset;

    public (int i, int j)
    {
        super(i, j);
        isOverflowButton = false;
    }

    public isOverflowButton(int i, int j, boolean flag)
    {
        super(i, j);
        isOverflowButton = flag;
    }

    public isOverflowButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public isOverflowButton(isOverflowButton isoverflowbutton)
    {
        super(isoverflowbutton);
        isOverflowButton = isoverflowbutton.isOverflowButton;
    }
}
