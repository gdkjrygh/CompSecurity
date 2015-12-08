// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import com.tinder.activities.ActivityMain;
import com.tinder.e.au;
import com.tinder.views.LoadingView;

// Referenced classes of package com.tinder.fragments:
//            ab

final class a extends au
{

    final ab a;

    public final void onAnimationEnd(Animator animator)
    {
        try
        {
            ((ActivityMain)a.getActivity()).G();
        }
        // Misplaced declaration of an exception variable
        catch (Animator animator) { }
        ab.a(a).startAllPingAnimations();
    }

    tion(ab ab1)
    {
        a = ab1;
        super();
    }
}
