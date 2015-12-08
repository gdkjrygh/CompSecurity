// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package me.lyft.android.ui.invites:
//            BottomSheetDialogView

class init> extends android.support.v4.widget.
{

    final BottomSheetDialogView this$0;

    public int clampViewPositionVertical(View view, int i, int j)
    {
        j = getHeight();
        int k = view.getHeight();
        int l = getHeight();
        int i1 = view.getHeight();
        return Math.min(Math.max(i, j - (k - 200)), l + i1);
    }

    public int getViewVerticalDragRange(View view)
    {
        return 1;
    }

    public void onViewDragStateChanged(int i)
    {
        super.onViewDragStateChanged(i);
        i;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (bottomSheetContainer.getTop() >= getHeight())
        {
            animateOut();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        view.setY(j);
        float f = (float)(backgroundView.getHeight() - j) / ((float)view.getHeight() - 200F);
        backgroundView.setAlpha(f * 0.2F);
    }

    public void onViewReleased(View view, float f, float f1)
    {
        int i = getHeight();
        int j = view.getHeight() - 200;
        if (view.getTop() <= i - j / 2)
        {
            i -= j;
        }
        if (BottomSheetDialogView.access$300(BottomSheetDialogView.this).a(view.getLeft(), i))
        {
            invalidate();
        }
    }

    public boolean tryCaptureView(View view, int i)
    {
        return view == bottomSheetContainer;
    }

    ()
    {
        this$0 = BottomSheetDialogView.this;
        super();
    }
}
