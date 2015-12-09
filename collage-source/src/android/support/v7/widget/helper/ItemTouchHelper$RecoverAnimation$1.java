// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.support.v4.animation.AnimatorUpdateListenerCompat;
import android.support.v4.animation.ValueAnimatorCompat;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

class val.this._cls0
    implements AnimatorUpdateListenerCompat
{

    final  this$1;
    final ItemTouchHelper val$this$0;

    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
    {
        tFraction(valueanimatorcompat.getAnimatedFraction());
    }

    I()
    {
        this$1 = final_i;
        val$this$0 = ItemTouchHelper.this;
        super();
    }
}
