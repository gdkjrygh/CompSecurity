// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import android.view.animation.Animation;
import kik.android.util.cv;

// Referenced classes of package kik.android.widget:
//            ProgressWidget

final class dd
    implements android.view.animation.Animation.AnimationListener
{

    final ProgressWidget a;

    dd(ProgressWidget progresswidget)
    {
        a = progresswidget;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        cv.e(new View[] {
            a
        });
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
