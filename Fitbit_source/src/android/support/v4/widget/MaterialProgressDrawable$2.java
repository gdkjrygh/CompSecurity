// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

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
    }

    public void onAnimationRepeat(Animation animation)
    {
        val$ring.storeOriginals();
        val$ring.goToNextColor();
        val$ring.setStartTrim(val$ring.getEndTrim());
        if (mFinishing)
        {
            mFinishing = false;
            animation.setDuration(1333L);
            val$ring.setShowArrow(false);
            return;
        } else
        {
            MaterialProgressDrawable.access$502(MaterialProgressDrawable.this, (MaterialProgressDrawable.access$500(MaterialProgressDrawable.this) + 1.0F) % 5F);
            return;
        }
    }

    public void onAnimationStart(Animation animation)
    {
        MaterialProgressDrawable.access$502(MaterialProgressDrawable.this, 0.0F);
    }

    ng()
    {
        this$0 = final_materialprogressdrawable;
        val$ring = ng.this;
        super();
    }
}
