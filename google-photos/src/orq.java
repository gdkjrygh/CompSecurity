// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

final class orq extends AnimatorListenerAdapter
{

    private final orn a;
    private ork b;

    public orq(ork ork1, orn orn)
    {
        b = ork1;
        super();
        a = orn;
    }

    public final void onAnimationEnd(Animator animator)
    {
        ork.a(b, a);
        ork.a(b, null);
        for (animator = ork.c(b).iterator(); animator.hasNext(); ((oro)animator.next()).b()) { }
    }
}
