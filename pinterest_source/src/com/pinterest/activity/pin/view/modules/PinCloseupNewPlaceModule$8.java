// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.pinterest.activity.pin.view.modules.util.PinMapMarker;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupNewPlaceModule

class this._cls0
    implements Runnable
{

    final PinCloseupNewPlaceModule this$0;

    public void run()
    {
        PinCloseupNewPlaceModule.access$500(PinCloseupNewPlaceModule.this).bringToFront();
        PinCloseupNewPlaceModule.access$600(PinCloseupNewPlaceModule.this).setVisibility(0);
        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        valueanimator.setDuration(Constants.ANIM_SPEED_FAST);
        class _cls1
            implements android.animation.ValueAnimator.AnimatorUpdateListener
        {

            final PinCloseupNewPlaceModule._cls8 this$1;

            public void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                PinCloseupNewPlaceModule.access$600(this$0).setAlpha(((Float)valueanimator1.getAnimatedValue()).floatValue());
            }

            _cls1()
            {
                this$1 = PinCloseupNewPlaceModule._cls8.this;
                super();
            }
        }

        valueanimator.addUpdateListener(new _cls1());
        valueanimator.start();
    }

    _cls1()
    {
        this$0 = PinCloseupNewPlaceModule.this;
        super();
    }
}
