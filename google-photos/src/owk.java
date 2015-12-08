// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class owk extends AnimatorListenerAdapter
{

    private View a;
    private owh b;

    owk(owh owh1, View view)
    {
        b = owh1;
        a = view;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        int i = owh.a(b).c(a);
        if (i != -1 && owh.b(b).b(i))
        {
            owh.b(b).a(owh.a(b), i);
        }
        owh.c(b);
    }
}
