// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.baselib.view:
//            f, e

final class g extends AnimatorListenerAdapter
{

    final ImageView a;
    final f b;

    g(f f1, ImageView imageview)
    {
        b = f1;
        a = imageview;
        super();
    }

    public final void onAnimationCancel(Animator animator)
    {
        b.a.removeView(a);
    }

    public final void onAnimationEnd(Animator animator)
    {
        b.a.removeView(a);
    }
}
