// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            MaterialProgressDrawable

class ng
    implements android.view.animation.
{

    final MaterialProgressDrawable this$0;
    final ng val$ring;

    public void onAnimationEnd(Animation animation)
    {
        val$ring.goToNextColor();
        val$ring.storeOriginals();
        val$ring.setShowArrow(false);
        MaterialProgressDrawable.access$300(MaterialProgressDrawable.this).startAnimation(MaterialProgressDrawable.access$200(MaterialProgressDrawable.this));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ng()
    {
        this$0 = final_materialprogressdrawable;
        val$ring = ng.this;
        super();
    }
}
