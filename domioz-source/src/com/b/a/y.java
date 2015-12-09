// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.util.Log;
import com.b.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.b.a:
//            d, c, z, h, 
//            f, g, e, aa

public class y
    implements Cloneable
{

    private static final aa i = new d();
    private static final aa j = new com.b.a.c();
    private static Class k[];
    private static Class l[];
    private static Class m[];
    private static final HashMap n = new HashMap();
    private static final HashMap o = new HashMap();
    String a;
    protected c b;
    Method c;
    Class d;
    h e;
    final ReentrantReadWriteLock f;
    final Object g[];
    private Method h;
    private aa p;
    private Object q;

    private y(c c1)
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

    y(c c1, byte byte0)
    {
        this(c1);
    }

    private y(String s)
    {
        c = null;
        h = null;
        e = null;
        f = new ReentrantReadWriteLock();
        g = new Object[1];
        a = s;
    }

    y(String s, byte byte0)
    {
        this(s);
    }

    public static transient y a(c c1, int ai[])
    {
        return new z(c1, ai);
    }

    public static transient y a(String s, int ai[])
    {
        return new z(s, ai);
    }

    private Method a(Class class1, String s, Class class2)
    {
        String s1;
        Method method;
        method = null;
        String s2 = a;
        s1 = s;
        if (s2 != null)
        {
            if (s2.length() == 0)
            {
                s1 = s;
            } else
            {
                char c1 = Character.toUpperCase(s2.charAt(0));
                s1 = s2.substring(1);
                s1 = (new StringBuilder()).append(s).append(c1).append(s1).toString();
            }
        }
        if (class2 != null) goto _L2; else goto _L1
_L1:
        s = class1.getMethod(s1, null);
        return s;
        s;
        class1 = class1.getDeclaredMethod(s1, null);
        class1.setAccessible(true);
        return class1;
        class2;
_L6:
        Log.e("PropertyValuesHolder", (new StringBuilder("Couldn't find no-arg method for property ")).append(a).append(": ").append(s).toString());
        return class1;
_L2:
        Class aclass[];
        Class class3;
        int i1;
        aclass = new Class[1];
        int j1;
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
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        class3 = s[i1];
        aclass[0] = class3;
        method = class1.getMethod(s1, aclass);
        class2 = method;
        d = class3;
        return method;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        nosuchmethodexception = class1.getDeclaredMethod(s1, aclass);
        class2 = nosuchmethodexception;
        nosuchmethodexception.setAccessible(true);
        class2 = nosuchmethodexception;
        d = class3;
        return nosuchmethodexception;
        nosuchmethodexception;
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        Log.e("PropertyValuesHolder", (new StringBuilder("Couldn't find setter/getter for property ")).append(a).append(" with value type ").append(d).toString());
        return class2;
        class1;
        class1 = null;
        if (true) goto _L6; else goto _L5
_L5:
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
        Method method1;
        method1 = method;
        if (method != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        method1 = a(class1, s, class2);
        s = hashmap1;
        if (hashmap1 != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        s = new HashMap();
        hashmap.put(class1, s);
        s.put(a, method1);
        f.writeLock().unlock();
        return method1;
        class1;
        f.writeLock().unlock();
        throw class1;
    }

    public y a()
    {
        y y1;
        try
        {
            y1 = (y)super.clone();
            y1.a = a;
            y1.b = b;
            y1.e = e.a();
            y1.p = p;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return y1;
    }

    void a(float f1)
    {
        q = e.a(f1);
    }

    public final void a(aa aa)
    {
        p = aa;
        e.f = aa;
    }

    public final void a(c c1)
    {
        b = c1;
    }

    void a(Class class1)
    {
        c = a(class1, n, "set", d);
    }

    final void a(Object obj)
    {
label0:
        {
            if (b != null)
            {
                try
                {
                    b.a(obj);
                    Iterator iterator = e.e.iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        f f1 = (f)iterator.next();
                        if (!f1.c)
                        {
                            f1.a(b.a(obj));
                        }
                    } while (true);
                    break label0;
                }
                catch (ClassCastException classcastexception)
                {
                    Log.e("PropertyValuesHolder", (new StringBuilder("No such property (")).append(b.a()).append(") on target object ").append(obj).append(". Trying reflection instead").toString());
                    b = null;
                }
            }
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
                f f2 = (f)iterator1.next();
                if (!f2.c)
                {
                    if (h == null)
                    {
                        h = a(class1, o, "get", null);
                    }
                    try
                    {
                        f2.a(h.invoke(obj, new Object[0]));
                    }
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        Log.e("PropertyValuesHolder", invocationtargetexception.toString());
                    }
                    catch (IllegalAccessException illegalaccessexception)
                    {
                        Log.e("PropertyValuesHolder", illegalaccessexception.toString());
                    }
                }
            } while (true);
        }
    }

    public transient void a(int ai[])
    {
        int i1 = 1;
        d = Integer.TYPE;
        int j1 = ai.length;
        g ag[] = new g[Math.max(j1, 2)];
        if (j1 == 1)
        {
            ag[0] = (g)new g();
            ag[1] = (g)com.b.a.f.a(1.0F, ai[0]);
        } else
        {
            ag[0] = (g)com.b.a.f.a(0.0F, ai[0]);
            while (i1 < j1) 
            {
                ag[i1] = (g)com.b.a.f.a((float)i1 / (float)(j1 - 1), ai[i1]);
                i1++;
            }
        }
        e = new e(ag);
    }

    final void b()
    {
        if (p == null)
        {
            aa aa;
            if (d == java/lang/Integer)
            {
                aa = i;
            } else
            if (d == java/lang/Float)
            {
                aa = j;
            } else
            {
                aa = null;
            }
            p = aa;
        }
        if (p != null)
        {
            e.f = p;
        }
    }

    void b(Object obj)
    {
        if (b != null)
        {
            b.a(obj, c());
        }
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        g[0] = c();
        c.invoke(obj, g);
        return;
        obj;
        Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
        return;
        obj;
        Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
        return;
    }

    Object c()
    {
        return q;
    }

    public Object clone()
    {
        return a();
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append(": ").append(e.toString()).toString();
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
