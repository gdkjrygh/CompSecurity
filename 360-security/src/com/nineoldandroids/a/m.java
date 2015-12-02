// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import com.nineoldandroids.util.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.nineoldandroids.a:
//            g, e, j, i, 
//            n, f, h

public class m
    implements Cloneable
{
    static class a extends m
    {

        f h;
        float i;
        private com.nineoldandroids.util.a j;

        public m a()
        {
            return e();
        }

        void a(float f1)
        {
            i = h.b(f1);
        }

        void a(Class class1)
        {
            if (b != null)
            {
                return;
            } else
            {
                a(class1);
                return;
            }
        }

        public transient void a(float af[])
        {
            a(af);
            h = (f)e;
        }

        void b(Object obj)
        {
            if (j != null)
            {
                j.a(obj, i);
            } else
            {
                if (b != null)
                {
                    b.a(obj, Float.valueOf(i));
                    return;
                }
                if (c != null)
                {
                    try
                    {
                        g[0] = Float.valueOf(i);
                        c.invoke(obj, g);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return;
                    }
                }
            }
        }

        Object d()
        {
            return Float.valueOf(i);
        }

        public a e()
        {
            a a1 = (a)a();
            a1.h = (f)a1.e;
            return a1;
        }

        public transient a(c c1, float af[])
        {
            super(c1, null);
            a(af);
            if (c1 instanceof com.nineoldandroids.util.a)
            {
                j = (com.nineoldandroids.util.a)b;
            }
        }

        public transient a(String s, float af[])
        {
            super(s, null);
            a(af);
        }
    }

    static class b extends m
    {

        h h;
        int i;
        private com.nineoldandroids.util.b j;

        public m a()
        {
            return e();
        }

        void a(float f1)
        {
            i = h.b(f1);
        }

        void a(Class class1)
        {
            if (b != null)
            {
                return;
            } else
            {
                a(class1);
                return;
            }
        }

        public transient void a(int ai[])
        {
            a(ai);
            h = (h)e;
        }

        void b(Object obj)
        {
            if (j != null)
            {
                j.a(obj, i);
            } else
            {
                if (b != null)
                {
                    b.a(obj, Integer.valueOf(i));
                    return;
                }
                if (c != null)
                {
                    try
                    {
                        g[0] = Integer.valueOf(i);
                        c.invoke(obj, g);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return;
                    }
                }
            }
        }

        Object d()
        {
            return Integer.valueOf(i);
        }

        public b e()
        {
            b b1 = (b)a();
            b1.h = (h)b1.e;
            return b1;
        }

        public transient b(c c1, int ai[])
        {
            super(c1, null);
            a(ai);
            if (c1 instanceof com.nineoldandroids.util.b)
            {
                j = (com.nineoldandroids.util.b)b;
            }
        }

        public transient b(String s, int ai[])
        {
            super(s, null);
            a(ai);
        }
    }


    private static final n i = new g();
    private static final n j = new e();
    private static Class k[];
    private static Class l[];
    private static Class m[];
    private static final HashMap n = new HashMap();
    private static final HashMap o = new HashMap();
    String a;
    protected c b;
    Method c;
    Class d;
    j e;
    final ReentrantReadWriteLock f;
    final Object g[];
    private Method h;
    private n p;
    private Object q;

    private m(c c1)
    {
        c = null;
        h = null;
        e = null;
        f = new ReentrantReadWriteLock();
        g = new Object[1];
        b = c1;
        if (c1 != null)
        {
            a = c1.a();
        }
    }

    m(c c1, m m1)
    {
        this(c1);
    }

    private m(String s)
    {
        c = null;
        h = null;
        e = null;
        f = new ReentrantReadWriteLock();
        g = new Object[1];
        a = s;
    }

    m(String s, m m1)
    {
        this(s);
    }

    public static transient m a(c c1, float af[])
    {
        return new a(c1, af);
    }

    public static transient m a(c c1, int ai[])
    {
        return new b(c1, ai);
    }

    public static transient m a(String s, float af[])
    {
        return new a(s, af);
    }

    public static transient m a(String s, int ai[])
    {
        return new b(s, ai);
    }

    static String a(String s, String s1)
    {
        if (s1 == null || s1.length() == 0)
        {
            return s;
        } else
        {
            char c1 = Character.toUpperCase(s1.charAt(0));
            s1 = s1.substring(1);
            return (new StringBuilder(String.valueOf(s))).append(c1).append(s1).toString();
        }
    }

    private Method a(Class class1, String s, Class class2)
    {
        Method method = null;
        String s1 = a(s, a);
        if (class2 == null)
        {
            try
            {
                s = class1.getMethod(s1, null);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                NoSuchMethodException nosuchmethodexception;
                Class aclass[];
                Class class3;
                int i1;
                int j1;
                try
                {
                    class1 = class1.getDeclaredMethod(s1, null);
                }
                // Misplaced declaration of an exception variable
                catch (Class class1)
                {
                    return null;
                }
                try
                {
                    class1.setAccessible(true);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return class1;
                }
                return class1;
            }
            return s;
        }
        aclass = new Class[1];
        if (d.equals(java/lang/Float))
        {
            s = k;
        } else
        if (d.equals(java/lang/Integer))
        {
            s = l;
        } else
        if (d.equals(java/lang/Double))
        {
            s = m;
        } else
        {
            s = new Class[1];
            s[0] = d;
        }
        j1 = s.length;
        i1 = 0;
        class2 = method;
        if (i1 >= j1)
        {
            return class2;
        }
        class3 = s[i1];
        aclass[0] = class3;
        method = class1.getMethod(s1, aclass);
        class2 = method;
        d = class3;
        return method;
        nosuchmethodexception;
        try
        {
            nosuchmethodexception = class1.getDeclaredMethod(s1, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (NoSuchMethodException nosuchmethodexception)
        {
            i1++;
            if (false)
            {
            } else
            {
                break MISSING_BLOCK_LABEL_78;
            }
        }
        class2 = nosuchmethodexception;
        nosuchmethodexception.setAccessible(true);
        class2 = nosuchmethodexception;
        d = class3;
        return nosuchmethodexception;
    }

    private Method a(Class class1, HashMap hashmap, String s, Class class2)
    {
        Method method = null;
        HashMap hashmap1;
        f.writeLock().lock();
        hashmap1 = (HashMap)hashmap.get(class1);
        if (hashmap1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        method = (Method)hashmap1.get(a);
        if (method != null) goto _L2; else goto _L1
_L1:
        class2 = a(class1, s, class2);
        s = hashmap1;
        if (hashmap1 != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s = new HashMap();
        hashmap.put(class1, s);
        s.put(a, class2);
        class1 = class2;
_L4:
        f.writeLock().unlock();
        return class1;
        class1;
        f.writeLock().unlock();
        throw class1;
_L2:
        class1 = method;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(Class class1)
    {
        h = a(class1, o, "get", null);
    }

    public m a()
    {
        m m1;
        try
        {
            m1 = (m)super.clone();
            m1.a = a;
            m1.b = b;
            m1.e = e.b();
            m1.p = p;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return m1;
    }

    void a(float f1)
    {
        q = e.a(f1);
    }

    public void a(n n1)
    {
        p = n1;
        e.a(n1);
    }

    public void a(c c1)
    {
        b = c1;
    }

    void a(Class class1)
    {
        c = a(class1, n, "set", d);
    }

    void a(Object obj)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        Iterator iterator;
        b.a(obj);
        iterator = e.e.iterator();
_L2:
        if (!iterator.hasNext())
        {
            return;
        }
        i i1 = (i)iterator.next();
        if (!i1.a())
        {
            i1.a(b.a(obj));
        }
        if (true) goto _L2; else goto _L1
_L1:
        ClassCastException classcastexception;
        classcastexception;
        b = null;
        Class class1 = obj.getClass();
        if (c == null)
        {
            a(class1);
        }
        Iterator iterator1 = e.e.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            i j1 = (i)iterator1.next();
            if (!j1.a())
            {
                if (h == null)
                {
                    b(class1);
                }
                try
                {
                    j1.a(h.invoke(obj, new Object[0]));
                }
                catch (InvocationTargetException invocationtargetexception) { }
                catch (IllegalAccessException illegalaccessexception) { }
            }
        } while (true);
        return;
    }

    public void a(String s)
    {
        a = s;
    }

    public transient void a(float af[])
    {
        d = Float.TYPE;
        e = com.nineoldandroids.a.j.a(af);
    }

    public transient void a(int ai[])
    {
        d = Integer.TYPE;
        e = com.nineoldandroids.a.j.a(ai);
    }

    void b()
    {
        if (p == null)
        {
            n n1;
            if (d == java/lang/Integer)
            {
                n1 = i;
            } else
            if (d == java/lang/Float)
            {
                n1 = j;
            } else
            {
                n1 = null;
            }
            p = n1;
        }
        if (p != null)
        {
            e.a(p);
        }
    }

    void b(Object obj)
    {
        if (b != null)
        {
            b.a(obj, d());
        }
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        g[0] = d();
        c.invoke(obj, g);
        return;
        obj;
        return;
        obj;
    }

    public String c()
    {
        return a;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

    Object d()
    {
        return q;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(a))).append(": ").append(e.toString()).toString();
    }

    static 
    {
        k = (new Class[] {
            Float.TYPE, java/lang/Float, Double.TYPE, Integer.TYPE, java/lang/Double, java/lang/Integer
        });
        l = (new Class[] {
            Integer.TYPE, java/lang/Integer, Float.TYPE, Double.TYPE, java/lang/Float, java/lang/Double
        });
        m = (new Class[] {
            Double.TYPE, java/lang/Double, Float.TYPE, Integer.TYPE, java/lang/Float, java/lang/Integer
        });
    }
}
