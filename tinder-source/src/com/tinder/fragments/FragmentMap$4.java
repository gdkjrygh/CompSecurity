// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import com.google.android.m4b.maps.model.j;
import com.tinder.e.au;

// Referenced classes of package com.tinder.fragments:
//            FragmentMap

final class a extends au
{

    final j a;
    final FragmentMap b;

    public final void onAnimationEnd(Animator animator)
    {
        a.b();
        a.d();
    }

    (FragmentMap fragmentmap, j j1)
    {
        b = fragmentmap;
        a = j1;
        super();
    }
}
