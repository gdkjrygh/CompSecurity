// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Interpolator;

final class g
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

        public abstract void a(g g1);
    }

    static interface d
    {

        public abstract g a();
    }

    static abstract class e
    {

        abstract void a();

        abstract void a(int i, int j);

        abstract void a(a a1);

        abstract void a(b b1);

        abstract void a(Interpolator interpolator);

        abstract boolean b();

        abstract int c();

        abstract void d();

        abstract void e();

        abstract void f();

        abstract float g();

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


    final e a;

    g(e e1)
    {
        a = e1;
    }

    public final void a(int i, int j)
    {
        a.a(i, j);
    }

    public final void a(c c1)
    {
        a.a(new e.b(c1) {

            final c a;
            final g b;

            public final void a()
            {
                a.a(b);
            }

            
            {
                b = g.this;
                a = c1;
                super();
            }
        });
    }

    public final void a(Interpolator interpolator)
    {
        a.a(interpolator);
    }

    // Unreferenced inner class android/support/design/widget/g$2

/* anonymous class */
    final class _cls2
        implements e.a
    {

        final a a;
        final g b;

        public final void a()
        {
            a.a();
        }

        public final void b()
        {
            a.b();
        }

            
            {
                b = g.this;
                a = a1;
                super();
            }
    }

}
