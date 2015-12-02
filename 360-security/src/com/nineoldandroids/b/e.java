// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.a.o;
import com.nineoldandroids.b.a.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.nineoldandroids.b:
//            b

class e extends com.nineoldandroids.b.b
{
    private class a
        implements com.nineoldandroids.a.a.a, com.nineoldandroids.a.o.b
    {

        final e a;

        public void a(com.nineoldandroids.a.a a1)
        {
            if (e.b(a) != null)
            {
                e.b(a).a(a1);
            }
        }

        public void a(o o1)
        {
            float f1;
            f1 = o1.p();
            o1 = (c)e.c(a).get(o1);
            if ((((c) (o1)).a & 0x1ff) != 0)
            {
                View view = (View)e.d(a).get();
                if (view != null)
                {
                    view.invalidate();
                }
            }
            o1 = ((c) (o1)).b;
            if (o1 == null) goto _L2; else goto _L1
_L1:
            int i1;
            int j1;
            j1 = o1.size();
            i1 = 0;
_L5:
            if (i1 < j1) goto _L3; else goto _L2
_L2:
            o1 = (View)e.d(a).get();
            if (o1 != null)
            {
                o1.invalidate();
            }
            return;
_L3:
            b b1 = (b)o1.get(i1);
            float f2 = b1.b;
            float f3 = b1.c;
            com.nineoldandroids.b.e.a(a, b1.a, f2 + f3 * f1);
            i1++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public void b(com.nineoldandroids.a.a a1)
        {
            if (e.b(a) != null)
            {
                e.b(a).b(a1);
            }
            e.c(a).remove(a1);
            if (e.c(a).isEmpty())
            {
                com.nineoldandroids.b.e.a(a, null);
            }
        }

        public void c(com.nineoldandroids.a.a a1)
        {
            if (e.b(a) != null)
            {
                e.b(a).c(a1);
            }
        }

        public void d(com.nineoldandroids.a.a a1)
        {
            if (e.b(a) != null)
            {
                e.b(a).d(a1);
            }
        }

        private a()
        {
            a = e.this;
            super();
        }

        a(a a1)
        {
            this();
        }
    }

    private static class b
    {

        int a;
        float b;
        float c;

        b(int i1, float f1, float f2)
        {
            a = i1;
            b = f1;
            c = f2;
        }
    }

    private static class c
    {

        int a;
        ArrayList b;

        boolean a(int i1)
        {
            if ((a & i1) == 0 || b == null) goto _L2; else goto _L1
_L1:
            int j1;
            int k1;
            k1 = b.size();
            j1 = 0;
_L5:
            if (j1 < k1) goto _L3; else goto _L2
_L2:
            return false;
_L3:
            if (((b)b.get(j1)).a == i1)
            {
                b.remove(j1);
                a = a & ~i1;
                return true;
            }
            j1++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        c(int i1, ArrayList arraylist)
        {
            a = i1;
            b = arraylist;
        }
    }


    ArrayList a;
    private final com.nineoldandroids.b.a.a b;
    private final WeakReference c;
    private long d;
    private boolean e;
    private long f;
    private boolean g;
    private Interpolator h;
    private boolean i;
    private com.nineoldandroids.a.a.a j;
    private a k;
    private Runnable l;
    private HashMap m;

    e(View view)
    {
        e = false;
        f = 0L;
        g = false;
        i = false;
        j = null;
        k = new a(null);
        a = new ArrayList();
        l = new Runnable() {

            final e a;

            public void run()
            {
                com.nineoldandroids.b.e.a(a);
            }

            
            {
                a = e.this;
                super();
            }
        };
        m = new HashMap();
        c = new WeakReference(view);
        b = com.nineoldandroids.b.a.a.a(view);
    }

    private float a(int i1)
    {
        switch (i1)
        {
        default:
            return 0.0F;

        case 1: // '\001'
            return b.k();

        case 2: // '\002'
            return b.l();

        case 16: // '\020'
            return b.d();

        case 32: // ' '
            return b.e();

        case 64: // '@'
            return b.f();

        case 4: // '\004'
            return b.g();

        case 8: // '\b'
            return b.h();

        case 128: 
            return b.m();

        case 256: 
            return b.n();

        case 512: 
            return b.a();
        }
    }

    private void a(int i1, float f1)
    {
        float f2 = a(i1);
        a(i1, f2, f1 - f2);
    }

    private void a(int i1, float f1, float f2)
    {
        if (m.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = m.keySet().iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = null;
_L5:
        if (obj != null)
        {
            ((com.nineoldandroids.a.a) (obj)).b();
        }
_L2:
        obj = new b(i1, f1, f2);
        a.add(obj);
        obj = (View)c.get();
        if (obj != null)
        {
            ((View) (obj)).removeCallbacks(l);
            ((View) (obj)).post(l);
        }
        return;
_L4:
        c c1;
        obj = (com.nineoldandroids.a.a)iterator.next();
        c1 = (c)m.get(obj);
        if (!c1.a(i1) || c1.a != 0) goto _L6; else goto _L5
    }

    static void a(e e1)
    {
        e1.b();
    }

    static void a(e e1, int i1, float f1)
    {
        e1.b(i1, f1);
    }

    static void a(e e1, com.nineoldandroids.a.a.a a1)
    {
        e1.j = a1;
    }

    static com.nineoldandroids.a.a.a b(e e1)
    {
        return e1.j;
    }

    private void b()
    {
        o o1 = o.b(new float[] {
            1.0F
        });
        ArrayList arraylist = (ArrayList)a.clone();
        a.clear();
        int k1 = arraylist.size();
        int i1 = 0;
        int j1 = 0;
        do
        {
            if (i1 >= k1)
            {
                m.put(o1, new c(j1, arraylist));
                o1.a(k);
                o1.a(k);
                if (g)
                {
                    o1.a(f);
                }
                if (e)
                {
                    o1.d(d);
                }
                if (i)
                {
                    o1.a(h);
                }
                o1.a();
                return;
            }
            j1 |= ((b)arraylist.get(i1)).a;
            i1++;
        } while (true);
    }

    private void b(int i1, float f1)
    {
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            b.i(f1);
            return;

        case 2: // '\002'
            b.j(f1);
            return;

        case 16: // '\020'
            b.d(f1);
            return;

        case 32: // ' '
            b.e(f1);
            return;

        case 64: // '@'
            b.f(f1);
            return;

        case 4: // '\004'
            b.g(f1);
            return;

        case 8: // '\b'
            b.h(f1);
            return;

        case 128: 
            b.k(f1);
            return;

        case 256: 
            b.l(f1);
            return;

        case 512: 
            b.a(f1);
            break;
        }
    }

    static HashMap c(e e1)
    {
        return e1.m;
    }

    static WeakReference d(e e1)
    {
        return e1.c;
    }

    public com.nineoldandroids.b.b a(float f1)
    {
        a(1, f1);
        return this;
    }

    public com.nineoldandroids.b.b a(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Animators cannot have negative duration: ")).append(l1).toString());
        } else
        {
            e = true;
            d = l1;
            return this;
        }
    }

    public com.nineoldandroids.b.b a(com.nineoldandroids.a.a.a a1)
    {
        j = a1;
        return this;
    }

    public void a()
    {
        b();
    }

    public com.nineoldandroids.b.b b(float f1)
    {
        a(2, f1);
        return this;
    }

    public com.nineoldandroids.b.b c(float f1)
    {
        a(512, f1);
        return this;
    }
}
