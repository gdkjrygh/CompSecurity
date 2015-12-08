// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Predicates;
import com.google.common.collect.AbstractIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class cuw
{

    private static cvi a = new cvi() {

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

    public static cvh a()
    {
        return a;
    }

    public static cvh a(Object obj)
    {
        return new cvh(obj) {

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

    public static cvh a(Iterator iterator)
    {
        ctz.a(iterator);
        if (iterator instanceof cvh)
        {
            return (cvh)iterator;
        } else
        {
            return new cvh(iterator) {

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

    public static transient cvh a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    public static cvi a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        ctz.a(i, i + j, aobj.length);
        ctz.b(k, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new cug(j, k, aobj, i) {

                private Object a[];
                private int b;

                protected final Object a(int l)
                {
                    return a[b + l];
                }

            
            {
                a = aobj;
                b = k;
                super(i, j);
            }
            };
        }
    }

    public static Iterator a(Iterator iterator, ctv ctv)
    {
        ctz.a(ctv);
        return new cvf(iterator, ctv) {

            private ctv b;

            final Object a(Object obj)
            {
                return b.a(obj);
            }

            
            {
                b = ctv1;
                super(iterator);
            }
        };
    }

    public static boolean a(Collection collection, Iterator iterator)
    {
        ctz.a(collection);
        ctz.a(iterator);
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= collection.add(iterator.next())) { }
        return flag;
    }

    public static boolean a(Iterator iterator, cua cua1)
    {
        ctz.a(cua1);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (cua1.a(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = Predicates.a(obj);
        ctz.a(obj, "predicate");
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((cua) (obj)).a(iterator.next())) goto _L2; else goto _L1
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
        } while (cty.a(iterator.next(), iterator1.next()));
        return false;
    }

    public static cvh b(Iterator iterator, cua cua1)
    {
        ctz.a(iterator);
        ctz.a(cua1);
        return new AbstractIterator(iterator, cua1) {

            private Iterator b;
            private cua c;

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
                super.a = com.google.common.collect.AbstractIterator.State.c;
                return null;
            }

            
            {
                b = iterator;
                c = cua1;
                super();
            }
        };
    }

    public static String b(Iterator iterator)
    {
        return cuk.a.a(new StringBuilder("["), iterator).append(']').toString();
    }

    public static Object c(Iterator iterator)
    {
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return obj;
        }
        StringBuilder stringbuilder = new StringBuilder();
        obj = String.valueOf(String.valueOf(obj));
        stringbuilder.append((new StringBuilder(((String) (obj)).length() + 31)).append("expected one element but was: <").append(((String) (obj))).toString());
        for (int i = 0; i < 4 && iterator.hasNext(); i++)
        {
            String s = String.valueOf(String.valueOf(iterator.next()));
            stringbuilder.append((new StringBuilder(s.length() + 2)).append(", ").append(s).toString());
        }

        if (iterator.hasNext())
        {
            stringbuilder.append(", ...");
        }
        stringbuilder.append('>');
        throw new IllegalArgumentException(stringbuilder.toString());
    }

    public static Iterator d(Iterator iterator)
    {
        ctz.a(iterator);
        return new Iterator(iterator) {

            private Iterator a;
            private Iterator b;
            private Iterator c;

            public final boolean hasNext()
            {
                do
                {
                    boolean flag = ((Iterator)ctz.a(a)).hasNext();
                    if (!flag && c.hasNext())
                    {
                        a = (Iterator)c.next();
                    } else
                    {
                        return flag;
                    }
                } while (true);
            }

            public final Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    b = a;
                    return a.next();
                }
            }

            public final void remove()
            {
                boolean flag;
                if (b != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ctz.b(flag, "no calls to next() since the last call to remove()");
                b.remove();
                b = null;
            }

            
            {
                c = iterator;
                super();
                a = cuw.a();
            }
        };
    }

    public static Object e(Iterator iterator)
    {
        if (iterator.hasNext())
        {
            return iterator.next();
        } else
        {
            return null;
        }
    }

    public static cvb f(Iterator iterator)
    {
        if (iterator instanceof cux)
        {
            return (cux)iterator;
        } else
        {
            return new cux(iterator);
        }
    }

    static ListIterator g(Iterator iterator)
    {
        return (ListIterator)iterator;
    }

    static 
    {
        new Iterator() {

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
                ctz.b(false, "no calls to next() since the last call to remove()");
            }

        };
    }
}
