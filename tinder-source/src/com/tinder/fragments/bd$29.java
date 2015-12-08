// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.e.au;
import com.tinder.views.CustomTextView;

// Referenced classes of package com.tinder.fragments:
//            bd

final class b extends au
{

    final View a;
    final ViewGroup b;
    final bd c;

    public final void onAnimationEnd(Animator animator)
    {
        a.setRotationY(0.0F);
        bd.x(c).setRotationY(0.0F);
        b.bringChildToFront(bd.b(c));
    }

    View(bd bd1, View view, ViewGroup viewgroup)
    {
        c = bd1;
        a = view;
        b = viewgroup;
        super();
    }
}
