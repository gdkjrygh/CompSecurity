// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.nineoldandroids.a:
//            a, o, b

public final class com.nineoldandroids.a.c extends com.nineoldandroids.a.a
{
    private class a
        implements a.a
    {

        final com.nineoldandroids.a.c a;
        private com.nineoldandroids.a.c b;

        public void a(com.nineoldandroids.a.a a1)
        {
        }

        public void b(com.nineoldandroids.a.a a1)
        {
            a1.b(this);
            com.nineoldandroids.a.c.a(a).remove(a1);
            ((e)com.nineoldandroids.a.c.b(b).get(a1)).f = true;
            if (a.b) goto _L2; else goto _L1
_L1:
            int i1;
            int j1;
            a1 = com.nineoldandroids.a.c.c(b);
            j1 = a1.size();
            i1 = 0;
_L6:
            if (i1 >= j1)
            {
                i1 = 1;
            } else
            {
label0:
                {
                    if (((e)a1.get(i1)).f)
                    {
                        break label0;
                    }
                    i1 = 0;
                }
            }
            if (i1 == 0) goto _L2; else goto _L3
_L3:
            if (a.a == null) goto _L5; else goto _L4
_L4:
            a1 = (ArrayList)a.a.clone();
            j1 = a1.size();
            i1 = 0;
_L7:
            if (i1 < j1)
            {
                break MISSING_BLOCK_LABEL_142;
            }
_L5:
            com.nineoldandroids.a.c.a(b, false);
_L2:
            return;
            i1++;
              goto _L6
            ((a.a)a1.get(i1)).b(b);
            i1++;
              goto _L7
        }

        public void c(com.nineoldandroids.a.a a1)
        {
            if (a.b || com.nineoldandroids.a.c.a(a).size() != 0 || a.a == null) goto _L2; else goto _L1
_L1:
            int i1;
            int j1;
            j1 = a.a.size();
            i1 = 0;
_L5:
            if (i1 < j1) goto _L3; else goto _L2
_L2:
            return;
_L3:
            ((a.a)a.a.get(i1)).c(b);
            i1++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public void d(com.nineoldandroids.a.a a1)
        {
        }

        a(com.nineoldandroids.a.c c2)
        {
            a = com.nineoldandroids.a.c.this;
            super();
            b = c2;
        }
    }

    public class b
    {

        final com.nineoldandroids.a.c a;
        private e b;

        public b a(long l1)
        {
            o o1 = o.b(new float[] {
                0.0F, 1.0F
            });
            o1.d(l1);
            b(o1);
            return this;
        }

        public b a(com.nineoldandroids.a.a a1)
        {
            e e2 = (e)com.nineoldandroids.a.c.b(a).get(a1);
            e e1 = e2;
            if (e2 == null)
            {
                e1 = new e(a1);
                com.nineoldandroids.a.c.b(a).put(a1, e1);
                com.nineoldandroids.a.c.d(a).add(e1);
            }
            e1.a(new c(b, 0));
            return this;
        }

        public b b(com.nineoldandroids.a.a a1)
        {
            e e2 = (e)com.nineoldandroids.a.c.b(a).get(a1);
            e e1 = e2;
            if (e2 == null)
            {
                e1 = new e(a1);
                com.nineoldandroids.a.c.b(a).put(a1, e1);
                com.nineoldandroids.a.c.d(a).add(e1);
            }
            a1 = new c(e1, 1);
            b.a(a1);
            return this;
        }

        b(com.nineoldandroids.a.a a1)
        {
            a = com.nineoldandroids.a.c.this;
            super();
            b = (e)com.nineoldandroids.a.c.b(com.nineoldandroids.a.c.this).get(a1);
            if (b == null)
            {
                b = new e(a1);
                com.nineoldandroids.a.c.b(com.nineoldandroids.a.c.this).put(a1, b);
                com.nineoldandroids.a.c.d(com.nineoldandroids.a.c.this).add(b);
            }
        }
    }

    private static class c
    {

        public e a;
        public int b;

        public c(e e1, int i1)
        {
            a = e1;
            b = i1;
        }
    }

    private static class d
        implements a.a
    {

        private com.nineoldandroids.a.c a;
        private e b;
        private int c;

        private void e(com.nineoldandroids.a.a a1)
        {
            if (!a.b) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int j1 = b.c.size();
            int i1 = 0;
            do
            {
                if (i1 >= j1)
                {
                    a1 = null;
                } else
                {
label0:
                    {
                        c c1 = (c)b.c.get(i1);
                        if (c1.b != c || c1.a.a != a1)
                        {
                            break label0;
                        }
                        a1.b(this);
                        a1 = c1;
                    }
                }
                b.c.remove(a1);
                if (b.c.size() == 0)
                {
                    b.a.a();
                    com.nineoldandroids.a.c.a(a).add(b.a);
                    return;
                }
                if (true)
                {
                    continue;
                }
                i1++;
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void a(com.nineoldandroids.a.a a1)
        {
            if (c == 0)
            {
                e(a1);
            }
        }

        public void b(com.nineoldandroids.a.a a1)
        {
            if (c == 1)
            {
                e(a1);
            }
        }

        public void c(com.nineoldandroids.a.a a1)
        {
        }

        public void d(com.nineoldandroids.a.a a1)
        {
        }

        public d(com.nineoldandroids.a.c c1, e e1, int i1)
        {
            a = c1;
            b = e1;
            c = i1;
        }
    }

    private static class e
        implements Cloneable
    {

        public com.nineoldandroids.a.a a;
        public ArrayList b;
        public ArrayList c;
        public ArrayList d;
        public ArrayList e;
        public boolean f;

        public e a()
        {
            e e1;
            try
            {
                e1 = (e)super.clone();
                e1.a = a.h();
            }
            catch (CloneNotSupportedException clonenotsupportedexception)
            {
                throw new AssertionError();
            }
            return e1;
        }

        public void a(c c1)
        {
            if (b == null)
            {
                b = new ArrayList();
                d = new ArrayList();
            }
            b.add(c1);
            if (!d.contains(c1.a))
            {
                d.add(c1.a);
            }
            c1 = c1.a;
            if (((e) (c1)).e == null)
            {
                c1.e = new ArrayList();
            }
            ((e) (c1)).e.add(this);
        }

        public Object clone()
            throws CloneNotSupportedException
        {
            return a();
        }

        public e(com.nineoldandroids.a.a a1)
        {
            b = null;
            c = null;
            d = null;
            e = null;
            f = false;
            a = a1;
        }
    }


    boolean b;
    private ArrayList c;
    private HashMap d;
    private ArrayList e;
    private ArrayList f;
    private boolean g;
    private a h;
    private boolean i;
    private long j;
    private o k;
    private long l;

    public com.nineoldandroids.a.c()
    {
        c = new ArrayList();
        d = new HashMap();
        e = new ArrayList();
        f = new ArrayList();
        g = true;
        h = null;
        b = false;
        i = false;
        j = 0L;
        k = null;
        l = -1L;
    }

    static ArrayList a(com.nineoldandroids.a.c c1)
    {
        return c1.c;
    }

    static void a(com.nineoldandroids.a.c c1, boolean flag)
    {
        c1.i = flag;
    }

    static HashMap b(com.nineoldandroids.a.c c1)
    {
        return c1.d;
    }

    static ArrayList c(com.nineoldandroids.a.c c1)
    {
        return c1.f;
    }

    static ArrayList d(com.nineoldandroids.a.c c1)
    {
        return c1.e;
    }

    private void j()
    {
        if (!g) goto _L2; else goto _L1
_L1:
        Object obj;
        int i1;
        int j1;
        f.clear();
        obj = new ArrayList();
        j1 = e.size();
        i1 = 0;
_L8:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        Object obj1 = new ArrayList();
_L9:
        if (((ArrayList) (obj)).size() > 0) goto _L6; else goto _L5
_L5:
        g = false;
        if (f.size() != e.size())
        {
            throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
        }
          goto _L7
_L4:
        obj1 = (e)e.get(i1);
        if (((e) (obj1)).b == null || ((e) (obj1)).b.size() == 0)
        {
            ((ArrayList) (obj)).add(obj1);
        }
        i1++;
          goto _L8
_L6:
        int k1;
        k1 = ((ArrayList) (obj)).size();
        i1 = 0;
_L12:
label0:
        {
            if (i1 < k1)
            {
                break label0;
            }
            ((ArrayList) (obj)).clear();
            ((ArrayList) (obj)).addAll(((Collection) (obj1)));
            ((ArrayList) (obj1)).clear();
        }
          goto _L9
        e e1;
        e1 = (e)((ArrayList) (obj)).get(i1);
        f.add(e1);
        if (e1.e == null) goto _L11; else goto _L10
_L10:
        int l1;
        l1 = e1.e.size();
        j1 = 0;
_L13:
        if (j1 < l1)
        {
            break MISSING_BLOCK_LABEL_220;
        }
_L11:
        i1++;
          goto _L12
        e e2 = (e)e1.e.get(j1);
        e2.d.remove(e1);
        if (e2.d.size() == 0)
        {
            ((ArrayList) (obj1)).add(e2);
        }
        j1++;
          goto _L13
_L2:
        k1 = e.size();
        i1 = 0;
_L17:
        if (i1 < k1) goto _L14; else goto _L7
_L7:
        return;
_L14:
        obj = (e)e.get(i1);
        if (((e) (obj)).b == null || ((e) (obj)).b.size() <= 0) goto _L16; else goto _L15
_L15:
        l1 = ((e) (obj)).b.size();
        j1 = 0;
_L18:
        if (j1 < l1)
        {
            break MISSING_BLOCK_LABEL_354;
        }
_L16:
        obj.f = false;
        i1++;
          goto _L17
        c c1 = (c)((e) (obj)).b.get(j1);
        if (((e) (obj)).d == null)
        {
            obj.d = new ArrayList();
        }
        if (!((e) (obj)).d.contains(c1.a))
        {
            ((e) (obj)).d.add(c1.a);
        }
        j1++;
          goto _L18
    }

    public b a(com.nineoldandroids.a.a a1)
    {
        if (a1 != null)
        {
            g = true;
            return new b(a1);
        } else
        {
            return null;
        }
    }

    public void a()
    {
        int i1;
        boolean flag;
        int k1;
        flag = false;
        b = false;
        i = true;
        j();
        k1 = f.size();
        i1 = 0;
_L17:
        if (i1 < k1) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new ArrayList();
        i1 = 0;
_L21:
        if (i1 < k1) goto _L4; else goto _L3
_L3:
        if (j > 0L) goto _L6; else goto _L5
_L5:
        obj = ((ArrayList) (obj)).iterator();
_L24:
        if (((Iterator) (obj)).hasNext()) goto _L8; else goto _L7
_L7:
        if (a == null) goto _L10; else goto _L9
_L9:
        int j1;
        obj = (ArrayList)a.clone();
        j1 = ((ArrayList) (obj)).size();
        i1 = 0;
_L25:
        if (i1 < j1) goto _L11; else goto _L10
_L10:
        if (e.size() != 0 || j != 0L) goto _L13; else goto _L12
_L12:
        i = false;
        if (a == null) goto _L13; else goto _L14
_L14:
        obj = (ArrayList)a.clone();
        j1 = ((ArrayList) (obj)).size();
        i1 = ((flag) ? 1 : 0);
_L26:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_537;
        }
_L13:
        return;
_L2:
        Object obj1;
        obj = (e)f.get(i1);
        obj1 = ((e) (obj)).a.f();
        if (obj1 == null || ((ArrayList) (obj1)).size() <= 0) goto _L16; else goto _L15
_L15:
        obj1 = (new ArrayList(((Collection) (obj1)))).iterator();
_L18:
        if (((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_233;
        }
_L16:
        i1++;
          goto _L17
        a.a a1 = (a.a)((Iterator) (obj1)).next();
        if ((a1 instanceof d) || (a1 instanceof a))
        {
            ((e) (obj)).a.b(a1);
        }
          goto _L18
_L4:
        obj1 = (e)f.get(i1);
        if (h == null)
        {
            h = new a(this);
        }
        if (((e) (obj1)).b != null && ((e) (obj1)).b.size() != 0) goto _L20; else goto _L19
_L19:
        ((ArrayList) (obj)).add(obj1);
_L22:
        ((e) (obj1)).a.a(h);
        i1++;
          goto _L21
_L20:
        int l1;
        l1 = ((e) (obj1)).b.size();
        j1 = 0;
_L23:
label0:
        {
            if (j1 < l1)
            {
                break label0;
            }
            obj1.c = (ArrayList)((e) (obj1)).b.clone();
        }
          goto _L22
        c c1 = (c)((e) (obj1)).b.get(j1);
        c1.a.a.a(new d(this, ((e) (obj1)), c1.b));
        j1++;
          goto _L23
_L8:
        e e1 = (e)((Iterator) (obj)).next();
        e1.a.a();
        c.add(e1.a);
          goto _L24
_L6:
        k = o.b(new float[] {
            0.0F, 1.0F
        });
        k.d(j);
        k.a(new com.nineoldandroids.a.b(((ArrayList) (obj))) {

            boolean a;
            final com.nineoldandroids.a.c b;
            private final ArrayList c;

            public void b(com.nineoldandroids.a.a a2)
            {
                if (a) goto _L2; else goto _L1
_L1:
                int i2;
                int j2;
                j2 = c.size();
                i2 = 0;
_L5:
                if (i2 < j2) goto _L3; else goto _L2
_L2:
                return;
_L3:
                a2 = (e)c.get(i2);
                ((e) (a2)).a.a();
                com.nineoldandroids.a.c.a(b).add(((e) (a2)).a);
                i2++;
                if (true) goto _L5; else goto _L4
_L4:
            }

            public void c(com.nineoldandroids.a.a a2)
            {
                a = true;
            }

            
            {
                b = com.nineoldandroids.a.c.this;
                c = arraylist;
                super();
                a = false;
            }
        });
        k.a();
          goto _L7
_L11:
        ((a.a)((ArrayList) (obj)).get(i1)).a(this);
        i1++;
          goto _L25
        ((a.a)((ArrayList) (obj)).get(i1)).b(this);
        i1++;
          goto _L26
    }

    public void a(long l1)
    {
        j = l1;
    }

    public void a(Interpolator interpolator)
    {
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((e)iterator.next()).a.a(interpolator);
        } while (true);
    }

    public void a(Collection collection)
    {
        if (collection == null || collection.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        g = true;
        iterator = collection.iterator();
        collection = null;
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        com.nineoldandroids.a.a a1 = (com.nineoldandroids.a.a)iterator.next();
        if (collection == null)
        {
            collection = a(a1);
        } else
        {
            collection.a(a1);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public transient void a(com.nineoldandroids.a.a aa[])
    {
        int i1 = 1;
        if (aa == null) goto _L2; else goto _L1
_L1:
        b b1;
        g = true;
        b1 = a(aa[0]);
_L5:
        if (i1 < aa.length) goto _L3; else goto _L2
_L2:
        return;
_L3:
        b1.a(aa[i1]);
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public com.nineoldandroids.a.a b(long l1)
    {
        return c(l1);
    }

    public void b()
    {
        b = true;
        if (!e()) goto _L2; else goto _L1
_L1:
        Object obj;
        Iterator iterator;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        obj = (ArrayList)a.clone();
        iterator = ((ArrayList) (obj)).iterator();
_L8:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (k != null && k.d())
        {
            k.b();
        } else
        if (f.size() > 0)
        {
            Iterator iterator1 = f.iterator();
            while (iterator1.hasNext()) 
            {
                ((e)iterator1.next()).a.b();
            }
        }
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((ArrayList) (obj)).iterator();
_L9:
        if (((Iterator) (obj)).hasNext()) goto _L7; else goto _L6
_L6:
        i = false;
_L2:
        return;
_L4:
        ((a.a)iterator.next()).c(this);
          goto _L8
_L7:
        ((a.a)((Iterator) (obj)).next()).b(this);
          goto _L9
        obj = null;
          goto _L3
    }

    public com.nineoldandroids.a.c c(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                l = l1;
                return this;
            }
            ((e)iterator.next()).a.b(l1);
        } while (true);
    }

    public void c()
    {
        b = true;
        if (!e()) goto _L2; else goto _L1
_L1:
        if (f.size() == e.size()) goto _L4; else goto _L3
_L3:
        Iterator iterator;
        j();
        iterator = f.iterator();
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        if (k != null)
        {
            k.b();
        }
        if (f.size() > 0)
        {
            e e1;
            for (iterator = f.iterator(); iterator.hasNext(); ((e)iterator.next()).a.c())
            {
                break MISSING_BLOCK_LABEL_171;
            }

        }
        if (a != null)
        {
            for (iterator = ((ArrayList)a.clone()).iterator(); iterator.hasNext(); ((a.a)iterator.next()).b(this))
            {
                break MISSING_BLOCK_LABEL_189;
            }

        }
        i = false;
_L2:
        return;
_L5:
        e1 = (e)iterator.next();
        if (h == null)
        {
            h = new a(this);
        }
        e1.a.a(h);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean d()
    {
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
        } while (!((e)iterator.next()).a.d());
        return true;
    }

    public boolean e()
    {
        return i;
    }

    public com.nineoldandroids.a.a h()
    {
        return i();
    }

    public com.nineoldandroids.a.c i()
    {
        com.nineoldandroids.a.c c1;
        HashMap hashmap;
        Iterator iterator;
        c1 = (com.nineoldandroids.a.c)super.h();
        c1.g = true;
        c1.b = false;
        c1.i = false;
        c1.c = new ArrayList();
        c1.d = new HashMap();
        c1.e = new ArrayList();
        c1.f = new ArrayList();
        hashmap = new HashMap();
        iterator = e.iterator();
_L4:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = e.iterator();
_L6:
        if (!((Iterator) (obj)).hasNext())
        {
            return c1;
        }
        break MISSING_BLOCK_LABEL_295;
_L2:
        ArrayList arraylist;
        obj = (e)iterator.next();
        e e1 = ((e) (obj)).a();
        hashmap.put(obj, e1);
        c1.e.add(e1);
        c1.d.put(e1.a, e1);
        e1.b = null;
        e1.c = null;
        e1.e = null;
        e1.d = null;
        arraylist = e1.a.f();
        if (arraylist == null) goto _L4; else goto _L3
_L3:
        Iterator iterator1;
        iterator1 = arraylist.iterator();
        obj = null;
_L5:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            if (obj != null)
            {
                obj = ((ArrayList) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    arraylist.remove((a.a)((Iterator) (obj)).next());
                }
            }
        }
          goto _L4
        a.a a1 = (a.a)iterator1.next();
        if (a1 instanceof a)
        {
            Object obj1 = obj;
            if (obj == null)
            {
                obj1 = new ArrayList();
            }
            ((ArrayList) (obj1)).add(a1);
            obj = obj1;
        }
          goto _L5
        Object obj2 = (e)((Iterator) (obj)).next();
        e e2 = (e)hashmap.get(obj2);
        if (((e) (obj2)).b != null)
        {
            obj2 = ((e) (obj2)).b.iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                c c2 = (c)((Iterator) (obj2)).next();
                e2.a(new c((e)hashmap.get(c2.a), c2.b));
            }
        }
          goto _L6
    }
}
