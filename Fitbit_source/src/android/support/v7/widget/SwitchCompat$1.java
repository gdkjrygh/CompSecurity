// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v7.widget:
//            SwitchCompat

class val.diff extends Animation
{

    final SwitchCompat this$0;
    final float val$diff;
    final float val$startPosition;

    protected void applyTransformation(float f, Transformation transformation)
    {
        SwitchCompat.access$000(SwitchCompat.this, val$startPosition + val$diff * f);
    }

    ()
    {
        this$0 = final_switchcompat;
        val$startPosition = f;
        val$diff = F.this;
        super();
    }
}
