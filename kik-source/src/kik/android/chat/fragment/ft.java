// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.ValueAnimator;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ft
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final int a;
    final KikChatFragment b;

    ft(KikChatFragment kikchatfragment, int i)
    {
        b = kikchatfragment;
        a = i;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = a;
        int j = ((Integer)valueanimator.getAnimatedValue()).intValue();
        KikChatFragment.m(b).setPadding(0, 0, 0, Integer.valueOf(i - j).intValue());
    }
}
