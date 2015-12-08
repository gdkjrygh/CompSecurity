// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package p.e:
//            b

abstract class f
{
    final class a
        implements Iterator
    {

        final int a;
        int b;
        int c;
        boolean d;
        final f e;

        public boolean hasNext()
        {
            return c < b;
        }

        public Object next()
        {
            Object obj = e.a(c, a);
            c = c + 1;
            d = true;
            return obj;
        }

        public void remove()
        {
            if (!d)
            {
                throw new IllegalStateException();
            } else
            {
                c = c - 1;
                b = b - 1;
                d = false;
                e.a(c);
                return;
            }
        }

        a(int i)
        {
            e = f.this;
            super();
            d = false;
            a = i;
            b = f.this.a();
        }
    }

    final class b
        implements Set
    {

        final f a;

        public boolean a(java.util.Map.Entry entry)
        {
            throw new UnsupportedOperationException();
        }

        public boolean add(Object obj)
        {
            return a((java.util.Map.Entry)obj);
        }

        public boolean addAll(Collection collection)
        {
            int i = a.a();
            java.util.Map.Entry entry;
            for (collection = collection.iterator(); collection.hasNext(); a.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)collection.next();
            }

            return i != a.a();
        }

        public void clear()
        {
            a.c();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                int i = a.a(((java.util.Map.Entry) (obj)).getKey());
                if (i >= 0)
                {
                    return p.e.b.a(a.a(i, 1), ((java.util.Map.Entry) (obj)).getValue());
                }
            }
            return false;
        }

        public boolean containsAll(Collection collection)
        {
            for (collection = collection.iterator(); collection.hasNext();)
            {
                if (!contains(collection.next()))
                {
                    return false;
                }
            }

            return true;
        }

        public boolean equals(Object obj)
        {
            return f.a(this, obj);
        }

        public int hashCode()
        {
            int j = a.a() - 1;
            int i = 0;
            while (j >= 0) 
            {
                Object obj = a.a(j, 0);
                Object obj1 = a.a(j, 1);
                int k;
                int l;
                if (obj == null)
                {
                    k = 0;
                } else
                {
                    k = obj.hashCode();
                }
                if (obj1 == null)
                {
                    l = 0;
                } else
                {
                    l = obj1.hashCode();
                }
                j--;
                i += l ^ k;
            }
            return i;
        }

        public boolean isEmpty()
        {
            return a.a() == 0;
        }

        public Iterator iterator()
        {
            return a. new d();
        }

        public boolean remove(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public int size()
        {
            return a.a();
        }

        public Object[] toArray()
        {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray(Object aobj[])
        {
            throw new UnsupportedOperationException();
        }

        b()
        {
            a = f.this;
            super();
        }
    }

    final class c
        implements Set
    {

        final f a;

        public boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public void clear()
        {
            a.c();
        }

        public boolean contains(Object obj)
        {
            return a.a(obj) >= 0;
        }

        public boolean containsAll(Collection collection)
        {
            return f.a(a.b(), collection);
        }

        public boolean equals(Object obj)
        {
            return f.a(this, obj);
        }

        public int hashCode()
        {
            int i = a.a() - 1;
            int j = 0;
            while (i >= 0) 
            {
                Object obj = a.a(i, 0);
                int k;
                if (obj == null)
                {
                    k = 0;
                } else
                {
                    k = obj.hashCode();
                }
                j += k;
                i--;
            }
            return j;
        }

        public boolean isEmpty()
        {
            return a.a() == 0;
        }

        public Iterator iterator()
        {
            return a. new a(0);
        }

        public boolean remove(Object obj)
        {
            int i = a.a(obj);
            if (i >= 0)
            {
                a.a(i);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            return f.b(a.b(), collection);
        }

        public boolean retainAll(Collection collection)
        {
            return f.c(a.b(), collection);
        }

        public int size()
        {
            return a.a();
        }

        public Object[] toArray()
        {
            return a.b(0);
        }

        public Object[] toArray(Object aobj[])
        {
            return a.a(aobj, 0);
        }

        c()
        {
            a = f.this;
            super();
        }
    }

    final class d
        implements Iterator, java.util.Map.Entry
    {

        int a;
        int b;
        boolean c;
        final f d;

        public java.util.Map.Entry a()
        {
            b = b + 1;
            c = true;
            return this;
        }

        public final boolean equals(Object obj)
        {
            boolean flag = true;
            if (!c)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            obj = (java.util.Map.Entry)obj;
            if (!p.e.b.a(((java.util.Map.Entry) (obj)).getKey(), d.a(b, 0)) || !p.e.b.a(((java.util.Map.Entry) (obj)).getValue(), d.a(b, 1)))
            {
                flag = false;
            }
            return flag;
        }

        public Object getKey()
        {
            if (!c)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else
            {
                return d.a(b, 0);
            }
        }

        public Object getValue()
        {
            if (!c)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else
            {
                return d.a(b, 1);
            }
        }

        public boolean hasNext()
        {
            return b < a;
        }

        public final int hashCode()
        {
            int j = 0;
            if (!c)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object obj = d.a(b, 0);
            Object obj1 = d.a(b, 1);
            int i;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = obj.hashCode();
            }
            if (obj1 != null)
            {
                j = obj1.hashCode();
            }
            return j ^ i;
        }

        public Object next()
        {
            return a();
        }

        public void remove()
        {
            if (!c)
            {
                throw new IllegalStateException();
            } else
            {
                d.a(b);
                b = b - 1;
                a = a - 1;
                c = false;
                return;
            }
        }

        public Object setValue(Object obj)
        {
            if (!c)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else
            {
                return d.a(b, obj);
            }
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
        }

        d()
        {
            d = f.this;
            super();
            c = false;
            a = f.this.a() - 1;
            b = -1;
        }
    }

    final class e
        implements Collection
    {

        final f a;

        public boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public void clear()
        {
            a.c();
        }

        public boolean contains(Object obj)
        {
            return a.b(obj) >= 0;
        }

        public boolean containsAll(Collection collection)
        {
            for (collection = collection.iterator(); collection.hasNext();)
            {
                if (!contains(collection.next()))
                {
                    return false;
                }
            }

            return true;
        }

        public boolean isEmpty()
        {
            return a.a() == 0;
        }

        public Iterator iterator()
        {
            return a. new a(1);
        }

        public boolean remove(Object obj)
        {
            int i = a.b(obj);
            if (i >= 0)
            {
                a.a(i);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            int i = 0;
            int j = a.a();
            boolean flag = false;
            int k;
            for (; i < j; j = k)
            {
                int l = i;
                k = j;
                if (collection.contains(a.a(i, 1)))
                {
                    a.a(i);
                    l = i - 1;
                    k = j - 1;
                    flag = true;
                }
                i = l + 1;
            }

            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            int i = 0;
            int j = a.a();
            boolean flag = false;
            int k;
            for (; i < j; j = k)
            {
                int l = i;
                k = j;
                if (!collection.contains(a.a(i, 1)))
                {
                    a.a(i);
                    l = i - 1;
                    k = j - 1;
                    flag = true;
                }
                i = l + 1;
            }

            return flag;
        }

        public int size()
        {
            return a.a();
        }

        public Object[] toArray()
        {
            return a.b(1);
        }

        public Object[] toArray(Object aobj[])
        {
            return a.a(aobj, 1);
        }

        e()
        {
            a = f.this;
            super();
        }
    }


    b b;
    c c;
    e d;

    f()
    {
    }

    public static boolean a(Map map, Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!map.containsKey(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean a(Set set, Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
        if (set != obj) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        if (!(obj instanceof Set)) goto _L4; else goto _L3
_L3:
        obj = (Set)obj;
        if (set.size() != ((Set) (obj)).size()) goto _L6; else goto _L5
_L5:
        flag = set.containsAll(((Collection) (obj)));
        if (!flag) goto _L6; else goto _L7
_L7:
        flag = flag1;
_L9:
        return flag;
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        set;
        return false;
        set;
        return false;
    }

    public static boolean b(Map map, Collection collection)
    {
        int i = map.size();
        for (collection = collection.iterator(); collection.hasNext(); map.remove(collection.next())) { }
        return i != map.size();
    }

    public static boolean c(Map map, Collection collection)
    {
        int i = map.size();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!collection.contains(iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
        return i != map.size();
    }

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i, int j);

    protected abstract Object a(int i, Object obj);

    protected abstract void a(int i);

    protected abstract void a(Object obj, Object obj1);

    public Object[] a(Object aobj[], int i)
    {
        int k = a();
        if (aobj.length < k)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
        }
        for (int j = 0; j < k; j++)
        {
            aobj[j] = a(j, i);
        }

        if (aobj.length > k)
        {
            aobj[k] = null;
        }
        return aobj;
    }

    protected abstract int b(Object obj);

    protected abstract Map b();

    public Object[] b(int i)
    {
        int k = a();
        Object aobj[] = new Object[k];
        for (int j = 0; j < k; j++)
        {
            aobj[j] = a(j, i);
        }

        return aobj;
    }

    protected abstract void c();

    public Set d()
    {
        if (b == null)
        {
            b = new b();
        }
        return b;
    }

    public Set e()
    {
        if (c == null)
        {
            c = new c();
        }
        return c;
    }

    public Collection f()
    {
        if (d == null)
        {
            d = new e();
        }
        return d;
    }
}
