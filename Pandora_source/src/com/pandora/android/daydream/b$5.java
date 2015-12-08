// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

// Referenced classes of package com.pandora.android.daydream:
//            b

class rAdapter extends AnimatorListenerAdapter
{

    final b a;

    public void onAnimationEnd(Animator animator)
    {
        b.a(a, false);
        b.b(a, false);
        b.a(a).clearColorFilter();
        b.b(a).clearColorFilter();
    }

    rAdapter(b b1)
    {
        a = b1;
        super();
    }
}
