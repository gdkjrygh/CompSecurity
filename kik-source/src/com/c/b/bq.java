// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// Referenced classes of package com.c.b:
//            br, bs, bt

class bq extends AbstractMap
{
    private static final class a
    {

        private static final Iterator a = new bs();
        private static final Iterable b = new bt();

        static Iterable a()
        {
            return b;
        }

        static Iterator b()
        {
            return a;
        }

    }

    private final class b
        implements Comparable, java.util.Map.Entry
    {

        final bq a;
        private final Comparable b;
        private Object c;

        private static boolean a(Object obj, Object obj1)
        {
            if (obj == null)
            {
                return obj1 == null;
            } else
            {
                return obj.equals(obj1);
            }
        }

        public final Comparable a()
        {
            return b;
        }

        public final volatile int compareTo(Object obj)
        {
            obj = (b)obj;
            return b.compareTo(((b) (obj)).b);
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof java.util.Map.Entry))
                {
                    return false;
                }
                obj = (java.util.Map.Entry)obj;
                if (!a(b, ((java.util.Map.Entry) (obj)).getKey()) || !a(c, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return false;
                }
            }
            return true;
        }

        public final volatile Object getKey()
        {
            return b;
        }

        public final Object getValue()
        {
            return c;
        }

        public final int hashCode()
        {
            int j = 0;
            int i;
            if (b == null)
            {
                i = 0;
            } else
            {
                i = b.hashCode();
            }
            if (c != null)
            {
                j = c.hashCode();
            }
            return i ^ j;
        }

        public final Object setValue(Object obj)
        {
            bq.a(a);
            Object obj1 = c;
            c = obj;
            return obj1;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(b).append("=").append(c).toString();
        }

        b(Comparable comparable, Object obj)
        {
            a = bq.this;
            super();
            b = comparable;
            c = obj;
        }

        b(java.util.Map.Entry entry)
        {
            this((Comparable)entry.getKey(), entry.getValue());
        }
    }

    private final class c
        implements Iterator
    {

        final bq a;
        private int b;
        private boolean c;
        private Iterator d;

        private Iterator a()
        {
            if (d == null)
            {
                d = bq.c(a).entrySet().iterator();
            }
            return d;
        }

        public final boolean hasNext()
        {
            return b + 1 < bq.b(a).size() || a().hasNext();
        }

        public final Object next()
        {
            c = true;
            int i = b + 1;
            b = i;
            if (i < bq.b(a).size())
            {
                return (java.util.Map.Entry)bq.b(a).get(b);
            } else
            {
                return (java.util.Map.Entry)a().next();
            }
        }

        public final void remove()
        {
            if (!c)
            {
                throw new IllegalStateException("remove() was called before next()");
            }
            c = false;
            bq.a(a);
            if (b < bq.b(a).size())
            {
                bq bq1 = a;
                int i = b;
                b = i - 1;
                bq.a(bq1, i);
                return;
            } else
            {
                a().remove();
                return;
            }
        }

        private c()
        {
            a = bq.this;
            super();
            b = -1;
        }

        c(byte byte0)
        {
            this();
        }
    }

    private final class d extends AbstractSet
    {

        final bq a;

        public final boolean add(Object obj)
        {
            obj = (java.util.Map.Entry)obj;
            if (!contains(obj))
            {
                a.a((Comparable)((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
                return true;
            } else
            {
                return false;
            }
        }

        public final void clear()
        {
            a.clear();
        }

        public final boolean contains(Object obj)
        {
            Object obj1 = (java.util.Map.Entry)obj;
            obj = a.get(((java.util.Map.Entry) (obj1)).getKey());
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            return obj == obj1 || obj != null && obj.equals(obj1);
        }

        public final Iterator iterator()
        {
            return a. new c((byte)0);
        }

        public final boolean remove(Object obj)
        {
            obj = (java.util.Map.Entry)obj;
            if (contains(obj))
            {
                a.remove(((java.util.Map.Entry) (obj)).getKey());
                return true;
            } else
            {
                return false;
            }
        }

        public final int size()
        {
            return a.size();
        }

        private d()
        {
            a = bq.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private final int a;
    private List b;
    private Map c;
    private boolean d;
    private volatile d e;

    private bq(int i)
    {
        a = i;
        b = Collections.emptyList();
        c = Collections.emptyMap();
    }

    bq(int i, byte byte0)
    {
        this(i);
    }

    private int a(Comparable comparable)
    {
_L2:
        int k;
        while (k <= i) 
        {
            int l = (k + i) / 2;
            int i1 = comparable.compareTo(((b)b.get(l)).a());
            if (i1 < 0)
            {
                i = l - 1;
            } else
            if (i1 > 0)
            {
                k = l + 1;
            } else
            {
                return l;
            }
        }
        return -(k + 1);
        int i = b.size() - 1;
        if (i >= 0)
        {
            int j = comparable.compareTo(((b)b.get(i)).a());
            if (j > 0)
            {
                return -(i + 2);
            }
            if (j == 0)
            {
                return i;
            }
        }
        k = 0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static bq a(int i)
    {
        return new br(i);
    }

    static Object a(bq bq1, int i)
    {
        return bq1.c(i);
    }

    static void a(bq bq1)
    {
        bq1.e();
    }

    static List b(bq bq1)
    {
        return bq1.b;
    }

    private Object c(int i)
    {
        e();
        Object obj = ((b)b.remove(i)).getValue();
        if (!c.isEmpty())
        {
            Iterator iterator = f().entrySet().iterator();
            b.add(new b((java.util.Map.Entry)iterator.next()));
            iterator.remove();
        }
        return obj;
    }

    static Map c(bq bq1)
    {
        return bq1.c;
    }

    private void e()
    {
        if (d)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    private SortedMap f()
    {
        e();
        if (c.isEmpty() && !(c instanceof TreeMap))
        {
            c = new TreeMap();
        }
        return (SortedMap)c;
    }

    public final Object a(Comparable comparable, Object obj)
    {
        e();
        int i = a(comparable);
        if (i >= 0)
        {
            return ((b)b.get(i)).setValue(obj);
        }
        e();
        if (b.isEmpty() && !(b instanceof ArrayList))
        {
            b = new ArrayList(a);
        }
        i = -(i + 1);
        if (i >= a)
        {
            return f().put(comparable, obj);
        }
        if (b.size() == a)
        {
            b b1 = (b)b.remove(a - 1);
            f().put(b1.a(), b1.getValue());
        }
        b.add(i, new b(comparable, obj));
        return null;
    }

    public void a()
    {
        if (!d)
        {
            Map map;
            if (c.isEmpty())
            {
                map = Collections.emptyMap();
            } else
            {
                map = Collections.unmodifiableMap(c);
            }
            c = map;
            d = true;
        }
    }

    public final java.util.Map.Entry b(int i)
    {
        return (java.util.Map.Entry)b.get(i);
    }

    public final boolean b()
    {
        return d;
    }

    public final int c()
    {
        return b.size();
    }

    public void clear()
    {
        e();
        if (!b.isEmpty())
        {
            b.clear();
        }
        if (!c.isEmpty())
        {
            c.clear();
        }
    }

    public boolean containsKey(Object obj)
    {
        obj = (Comparable)obj;
        return a(((Comparable) (obj))) >= 0 || c.containsKey(obj);
    }

    public final Iterable d()
    {
        if (c.isEmpty())
        {
            return a.a();
        } else
        {
            return c.entrySet();
        }
    }

    public Set entrySet()
    {
        if (e == null)
        {
            e = new d((byte)0);
        }
        return e;
    }

    public Object get(Object obj)
    {
        obj = (Comparable)obj;
        int i = a(((Comparable) (obj)));
        if (i >= 0)
        {
            return ((b)b.get(i)).getValue();
        } else
        {
            return c.get(obj);
        }
    }

    public Object put(Object obj, Object obj1)
    {
        return a((Comparable)obj, obj1);
    }

    public Object remove(Object obj)
    {
        e();
        obj = (Comparable)obj;
        int i = a(((Comparable) (obj)));
        if (i >= 0)
        {
            return c(i);
        }
        if (c.isEmpty())
        {
            return null;
        } else
        {
            return c.remove(obj);
        }
    }

    public int size()
    {
        return b.size() + c.size();
    }
}
