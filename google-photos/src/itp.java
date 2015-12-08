// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

final class itp extends AnimatorListenerAdapter
{

    private itf a;

    itp(itf itf1)
    {
        a = itf1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (itf.A(a) != null)
        {
            itf.A(a).setAlpha(1.0F);
        } else
        if (itf.B(a) != null)
        {
            itf.B(a).setAlpha(1.0F);
            return;
        }
    }
}
