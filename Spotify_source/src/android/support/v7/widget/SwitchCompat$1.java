// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v7.widget:
//            SwitchCompat

public final class a
    implements android.view.animation.tionListener
{

    private boolean a;
    private SwitchCompat b;

    public final void onAnimationEnd(Animation animation)
    {
        if (SwitchCompat.a(b) == animation)
        {
            animation = b;
            float f;
            if (a)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            SwitchCompat.a(animation, f);
            SwitchCompat.b(b);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    nListener(SwitchCompat switchcompat, boolean flag)
    {
        b = switchcompat;
        a = flag;
        super();
    }
}
