// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.util.Log;
import com.a.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.a.a:
//            m, k, ai, p, 
//            n, aj, ah

public class ag
    implements Cloneable
{

    private static final aj i = new m();
    private static final aj j = new k();
    private static Class k[];
    private static Class l[];
    private static Class m[];
    private static final HashMap n = new HashMap();
    private static final HashMap o = new HashMap();
    String a;
    protected c b;
    Method c;
    Class d;
    p e;
    final ReentrantReadWriteLock f;
    final Object g[];
    private Method h;
    private aj p;
    private Object q;

    private ag(c c1)
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

    ag(c c1, ah ah)
    {
        this(c1);
    }

    private ag(String s)
    {
        c = null;
        h = null;
        e = null;
        f = new ReentrantReadWriteLock();
        g = new Object[1];
        a = s;
    }

    ag(String s, ah ah)
    {
        this(s);
    }

    public static transient ag a(c c1, float af[])
    {
        return new ai(c1, af);
    }

    public static transient ag a(String s, float af[])
    {
        return new ai(s, af);
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
            return (new StringBuilder()).append(s).append(c1).append(s1).toString();
        }
    }

    private Method a(Class class1, String s, Class class2)
    {
        Method method;
        String s1;
        method = null;
        s1 = a(s, a);
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
        Log.e("PropertyValuesHolder", (new StringBuilder()).append("Couldn't find no-arg method for property ").append(a).append(": ").append(s).toString());
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
        Log.e("PropertyValuesHolder", (new StringBuilder()).append("Couldn't find setter/getter for property ").append(a).append(" with value type ").append(d).toString());
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

    private void b(Class class1)
    {
        h = a(class1, o, "get", null);
    }

    public ag a()
    {
        ag ag1;
        try
        {
            ag1 = (ag)super.clone();
            ag1.a = a;
            ag1.b = b;
            ag1.e = e.b();
            ag1.p = p;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return ag1;
    }

    void a(float f1)
    {
        q = e.a(f1);
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
                        n n1 = (n)iterator.next();
                        if (!n1.a())
                        {
                            n1.a(b.a(obj));
                        }
                    } while (true);
                    break label0;
                }
                catch (ClassCastException classcastexception)
                {
                    Log.e("PropertyValuesHolder", (new StringBuilder()).append("No such property (").append(b.a()).append(") on target object ").append(obj).append(". Trying reflection instead").toString());
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
                n n2 = (n)iterator1.next();
                if (!n2.a())
                {
                    if (h == null)
                    {
                        b(class1);
                    }
                    try
                    {
                        n2.a(h.invoke(obj, new Object[0]));
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

    public void a(String s)
    {
        a = s;
    }

    public transient void a(float af[])
    {
        d = Float.TYPE;
        e = com.a.a.p.a(af);
    }

    void b()
    {
        if (p == null)
        {
            aj aj;
            if (d == java/lang/Integer)
            {
                aj = i;
            } else
            if (d == java/lang/Float)
            {
                aj = j;
            } else
            {
                aj = null;
            }
            p = aj;
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
        Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
        return;
        obj;
        Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
        return;
    }

    public String c()
    {
        return a;
    }

    public Object clone()
    {
        return a();
    }

    Object d()
    {
        return q;
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
