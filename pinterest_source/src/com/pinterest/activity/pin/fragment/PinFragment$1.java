// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.pinterest.activity.pin.view.PinCloseupAccessoryActionBar;
import com.pinterest.activity.pin.view.PinCloseupView;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinFragment

class this._cls0
    implements Runnable
{

    final PinFragment this$0;

    public void run()
    {
        Object obj = getView();
        if (obj == null)
        {
            return;
        } else
        {
            PinFragment.access$002(PinFragment.this, new PinCloseupAccessoryActionBar(((View) (obj)).getContext()));
            obj = new android.widget.youtParams(-1, Constants.ACTIONBAR_HEIGHT);
            obj.gravity = 80;
            PinFragment.access$000(PinFragment.this).setPin(_pin, PinFragment.access$100(PinFragment.this).detailsLoaded());
            PinFragment.access$000(PinFragment.this).setVisibility(4);
            PinFragment.access$000(PinFragment.this).setTranslationY(Constants.ACTIONBAR_HEIGHT);
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(PinFragment.access$000(PinFragment.this), "translationY", new float[] {
                0.0F
            });
            objectanimator.setInterpolator(new DecelerateInterpolator());
            objectanimator.setDuration(200L);
            objectanimator.start();
            _rootVw.addView(PinFragment.access$000(PinFragment.this), ((android.view.utParams) (obj)));
            class _cls1
                implements Runnable
            {

                final PinFragment._cls1 this$1;

                public void run()
                {
                    PinFragment.access$200(this$0);
                    PinFragment.access$300(this$0);
                }

            _cls1()
            {
                this$1 = PinFragment._cls1.this;
                super();
            }
            }

            PinFragment.access$000(PinFragment.this).post(new _cls1());
            return;
        }
    }

    _cls1()
    {
        this$0 = PinFragment.this;
        super();
    }
}
