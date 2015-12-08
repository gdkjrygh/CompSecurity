// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;

import java.lang.reflect.Array;
import java.util.Comparator;

public final class android.support.v7.util.a
{
    public static final class a extends b
    {

        int a;
        int b;
        int c;
        private final b d;

        public final void a()
        {
            if (a == 0)
            {
                return;
            }
            a;
            JVM INSTR tableswitch 1 3: default 40
        //                       1 46
        //                       2 64
        //                       3 82;
               goto _L1 _L2 _L3 _L4
_L1:
            a = 0;
            return;
_L2:
            d.onInserted(b, c);
            continue; /* Loop/switch isn't completed */
_L3:
            d.onRemoved(b, c);
            continue; /* Loop/switch isn't completed */
_L4:
            d.onChanged(b, c);
            if (true) goto _L1; else goto _L5
_L5:
        }

        public final boolean areContentsTheSame(Object obj, Object obj1)
        {
            return d.areContentsTheSame(obj, obj1);
        }

        public final boolean areItemsTheSame(Object obj, Object obj1)
        {
            return d.areItemsTheSame(obj, obj1);
        }

        public final int compare(Object obj, Object obj1)
        {
            return d.compare(obj, obj1);
        }

        public final void onChanged(int i, int j)
        {
            if (a == 3 && i <= b + c && i + j >= b)
            {
                int k = b;
                int l = c;
                b = Math.min(i, b);
                c = Math.max(k + l, i + j) - b;
                return;
            } else
            {
                a();
                b = i;
                c = j;
                a = 3;
                return;
            }
        }

        public final void onInserted(int i, int j)
        {
            if (a == 1 && i >= b && i <= b + c)
            {
                c = c + j;
                b = Math.min(i, b);
                return;
            } else
            {
                a();
                b = i;
                c = j;
                a = 1;
                return;
            }
        }

        public final void onMoved(int i, int j)
        {
            a();
            d.onMoved(i, j);
        }

        public final void onRemoved(int i, int j)
        {
            if (a == 2 && b == i)
            {
                c = c + j;
                return;
            } else
            {
                a();
                b = i;
                c = j;
                a = 2;
                return;
            }
        }

        public a(b b1)
        {
            a = 0;
            b = -1;
            c = -1;
            d = b1;
        }
    }

    public static abstract class b
        implements Comparator
    {

        public abstract boolean areContentsTheSame(Object obj, Object obj1);

        public abstract boolean areItemsTheSame(Object obj, Object obj1);

        public abstract int compare(Object obj, Object obj1);

        public abstract void onChanged(int i, int j);

        public abstract void onInserted(int i, int j);

        public abstract void onMoved(int i, int j);

        public abstract void onRemoved(int i, int j);

        public b()
        {
        }
    }


    Object a[];
    private Object b[];
    private int c;
    private int d;
    private int e;
    private b f;
    private int g;
    private final Class h;

    public android.support.v7.util.a(Class class1, b b1)
    {
        this(class1, b1, (byte)0);
    }

    private android.support.v7.util.a(Class class1, b b1, byte byte0)
    {
        h = class1;
        a = (Object[])Array.newInstance(class1, 10);
        f = b1;
        g = 0;
    }

    private int a(Object obj, Object aobj[], int i, int j, int k)
    {
        int l;
        l = j;
        j = i;
_L12:
        Object obj1;
        int i1;
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = (j + l) / 2;
        obj1 = aobj[i1];
        i = f.compare(obj1, obj);
        if (i < 0)
        {
            j = i1 + 1;
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        if (!f.areItemsTheSame(obj1, obj)) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        i = i1 - 1;
_L8:
        if (i < j) goto _L4; else goto _L3
_L3:
        aobj = ((Object []) (a[i]));
        if (f.compare(((Object) (aobj)), obj) != 0) goto _L4; else goto _L5
_L5:
        if (!f.areItemsTheSame(((Object) (aobj)), obj)) goto _L7; else goto _L6
_L6:
        if (k == 1)
        {
            if (i != -1)
            {
                return i;
            }
        } else
        {
            return i;
        }
          goto _L1
_L7:
        i--;
          goto _L8
_L4:
        j = i1 + 1;
_L10:
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        aobj = ((Object []) (a[j]));
        if (f.compare(((Object) (aobj)), obj) != 0)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        i = j;
        if (f.areItemsTheSame(((Object) (aobj)), obj)) goto _L6; else goto _L9
_L9:
        j++;
          goto _L10
        i = -1;
          goto _L6
        l = i1;
        if (true) goto _L12; else goto _L11
_L11:
        if (k == 1)
        {
            return j;
        } else
        {
            return -1;
        }
    }

    private void b()
    {
        if (b != null)
        {
            throw new IllegalStateException("Cannot call this method from within addAll");
        } else
        {
            return;
        }
    }

    private void c(int i)
    {
        System.arraycopy(((Object) (a)), i + 1, ((Object) (a)), i, g - i - 1);
        g = g - 1;
        a[g] = null;
        f.onRemoved(i, 1);
    }

    public final int a()
    {
        return g;
    }

    public final int a(Object obj)
    {
        b();
        int i = a(obj, a, 0, g, 1);
        if (i == -1)
        {
            i = 0;
        } else
        if (i < g)
        {
            Object obj1 = a[i];
            if (f.areItemsTheSame(obj1, obj))
            {
                if (f.areContentsTheSame(obj1, obj))
                {
                    a[i] = obj;
                    return i;
                } else
                {
                    a[i] = obj;
                    f.onChanged(i, 1);
                    return i;
                }
            }
        }
        if (i > g)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("cannot add item to ")).append(i).append(" because size is ").append(g).toString());
        }
        if (g == a.length)
        {
            Object aobj[] = (Object[])Array.newInstance(h, a.length + 10);
            System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, i);
            aobj[i] = obj;
            System.arraycopy(((Object) (a)), i, ((Object) (aobj)), i + 1, g - i);
            a = aobj;
        } else
        {
            System.arraycopy(((Object) (a)), i, ((Object) (a)), i + 1, g - i);
            a[i] = obj;
        }
        g = g + 1;
        f.onInserted(i, 1);
        return i;
    }

    public final Object a(int i)
    {
        b();
        Object obj = b(i);
        c(i);
        return obj;
    }

    public final Object b(int i)
        throws IndexOutOfBoundsException
    {
        if (i >= g || i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Asked to get item at ")).append(i).append(" but size is ").append(g).toString());
        }
        if (b != null && i >= e)
        {
            return b[(i - e) + c];
        } else
        {
            return a[i];
        }
    }

    public final boolean b(Object obj)
    {
        b();
        int i = a(obj, a, 0, g, 2);
        if (i == -1)
        {
            return false;
        } else
        {
            c(i);
            return true;
        }
    }

    public final int c(Object obj)
    {
        if (b != null)
        {
            int i = a(obj, a, 0, e, 4);
            if (i != -1)
            {
                return i;
            }
            i = a(obj, b, c, d, 4);
            if (i != -1)
            {
                return (i - c) + e;
            } else
            {
                return -1;
            }
        } else
        {
            return a(obj, a, 0, g, 4);
        }
    }
}
