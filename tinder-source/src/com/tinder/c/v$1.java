// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.animation.Animator;
import android.widget.ImageView;
import com.tinder.e.au;

// Referenced classes of package com.tinder.c:
//            v

final class init> extends au
{

    final ImageView a;
    final v b;

    public final void onAnimationStart(Animator animator)
    {
        a.setColorFilter(v.a(b));
    }

    ageView(v v1, ImageView imageview)
    {
        b = v1;
        a = imageview;
        super();
    }
}
