// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            MaterialProgressDrawable

final class ng
    implements android.view.animation.
{

    final MaterialProgressDrawable this$0;
    final ng val$ring;

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
        val$ring.storeOriginals();
        ng ng = val$ring;
        ng.setColorIndex(ng.getNextColorIndex());
        val$ring.setStartTrim(val$ring.mEndTrim);
        if (mFinishing)
        {
            mFinishing = false;
            animation.setDuration(1332L);
            val$ring.setShowArrow(false);
            return;
        } else
        {
            MaterialProgressDrawable.access$402(MaterialProgressDrawable.this, (MaterialProgressDrawable.access$400(MaterialProgressDrawable.this) + 1.0F) % 5F);
            return;
        }
    }

    public final void onAnimationStart(Animation animation)
    {
        MaterialProgressDrawable.access$402(MaterialProgressDrawable.this, 0.0F);
    }

    ng()
    {
        this$0 = final_materialprogressdrawable;
        val$ring = ng.this;
        super();
    }
}
