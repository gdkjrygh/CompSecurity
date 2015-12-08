// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.view.View;
import com.tinder.e.au;

// Referenced classes of package com.tinder.fragments:
//            ac

final class a extends au
{

    final View a;
    final ac b;

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(0);
    }

    (ac ac1, View view)
    {
        b = ac1;
        a = view;
        super();
    }
}
