// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Interpolator;

final class p
{
    static interface a
    {

        public abstract void a();

        public abstract void b();
    }

    static class b
        implements a
    {

        public void a()
        {
        }

        public void b()
        {
        }

        b()
        {
        }
    }

    static interface c
    {

        public abstract void a(p p1);
    }

    static interface d
    {

        public abstract p a();
    }

    static abstract class e
    {

        abstract void a();

        abstract void a(float f1, float f2);

        abstract void a(int i);

        abstract void a(int i, int j);

        abstract void a(a a1);

        abstract void a(b b1);

        abstract void a(Interpolator interpolator);

        abstract boolean b();

        abstract int c();

        abstract float d();

        abstract void e();

        abstract float f();

        e()
        {
        }
    }

    static interface e.a
    {

        public abstract void a();

        public abstract void b();
    }

    static interface e.b
    {

        public abstract void a();
    }


    private final e a;

    p(e e1)
    {
        a = e1;
    }

    public final void a()
    {
        a.a();
    }

    public final void a(float f1, float f2)
    {
        a.a(f1, f2);
    }

    public final void a(int i)
    {
        a.a(i);
    }

    public final void a(int i, int j)
    {
        a.a(i, j);
    }

    public final void a(a a1)
    {
        a.a(new e.a(a1) {

            final a a;
            final p b;

            public final void a()
            {
                a.a();
            }

            public final void b()
            {
                a.b();
            }

            
            {
                b = p.this;
                a = a1;
                super();
            }
        });
    }

    public final void a(c c1)
    {
        a.a(new e.b(c1) {

            final c a;
            final p b;

            public final void a()
            {
                a.a(b);
            }

            
            {
                b = p.this;
                a = c1;
                super();
            }
        });
    }

    public final void a(Interpolator interpolator)
    {
        a.a(interpolator);
    }

    public final boolean b()
    {
        return a.b();
    }

    public final int c()
    {
        return a.c();
    }

    public final float d()
    {
        return a.d();
    }

    public final void e()
    {
        a.e();
    }

    public final float f()
    {
        return a.f();
    }
}
