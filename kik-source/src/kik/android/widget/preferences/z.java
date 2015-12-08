// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.view.animation.Animation;
import com.kik.m.p;

// Referenced classes of package kik.android.widget.preferences:
//            y

final class z
    implements android.view.animation.Animation.AnimationListener
{

    final y a;

    z(y y1)
    {
        a = y1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (a.c instanceof p)
        {
            ((p)a.c).a();
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
