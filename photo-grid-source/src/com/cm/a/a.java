// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.cm.a:
//            c, b, d, f, 
//            g, i

public final class a
    implements Map
{

    public static final a a = new a((byte)0);
    static Object b[];
    static int c;
    static Object d[];
    static int e;
    static final int f[] = new int[0];
    int g[];
    Object h[];
    int i;
    d j;

    public a()
    {
        g = c.b;
        h = c.d;
        i = 0;
    }

    private a(byte byte0)
    {
        g = f;
        h = c.d;
        i = 0;
    }

    private static void a(int ai[], Object aobj[], int k)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        com/cm/a/a;
        JVM INSTR monitorenter ;
        if (e < 10)
        {
            aobj[0] = ((Object) (d));
            break MISSING_BLOCK_LABEL_24;
        }
          goto _L3
_L8:
        d = aobj;
        e++;
_L3:
        com/cm/a/a;
        JVM INSTR monitorexit ;
        return;
        ai;
        com/cm/a/a;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        com/cm/a/a;
        JVM INSTR monitorenter ;
        if (c >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (b));
        aobj[1] = ai;
        k = (k << 1) - 1;
        break MISSING_BLOCK_LABEL_134;
_L9:
        b = aobj;
        c++;
_L7:
        com/cm/a/a;
        JVM INSTR monitorexit ;
        return;
        ai;
        com/cm/a/a;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        k = (k << 1) - 1;
        while (k >= 2) 
        {
            aobj[k] = null;
            k--;
        }
          goto _L8
_L5:
        return;
        while (k >= 2) 
        {
            aobj[k] = null;
            k--;
        }
          goto _L9
    }

    private d b()
    {
        if (j == null)
        {
            j = new b(this);
        }
        return j;
    }

    private void b(int k)
    {
        if (g == f)
        {
            throw new UnsupportedOperationException("ArrayMap is immutable");
        }
        if (k != 8) goto _L2; else goto _L1
_L1:
        com/cm/a/a;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        aobj = d;
        h = aobj;
        d = (Object[])aobj[0];
        g = (int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        e--;
        com/cm/a/a;
        JVM INSTR monitorexit ;
        return;
        com/cm/a/a;
        JVM INSTR monitorexit ;
_L4:
        g = new int[k];
        h = new Object[k << 1];
        return;
        Exception exception;
        exception;
        com/cm/a/a;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (k != 4) goto _L4; else goto _L3
_L3:
        com/cm/a/a;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        exception = ((Exception) (b));
        h = exception;
        b = (Object[])exception[0];
        g = (int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        c--;
        com/cm/a/a;
        JVM INSTR monitorexit ;
        return;
        exception;
        com/cm/a/a;
        JVM INSTR monitorexit ;
        throw exception;
        com/cm/a/a;
        JVM INSTR monitorexit ;
          goto _L4
    }

    private Object c(int k)
    {
        return h[k << 1];
    }

    private Object d(int k)
    {
        return h[(k << 1) + 1];
    }

    final int a()
    {
        int j1 = i;
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        int i1;
        int l = com.cm.a.c.a(g, j1, 0);
        k = l;
        if (l >= 0)
        {
            k = l;
            if (h[l << 1] != null)
            {
                for (i1 = l + 1; i1 < j1 && g[i1] == 0; i1++)
                {
                    if (h[i1 << 1] == null)
                    {
                        return i1;
                    }
                }

                l--;
label0:
                do
                {
label1:
                    {
                        if (l < 0 || g[l] != 0)
                        {
                            break label1;
                        }
                        k = l;
                        if (h[l << 1] == null)
                        {
                            break label0;
                        }
                        l--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~i1;
    }

    final int a(Object obj)
    {
        Object aobj[];
        int k;
        boolean flag;
        int l;
        k = 1;
        flag = true;
        l = i * 2;
        aobj = h;
        if (obj != null) goto _L2; else goto _L1
_L1:
        for (k = ((flag) ? 1 : 0); k < l; k += 2)
        {
            if (aobj[k] == null)
            {
                return k >> 1;
            }
        }

          goto _L3
_L4:
        k += 2;
_L2:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj.equals(aobj[k]))
        {
            return k >> 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    final int a(Object obj, int k)
    {
        int k1 = i;
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        int l = -1;
_L4:
        return l;
_L2:
        int j1;
        int i1 = com.cm.a.c.a(g, k1, k);
        l = i1;
        if (i1 >= 0)
        {
            l = i1;
            if (!obj.equals(h[i1 << 1]))
            {
                for (j1 = i1 + 1; j1 < k1 && g[j1] == k; j1++)
                {
                    if (obj.equals(h[j1 << 1]))
                    {
                        return j1;
                    }
                }

                i1--;
label0:
                do
                {
label1:
                    {
                        if (i1 < 0 || g[i1] != k)
                        {
                            break label1;
                        }
                        l = i1;
                        if (obj.equals(h[i1 << 1]))
                        {
                            break label0;
                        }
                        i1--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~j1;
    }

    public final Object a(int k)
    {
        int l = 8;
        Object obj = h[(k << 1) + 1];
        if (i <= 1)
        {
            a(g, h, i);
            g = c.b;
            h = c.d;
            i = 0;
        } else
        if (g.length > 8 && i < g.length / 3)
        {
            if (i > 8)
            {
                l = i + (i >> 1);
            }
            int ai[] = g;
            Object aobj[] = h;
            b(l);
            i = i - 1;
            if (k > 0)
            {
                System.arraycopy(ai, 0, g, 0, k);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (h)), 0, k << 1);
            }
            if (k < i)
            {
                System.arraycopy(ai, k + 1, g, k, i - k);
                System.arraycopy(((Object) (aobj)), k + 1 << 1, ((Object) (h)), k << 1, i - k << 1);
                return obj;
            }
        } else
        {
            i = i - 1;
            if (k < i)
            {
                System.arraycopy(g, k + 1, g, k, i - k);
                System.arraycopy(((Object) (h)), k + 1 << 1, ((Object) (h)), k << 1, i - k << 1);
            }
            h[i << 1] = null;
            h[(i << 1) + 1] = null;
            return obj;
        }
        return obj;
    }

    public final void clear()
    {
        if (i > 0)
        {
            a(g, h, i);
            g = c.b;
            h = c.d;
            i = 0;
        }
    }

    public final boolean containsKey(Object obj)
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

    public final boolean containsValue(Object obj)
    {
        return a(obj) >= 0;
    }

    public final Set entrySet()
    {
        d d1 = b();
        if (d1.b == null)
        {
            d1.b = new f(d1);
        }
        return d1.b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int k;
        if (!(obj instanceof Map))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = (Map)obj;
        if (size() != ((Map) (obj)).size())
        {
            return false;
        }
        k = 0;
_L4:
        Object obj1;
        Object obj2;
        Object obj3;
        if (k >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = c(k);
        obj2 = d(k);
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
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        return false;
        return false;
    }

    public final Object get(Object obj)
    {
        int k;
        if (obj == null)
        {
            k = a();
        } else
        {
            k = a(obj, obj.hashCode());
        }
        if (k >= 0)
        {
            return h[(k << 1) + 1];
        } else
        {
            return null;
        }
    }

    public final int hashCode()
    {
        int ai[] = g;
        Object aobj[] = h;
        int k1 = i;
        int k = 1;
        int l = 0;
        int i1 = 0;
        while (l < k1) 
        {
            Object obj = aobj[k];
            int l1 = ai[l];
            int j1;
            if (obj == null)
            {
                j1 = 0;
            } else
            {
                j1 = obj.hashCode();
            }
            i1 += j1 ^ l1;
            l++;
            k += 2;
        }
        return i1;
    }

    public final boolean isEmpty()
    {
        return i <= 0;
    }

    public final Set keySet()
    {
        d d1 = b();
        if (d1.c == null)
        {
            d1.c = new g(d1);
        }
        return d1.c;
    }

    public final Object put(Object obj, Object obj1)
    {
        int i1;
        byte byte0;
        int j1;
        byte0 = 8;
        int k;
        if (obj == null)
        {
            k = a();
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
            k = a(obj, i1);
        }
        if (k >= 0)
        {
            k = (k << 1) + 1;
            obj = h[k];
            h[k] = obj1;
            return obj;
        }
        j1 = ~k;
        if (i < g.length) goto _L2; else goto _L1
_L1:
        if (i < 8) goto _L4; else goto _L3
_L3:
        int l = i + (i >> 1);
_L6:
        int ai[] = g;
        Object aobj[] = h;
        b(l);
        if (g.length > 0)
        {
            System.arraycopy(ai, 0, g, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (h)), 0, aobj.length);
        }
        a(ai, aobj, i);
_L2:
        if (j1 < i)
        {
            System.arraycopy(g, j1, g, j1 + 1, i - j1);
            System.arraycopy(((Object) (h)), j1 << 1, ((Object) (h)), j1 + 1 << 1, i - j1 << 1);
        }
        g[j1] = i1;
        h[j1 << 1] = obj;
        h[(j1 << 1) + 1] = obj1;
        i = i + 1;
        return null;
_L4:
        l = byte0;
        if (i < 4)
        {
            l = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void putAll(Map map)
    {
        int k = i + map.size();
        if (g.length < k)
        {
            int ai[] = g;
            Object aobj[] = h;
            b(k);
            if (i > 0)
            {
                System.arraycopy(ai, 0, g, 0, i);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (h)), 0, i << 1);
            }
            a(ai, aobj, i);
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public final Object remove(Object obj)
    {
        int k;
        if (obj == null)
        {
            k = a();
        } else
        {
            k = a(obj, obj.hashCode());
        }
        if (k >= 0)
        {
            return a(k);
        } else
        {
            return null;
        }
    }

    public final int size()
    {
        return i;
    }

    public final String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(i * 28);
        stringbuilder.append('{');
        int k = 0;
        while (k < i) 
        {
            if (k > 0)
            {
                stringbuilder.append(", ");
            }
            Object obj = c(k);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            stringbuilder.append('=');
            obj = d(k);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            k++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public final Collection values()
    {
        d d1 = b();
        if (d1.d == null)
        {
            d1.d = new i(d1);
        }
        return d1.d;
    }

}
