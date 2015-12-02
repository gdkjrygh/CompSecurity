// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.nineoldandroids.b:
//            b

class com.nineoldandroids.b.c extends com.nineoldandroids.b.b
{
    private class a
        implements com.nineoldandroids.a.a.a, com.nineoldandroids.a.o.b
    {

        final com.nineoldandroids.b.c a;

        public void a(com.nineoldandroids.a.a a1)
        {
            if (com.nineoldandroids.b.c.b(a) != null)
            {
                com.nineoldandroids.b.c.b(a).a(a1);
            }
        }

        public void a(o o1)
        {
            float f1;
            f1 = o1.p();
            o1 = (c)com.nineoldandroids.b.c.c(a).get(o1);
            if ((((c) (o1)).a & 0x1ff) != 0)
            {
                View view = (View)com.nineoldandroids.b.c.d(a).get();
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
            o1 = (View)com.nineoldandroids.b.c.d(a).get();
            if (o1 != null)
            {
                o1.invalidate();
            }
            return;
_L3:
            b b1 = (b)o1.get(i1);
            float f2 = b1.b;
            float f3 = b1.c;
            com.nineoldandroids.b.c.a(a, b1.a, f2 + f3 * f1);
            i1++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public void b(com.nineoldandroids.a.a a1)
        {
            if (com.nineoldandroids.b.c.b(a) != null)
            {
                com.nineoldandroids.b.c.b(a).b(a1);
            }
            com.nineoldandroids.b.c.c(a).remove(a1);
            if (com.nineoldandroids.b.c.c(a).isEmpty())
            {
                com.nineoldandroids.b.c.a(a, null);
            }
        }

        public void c(com.nineoldandroids.a.a a1)
        {
            if (com.nineoldandroids.b.c.b(a) != null)
            {
                com.nineoldandroids.b.c.b(a).c(a1);
            }
        }

        public void d(com.nineoldandroids.a.a a1)
        {
            if (com.nineoldandroids.b.c.b(a) != null)
            {
                com.nineoldandroids.b.c.b(a).d(a1);
            }
        }

        private a()
        {
            a = com.nineoldandroids.b.c.this;
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
    private final WeakReference b;
    private long c;
    private boolean d;
    private long e;
    private boolean f;
    private Interpolator g;
    private boolean h;
    private com.nineoldandroids.a.a.a i;
    private a j;
    private Runnable k;
    private HashMap l;

    com.nineoldandroids.b.c(View view)
    {
        d = false;
        e = 0L;
        f = false;
        h = false;
        i = null;
        j = new a(null);
        a = new ArrayList();
        k = new Runnable() {

            final com.nineoldandroids.b.c a;

            public void run()
            {
                com.nineoldandroids.b.c.a(a);
            }

            
            {
                a = com.nineoldandroids.b.c.this;
                super();
            }
        };
        l = new HashMap();
        b = new WeakReference(view);
    }

    private float a(int i1)
    {
        View view = (View)b.get();
        if (view == null) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR lookupswitch 10: default 108
    //                   1: 110
    //                   2: 115
    //                   4: 135
    //                   8: 140
    //                   16: 120
    //                   32: 125
    //                   64: 130
    //                   128: 145
    //                   256: 150
    //                   512: 155;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L2:
        return 0.0F;
_L3:
        return view.getTranslationX();
_L4:
        return view.getTranslationY();
_L7:
        return view.getRotation();
_L8:
        return view.getRotationX();
_L9:
        return view.getRotationY();
_L5:
        return view.getScaleX();
_L6:
        return view.getScaleY();
_L10:
        return view.getX();
_L11:
        return view.getY();
_L12:
        return view.getAlpha();
    }

    private void a(int i1, float f1)
    {
        float f2 = a(i1);
        a(i1, f2, f1 - f2);
    }

    private void a(int i1, float f1, float f2)
    {
        if (l.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = l.keySet().iterator();
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
        obj = (View)b.get();
        if (obj != null)
        {
            ((View) (obj)).removeCallbacks(k);
            ((View) (obj)).post(k);
        }
        return;
_L4:
        c c1;
        obj = (com.nineoldandroids.a.a)iterator.next();
        c1 = (c)l.get(obj);
        if (!c1.a(i1) || c1.a != 0) goto _L6; else goto _L5
    }

    static void a(com.nineoldandroids.b.c c1)
    {
        c1.b();
    }

    static void a(com.nineoldandroids.b.c c1, int i1, float f1)
    {
        c1.b(i1, f1);
    }

    static void a(com.nineoldandroids.b.c c1, com.nineoldandroids.a.a.a a1)
    {
        c1.i = a1;
    }

    static com.nineoldandroids.a.a.a b(com.nineoldandroids.b.c c1)
    {
        return c1.i;
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
                l.put(o1, new c(j1, arraylist));
                o1.a(j);
                o1.a(j);
                if (f)
                {
                    o1.a(e);
                }
                if (d)
                {
                    o1.d(c);
                }
                if (h)
                {
                    o1.a(g);
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
        View view = (View)b.get();
        if (view == null) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR lookupswitch 10: default 108
    //                   1: 109
    //                   2: 115
    //                   4: 139
    //                   8: 145
    //                   16: 121
    //                   32: 127
    //                   64: 133
    //                   128: 151
    //                   256: 157
    //                   512: 163;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L2:
        return;
_L3:
        view.setTranslationX(f1);
        return;
_L4:
        view.setTranslationY(f1);
        return;
_L7:
        view.setRotation(f1);
        return;
_L8:
        view.setRotationX(f1);
        return;
_L9:
        view.setRotationY(f1);
        return;
_L5:
        view.setScaleX(f1);
        return;
_L6:
        view.setScaleY(f1);
        return;
_L10:
        view.setX(f1);
        return;
_L11:
        view.setY(f1);
        return;
_L12:
        view.setAlpha(f1);
        return;
    }

    static HashMap c(com.nineoldandroids.b.c c1)
    {
        return c1.l;
    }

    static WeakReference d(com.nineoldandroids.b.c c1)
    {
        return c1.b;
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
            d = true;
            c = l1;
            return this;
        }
    }

    public com.nineoldandroids.b.b a(com.nineoldandroids.a.a.a a1)
    {
        i = a1;
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
