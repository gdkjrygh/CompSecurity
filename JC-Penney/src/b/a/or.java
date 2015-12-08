// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;

// Referenced classes of package b.a:
//            ot, os, pe, pn

public final class or
    implements Comparable
{

    private static final HashMap a = new HashMap(500);
    private final String b;
    private final ot c;
    private final os d;
    private os e;

    private or(String s, ot ot1, os os1)
    {
        if (s == null)
        {
            throw new NullPointerException("descriptor == null");
        }
        if (ot1 == null)
        {
            throw new NullPointerException("returnType == null");
        }
        if (os1 == null)
        {
            throw new NullPointerException("parameterTypes == null");
        } else
        {
            b = s;
            c = ot1;
            d = os1;
            e = null;
            return;
        }
    }

    public static or a(String s)
    {
        int i;
        int l;
label0:
        {
            boolean flag = false;
            if (s == null)
            {
                throw new NullPointerException("descriptor == null");
            }
            Object obj;
            synchronized (a)
            {
                obj = (or)a.get(s);
            }
            if (obj != null)
            {
                return ((or) (obj));
            }
            ot aot[] = b(s);
            i = 1;
            int k = 0;
            os os1;
            int j;
            do
            {
                j = s.charAt(i);
                if (j != ')')
                {
                    break label0;
                }
                obj = ot.b(s.substring(i + 1));
                os1 = new os(k);
                for (i = ((flag) ? 1 : 0); i < k; i++)
                {
                    os1.a(i, aot[i]);
                }

                break;
            } while (true);
            return b(new or(s, ((ot) (obj)), os1));
        }
        l = i;
        for (; j == '['; j = s.charAt(l))
        {
            l++;
        }

        if (j == 'L')
        {
            j = s.indexOf(';', l);
            if (j == -1)
            {
                throw new IllegalArgumentException("bad descriptor");
            }
            j++;
        } else
        {
            j = l + 1;
        }
        aot[k] = ot.a(s.substring(i, j));
        k++;
        i = j;
        continue;
    }

    private static or b(or or1)
    {
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        String s;
        or or2;
        s = or1.b;
        or2 = (or)a.get(s);
        if (or2 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return or2;
        a.put(s, or1);
        hashmap;
        JVM INSTR monitorexit ;
        return or1;
        or1;
        throw or1;
    }

    private static ot[] b(String s)
    {
        int i;
        int j;
        int l;
        l = s.length();
        if (s.charAt(0) != '(')
        {
            throw new IllegalArgumentException("bad descriptor");
        }
        i = 1;
        j = 0;
_L4:
label0:
        {
            if (i >= l)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            char c1 = s.charAt(i);
            if (c1 == ')')
            {
                break label0;
            } else
            {
                int k = j;
                if (c1 >= 'A')
                {
                    k = j;
                    if (c1 <= 'Z')
                    {
                        k = j + 1;
                    }
                }
                i++;
                j = k;
                continue; /* Loop/switch isn't completed */
            }
        }
_L2:
        if (i == 0 || i == l - 1)
        {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (s.indexOf(')', i + 1) != -1)
        {
            throw new IllegalArgumentException("bad descriptor");
        } else
        {
            return new ot[j];
        }
        i = 0;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int a(or or1)
    {
        if (this != or1)
        {
            int i = c.a(or1.c);
            if (i != 0)
            {
                return i;
            }
            int k = ((pe) (d)).K.length;
            int l = ((pe) (or1.d)).K.length;
            int i1 = Math.min(k, l);
            for (int j = 0; j < i1; j++)
            {
                int j1 = d.b(j).a(or1.d.b(j));
                if (j1 != 0)
                {
                    return j1;
                }
            }

            if (k < l)
            {
                return -1;
            }
            if (k > l)
            {
                return 1;
            }
        }
        return 0;
    }

    public final or a(ot ot1)
    {
        String s = (new StringBuilder("(")).append(ot1.e()).append(b.substring(1)).toString();
        ot1 = d.b(ot1);
        ot1.L = false;
        return b(new or(s, c, ot1));
    }

    public final ot a()
    {
        return c;
    }

    public final os b()
    {
        return d;
    }

    public final os c()
    {
        if (e == null)
        {
            int j = ((pe) (d)).K.length;
            os os2 = new os(j);
            int i = 0;
            boolean flag = false;
            for (; i < j; i++)
            {
                ot ot2 = d.b(i);
                ot ot1 = ot2;
                if (ot2.h())
                {
                    flag = true;
                    ot1 = ot.f;
                }
                os2.a(i, ot1);
            }

            os os1;
            if (flag)
            {
                os1 = os2;
            } else
            {
                os1 = d;
            }
            e = os1;
        }
        return e;
    }

    public final int compareTo(Object obj)
    {
        return a((or)obj);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof or))
        {
            return false;
        } else
        {
            return b.equals(((or)obj).b);
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        return b;
    }

}
