// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.a:
//            c, g, b, d

final class e
    implements c
{
    private static final class a
        implements g
    {

        List a;
        List b;
        View c;
        long d;
        long e;
        float f;
        Runnable g;
        private boolean h;
        private boolean i;

        public final void a()
        {
            if (h)
            {
                return;
            }
            h = true;
            for (int j = a.size() - 1; j >= 0; j--)
            {
                ((b)a.get(j)).onAnimationStart(this);
            }

            f = 0.0F;
            d = c.getDrawingTime();
            c.postDelayed(g, 16L);
        }

        public final void a(long l)
        {
            if (!h)
            {
                e = l;
            }
        }

        public final void a(b b1)
        {
            a.add(b1);
        }

        public final void a(d d1)
        {
            b.add(d1);
        }

        public final void a(View view)
        {
            c = view;
        }

        final void b()
        {
            for (int j = a.size() - 1; j >= 0; j--)
            {
                ((b)a.get(j)).onAnimationEnd(this);
            }

        }

        public final void c()
        {
            if (i)
            {
                return;
            }
            i = true;
            if (h)
            {
                for (int j = a.size() - 1; j >= 0; j--)
                {
                    ((b)a.get(j)).onAnimationCancel(this);
                }

            }
            b();
        }

        public final float d()
        {
            return f;
        }

        public a()
        {
            a = new ArrayList();
            b = new ArrayList();
            e = 200L;
            f = 0.0F;
            h = false;
            i = false;
            g = new _cls1(this);
        }
    }


    e()
    {
    }

    public final g a()
    {
        return new a();
    }

    public final void a(View view)
    {
    }

    // Unreferenced inner class android/support/v4/a/e$a$1

/* anonymous class */
    final class a._cls1
        implements Runnable
    {

        final a a;

        public final void run()
        {
            float f = ((float)(a.c.getDrawingTime() - a.d) * 1.0F) / (float)a.e;
            if (f > 1.0F || a.c.getParent() == null)
            {
                f = 1.0F;
            }
            a.f = f;
            a a1 = a;
            for (int i = a1.b.size() - 1; i >= 0; i--)
            {
                ((d)a1.b.get(i)).onAnimationUpdate(a1);
            }

            if (a.f >= 1.0F)
            {
                a.b();
                return;
            } else
            {
                a.c.postDelayed(a.g, 16L);
                return;
            }
        }

            
            {
                a = a1;
                super();
            }
    }

}
