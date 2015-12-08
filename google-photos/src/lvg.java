// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class lvg
    implements Collection, Set
{

    private static Object c[];
    private static int d;
    private static Object e[];
    private static int f;
    Object a[];
    int b;
    private int g[];
    private lvj h;

    public lvg()
    {
        g = lvi.a;
        a = lvi.b;
        b = 0;
    }

    private int a()
    {
        int l = b;
        if (l != 0) goto _L2; else goto _L1
_L1:
        int i = -1;
_L4:
        return i;
_L2:
        int k;
        int j = lvi.a(g, l, 0);
        i = j;
        if (j >= 0)
        {
            i = j;
            if (a[j] != null)
            {
                for (k = j + 1; k < l && g[k] == 0; k++)
                {
                    if (a[k] == null)
                    {
                        return k;
                    }
                }

                j--;
label0:
                do
                {
label1:
                    {
                        if (j < 0 || g[j] != 0)
                        {
                            break label1;
                        }
                        i = j;
                        if (a[j] == null)
                        {
                            break label0;
                        }
                        j--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~k;
    }

    private int a(Object obj, int i)
    {
        int i1 = b;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int l;
        int k = lvi.a(g, i1, i);
        j = k;
        if (k >= 0)
        {
            j = k;
            if (!obj.equals(a[k]))
            {
                for (l = k + 1; l < i1 && g[l] == i; l++)
                {
                    if (obj.equals(a[l]))
                    {
                        return l;
                    }
                }

                k--;
label0:
                do
                {
label1:
                    {
                        if (k < 0 || g[k] != i)
                        {
                            break label1;
                        }
                        j = k;
                        if (obj.equals(a[k]))
                        {
                            break label0;
                        }
                        k--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~l;
    }

    static int a(lvg lvg1)
    {
        return lvg1.a();
    }

    static int a(lvg lvg1, Object obj, int i)
    {
        return lvg1.a(obj, i);
    }

    private static void a(int ai[], Object aobj[], int i)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        lvg;
        JVM INSTR monitorenter ;
        if (f < 10)
        {
            aobj[0] = ((Object) (e));
            break MISSING_BLOCK_LABEL_24;
        }
          goto _L3
_L8:
        e = aobj;
        f++;
_L3:
        lvg;
        JVM INSTR monitorexit ;
        return;
        ai;
        lvg;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        lvg;
        JVM INSTR monitorenter ;
        if (d >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (c));
        aobj[1] = ai;
        i--;
        break MISSING_BLOCK_LABEL_130;
_L9:
        c = aobj;
        d++;
_L7:
        lvg;
        JVM INSTR monitorexit ;
        return;
        ai;
        lvg;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        i--;
        while (i >= 2) 
        {
            aobj[i] = null;
            i--;
        }
          goto _L8
_L5:
        return;
        while (i >= 2) 
        {
            aobj[i] = null;
            i--;
        }
          goto _L9
    }

    private void b(int i)
    {
        if (i != 8) goto _L2; else goto _L1
_L1:
        lvg;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        aobj = e;
        a = aobj;
        e = (Object[])aobj[0];
        g = (int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        f--;
        lvg;
        JVM INSTR monitorexit ;
        return;
        lvg;
        JVM INSTR monitorexit ;
_L4:
        g = new int[i];
        a = new Object[i];
        return;
        Exception exception;
        exception;
        lvg;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (i != 4) goto _L4; else goto _L3
_L3:
        lvg;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        exception = ((Exception) (c));
        a = exception;
        c = (Object[])exception[0];
        g = (int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        d--;
        lvg;
        JVM INSTR monitorexit ;
        return;
        exception;
        lvg;
        JVM INSTR monitorexit ;
        throw exception;
        lvg;
        JVM INSTR monitorexit ;
          goto _L4
    }

    public final Object a(int i)
    {
        int j = 8;
        Object obj = a[i];
        if (b <= 1)
        {
            a(g, a, b);
            g = lvi.a;
            a = lvi.b;
            b = 0;
        } else
        if (g.length > 8 && b < g.length / 3)
        {
            if (b > 8)
            {
                j = b + (b >> 1);
            }
            int ai[] = g;
            Object aobj[] = a;
            b(j);
            b = b - 1;
            if (i > 0)
            {
                System.arraycopy(ai, 0, g, 0, i);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), 0, i);
            }
            if (i < b)
            {
                System.arraycopy(ai, i + 1, g, i, b - i);
                System.arraycopy(((Object) (aobj)), i + 1, ((Object) (a)), i, b - i);
                return obj;
            }
        } else
        {
            b = b - 1;
            if (i < b)
            {
                System.arraycopy(g, i + 1, g, i, b - i);
                System.arraycopy(((Object) (a)), i + 1, ((Object) (a)), i, b - i);
            }
            a[b] = null;
            return obj;
        }
        return obj;
    }

    public final boolean add(Object obj)
    {
        int k;
        byte byte0;
        int l;
        byte0 = 8;
        int i;
        if (obj == null)
        {
            i = a();
            k = 0;
        } else
        {
            k = obj.hashCode();
            i = a(obj, k);
        }
        if (i >= 0)
        {
            return false;
        }
        l = ~i;
        if (b < g.length) goto _L2; else goto _L1
_L1:
        if (b < 8) goto _L4; else goto _L3
_L3:
        int j = b + (b >> 1);
_L6:
        int ai[] = g;
        Object aobj[] = a;
        b(j);
        if (g.length > 0)
        {
            System.arraycopy(ai, 0, g, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), 0, aobj.length);
        }
        a(ai, aobj, b);
_L2:
        if (l < b)
        {
            System.arraycopy(g, l, g, l + 1, b - l);
            System.arraycopy(((Object) (a)), l, ((Object) (a)), l + 1, b - l);
        }
        g[l] = k;
        a[l] = obj;
        b = b + 1;
        return true;
_L4:
        j = byte0;
        if (b < 4)
        {
            j = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean addAll(Collection collection)
    {
        boolean flag = false;
        int i = b + collection.size();
        if (g.length < i)
        {
            int ai[] = g;
            Object aobj[] = a;
            b(i);
            if (b > 0)
            {
                System.arraycopy(ai, 0, g, 0, b);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), 0, b);
            }
            a(ai, aobj, b);
        }
        for (collection = collection.iterator(); collection.hasNext();)
        {
            flag |= add(collection.next());
        }

        return flag;
    }

    public final void clear()
    {
        if (b != 0)
        {
            a(g, a, b);
            g = lvi.a;
            a = lvi.b;
            b = 0;
        }
    }

    public final boolean contains(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (a() < 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (a(obj, obj.hashCode()) < 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
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
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
label0:
        {
            if (!(obj instanceof Set))
            {
                break label0;
            }
            obj = (Set)obj;
            if (size() != ((Set) (obj)).size())
            {
                return false;
            }
            int i = 0;
            do
            {
                boolean flag;
                try
                {
                    if (i >= b)
                    {
                        break;
                    }
                    flag = ((Set) (obj)).contains(a[i]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return false;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return false;
                }
                if (!flag)
                {
                    return false;
                }
                i++;
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public final int hashCode()
    {
        int i = 0;
        int ai[] = g;
        int k = b;
        int j = 0;
        for (; i < k; i++)
        {
            j += ai[i];
        }

        return j;
    }

    public final boolean isEmpty()
    {
        return b <= 0;
    }

    public final Iterator iterator()
    {
        if (h == null)
        {
            h = new lvh(this);
        }
        lvj lvj1 = h;
        if (lvj1.a == null)
        {
            lvj1.a = new lvl(lvj1);
        }
        return lvj1.a.iterator();
    }

    public final boolean remove(Object obj)
    {
        int i;
        if (obj == null)
        {
            i = a();
        } else
        {
            i = a(obj, obj.hashCode());
        }
        if (i >= 0)
        {
            a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean removeAll(Collection collection)
    {
        boolean flag = false;
        for (collection = collection.iterator(); collection.hasNext();)
        {
            flag |= remove(collection.next());
        }

        return flag;
    }

    public final boolean retainAll(Collection collection)
    {
        int i = b;
        boolean flag = false;
        for (i--; i >= 0; i--)
        {
            if (!collection.contains(a[i]))
            {
                a(i);
                flag = true;
            }
        }

        return flag;
    }

    public final int size()
    {
        return b;
    }

    public final Object[] toArray()
    {
        Object aobj[] = new Object[b];
        System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, b);
        return aobj;
    }

    public final Object[] toArray(Object aobj[])
    {
        if (aobj.length < b)
        {
            aobj = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), b);
        }
        System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, b);
        if (aobj.length > b)
        {
            aobj[b] = null;
        }
        return aobj;
    }

    public final String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(b * 14);
        stringbuilder.append('{');
        int i = 0;
        while (i < b) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            Object obj = a[i];
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Set)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
