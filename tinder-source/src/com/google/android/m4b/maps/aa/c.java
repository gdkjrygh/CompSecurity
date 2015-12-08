// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            au, ax, e, bc, 
//            bo

abstract class com.google.android.m4b.maps.aa.c extends au
    implements Serializable
{
    class a extends ax.c
    {

        final transient Map a;
        final com.google.android.m4b.maps.aa.c b;

        protected final Set a()
        {
            return new a(this);
        }

        public void clear()
        {
            if (a == com.google.android.m4b.maps.aa.c.a(b))
            {
                com.google.android.m4b.maps.aa.c c1 = b;
                for (Iterator iterator = c1.a.values().iterator(); iterator.hasNext(); ((Collection)iterator.next()).clear()) { }
                c1.a.clear();
                c1.b = 0;
                return;
            } else
            {
                com.google.android.m4b.maps.aa.e.d(new b(this));
                return;
            }
        }

        public boolean containsKey(Object obj)
        {
            return ax.b(a, obj);
        }

        public boolean equals(Object obj)
        {
            return this == obj || a.equals(obj);
        }

        public Object get(Object obj)
        {
            Collection collection = (Collection)ax.a(a, obj);
            if (collection == null)
            {
                return null;
            } else
            {
                return b.a(obj, collection);
            }
        }

        public int hashCode()
        {
            return a.hashCode();
        }

        public Set keySet()
        {
            return b.d();
        }

        public Object remove(Object obj)
        {
            obj = (Collection)a.remove(obj);
            if (obj == null)
            {
                return null;
            } else
            {
                Collection collection = b.f();
                collection.addAll(((Collection) (obj)));
                com.google.android.m4b.maps.aa.c.b(b, ((Collection) (obj)).size());
                ((Collection) (obj)).clear();
                return collection;
            }
        }

        public int size()
        {
            return a.size();
        }

        public String toString()
        {
            return a.toString();
        }

        a(Map map)
        {
            b = com.google.android.m4b.maps.aa.c.this;
            super();
            a = map;
        }
    }

    final class a.a extends ax.b
    {

        private a a;

        final Map a()
        {
            return a;
        }

        public final boolean contains(Object obj)
        {
            return bc.a(a.a.entrySet(), obj);
        }

        public final Iterator iterator()
        {
            return new a.b(a);
        }

        public final boolean remove(Object obj)
        {
            if (!contains(obj))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                com.google.android.m4b.maps.aa.c.a(a.b, ((java.util.Map.Entry) (obj)).getKey());
                return true;
            }
        }

        a.a(a a1)
        {
            a = a1;
            super();
        }
    }

    final class a.b
        implements Iterator
    {

        private Iterator a;
        private Collection b;
        private a c;

        public final boolean hasNext()
        {
            return a.hasNext();
        }

        public final Object next()
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
            b = (Collection)entry.getValue();
            a a1 = c;
            Object obj = entry.getKey();
            return ax.a(obj, a1.b.a(obj, (Collection)entry.getValue()));
        }

        public final void remove()
        {
            a.remove();
            com.google.android.m4b.maps.aa.c.b(c.b, b.size());
            b.clear();
        }

        a.b(a a1)
        {
            c = a1;
            super();
            a = c.a.entrySet().iterator();
        }
    }

    class b extends ax.d
    {

        final com.google.android.m4b.maps.aa.c b;

        public void clear()
        {
            com.google.android.m4b.maps.aa.e.d(iterator());
        }

        public boolean containsAll(Collection collection)
        {
            return super.a.keySet().containsAll(collection);
        }

        public boolean equals(Object obj)
        {
            return this == obj || super.a.keySet().equals(obj);
        }

        public int hashCode()
        {
            return super.a.keySet().hashCode();
        }

        public Iterator iterator()
        {
            return new Iterator(this, super.a.entrySet().iterator()) {

                private java.util.Map.Entry a;
                private Iterator b;
                private b c;

                public final boolean hasNext()
                {
                    return b.hasNext();
                }

                public final Object next()
                {
                    a = (java.util.Map.Entry)b.next();
                    return a.getKey();
                }

                public final void remove()
                {
                    Collection collection;
                    boolean flag;
                    if (a != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    j.b(flag, "no calls to next() since the last call to remove()");
                    collection = (Collection)a.getValue();
                    b.remove();
                    com.google.android.m4b.maps.aa.c.b(c.b, collection.size());
                    collection.clear();
                }

            
            {
                c = b1;
                b = iterator;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            obj = (Collection)super.a.remove(obj);
            int k;
            if (obj != null)
            {
                k = ((Collection) (obj)).size();
                ((Collection) (obj)).clear();
                com.google.android.m4b.maps.aa.c.b(b, k);
            } else
            {
                k = 0;
            }
            return k > 0;
        }

        b(Map map)
        {
            b = com.google.android.m4b.maps.aa.c.this;
            super(map);
        }
    }

    final class c extends g
        implements RandomAccess
    {

        private com.google.android.m4b.maps.aa.c f;

        c(Object obj, List list, f f1)
        {
            f = com.google.android.m4b.maps.aa.c.this;
            super(obj, list, f1);
        }
    }

    public final class d extends a
        implements SortedMap
    {

        private SortedSet c;
        private com.google.android.m4b.maps.aa.c d;

        private SortedSet c()
        {
            return d. new e((SortedMap)a);
        }

        final Set b()
        {
            return c();
        }

        public final Comparator comparator()
        {
            return ((SortedMap)a).comparator();
        }

        public final Object firstKey()
        {
            return ((SortedMap)a).firstKey();
        }

        public final SortedMap headMap(Object obj)
        {
            return d. new d(((SortedMap)a).headMap(obj));
        }

        public final Set keySet()
        {
            SortedSet sortedset1 = c;
            SortedSet sortedset = sortedset1;
            if (sortedset1 == null)
            {
                sortedset = c();
                c = sortedset;
            }
            return sortedset;
        }

        public final Object lastKey()
        {
            return ((SortedMap)a).lastKey();
        }

        public final SortedMap subMap(Object obj, Object obj1)
        {
            return d. new d(((SortedMap)a).subMap(obj, obj1));
        }

        public final SortedMap tailMap(Object obj)
        {
            return d. new d(((SortedMap)a).tailMap(obj));
        }

        d(SortedMap sortedmap)
        {
            d = com.google.android.m4b.maps.aa.c.this;
            super(sortedmap);
        }
    }

    public final class e extends b
        implements SortedSet
    {

        private com.google.android.m4b.maps.aa.c c;

        public final Comparator comparator()
        {
            return ((SortedMap)super.a).comparator();
        }

        public final Object first()
        {
            return ((SortedMap)super.a).firstKey();
        }

        public final SortedSet headSet(Object obj)
        {
            return c. new e(((SortedMap)super.a).headMap(obj));
        }

        public final Object last()
        {
            return ((SortedMap)super.a).lastKey();
        }

        public final SortedSet subSet(Object obj, Object obj1)
        {
            return c. new e(((SortedMap)super.a).subMap(obj, obj1));
        }

        public final SortedSet tailSet(Object obj)
        {
            return c. new e(((SortedMap)super.a).tailMap(obj));
        }

        e(SortedMap sortedmap)
        {
            c = com.google.android.m4b.maps.aa.c.this;
            super(sortedmap);
        }
    }

    class f extends AbstractCollection
    {

        final Object a;
        Collection b;
        final f c;
        final com.google.android.m4b.maps.aa.c d;
        private Collection e;

        final void a()
        {
            if (c != null)
            {
                c.a();
                if (c.b != e)
                {
                    throw new ConcurrentModificationException();
                }
            } else
            if (b.isEmpty())
            {
                Collection collection = (Collection)com.google.android.m4b.maps.aa.c.a(d).get(a);
                if (collection != null)
                {
                    b = collection;
                }
            }
        }

        public boolean add(Object obj)
        {
            a();
            boolean flag = b.isEmpty();
            boolean flag1 = b.add(obj);
            if (flag1)
            {
                com.google.android.m4b.maps.aa.c.c(d);
                if (flag)
                {
                    c();
                }
            }
            return flag1;
        }

        public boolean addAll(Collection collection)
        {
            boolean flag;
            if (collection.isEmpty())
            {
                flag = false;
            } else
            {
                int k = size();
                boolean flag1 = b.addAll(collection);
                flag = flag1;
                if (flag1)
                {
                    int l = b.size();
                    com.google.android.m4b.maps.aa.c.a(d, l - k);
                    flag = flag1;
                    if (k == 0)
                    {
                        c();
                        return flag1;
                    }
                }
            }
            return flag;
        }

        final void b()
        {
            f f1;
            for (f1 = this; f1.c != null; f1 = f1.c) { }
            if (f1.b.isEmpty())
            {
                com.google.android.m4b.maps.aa.c.a(f1.d).remove(f1.a);
            }
        }

        final void c()
        {
            f f1;
            for (f1 = this; f1.c != null; f1 = f1.c) { }
            com.google.android.m4b.maps.aa.c.a(f1.d).put(f1.a, f1.b);
        }

        public void clear()
        {
            int k = size();
            if (k == 0)
            {
                return;
            } else
            {
                b.clear();
                com.google.android.m4b.maps.aa.c.b(d, k);
                b();
                return;
            }
        }

        public boolean contains(Object obj)
        {
            a();
            return b.contains(obj);
        }

        public boolean containsAll(Collection collection)
        {
            a();
            return b.containsAll(collection);
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            } else
            {
                a();
                return b.equals(obj);
            }
        }

        public int hashCode()
        {
            a();
            return b.hashCode();
        }

        public Iterator iterator()
        {
            a();
            return new a(this);
        }

        public boolean remove(Object obj)
        {
            a();
            boolean flag = b.remove(obj);
            if (flag)
            {
                com.google.android.m4b.maps.aa.c.b(d);
                b();
            }
            return flag;
        }

        public boolean removeAll(Collection collection)
        {
            boolean flag;
            if (collection.isEmpty())
            {
                flag = false;
            } else
            {
                int k = size();
                boolean flag1 = b.removeAll(collection);
                flag = flag1;
                if (flag1)
                {
                    int l = b.size();
                    com.google.android.m4b.maps.aa.c.a(d, l - k);
                    b();
                    return flag1;
                }
            }
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            j.a(collection);
            int k = size();
            boolean flag = b.retainAll(collection);
            if (flag)
            {
                int l = b.size();
                com.google.android.m4b.maps.aa.c.a(d, l - k);
                b();
            }
            return flag;
        }

        public int size()
        {
            a();
            return b.size();
        }

        public String toString()
        {
            a();
            return b.toString();
        }

        f(Object obj, Collection collection, f f1)
        {
            d = com.google.android.m4b.maps.aa.c.this;
            super();
            a = obj;
            b = collection;
            c = f1;
            if (f1 == null)
            {
                c1 = null;
            } else
            {
                c1 = f1.b;
            }
            e = com.google.android.m4b.maps.aa.c.this;
        }
    }

    class f.a
        implements Iterator
    {

        final Iterator a;
        private Collection b;
        private f c;

        final void a()
        {
            c.a();
            if (c.b != b)
            {
                throw new ConcurrentModificationException();
            } else
            {
                return;
            }
        }

        public boolean hasNext()
        {
            a();
            return a.hasNext();
        }

        public Object next()
        {
            a();
            return a.next();
        }

        public void remove()
        {
            a.remove();
            com.google.android.m4b.maps.aa.c.b(c.d);
            c.b();
        }

        f.a(f f1)
        {
            c = f1;
            super();
            b = c.b;
            a = com.google.android.m4b.maps.aa.c.a(f1.b);
        }

        f.a(f f1, Iterator iterator)
        {
            c = f1;
            super();
            b = c.b;
            a = iterator;
        }
    }

    class g extends f
        implements List
    {

        final com.google.android.m4b.maps.aa.c e;

        public void add(int k, Object obj)
        {
            a();
            boolean flag = super.b.isEmpty();
            ((List)super.b).add(k, obj);
            com.google.android.m4b.maps.aa.c.c(e);
            if (flag)
            {
                c();
            }
        }

        public boolean addAll(int k, Collection collection)
        {
            boolean flag;
            if (collection.isEmpty())
            {
                flag = false;
            } else
            {
                int l = size();
                boolean flag1 = ((List)super.b).addAll(k, collection);
                flag = flag1;
                if (flag1)
                {
                    k = super.b.size();
                    com.google.android.m4b.maps.aa.c.a(e, k - l);
                    flag = flag1;
                    if (l == 0)
                    {
                        c();
                        return flag1;
                    }
                }
            }
            return flag;
        }

        public Object get(int k)
        {
            a();
            return ((List)super.b).get(k);
        }

        public int indexOf(Object obj)
        {
            a();
            return ((List)super.b).indexOf(obj);
        }

        public int lastIndexOf(Object obj)
        {
            a();
            return ((List)super.b).lastIndexOf(obj);
        }

        public ListIterator listIterator()
        {
            a();
            return new a(this);
        }

        public ListIterator listIterator(int k)
        {
            a();
            return new a(this, k);
        }

        public Object remove(int k)
        {
            a();
            Object obj = ((List)super.b).remove(k);
            com.google.android.m4b.maps.aa.c.b(e);
            b();
            return obj;
        }

        public Object set(int k, Object obj)
        {
            a();
            return ((List)super.b).set(k, obj);
        }

        public List subList(int k, int l)
        {
            a();
            com.google.android.m4b.maps.aa.c c1 = e;
            Object obj1 = super.a;
            List list = ((List)super.b).subList(k, l);
            Object obj;
            if (super.c == null)
            {
                obj = this;
            } else
            {
                obj = super.c;
            }
            return com.google.android.m4b.maps.aa.c.a(c1, obj1, list, ((f) (obj)));
        }

        g(Object obj, List list, f f1)
        {
            e = com.google.android.m4b.maps.aa.c.this;
            super(obj, list, f1);
        }
    }

    final class g.a extends f.a
        implements ListIterator
    {

        private g b;

        private ListIterator b()
        {
            ((f.a)this).a();
            return (ListIterator)super.a;
        }

        public final void add(Object obj)
        {
            boolean flag = b.isEmpty();
            b().add(obj);
            com.google.android.m4b.maps.aa.c.c(b.e);
            if (flag)
            {
                b.c();
            }
        }

        public final boolean hasPrevious()
        {
            return b().hasPrevious();
        }

        public final int nextIndex()
        {
            return b().nextIndex();
        }

        public final Object previous()
        {
            return b().previous();
        }

        public final int previousIndex()
        {
            return b().previousIndex();
        }

        public final void set(Object obj)
        {
            b().set(obj);
        }

        g.a(g g1)
        {
            b = g1;
            super(g1);
        }

        public g.a(g g1, int k)
        {
            b = g1;
            super(g1, ((List)((f) (g1)).b).listIterator(k));
        }
    }

    final class h extends f
        implements Set
    {

        private com.google.android.m4b.maps.aa.c e;

        public final boolean removeAll(Collection collection)
        {
            boolean flag;
            if (collection.isEmpty())
            {
                flag = false;
            } else
            {
                int k = size();
                boolean flag1 = bo.a((Set)b, collection);
                flag = flag1;
                if (flag1)
                {
                    int l = b.size();
                    com.google.android.m4b.maps.aa.c.a(e, l - k);
                    b();
                    return flag1;
                }
            }
            return flag;
        }

        h(Object obj, Set set)
        {
            e = com.google.android.m4b.maps.aa.c.this;
            super(obj, set, null);
        }
    }

    public final class i extends f
        implements SortedSet
    {

        private com.google.android.m4b.maps.aa.c e;

        public final Comparator comparator()
        {
            return ((SortedSet)super.b).comparator();
        }

        public final Object first()
        {
            a();
            return ((SortedSet)super.b).first();
        }

        public final SortedSet headSet(Object obj)
        {
            a();
            com.google.android.m4b.maps.aa.c c1 = e;
            Object obj1 = super.a;
            SortedSet sortedset = ((SortedSet)super.b).headSet(obj);
            if (super.c == null)
            {
                obj = this;
            } else
            {
                obj = super.c;
            }
            return c1. new i(obj1, sortedset, ((f) (obj)));
        }

        public final Object last()
        {
            a();
            return ((SortedSet)super.b).last();
        }

        public final SortedSet subSet(Object obj, Object obj1)
        {
            a();
            com.google.android.m4b.maps.aa.c c1 = e;
            Object obj2 = super.a;
            obj1 = ((SortedSet)super.b).subSet(obj, obj1);
            if (super.c == null)
            {
                obj = this;
            } else
            {
                obj = super.c;
            }
            return c1. new i(obj2, ((SortedSet) (obj1)), ((f) (obj)));
        }

        public final SortedSet tailSet(Object obj)
        {
            a();
            com.google.android.m4b.maps.aa.c c1 = e;
            Object obj1 = super.a;
            SortedSet sortedset = ((SortedSet)super.b).tailSet(obj);
            if (super.c == null)
            {
                obj = this;
            } else
            {
                obj = super.c;
            }
            return c1. new i(obj1, sortedset, ((f) (obj)));
        }

        i(Object obj, SortedSet sortedset, f f1)
        {
            e = com.google.android.m4b.maps.aa.c.this;
            super(obj, sortedset, f1);
        }
    }


    private static final long serialVersionUID = 0x21f766b1f568c81dL;
    transient Map a;
    transient int b;

    protected com.google.android.m4b.maps.aa.c(Map map)
    {
        j.a(map.isEmpty());
        a = map;
    }

    static int a(com.google.android.m4b.maps.aa.c c1, int k)
    {
        k = c1.b + k;
        c1.b = k;
        return k;
    }

    static int a(com.google.android.m4b.maps.aa.c c1, Object obj)
    {
        obj = (Collection)ax.c(c1.a, obj);
        int k = 0;
        if (obj != null)
        {
            k = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            c1.b = c1.b - k;
        }
        return k;
    }

    static Iterator a(Collection collection)
    {
        if (collection instanceof List)
        {
            return ((List)collection).listIterator();
        } else
        {
            return collection.iterator();
        }
    }

    static List a(com.google.android.m4b.maps.aa.c c1, Object obj, List list, f f1)
    {
        return c1.a(obj, list, f1);
    }

    private List a(Object obj, List list, f f1)
    {
        if (list instanceof RandomAccess)
        {
            return new c(obj, list, f1);
        } else
        {
            return new g(obj, list, f1);
        }
    }

    static Map a(com.google.android.m4b.maps.aa.c c1)
    {
        return c1.a;
    }

    static int b(com.google.android.m4b.maps.aa.c c1)
    {
        int k = c1.b;
        c1.b = k - 1;
        return k;
    }

    static int b(com.google.android.m4b.maps.aa.c c1, int k)
    {
        k = c1.b - k;
        c1.b = k;
        return k;
    }

    static int c(com.google.android.m4b.maps.aa.c c1)
    {
        int k = c1.b;
        c1.b = k + 1;
        return k;
    }

    public final int a()
    {
        return b;
    }

    final Collection a(Object obj, Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return new i(obj, (SortedSet)collection, null);
        }
        if (collection instanceof Set)
        {
            return new h(obj, (Set)collection);
        }
        if (collection instanceof List)
        {
            return a(obj, (List)collection, null);
        } else
        {
            return new f(obj, collection, null);
        }
    }

    public final boolean a(Object obj, Object obj1)
    {
        Collection collection = (Collection)a.get(obj);
        if (collection == null)
        {
            collection = f();
            if (collection.add(obj1))
            {
                b = b + 1;
                a.put(obj, collection);
                return true;
            } else
            {
                throw new AssertionError("New Collection violated the Collection spec");
            }
        }
        if (collection.add(obj1))
        {
            b = b + 1;
            return true;
        } else
        {
            return false;
        }
    }

    public final Collection b(Object obj)
    {
        Collection collection1 = (Collection)a.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = f();
        }
        return a(obj, collection);
    }

    final Map b()
    {
        if (a instanceof SortedMap)
        {
            return new d((SortedMap)a);
        } else
        {
            return new a(a);
        }
    }

    abstract Collection f();

    final Set h_()
    {
        if (a instanceof SortedMap)
        {
            return new e((SortedMap)a);
        } else
        {
            return new b(a);
        }
    }
}
