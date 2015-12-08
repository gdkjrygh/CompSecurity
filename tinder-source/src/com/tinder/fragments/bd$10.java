// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.widget.ImageView;
import com.tinder.e.au;

// Referenced classes of package com.tinder.fragments:
//            bd

final class b extends au
{

    final ImageView a;
    final boolean b;
    final bd c;

    public final void onAnimationEnd(Animator animator)
    {
        animator = a;
        int i;
        if (b)
        {
            i = 0x7f0201bc;
        } else
        {
            i = 0x7f0201be;
        }
        animator.setImageResource(i);
    }

    (bd bd1, ImageView imageview, boolean flag)
    {
        c = bd1;
        a = imageview;
        b = flag;
        super();
    }
}
