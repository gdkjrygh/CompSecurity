// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.f;
import com.google.android.m4b.maps.y.g;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.k;
import com.google.android.m4b.maps.y.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            x, bc, as, r, 
//            a, b, v

public final class e
{
    static final class a
        implements r
    {

        private final Iterator a;
        private boolean b;
        private Object c;

        public final Object a()
        {
            if (!b)
            {
                c = a.next();
                b = true;
            }
            return c;
        }

        public final boolean hasNext()
        {
            return b || a.hasNext();
        }

        public final Object next()
        {
            if (!b)
            {
                return a.next();
            } else
            {
                Object obj = c;
                b = false;
                c = null;
                return obj;
            }
        }

        public final void remove()
        {
            boolean flag;
            if (!b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j.b(flag, "Can't remove after you've peeked at next");
            a.remove();
        }

        public a(Iterator iterator)
        {
            a = (Iterator)j.a(iterator);
        }
    }


    private static as a = new as() {

        public final boolean hasNext()
        {
            return false;
        }

        public final boolean hasPrevious()
        {
            return false;
        }

        public final Object next()
        {
            throw new NoSuchElementException();
        }

        public final int nextIndex()
        {
            return 0;
        }

        public final Object previous()
        {
            throw new NoSuchElementException();
        }

        public final int previousIndex()
        {
            return -1;
        }

    };
    private static final Iterator b = new Iterator() {

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
            j.b(false, "no calls to next() since the last call to remove()");
        }

    };

    static as a(Object aobj[], int i, int i1, int j1)
    {
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        j.a(i, i + i1, aobj.length);
        j.b(j1, i1);
        if (i1 == 0)
        {
            return a;
        } else
        {
            return new com.google.android.m4b.maps.aa.a(i1, j1, aobj, i) {

                private Object a[];
                private int b;

                protected final Object a(int k1)
                {
                    return a[b + k1];
                }

            
            {
                a = aobj;
                b = j1;
                super(i, i1);
            }
            };
        }
    }

    public static x a()
    {
        return a;
    }

    public static x a(Object obj)
    {
        return new x(obj) {

            private boolean a;
            private Object b;

            public final boolean hasNext()
            {
                return !a;
            }

            public final Object next()
            {
                if (a)
                {
                    throw new NoSuchElementException();
                } else
                {
                    a = true;
                    return b;
                }
            }

            
            {
                b = obj;
                super();
            }
        };
    }

    public static x a(Iterator iterator)
    {
        j.a(iterator);
        if (iterator instanceof x)
        {
            return (x)iterator;
        } else
        {
            return new x(iterator) {

                private Iterator a;

                public final boolean hasNext()
                {
                    return a.hasNext();
                }

                public final Object next()
                {
                    return a.next();
                }

            
            {
                a = iterator;
                super();
            }
            };
        }
    }

    public static x a(Iterator iterator, k k1)
    {
        j.a(iterator);
        j.a(k1);
        return new b(iterator, k1) {

            private Iterator b;
            private k c;

            protected final Object a()
            {
                while (b.hasNext()) 
                {
                    Object obj = b.next();
                    if (c.a(obj))
                    {
                        return obj;
                    }
                }
                super.a = b.a.c;
                return null;
            }

            
            {
                b = iterator;
                c = k1;
                super();
            }
        };
    }

    public static transient x a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    public static Iterator a(Iterator iterator, f f)
    {
        j.a(f);
        return new v(iterator, f) {

            private f a;

            final Object a(Object obj)
            {
                return a.a(obj);
            }

            
            {
                a = f1;
                super(iterator);
            }
        };
    }

    public static boolean a(Collection collection, Iterator iterator)
    {
        j.a(collection);
        j.a(iterator);
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= collection.add(iterator.next())) { }
        return flag;
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = l.a(obj);
        j.a(obj, "predicate");
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((k) (obj)).a(iterator.next())) goto _L2; else goto _L1
_L1:
        if (i != -1)
        {
            flag = true;
        }
        return flag;
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public static boolean a(Iterator iterator, Collection collection)
    {
        collection = l.a(collection);
        j.a(collection);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (collection.a(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    public static boolean a(Iterator iterator, Iterator iterator1)
    {
        do
        {
            if (iterator.hasNext())
            {
                if (iterator1.hasNext())
                {
                    continue;
                }
            } else
            if (!iterator1.hasNext())
            {
                return true;
            }
            return false;
        } while (h.a(iterator.next(), iterator1.next()));
        return false;
    }

    public static String b(Iterator iterator)
    {
        return bc.a.a(new StringBuilder("["), iterator).append(']').toString();
    }

    public static Object c(Iterator iterator)
    {
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return obj;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder("expected one element but was: <")).append(obj).toString());
        for (int i = 0; i < 4 && iterator.hasNext(); i++)
        {
            stringbuilder.append((new StringBuilder(", ")).append(iterator.next()).toString());
        }

        if (iterator.hasNext())
        {
            stringbuilder.append(", ...");
        }
        stringbuilder.append('>');
        throw new IllegalArgumentException(stringbuilder.toString());
    }

    static void d(Iterator iterator)
    {
        j.a(iterator);
        for (; iterator.hasNext(); iterator.remove())
        {
            iterator.next();
        }

    }

    public static r e(Iterator iterator)
    {
        if (iterator instanceof a)
        {
            return (a)iterator;
        } else
        {
            return new a(iterator);
        }
    }

}
