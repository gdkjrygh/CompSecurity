// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.view.bq;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            am

class as
    implements android.view.animation.Animation.AnimationListener
{

    private boolean a;
    private View b;

    public as(View view, Animation animation)
    {
        a = false;
        if (view == null || animation == null)
        {
            return;
        } else
        {
            b = view;
            return;
        }
    }

    public void onAnimationEnd(Animation animation)
    {
        if (a)
        {
            bq.a(b, 0, null);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        a = am.a(b, animation);
        if (a)
        {
            bq.a(b, 2, null);
        }
    }
}
