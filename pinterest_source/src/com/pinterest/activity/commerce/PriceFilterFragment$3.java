// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.animation.ObjectAnimator;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.commerce:
//            PriceFilterFragment

class this._cls0
    implements Runnable
{

    final PriceFilterFragment this$0;

    public void run()
    {
        if (_draggerVw == null)
        {
            return;
        } else
        {
            PriceFilterFragment.access$902(PriceFilterFragment.this, ObjectAnimator.ofFloat(_draggerVw, "translationY", new float[] {
                (float)(-Constants.MARGIN), 0.0F
            }));
            PriceFilterFragment.access$900(PriceFilterFragment.this).setDuration(500L);
            PriceFilterFragment.access$900(PriceFilterFragment.this).start();
            return;
        }
    }

    ()
    {
        this$0 = PriceFilterFragment.this;
        super();
    }
}
