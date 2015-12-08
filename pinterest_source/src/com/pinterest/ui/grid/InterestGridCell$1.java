// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.kit.utils.AnimationUtils;
import com.pinterest.ui.imageview.ProportionalImageView;

// Referenced classes of package com.pinterest.ui.grid:
//            InterestGridCell

class this._cls0
    implements android.view.r
{

    final InterestGridCell this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (InterestGridCell.access$000(InterestGridCell.this))
        {
            view = new AnimatorSet();
            if (motionevent.getAction() == 0 && !InterestGridCell.access$100(InterestGridCell.this))
            {
                view.playTogether(new Animator[] {
                    AnimationUtils.springAnimate(InterestGridCell.this, "scaleX", 1.0F, 0.85F, 1.0F, 1.25F), AnimationUtils.springAnimate(InterestGridCell.this, "scaleY", 1.0F, 0.85F, 1.0F, 1.25F)
                });
                view.start();
            } else
            if ((motionevent.getAction() == 1 || motionevent.getAction() == 3) && InterestGridCell.access$100(InterestGridCell.this))
            {
                view.playTogether(new Animator[] {
                    AnimationUtils.springAnimate(InterestGridCell.this, "scaleX", 0.85F, 1.0F, 1.0F, 1.25F), AnimationUtils.springAnimate(InterestGridCell.this, "scaleY", 0.85F, 1.0F, 1.0F, 1.25F)
                });
                view.start();
            }
        }
        if (InterestGridCell.access$200(InterestGridCell.this))
        {
            if (motionevent.getAction() == 0 && !InterestGridCell.access$100(InterestGridCell.this))
            {
                _image.setColorFilter(getResources().getColor(0x7f0e0076));
                InterestGridCell.access$102(InterestGridCell.this, true);
                return true;
            }
            if (motionevent.getAction() == 1 && InterestGridCell.access$100(InterestGridCell.this))
            {
                _image.setColorFilter(0);
                InterestGridCell.access$102(InterestGridCell.this, false);
                callOnClick();
                return true;
            }
            if (motionevent.getAction() == 3 && InterestGridCell.access$100(InterestGridCell.this))
            {
                _image.setColorFilter(0);
                InterestGridCell.access$102(InterestGridCell.this, false);
                return true;
            }
        }
        return false;
    }

    ageView()
    {
        this$0 = InterestGridCell.this;
        super();
    }
}
