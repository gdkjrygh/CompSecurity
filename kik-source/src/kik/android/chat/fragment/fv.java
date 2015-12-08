// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.ValueAnimator;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fv
    implements Runnable
{

    final ValueAnimator a;
    final KikChatFragment b;

    fv(KikChatFragment kikchatfragment, ValueAnimator valueanimator)
    {
        b = kikchatfragment;
        a = valueanimator;
        super();
    }

    public final void run()
    {
        if (a != null)
        {
            a.start();
        }
    }
}
