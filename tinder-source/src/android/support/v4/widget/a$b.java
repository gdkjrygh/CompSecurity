// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.x;
import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.v4.widget:
//            a

private final class <init>
    implements Runnable
{

    final a a;

    public final void run()
    {
        boolean flag1 = false;
        if (!android.support.v4.widget.a.a(a))
        {
            return;
        }
        if (android.support.v4.widget.a.b(a))
        {
            android.support.v4.widget.a.c(a);
            <init> <init>1 = android.support.v4.widget.a.d(a);
            <init>1.e = AnimationUtils.currentAnimationTimeMillis();
            <init>1.i = -1L;
            <init>1.f = <init>1.e;
            <init>1.j = 0.5F;
            <init>1.g = 0;
            <init>1.h = 0;
        }
        <init> <init>2 = android.support.v4.widget.a.d(a);
        boolean flag = flag1;
        if (<init>2.i > 0L)
        {
            flag = flag1;
            if (AnimationUtils.currentAnimationTimeMillis() > <init>2.i + (long)<init>2.k)
            {
                flag = true;
            }
        }
        if (flag || !android.support.v4.widget.a.e(a))
        {
            android.support.v4.widget.a.f(a);
            return;
        }
        if (android.support.v4.widget.a.g(a))
        {
            android.support.v4.widget.a.h(a);
            android.support.v4.widget.a.i(a);
        }
        if (<init>2.f == 0L)
        {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        } else
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            float f = <init>2.a(l);
            f = f * 4F + -4F * f * f;
            long l1 = l - <init>2.f;
            <init>2.f = l;
            <init>2.g = (int)((float)l1 * f * <init>2.c);
            <init>2.h = (int)(f * (float)l1 * <init>2.d);
            int i = <init>2.h;
            a.a(i);
            x.a(android.support.v4.widget.a.j(a), this);
            return;
        }
    }

    private onUtils(a a1)
    {
        a = a1;
        super();
    }

    a(a a1, byte byte0)
    {
        this(a1);
    }
}
