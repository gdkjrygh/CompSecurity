// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            vt, vr

public class wb
{

    static Object b[];
    static int c;
    static Object d[];
    static int e;
    int f[];
    Object g[];
    int h;

    public wb()
    {
        f = vt.a;
        g = vt.c;
        h = 0;
    }

    private static void a(int ai[], Object aobj[], int i)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/vr;
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
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
        return;
        ai;
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        com/google/android/gms/internal/vr;
        JVM INSTR monitorenter ;
        if (c >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (b));
        aobj[1] = ai;
        i = (i << 1) - 1;
        break MISSING_BLOCK_LABEL_134;
_L9:
        b = aobj;
        c++;
_L7:
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
        return;
        ai;
        com/google/android/gms/internal/vr;
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

    private void e(int i)
    {
        if (i != 8) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/vr;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        aobj = d;
        g = aobj;
        d = (Object[])aobj[0];
        f = (int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        e--;
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
        return;
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
_L4:
        f = new int[i];
        g = new Object[i << 1];
        return;
        Exception exception;
        exception;
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (i != 4) goto _L4; else goto _L3
_L3:
        com/google/android/gms/internal/vr;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        exception = ((Exception) (b));
        g = exception;
        b = (Object[])exception[0];
        f = (int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        c--;
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
        return;
        exception;
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/internal/vr;
        JVM INSTR monitorexit ;
          goto _L4
    }

    final int a()
    {
        int l = h;
        if (l != 0) goto _L2; else goto _L1
_L1:
        int i = -1;
_L4:
        return i;
_L2:
        int k;
        int j = vt.a(f, l, 0);
        i = j;
        if (j >= 0)
        {
            i = j;
            if (g[j << 1] != null)
            {
                for (k = j + 1; k < l && f[k] == 0; k++)
                {
                    if (g[k << 1] == null)
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
                        if (j < 0 || f[j] != 0)
                        {
                            break label1;
                        }
                        i = j;
                        if (g[j << 1] == null)
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

    final int a(Object obj)
    {
        Object aobj[];
        int i;
        boolean flag;
        int j;
        i = 1;
        flag = true;
        j = h * 2;
        aobj = g;
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

    final int a(Object obj, int i)
    {
        int i1 = h;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int l;
        int k = vt.a(f, i1, i);
        j = k;
        if (k >= 0)
        {
            j = k;
            if (!obj.equals(g[k << 1]))
            {
                for (l = k + 1; l < i1 && f[l] == i; l++)
                {
                    if (obj.equals(g[l << 1]))
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
                        if (k < 0 || f[k] != i)
                        {
                            break label1;
                        }
                        j = k;
                        if (obj.equals(g[k << 1]))
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

    public final void a(int i)
    {
        if (f.length < i)
        {
            int ai[] = f;
            Object aobj[] = g;
            e(i);
            if (h > 0)
            {
                System.arraycopy(ai, 0, f, 0, h);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, h << 1);
            }
            a(ai, aobj, h);
        }
    }

    public final Object b(int i)
    {
        return g[i << 1];
    }

    public final Object c(int i)
    {
        return g[(i << 1) + 1];
    }

    public void clear()
    {
        if (h != 0)
        {
            a(f, g, h);
            f = vt.a;
            g = vt.c;
            h = 0;
        }
    }

    public boolean containsKey(Object obj)
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

    public boolean containsValue(Object obj)
    {
        return a(obj) >= 0;
    }

    public final Object d(int i)
    {
        int j = 8;
        Object obj = g[(i << 1) + 1];
        if (h <= 1)
        {
            a(f, g, h);
            f = vt.a;
            g = vt.c;
            h = 0;
        } else
        if (f.length > 8 && h < f.length / 3)
        {
            if (h > 8)
            {
                j = h + (h >> 1);
            }
            int ai[] = f;
            Object aobj[] = g;
            e(j);
            h = h - 1;
            if (i > 0)
            {
                System.arraycopy(ai, 0, f, 0, i);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, i << 1);
            }
            if (i < h)
            {
                System.arraycopy(ai, i + 1, f, i, h - i);
                System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (g)), i << 1, h - i << 1);
                return obj;
            }
        } else
        {
            h = h - 1;
            if (i < h)
            {
                System.arraycopy(f, i + 1, f, i, h - i);
                System.arraycopy(((Object) (g)), i + 1 << 1, ((Object) (g)), i << 1, h - i << 1);
            }
            g[h << 1] = null;
            g[(h << 1) + 1] = null;
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
        if (i >= h)
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
            return g[(i << 1) + 1];
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        int ai[] = f;
        Object aobj[] = g;
        int i1 = h;
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
        return h <= 0;
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
            obj = g[i];
            g[i] = obj1;
            return obj;
        }
        l = ~i;
        if (h < f.length) goto _L2; else goto _L1
_L1:
        if (h < 8) goto _L4; else goto _L3
_L3:
        int j = h + (h >> 1);
_L6:
        int ai[] = f;
        Object aobj[] = g;
        e(j);
        if (f.length > 0)
        {
            System.arraycopy(ai, 0, f, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, aobj.length);
        }
        a(ai, aobj, h);
_L2:
        if (l < h)
        {
            System.arraycopy(f, l, f, l + 1, h - l);
            System.arraycopy(((Object) (g)), l << 1, ((Object) (g)), l + 1 << 1, h - l << 1);
        }
        f[l] = k;
        g[l << 1] = obj;
        g[(l << 1) + 1] = obj1;
        h = h + 1;
        return null;
_L4:
        j = byte0;
        if (h < 4)
        {
            j = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object remove(Object obj)
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
            return d(i);
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return h;
    }

    public String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(h * 28);
        stringbuilder.append('{');
        int i = 0;
        while (i < h) 
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
