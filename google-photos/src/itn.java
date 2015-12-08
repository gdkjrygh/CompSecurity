// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class itn extends AnimatorListenerAdapter
{

    private itf a;

    itn(itf itf1)
    {
        a = itf1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        itf.a(a, iua.e);
    }

    public final void onAnimationStart(Animator animator)
    {
        itf.a(a, iua.f);
    }
}
