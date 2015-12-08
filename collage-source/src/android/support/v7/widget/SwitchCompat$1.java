// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v7.widget:
//            SwitchCompat

class val.newCheckedState
    implements android.view.animation.tionListener
{

    final SwitchCompat this$0;
    final boolean val$newCheckedState;

    public void onAnimationEnd(Animation animation)
    {
        if (SwitchCompat.access$100(SwitchCompat.this) == animation)
        {
            animation = SwitchCompat.this;
            float f;
            if (val$newCheckedState)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            SwitchCompat.access$200(animation, f);
            SwitchCompat.access$102(SwitchCompat.this, null);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    nListener()
    {
        this$0 = final_switchcompat;
        val$newCheckedState = Z.this;
        super();
    }
}
