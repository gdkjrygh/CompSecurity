// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.photos.transition.ClipAnimationImageView;

final class inc extends AnimatorListenerAdapter
{

    private imz a;

    inc(imz imz1)
    {
        a = imz1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        imz.a(a, ine.c);
        if (imz.c(a) != null)
        {
            imz.a(a).setImageDrawable(imz.c(a));
        }
    }
}
