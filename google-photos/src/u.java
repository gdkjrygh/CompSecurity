// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

public class u
    implements ds, w
{

    public static final int A = 0x7f090291;
    public static final int B = 0x7f09019f;
    public static final int C = 0x7f090292;
    public static final int D = 0x7f090290;
    public static final int a = 0x7f09023d;
    public static final int b = 0x7f09023c;
    public static final int c = 0x7f090241;
    public static final int d = 0x7f090146;
    public static final int e = 0x7f09007c;
    public static final int f = 0x7f09007d;
    public static final int g = 0x7f09023e;
    public static final int h = 0x7f090240;
    public static final int i = 0x7f090171;
    public static final int j = 0x7f09044a;
    public static final int k = 0x7f0901bf;
    public static final int l = 0x7f0900f9;
    public static final int m = 0x7f0900bf;
    public static final int n = 0x7f09019e;
    public static final int o = 0x7f090298;
    public static final int p = 0x7f0900f1;
    public static final int q = 0x7f090389;
    public static final int r = 0x7f0901bc;
    public static final int s = 0x7f0c0199;
    public static final int t = 0x7f0b02a5;
    public static final int u = 0x7f0b001b;
    public static final int v = 0x7f0b001c;
    public static final int w = 0x7f0b001a;
    public static final int x = 0x7f09019d;
    public static final int y = 0x7f090293;
    public static final int z = 0x7f09028e;
    private Animator E;

    public u()
    {
    }

    public u(Animator animator)
    {
        E = animator;
    }

    public final void a(long l1)
    {
        E.setDuration(l1);
    }

    public final void a(View view)
    {
        E.setTarget(view);
    }

    public final void a(m m1)
    {
        E.addListener(new t(m1, this));
    }

    public final void a(o o1)
    {
        if (E instanceof ValueAnimator)
        {
            ((ValueAnimator)E).addUpdateListener(new v(this, o1));
        }
    }

    public final void b_()
    {
        E.start();
    }

    public final void c()
    {
        E.cancel();
    }

    public final float d()
    {
        return ((ValueAnimator)E).getAnimatedFraction();
    }
}
