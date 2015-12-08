// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;

// Referenced classes of package kik.android.widget:
//            x

public class FragmentContainerFrame extends FrameLayout
{

    public FragmentContainerFrame(Context context)
    {
        this(context, null);
    }

    public FragmentContainerFrame(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FragmentContainerFrame(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static void a(FragmentContainerFrame fragmentcontainerframe, View view)
    {
        fragmentcontainerframe.FrameLayout.removeView(view);
    }

    public void removeView(View view)
    {
        if (view != null)
        {
            Animation animation = view.getAnimation();
            if (animation != null && animation.getZAdjustment() == -1)
            {
                animation.setAnimationListener(new x(this, view));
                return;
            }
        }
        super.removeView(view);
    }
}
