// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ae;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class b
{
    public final class a
    {

        private int a;
        private int b;
        private Iterator c;
        private b d;

        public final boolean a()
        {
            if (b != 0x80000000)
            {
                return true;
            }
            if (a <= d.c)
            {
                for (; a <= d.c; a = a + 1)
                {
                    if (d.a[a] != null)
                    {
                        int i = a;
                        a = i + 1;
                        b = i;
                        return true;
                    }
                }

            }
            if (d.b != null)
            {
                if (c == null)
                {
                    c = d.b.keySet().iterator();
                }
                if (c.hasNext())
                {
                    b = ((Integer)c.next()).intValue();
                    return true;
                }
            }
            return false;
        }

        public final int b()
        {
            if (!a())
            {
                throw new NoSuchElementException();
            } else
            {
                int i = b;
                b = 0x80000000;
                return i;
            }
        }

        public a()
        {
            d = b.this;
            super();
            a = 0;
            b = 0x80000000;
            c = null;
        }
    }


    public Object a[];
    public HashMap b;
    public int c;
    public int d;
    public int e;

    public b()
    {
        this(128);
    }

    public b(int i)
    {
        if (i > 0)
        {
            i = Math.min(i, 128);
        } else
        {
            i = 1;
        }
        a = new Object[i];
        e = 0;
        d = 0x80000000;
        c = 0x80000000;
    }

    public final a a()
    {
        return new a();
    }

    public final Object a(int i)
    {
        Object obj1 = null;
        Object obj;
        if (i <= c && i >= 0)
        {
            obj = a[i];
        } else
        {
            obj = obj1;
            if (i <= d)
            {
                obj = obj1;
                if (b != null)
                {
                    return b.get(Integer.valueOf(i));
                }
            }
        }
        return obj;
    }

    public final void a(int i, Object obj)
    {
        if (obj == null)
        {
            b(i);
            return;
        }
        if (i > d)
        {
            d = i;
        }
        if (i >= 0 && i < 128)
        {
            if (i >= a.length)
            {
                int j = a.length;
                int k;
                do
                {
                    k = j << 1;
                    j = k;
                } while (k <= i);
                Object aobj[] = new Object[Math.min(Math.max(k, 16), 128)];
                aobj[i] = obj;
                c = i;
                e = e + 1;
                System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, a.length);
                Arrays.fill(a, null);
                a = aobj;
                return;
            }
            if (i > c)
            {
                c = i;
            }
            if (a[i] == null)
            {
                e = e + 1;
            }
            a[i] = obj;
            return;
        }
        if (b == null)
        {
            b = new HashMap();
        }
        b.put(Integer.valueOf(i), obj);
    }

    public final int b()
    {
        if (b == null)
        {
            return e;
        } else
        {
            return e + b.size();
        }
    }

    public final Object b(int i)
    {
        if (i >= 0 && i < a.length)
        {
            Object obj = a[i];
            if (obj != null)
            {
                e = e - 1;
            }
            a[i] = null;
            return obj;
        }
        if (b != null)
        {
            return b.remove(Integer.valueOf(i));
        } else
        {
            return null;
        }
    }

    public final boolean equals(Object obj)
    {
        Object aobj[];
        Object aobj1[];
        int i;
        int j;
        if (this == obj)
        {
            return true;
        }
        if (obj == null || !(obj instanceof b))
        {
            return false;
        }
        obj = (b)obj;
        if (b() != ((b) (obj)).b())
        {
            return false;
        }
        aobj = a;
        aobj1 = ((b) (obj)).a;
        i = Math.min(aobj.length, aobj1.length);
        j = 0;
_L5:
        if (j >= i) goto _L2; else goto _L1
_L1:
        if ((aobj[j] != null || aobj1[j] == null) && (aobj[j] == null || aobj[j].equals(aobj1[j]))) goto _L4; else goto _L3
_L3:
        i = 0;
_L6:
        return i != 0 && b.equals(((b) (obj)).b);
_L4:
        j++;
          goto _L5
_L2:
        if (aobj.length <= aobj1.length)
        {
            break MISSING_BLOCK_LABEL_171;
        }
_L7:
label0:
        {
            if (i >= aobj.length)
            {
                break MISSING_BLOCK_LABEL_207;
            }
            if (aobj[i] == null)
            {
                break label0;
            }
            i = 0;
        }
          goto _L6
        i++;
          goto _L7
        if (aobj.length >= aobj1.length)
        {
            break MISSING_BLOCK_LABEL_207;
        }
_L8:
label1:
        {
            if (i >= aobj1.length)
            {
                break MISSING_BLOCK_LABEL_207;
            }
            if (aobj1[i] == null)
            {
                break label1;
            }
            i = 0;
        }
          goto _L6
        i++;
          goto _L8
        i = 1;
          goto _L6
    }

    public final int hashCode()
    {
        int j = 1;
        for (int i = 0; i < a.length;)
        {
            Object obj = a[i];
            int k = j;
            if (obj != null)
            {
                k = j * 31 + obj.hashCode() + i;
            }
            i++;
            j = k;
        }

        if (b == null)
        {
            return j;
        } else
        {
            return j + b.hashCode();
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("IntMap{lower:");
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != null)
            {
                stringbuilder.append(i);
                stringbuilder.append("=>");
                stringbuilder.append(a[i]);
                stringbuilder.append(", ");
            }
        }

        String s = String.valueOf(b);
        stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 10)).append(", higher:").append(s).append("}").toString());
        return stringbuilder.toString();
    }
}
