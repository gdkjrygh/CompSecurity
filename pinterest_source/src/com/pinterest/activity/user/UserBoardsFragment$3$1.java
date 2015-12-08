// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import com.pinterest.activity.user.view.UserSuggestedPinnersView;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.user:
//            UserBoardsFragment

class this._cls1
    implements android.view.alLayoutListener
{

    final _cls1 this$1;

    public void onGlobalLayout()
    {
        UserBoardsFragment.access$1300(_fld0).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            0, UserBoardsFragment.access$1300(_fld0).getHeight()
        });
        class _cls1
            implements android.animation.ValueAnimator.AnimatorUpdateListener
        {

            final UserBoardsFragment._cls3._cls1 this$2;

            public void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                int i = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                valueanimator1 = UserBoardsFragment.access$1300(this$0).getLayoutParams();
                valueanimator1.height = i;
                UserBoardsFragment.access$1300(this$0).setLayoutParams(valueanimator1);
            }

            _cls1()
            {
                this$2 = UserBoardsFragment._cls3._cls1.this;
                super();
            }
        }

        valueanimator.addUpdateListener(new _cls1());
        valueanimator.setDuration(Resources.integer(0x7f0d000d).intValue());
        valueanimator.start();
    }

    _cls1()
    {
        this$1 = this._cls1.this;
        super();
    }
}
