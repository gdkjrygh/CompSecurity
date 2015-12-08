// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.animation.Animator;
import com.kik.m.c;

// Referenced classes of package kik.android.widget:
//            GifSearchFragment

final class bc extends c
{

    final boolean a;
    final GifSearchFragment b;

    bc(GifSearchFragment gifsearchfragment, boolean flag)
    {
        b = gifsearchfragment;
        a = flag;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        animator = b;
        int i;
        if (a)
        {
            i = GifSearchFragment.a.d;
        } else
        {
            i = kik.android.widget.GifSearchFragment.a.c;
        }
        GifSearchFragment.b(animator, i);
    }

    public final void onAnimationStart(Animator animator)
    {
        animator = b;
        int i;
        if (a)
        {
            i = GifSearchFragment.a.a;
        } else
        {
            i = GifSearchFragment.a.b;
        }
        GifSearchFragment.b(animator, i);
    }
}
