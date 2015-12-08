// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.AnimatorSet;

// Referenced classes of package kik.android.chat.fragment:
//            dg

final class di
    implements Runnable
{

    final AnimatorSet a;
    final dg b;

    di(dg dg, AnimatorSet animatorset)
    {
        b = dg;
        a = animatorset;
        super();
    }

    public final void run()
    {
        a.start();
    }
}
