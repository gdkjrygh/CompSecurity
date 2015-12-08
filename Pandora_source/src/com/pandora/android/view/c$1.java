// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.pandora.android.view:
//            c

class tenerAdapter extends AnimatorListenerAdapter
{

    final c a;

    public void onAnimationEnd(Animator animator)
    {
        c.a(a, false);
    }

    tenerAdapter(c c1)
    {
        a = c1;
        super();
    }
}
