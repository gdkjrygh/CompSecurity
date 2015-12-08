// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class jhy extends AnimatorListenerAdapter
{

    private jhw a;

    jhy(jhw jhw1)
    {
        a = jhw1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.b();
    }
}
