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

class this._cls0
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
        ViewCompat.o(bottomSheetContainer).c(200F).a(350L).a(BottomSheetDialogView.access$100(BottomSheetDialogView.this)).a(new ViewPropertyAnimatorListener() {

            boolean called;
            final BottomSheetDialogView._cls1 this$1;

            public void onAnimationCancel(View view)
            {
            }

            public void onAnimationEnd(View view)
            {
                if (!called)
                {
                    called = true;
                    BottomSheetDialogView.access$002(this$0, true);
                }
            }

            public void onAnimationStart(View view)
            {
            }

            
            {
                this$1 = BottomSheetDialogView._cls1.this;
                super();
                called = false;
            }
        }).b();
    }

    _cls1.called()
    {
        this$0 = BottomSheetDialogView.this;
        super();
    }
}
