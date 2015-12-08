// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import org.a.a.a.b;
import org.a.a.a.i;

// Referenced classes of package org.a.a.a.a:
//            h, i, j, k, 
//            l

public abstract class g
    implements Serializable
{

    public static final g a = new h();
    public static final g b = new org.a.a.a.a.i();
    public static final g c = new j();
    public static final g d = new k();
    public static final g e = new l();
    private static final ThreadLocal f = new ThreadLocal();
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    private boolean n;
    private boolean o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private String t;
    private boolean u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    protected g()
    {
        g = true;
        h = true;
        i = false;
        j = true;
        k = "[";
        l = "]";
        m = "=";
        n = false;
        o = false;
        p = ",";
        q = "{";
        r = ",";
        s = true;
        t = "}";
        u = true;
        v = "<null>";
        w = "<size=";
        x = ">";
        y = "<";
        z = ">";
    }

    private static void a(Object obj)
    {
        if (obj != null)
        {
            Map map = g();
            Object obj1 = map;
            if (map == null)
            {
                obj1 = new WeakHashMap();
                f.set(obj1);
            }
            ((Map) (obj1)).put(obj, null);
        }
    }

    private void a(StringBuffer stringbuffer)
    {
        stringbuffer.append(v);
    }

    private void a(StringBuffer stringbuffer, int i1)
    {
        stringbuffer.append(w);
        stringbuffer.append(i1);
        stringbuffer.append(x);
    }

    private void a(StringBuffer stringbuffer, String s1, Object obj, boolean flag)
    {
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        flag3 = false;
        flag4 = false;
        flag5 = false;
        flag6 = false;
        flag7 = false;
        flag8 = false;
        flag9 = false;
        flag10 = false;
        flag2 = false;
        Map map = g();
        boolean flag1;
        if (map != null && map.containsKey(obj))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character))
        {
            org.a.a.a.i.a(stringbuffer, obj);
            return;
        }
        a(obj);
        if (!(obj instanceof Collection)) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        stringbuffer.append((Collection)obj);
_L5:
        b(obj);
        return;
_L4:
        a(stringbuffer, ((Collection)obj).size());
          goto _L5
        stringbuffer;
        b(obj);
        throw stringbuffer;
_L2:
        if (!(obj instanceof Map))
        {
            break MISSING_BLOCK_LABEL_184;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        stringbuffer.append((Map)obj);
          goto _L5
        a(stringbuffer, ((Map)obj).size());
          goto _L5
        if (!(obj instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_278;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s1 = (long[])obj;
        stringbuffer.append(q);
        int i1 = ((flag2) ? 1 : 0);
_L7:
        if (i1 >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        stringbuffer.append(r);
        stringbuffer.append(s1[i1]);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        stringbuffer.append(t);
          goto _L5
        a(stringbuffer, ((long[])obj).length);
          goto _L5
        if (!(obj instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_372;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        s1 = (int[])obj;
        stringbuffer.append(q);
        i1 = ((flag3) ? 1 : 0);
_L9:
        if (i1 >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        stringbuffer.append(r);
        stringbuffer.append(s1[i1]);
        i1++;
        if (true) goto _L9; else goto _L8
_L8:
        stringbuffer.append(t);
          goto _L5
        a(stringbuffer, ((int[])obj).length);
          goto _L5
        if (!(obj instanceof short[]))
        {
            break MISSING_BLOCK_LABEL_466;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        s1 = (short[])obj;
        stringbuffer.append(q);
        i1 = ((flag4) ? 1 : 0);
_L11:
        if (i1 >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        stringbuffer.append(r);
        stringbuffer.append(s1[i1]);
        i1++;
        if (true) goto _L11; else goto _L10
_L10:
        stringbuffer.append(t);
          goto _L5
        a(stringbuffer, ((short[])obj).length);
          goto _L5
        if (!(obj instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_560;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_547;
        }
        s1 = (byte[])obj;
        stringbuffer.append(q);
        i1 = ((flag5) ? 1 : 0);
_L13:
        if (i1 >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        stringbuffer.append(r);
        stringbuffer.append(s1[i1]);
        i1++;
        if (true) goto _L13; else goto _L12
_L12:
        stringbuffer.append(t);
          goto _L5
        a(stringbuffer, ((byte[])obj).length);
          goto _L5
        if (!(obj instanceof char[]))
        {
            break MISSING_BLOCK_LABEL_654;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_641;
        }
        s1 = (char[])obj;
        stringbuffer.append(q);
        i1 = ((flag6) ? 1 : 0);
_L15:
        if (i1 >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_611;
        }
        stringbuffer.append(r);
        stringbuffer.append(s1[i1]);
        i1++;
        if (true) goto _L15; else goto _L14
_L14:
        stringbuffer.append(t);
          goto _L5
        a(stringbuffer, ((char[])obj).length);
          goto _L5
        if (!(obj instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_748;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_735;
        }
        s1 = (double[])obj;
        stringbuffer.append(q);
        i1 = ((flag7) ? 1 : 0);
_L17:
        if (i1 >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_705;
        }
        stringbuffer.append(r);
        stringbuffer.append(s1[i1]);
        i1++;
        if (true) goto _L17; else goto _L16
_L16:
        stringbuffer.append(t);
          goto _L5
        a(stringbuffer, ((double[])obj).length);
          goto _L5
        if (!(obj instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_842;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_829;
        }
        s1 = (float[])obj;
        stringbuffer.append(q);
        i1 = ((flag8) ? 1 : 0);
_L19:
        if (i1 >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_799;
        }
        stringbuffer.append(r);
        stringbuffer.append(s1[i1]);
        i1++;
        if (true) goto _L19; else goto _L18
_L18:
        stringbuffer.append(t);
          goto _L5
        a(stringbuffer, ((float[])obj).length);
          goto _L5
        if (!(obj instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_936;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_923;
        }
        s1 = (boolean[])obj;
        stringbuffer.append(q);
        i1 = ((flag9) ? 1 : 0);
_L21:
        if (i1 >= s1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_893;
        }
        stringbuffer.append(r);
        stringbuffer.append(s1[i1]);
        i1++;
        if (true) goto _L21; else goto _L20
_L20:
        stringbuffer.append(t);
          goto _L5
        a(stringbuffer, ((boolean[])obj).length);
          goto _L5
        if (!obj.getClass().isArray()) goto _L23; else goto _L22
_L22:
        if (!flag) goto _L25; else goto _L24
_L24:
        Object aobj[];
        aobj = (Object[])obj;
        stringbuffer.append(q);
        i1 = ((flag10) ? 1 : 0);
_L26:
        if (i1 >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_1027;
        }
        Object obj1;
        obj1 = aobj[i1];
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_999;
        }
        stringbuffer.append(r);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_1012;
        }
        a(stringbuffer);
        break MISSING_BLOCK_LABEL_1099;
        a(stringbuffer, s1, obj1, s);
        break MISSING_BLOCK_LABEL_1099;
        stringbuffer.append(t);
          goto _L5
_L25:
        a(stringbuffer, ((Object[])obj).length);
          goto _L5
_L23:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1066;
        }
        stringbuffer.append(obj);
          goto _L5
        stringbuffer.append(y);
        stringbuffer.append(org.a.a.a.b.a(obj.getClass()));
        stringbuffer.append(z);
          goto _L5
        i1++;
          goto _L26
    }

    private static void b(Object obj)
    {
        if (obj != null)
        {
            Map map = g();
            if (map != null)
            {
                map.remove(obj);
                if (map.isEmpty())
                {
                    f.set(null);
                }
            }
        }
    }

    private void b(StringBuffer stringbuffer)
    {
        stringbuffer.append(p);
    }

    private static Map g()
    {
        return (Map)f.get();
    }

    protected final void a()
    {
        h = false;
    }

    protected final void a(String s1)
    {
        k = s1;
    }

    public final void a(StringBuffer stringbuffer, Object obj)
    {
        if (obj != null)
        {
            if (h && obj != null)
            {
                a(obj);
                if (i)
                {
                    stringbuffer.append(org.a.a.a.b.a(obj.getClass()));
                } else
                {
                    stringbuffer.append(obj.getClass().getName());
                }
            }
            if (j && obj != null)
            {
                a(obj);
                stringbuffer.append('@');
                stringbuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringbuffer.append(k);
            if (n)
            {
                b(stringbuffer);
            }
        }
    }

    public final void a(StringBuffer stringbuffer, String s1, Object obj)
    {
        if (g && s1 != null)
        {
            stringbuffer.append(s1);
            stringbuffer.append(m);
        }
        if (obj == null)
        {
            a(stringbuffer);
        } else
        {
            a(stringbuffer, s1, obj, u);
        }
        b(stringbuffer);
    }

    protected final void b()
    {
        i = true;
    }

    protected final void b(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        l = s2;
    }

    public final void b(StringBuffer stringbuffer, Object obj)
    {
        boolean flag = false;
        if (o) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        j1 = stringbuffer.length();
        k1 = p.length();
        if (j1 <= 0 || k1 <= 0 || j1 < k1) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L6:
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (stringbuffer.charAt(j1 - 1 - i1) == p.charAt(k1 - 1 - i1)) goto _L5; else goto _L4
_L4:
        i1 = ((flag) ? 1 : 0);
_L7:
        if (i1 != 0)
        {
            stringbuffer.setLength(j1 - k1);
        }
_L2:
        stringbuffer.append(l);
        b(obj);
        return;
_L5:
        i1++;
          goto _L6
        i1 = 1;
          goto _L7
    }

    protected final void c()
    {
        j = false;
    }

    protected final void c(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        p = s2;
    }

    protected final void c(StringBuffer stringbuffer, Object obj)
    {
        stringbuffer.append(q);
        int j1 = Array.getLength(obj);
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj1 = Array.get(obj, i1);
            if (i1 > 0)
            {
                stringbuffer.append(r);
            }
            if (obj1 == null)
            {
                a(stringbuffer);
            } else
            {
                a(stringbuffer, null, obj1, s);
            }
            i1++;
        }
        stringbuffer.append(t);
    }

    protected final void d()
    {
        g = false;
    }

    protected final void e()
    {
        n = true;
    }

    protected final String f()
    {
        return v;
    }

}
