// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class v extends AbstractMap
{
    static final class a
    {

        private static final Iterator a = new Iterator() {

            public final boolean hasNext()
            {
                return false;
            }

            public final Object next()
            {
                throw new NoSuchElementException();
            }

            public final void remove()
            {
                throw new UnsupportedOperationException();
            }

        };
        private static final Iterable b = new Iterable() {

            public final Iterator iterator()
            {
                return a.b();
            }

        };

        static Iterable a()
        {
            return b;
        }

        static Iterator b()
        {
            return a;
        }

    }

    final class b
        implements Comparable, java.util.Map.Entry
    {

        final Comparable a;
        private Object b;
        private v c;

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

        public final int compareTo(Object obj)
        {
            obj = (b)obj;
            return a.compareTo(((b) (obj)).a);
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
                if (!a(a, ((java.util.Map.Entry) (obj)).getKey()) || !a(b, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return false;
                }
            }
            return true;
        }

        public final Object getKey()
        {
            return a;
        }

        public final Object getValue()
        {
            return b;
        }

        public final int hashCode()
        {
            int j = 0;
            int i;
            if (a == null)
            {
                i = 0;
            } else
            {
                i = a.hashCode();
            }
            if (b != null)
            {
                j = b.hashCode();
            }
            return i ^ j;
        }

        public final Object setValue(Object obj)
        {
            v.a(c);
            Object obj1 = b;
            b = obj;
            return obj1;
        }

        public final String toString()
        {
            String s = String.valueOf(a);
            String s1 = String.valueOf(b);
            return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("=").append(s1).toString();
        }

        b(Comparable comparable, Object obj)
        {
            c = v.this;
            super();
            a = comparable;
            b = obj;
        }

        b(java.util.Map.Entry entry)
        {
            this((Comparable)entry.getKey(), entry.getValue());
        }
    }

    final class c
        implements Iterator
    {

        private int a;
        private boolean b;
        private Iterator c;
        private v d;

        private Iterator a()
        {
            if (c == null)
            {
                c = v.c(d).entrySet().iterator();
            }
            return c;
        }

        public final boolean hasNext()
        {
            return a + 1 < v.b(d).size() || a().hasNext();
        }

        public final Object next()
        {
            b = true;
            int i = a + 1;
            a = i;
            if (i < v.b(d).size())
            {
                return (java.util.Map.Entry)v.b(d).get(a);
            } else
            {
                return (java.util.Map.Entry)a().next();
            }
        }

        public final void remove()
        {
            if (!b)
            {
                throw new IllegalStateException("remove() was called before next()");
            }
            b = false;
            v.a(d);
            if (a < v.b(d).size())
            {
                v v1 = d;
                int i = a;
                a = i - 1;
                v.a(v1, i);
                return;
            } else
            {
                a().remove();
                return;
            }
        }

        private c()
        {
            d = v.this;
            super();
            a = -1;
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d extends AbstractSet
    {

        private v a;

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
            a = v.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    boolean a;
    private final int b;
    private List c;
    private Map d;
    private volatile d e;

    private v(int i)
    {
        b = i;
        c = Collections.emptyList();
        d = Collections.emptyMap();
    }

    v(int i, byte byte0)
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
            int i1 = comparable.compareTo(((b)c.get(l)).a);
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
        int i = c.size() - 1;
        if (i >= 0)
        {
            int j = comparable.compareTo(((b)c.get(i)).a);
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

    static v a(int i)
    {
        return new v(i) {

            public final void a()
            {
                if (!a)
                {
                    for (int j = 0; j < b(); j++)
                    {
                        java.util.Map.Entry entry = b(j);
                        if (((i.a)entry.getKey()).d())
                        {
                            entry.setValue(Collections.unmodifiableList((List)entry.getValue()));
                        }
                    }

                    Iterator iterator = c().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
                        if (((i.a)entry1.getKey()).d())
                        {
                            entry1.setValue(Collections.unmodifiableList((List)entry1.getValue()));
                        }
                    } while (true);
                }
                a();
            }

            public final Object put(Object obj, Object obj1)
            {
                return a((i.a)obj, obj1);
            }

        };
    }

    static Object a(v v1, int i)
    {
        return v1.c(i);
    }

    static void a(v v1)
    {
        v1.d();
    }

    static List b(v v1)
    {
        return v1.c;
    }

    private Object c(int i)
    {
        d();
        Object obj = ((b)c.remove(i)).getValue();
        if (!d.isEmpty())
        {
            Iterator iterator = e().entrySet().iterator();
            c.add(new b((java.util.Map.Entry)iterator.next()));
            iterator.remove();
        }
        return obj;
    }

    static Map c(v v1)
    {
        return v1.d;
    }

    private void d()
    {
        if (a)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    private SortedMap e()
    {
        d();
        if (d.isEmpty() && !(d instanceof TreeMap))
        {
            d = new TreeMap();
        }
        return (SortedMap)d;
    }

    public final Object a(Comparable comparable, Object obj)
    {
        d();
        int i = a(comparable);
        if (i >= 0)
        {
            return ((b)c.get(i)).setValue(obj);
        }
        d();
        if (c.isEmpty() && !(c instanceof ArrayList))
        {
            c = new ArrayList(b);
        }
        i = -(i + 1);
        if (i >= b)
        {
            return e().put(comparable, obj);
        }
        if (c.size() == b)
        {
            b b1 = (b)c.remove(b - 1);
            e().put(b1.a, b1.getValue());
        }
        c.add(i, new b(comparable, obj));
        return null;
    }

    public void a()
    {
        if (!a)
        {
            Map map;
            if (d.isEmpty())
            {
                map = Collections.emptyMap();
            } else
            {
                map = Collections.unmodifiableMap(d);
            }
            d = map;
            a = true;
        }
    }

    public final int b()
    {
        return c.size();
    }

    public final java.util.Map.Entry b(int i)
    {
        return (java.util.Map.Entry)c.get(i);
    }

    public final Iterable c()
    {
        if (d.isEmpty())
        {
            return a.a();
        } else
        {
            return d.entrySet();
        }
    }

    public void clear()
    {
        d();
        if (!c.isEmpty())
        {
            c.clear();
        }
        if (!d.isEmpty())
        {
            d.clear();
        }
    }

    public boolean containsKey(Object obj)
    {
        obj = (Comparable)obj;
        return a(((Comparable) (obj))) >= 0 || d.containsKey(obj);
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
            return ((b)c.get(i)).getValue();
        } else
        {
            return d.get(obj);
        }
    }

    public Object put(Object obj, Object obj1)
    {
        return a((Comparable)obj, obj1);
    }

    public Object remove(Object obj)
    {
        d();
        obj = (Comparable)obj;
        int i = a(((Comparable) (obj)));
        if (i >= 0)
        {
            return c(i);
        }
        if (d.isEmpty())
        {
            return null;
        } else
        {
            return d.remove(obj);
        }
    }

    public int size()
    {
        return c.size() + d.size();
    }
}
