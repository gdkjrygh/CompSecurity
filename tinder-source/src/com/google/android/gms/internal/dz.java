// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            dx

abstract class dz
{
    final class a
        implements Iterator
    {

        final int a;
        int b;
        int c;
        boolean d;
        final dz e;

        public final boolean hasNext()
        {
            return c < b;
        }

        public final Object next()
        {
            Object obj = e.a(c, a);
            c = c + 1;
            d = true;
            return obj;
        }

        public final void remove()
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
            e = dz.this;
            super();
            d = false;
            a = i;
            b = dz.this.a();
        }
    }

    final class b
        implements Set
    {

        final dz a;

        public final boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection)
        {
            int i = a.a();
            java.util.Map.Entry entry;
            for (collection = collection.iterator(); collection.hasNext(); a.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)collection.next();
            }

            return i != a.a();
        }

        public final void clear()
        {
            a.c();
        }

        public final boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                int i = a.a(((java.util.Map.Entry) (obj)).getKey());
                if (i >= 0)
                {
                    return dx.a(a.a(i, 1), ((java.util.Map.Entry) (obj)).getValue());
                }
            }
            return false;
        }

        public final boolean containsAll(Collection collection)
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

        public final boolean equals(Object obj)
        {
            return dz.a(this, obj);
        }

        public final int hashCode()
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

        public final boolean isEmpty()
        {
            return a.a() == 0;
        }

        public final Iterator iterator()
        {
            return a. new d();
        }

        public final boolean remove(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final int size()
        {
            return a.a();
        }

        public final Object[] toArray()
        {
            throw new UnsupportedOperationException();
        }

        public final Object[] toArray(Object aobj[])
        {
            throw new UnsupportedOperationException();
        }

        b()
        {
            a = dz.this;
            super();
        }
    }

    final class c
        implements Set
    {

        final dz a;

        public final boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final void clear()
        {
            a.c();
        }

        public final boolean contains(Object obj)
        {
            return a.a(obj) >= 0;
        }

        public final boolean containsAll(Collection collection)
        {
            Map map = a.b();
            for (collection = collection.iterator(); collection.hasNext();)
            {
                if (!map.containsKey(collection.next()))
                {
                    return false;
                }
            }

            return true;
        }

        public final boolean equals(Object obj)
        {
            return dz.a(this, obj);
        }

        public final int hashCode()
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

        public final boolean isEmpty()
        {
            return a.a() == 0;
        }

        public final Iterator iterator()
        {
            return a. new a(0);
        }

        public final boolean remove(Object obj)
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

        public final boolean removeAll(Collection collection)
        {
            Map map = a.b();
            int i = map.size();
            for (collection = collection.iterator(); collection.hasNext(); map.remove(collection.next())) { }
            return i != map.size();
        }

        public final boolean retainAll(Collection collection)
        {
            Map map = a.b();
            int i = map.size();
            Iterator iterator1 = map.keySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                if (!collection.contains(iterator1.next()))
                {
                    iterator1.remove();
                }
            } while (true);
            return i != map.size();
        }

        public final int size()
        {
            return a.a();
        }

        public final Object[] toArray()
        {
            return a.b(0);
        }

        public final Object[] toArray(Object aobj[])
        {
            return a.a(aobj, 0);
        }

        c()
        {
            a = dz.this;
            super();
        }
    }

    final class d
        implements Iterator, java.util.Map.Entry
    {

        int a;
        int b;
        boolean c;
        final dz d;

        public final boolean equals(Object obj)
        {
            if (!c)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (obj instanceof java.util.Map.Entry)
            {
                if (dx.a(((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getKey(), d.a(b, 0)) && dx.a(((java.util.Map.Entry) (obj)).getValue(), d.a(b, 1)))
                {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey()
        {
            if (!c)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else
            {
                return d.a(b, 0);
            }
        }

        public final Object getValue()
        {
            if (!c)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else
            {
                return d.a(b, 1);
            }
        }

        public final boolean hasNext()
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

        public final volatile Object next()
        {
            b = b + 1;
            c = true;
            return this;
        }

        public final void remove()
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

        public final Object setValue(Object obj)
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
            d = dz.this;
            super();
            c = false;
            a = dz.this.a() - 1;
            b = -1;
        }
    }

    final class e
        implements Collection
    {

        final dz a;

        public final boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final void clear()
        {
            a.c();
        }

        public final boolean contains(Object obj)
        {
            return a.b(obj) >= 0;
        }

        public final boolean containsAll(Collection collection)
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

        public final boolean isEmpty()
        {
            return a.a() == 0;
        }

        public final Iterator iterator()
        {
            return a. new a(1);
        }

        public final boolean remove(Object obj)
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

        public final boolean removeAll(Collection collection)
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

        public final boolean retainAll(Collection collection)
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

        public final int size()
        {
            return a.a();
        }

        public final Object[] toArray()
        {
            return a.b(1);
        }

        public final Object[] toArray(Object aobj[])
        {
            return a.a(aobj, 1);
        }

        e()
        {
            a = dz.this;
            super();
        }
    }


    b b;
    c c;
    e d;

    dz()
    {
    }

    public static boolean a(Set set, Object obj)
    {
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i, int j);

    protected abstract Object a(int i, Object obj);

    protected abstract void a(int i);

    protected abstract void a(Object obj, Object obj1);

    public final Object[] a(Object aobj[], int i)
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

    public final Object[] b(int i)
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
}
