// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.invites:
//            BottomSheetDialogView

class called
    implements ViewPropertyAnimatorListener
{

    boolean called;
    final BottomSheetDialogView this$0;

    public void onAnimationCancel(View view)
    {
    }

    public void onAnimationEnd(View view)
    {
        if (!called)
        {
            called = true;
            dialogFlow.dismiss();
            BottomSheetDialogView.access$002(BottomSheetDialogView.this, false);
            BottomSheetDialogView.access$402(BottomSheetDialogView.this, false);
        }
    }

    public void onAnimationStart(View view)
    {
    }

    r()
    {
        this$0 = BottomSheetDialogView.this;
        super();
        called = false;
    }
}
