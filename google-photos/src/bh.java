// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;

class bh
    implements android.view.animation.Animation.AnimationListener
{

    private boolean a;
    private View b;

    public bh(View view, Animation animation)
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
            mk.a(b, 0, null);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        a = bb.a(b, animation);
        if (a)
        {
            mk.a(b, 2, null);
        }
    }
}
