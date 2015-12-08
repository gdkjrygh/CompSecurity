// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public class hs
{

    private static Object d[];
    private static int e;
    private static Object f[];
    private static int g;
    int a[];
    Object b[];
    int c;

    public hs()
    {
        a = hd.a;
        b = hd.b;
        c = 0;
    }

    public hs(int i)
    {
        if (i == 0)
        {
            a = hd.a;
            b = hd.b;
        } else
        {
            a(i);
        }
        c = 0;
    }

    private int a()
    {
        int l = c;
        if (l != 0) goto _L2; else goto _L1
_L1:
        int i = -1;
_L4:
        return i;
_L2:
        int k;
        int j = hd.a(a, l, 0);
        i = j;
        if (j >= 0)
        {
            i = j;
            if (b[j << 1] != null)
            {
                for (k = j + 1; k < l && a[k] == 0; k++)
                {
                    if (b[k << 1] == null)
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
                        if (j < 0 || a[j] != 0)
                        {
                            break label1;
                        }
                        i = j;
                        if (b[j << 1] == null)
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
        int i1 = c;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int l;
        int k = hd.a(a, i1, i);
        j = k;
        if (k >= 0)
        {
            j = k;
            if (!obj.equals(b[k << 1]))
            {
                for (l = k + 1; l < i1 && a[l] == i; l++)
                {
                    if (obj.equals(b[l << 1]))
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
                        if (k < 0 || a[k] != i)
                        {
                            break label1;
                        }
                        j = k;
                        if (obj.equals(b[k << 1]))
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

    static void a(int ai[], Object aobj[], int i)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        hc;
        JVM INSTR monitorenter ;
        if (g < 10)
        {
            aobj[0] = ((Object) (f));
            break MISSING_BLOCK_LABEL_24;
        }
          goto _L3
_L8:
        f = aobj;
        g++;
_L3:
        hc;
        JVM INSTR monitorexit ;
        return;
        ai;
        hc;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        hc;
        JVM INSTR monitorenter ;
        if (e >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (d));
        aobj[1] = ai;
        i = (i << 1) - 1;
        break MISSING_BLOCK_LABEL_134;
_L9:
        d = aobj;
        e++;
_L7:
        hc;
        JVM INSTR monitorexit ;
        return;
        ai;
        hc;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        i = (i << 1) - 1;
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

    public final int a(Object obj)
    {
        if (obj == null)
        {
            return a();
        } else
        {
            return a(obj, obj.hashCode());
        }
    }

    public final Object a(int i, Object obj)
    {
        i = (i << 1) + 1;
        Object obj1 = b[i];
        b[i] = obj;
        return obj1;
    }

    final void a(int i)
    {
        if (i != 8) goto _L2; else goto _L1
_L1:
        hc;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        aobj = f;
        b = aobj;
        f = (Object[])aobj[0];
        a = (int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        g--;
        hc;
        JVM INSTR monitorexit ;
        return;
        hc;
        JVM INSTR monitorexit ;
_L4:
        a = new int[i];
        b = new Object[i << 1];
        return;
        Exception exception;
        exception;
        hc;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (i != 4) goto _L4; else goto _L3
_L3:
        hc;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        exception = ((Exception) (d));
        b = exception;
        d = (Object[])exception[0];
        a = (int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        e--;
        hc;
        JVM INSTR monitorexit ;
        return;
        exception;
        hc;
        JVM INSTR monitorexit ;
        throw exception;
        hc;
        JVM INSTR monitorexit ;
          goto _L4
    }

    final int b(Object obj)
    {
        Object aobj[];
        int i;
        boolean flag;
        int j;
        i = 1;
        flag = true;
        j = c << 1;
        aobj = b;
        if (obj != null) goto _L2; else goto _L1
_L1:
        for (i = ((flag) ? 1 : 0); i < j; i += 2)
        {
            if (aobj[i] == null)
            {
                return i >> 1;
            }
        }

          goto _L3
_L4:
        i += 2;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj.equals(aobj[i]))
        {
            return i >> 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public final Object b(int i)
    {
        return b[i << 1];
    }

    public final Object c(int i)
    {
        return b[(i << 1) + 1];
    }

    public void clear()
    {
        if (c != 0)
        {
            a(a, b, c);
            a = hd.a;
            b = hd.b;
            c = 0;
        }
    }

    public boolean containsKey(Object obj)
    {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj)
    {
        return b(obj) >= 0;
    }

    public final Object d(int i)
    {
        int j = 8;
        Object obj = b[(i << 1) + 1];
        if (c <= 1)
        {
            a(a, b, c);
            a = hd.a;
            b = hd.b;
            c = 0;
        } else
        if (a.length > 8 && c < a.length / 3)
        {
            if (c > 8)
            {
                j = c + (c >> 1);
            }
            int ai[] = a;
            Object aobj[] = b;
            a(j);
            c = c - 1;
            if (i > 0)
            {
                System.arraycopy(ai, 0, a, 0, i);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (b)), 0, i << 1);
            }
            if (i < c)
            {
                System.arraycopy(ai, i + 1, a, i, c - i);
                System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (b)), i << 1, c - i << 1);
                return obj;
            }
        } else
        {
            c = c - 1;
            if (i < c)
            {
                System.arraycopy(a, i + 1, a, i, c - i);
                System.arraycopy(((Object) (b)), i + 1 << 1, ((Object) (b)), i << 1, c - i << 1);
            }
            b[c << 1] = null;
            b[(c << 1) + 1] = null;
            return obj;
        }
        return obj;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int i;
        if (!(obj instanceof Map))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = (Map)obj;
        if (size() != ((Map) (obj)).size())
        {
            return false;
        }
        i = 0;
_L4:
        Object obj1;
        Object obj2;
        Object obj3;
        if (i >= c)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = b(i);
        obj2 = c(i);
        obj3 = ((Map) (obj)).get(obj1);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (!((Map) (obj)).containsKey(obj1))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        break MISSING_BLOCK_LABEL_106;
        boolean flag;
        try
        {
            flag = obj2.equals(obj3);
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
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        return false;
        return false;
    }

    public Object get(Object obj)
    {
        int i = a(obj);
        if (i >= 0)
        {
            return b[(i << 1) + 1];
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        int ai[] = a;
        Object aobj[] = b;
        int i1 = c;
        int i = 1;
        int j = 0;
        int k = 0;
        while (j < i1) 
        {
            Object obj = aobj[i];
            int j1 = ai[j];
            int l;
            if (obj == null)
            {
                l = 0;
            } else
            {
                l = obj.hashCode();
            }
            k += l ^ j1;
            j++;
            i += 2;
        }
        return k;
    }

    public boolean isEmpty()
    {
        return c <= 0;
    }

    public Object put(Object obj, Object obj1)
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
            i = (i << 1) + 1;
            obj = b[i];
            b[i] = obj1;
            return obj;
        }
        l = ~i;
        if (c < a.length) goto _L2; else goto _L1
_L1:
        if (c < 8) goto _L4; else goto _L3
_L3:
        int j = c + (c >> 1);
_L6:
        int ai[] = a;
        Object aobj[] = b;
        a(j);
        if (a.length > 0)
        {
            System.arraycopy(ai, 0, a, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (b)), 0, aobj.length);
        }
        a(ai, aobj, c);
_L2:
        if (l < c)
        {
            System.arraycopy(a, l, a, l + 1, c - l);
            System.arraycopy(((Object) (b)), l << 1, ((Object) (b)), l + 1 << 1, c - l << 1);
        }
        a[l] = k;
        b[l << 1] = obj;
        b[(l << 1) + 1] = obj1;
        c = c + 1;
        return null;
_L4:
        j = byte0;
        if (c < 4)
        {
            j = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object remove(Object obj)
    {
        int i = a(obj);
        if (i >= 0)
        {
            return d(i);
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return c;
    }

    public String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(c * 28);
        stringbuilder.append('{');
        int i = 0;
        while (i < c) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            Object obj = b(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            stringbuilder.append('=');
            obj = c(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
