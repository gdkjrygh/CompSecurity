// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.invites:
//            BottomSheetDialogView

class called
    implements ViewPropertyAnimatorListener
{

    boolean called;
    final is._cls0 this$1;

    public void onAnimationCancel(View view)
    {
    }

    public void onAnimationEnd(View view)
    {
        if (!called)
        {
            called = true;
            BottomSheetDialogView.access$002(_fld0, true);
        }
    }

    public void onAnimationStart(View view)
    {
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
        called = false;
    }

    // Unreferenced inner class me/lyft/android/ui/invites/BottomSheetDialogView$1

/* anonymous class */
    class BottomSheetDialogView._cls1
        implements Action1
    {

        final BottomSheetDialogView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            bottomSheet.setPadding(bottomSheet.getPaddingLeft(), bottomSheet.getPaddingTop(), bottomSheet.getPaddingRight(), bottomSheet.getPaddingBottom() + 200);
            bottomSheetContainer.setTranslationY(bottomSheetContainer.getHeight() + 200);
            bottomSheetContainer.setVisibility(0);
            ViewCompat.o(backgroundView).a(0.2F).a(350L).b();
            ViewCompat.o(bottomSheetContainer).c(200F).a(350L).a(BottomSheetDialogView.access$100(BottomSheetDialogView.this)).a(new BottomSheetDialogView._cls1._cls1()).b();
        }

            
            {
                this$0 = BottomSheetDialogView.this;
                super();
            }
    }

}
