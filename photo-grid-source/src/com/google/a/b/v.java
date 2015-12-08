// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            aa, w, y, ac

public final class v extends AbstractMap
{

    private static final java.util.Map.Entry b[] = new aa[2];
    private static final int i = (new Random()).nextInt();
    private aa a;
    private aa c[];
    private int d;
    private int e;
    private Set f;
    private Set g;
    private Collection h;

    public v()
    {
        c = (aa[])b;
        e = -1;
        a = new aa();
    }

    static aa a(v v1)
    {
        return v1.a;
    }

    private aa a(String s)
    {
        if (s != null)
        {
            int j = b(s);
            aa aaa[] = c;
            aa aa1 = aaa[aaa.length - 1 & j];
            while (aa1 != null) 
            {
                String s1 = aa1.a;
                if (s1 == s || aa1.c == j && s.equals(s1))
                {
                    return aa1;
                }
                aa1 = aa1.d;
            }
        }
        return null;
    }

    private static void a(aa aa1)
    {
        aa1.f.e = aa1.e;
        aa1.e.f = aa1.f;
        aa1.f = null;
        aa1.e = null;
    }

    static boolean a(v v1, Object obj, Object obj1)
    {
        if (obj == null || !(obj instanceof String))
        {
            return false;
        }
        int j = b((String)obj);
        aa aaa[] = v1.c;
        int k = j & aaa.length - 1;
        aa aa1 = aaa[k];
        aa aa2 = null;
        aa aa3;
        for (; aa1 != null; aa1 = aa3)
        {
            if (aa1.c == j && obj.equals(aa1.a))
            {
                if (obj1 != null ? !obj1.equals(aa1.b) : aa1.b != null)
                {
                    return false;
                }
                if (aa2 == null)
                {
                    aaa[k] = aa1.d;
                } else
                {
                    aa2.d = aa1.d;
                }
                v1.d = v1.d - 1;
                a(aa1);
                return true;
            }
            aa3 = aa1.d;
            aa2 = aa1;
        }

        return false;
    }

    private aa[] a()
    {
        aa aaa1[];
        int j1;
        aaa1 = c;
        j1 = aaa1.length;
        if (j1 != 0x40000000) goto _L2; else goto _L1
_L1:
        aa aaa[] = aaa1;
_L4:
        return aaa;
_L2:
        int j = j1 * 2;
        aa aaa2[] = (aa[])new aa[j];
        c = aaa2;
        e = (j >> 2) + (j >> 1);
        aaa = aaa2;
        if (d == 0)
        {
            continue;
        }
        int l = 0;
        do
        {
            aaa = aaa2;
            if (l >= j1)
            {
                continue;
            }
            aa aa2 = aaa1[l];
            if (aa2 != null)
            {
                int k = aa2.c & j1;
                aaa2[l | k] = aa2;
                aa aa1 = aa2.d;
                aa aa3 = null;
                while (aa1 != null) 
                {
                    int i1 = aa1.c & j1;
                    if (i1 != k)
                    {
                        aa aa4;
                        if (aa3 == null)
                        {
                            aaa2[l | i1] = aa1;
                        } else
                        {
                            aa3.d = aa1;
                        }
                        k = i1;
                    } else
                    {
                        aa2 = aa3;
                    }
                    aa4 = aa1.d;
                    aa3 = aa2;
                    aa2 = aa1;
                    aa1 = aa4;
                }
                if (aa3 != null)
                {
                    aa3.d = null;
                }
            }
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static int b(v v1)
    {
        return v1.d;
    }

    private static int b(String s)
    {
        int l = i;
        for (int j = 0; j < s.length(); j++)
        {
            l += s.charAt(j);
            l = l + l << 10;
            l ^= l >>> 6;
        }

        int k = l >>> 20 ^ l >>> 12 ^ l;
        return k >>> 4 ^ (k >>> 7 ^ k);
    }

    public final Object a(String s, Object obj)
    {
        if (s == null)
        {
            throw new NullPointerException("key == null");
        }
        int k = b(s);
        aa aaa[] = c;
        int j = aaa.length - 1 & k;
        for (aa aa1 = aaa[j]; aa1 != null; aa1 = aa1.d)
        {
            if (aa1.c == k && s.equals(aa1.a))
            {
                s = ((String) (aa1.b));
                aa1.b = obj;
                return s;
            }
        }

        int l = d;
        d = l + 1;
        if (l > e)
        {
            j = a().length - 1 & k;
        }
        aa aa2 = a;
        aa aa3 = aa2.f;
        s = new aa(s, obj, k, c[j], aa2, aa3);
        obj = c;
        aa2.f = s;
        aa3.e = s;
        obj[j] = s;
        return null;
    }

    public final void clear()
    {
        if (d != 0)
        {
            Arrays.fill(c, null);
            d = 0;
        }
        aa aa3 = a;
        aa aa2;
        for (aa aa1 = aa3.e; aa1 != aa3; aa1 = aa2)
        {
            aa2 = aa1.e;
            aa1.f = null;
            aa1.e = null;
        }

        aa3.f = aa3;
        aa3.e = aa3;
    }

    public final boolean containsKey(Object obj)
    {
        return (obj instanceof String) && a((String)obj) != null;
    }

    public final Set entrySet()
    {
        Set set = g;
        if (set != null)
        {
            return set;
        } else
        {
            w w1 = new w(this, (byte)0);
            g = w1;
            return w1;
        }
    }

    public final Object get(Object obj)
    {
        Object obj2 = null;
        Object obj1 = obj2;
        if (obj instanceof String)
        {
            obj = a((String)obj);
            obj1 = obj2;
            if (obj != null)
            {
                obj1 = ((aa) (obj)).b;
            }
        }
        return obj1;
    }

    public final Set keySet()
    {
        Set set = f;
        if (set != null)
        {
            return set;
        } else
        {
            y y1 = new y(this, (byte)0);
            f = y1;
            return y1;
        }
    }

    public final Object put(Object obj, Object obj1)
    {
        return a((String)obj, obj1);
    }

    public final Object remove(Object obj)
    {
        if (obj == null || !(obj instanceof String))
        {
            return null;
        }
        int j = b((String)obj);
        aa aaa[] = c;
        int k = j & aaa.length - 1;
        aa aa1 = aaa[k];
        aa aa2 = null;
        aa aa3;
        for (; aa1 != null; aa1 = aa3)
        {
            if (aa1.c == j && obj.equals(aa1.a))
            {
                if (aa2 == null)
                {
                    aaa[k] = aa1.d;
                } else
                {
                    aa2.d = aa1.d;
                }
                d = d - 1;
                a(aa1);
                return aa1.b;
            }
            aa3 = aa1.d;
            aa2 = aa1;
        }

        return null;
    }

    public final int size()
    {
        return d;
    }

    public final Collection values()
    {
        Collection collection = h;
        if (collection != null)
        {
            return collection;
        } else
        {
            ac ac1 = new ac(this, (byte)0);
            h = ac1;
            return ac1;
        }
    }

}
