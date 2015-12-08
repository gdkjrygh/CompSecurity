// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.as.f;
import java.io.DataInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            w, am, d, ae, 
//            t, bf, ab

public final class bk
{
    public static final class a
    {

        public final int a;
        public final String b;
        public final float c;
        public final String d;
        public final t e;
        final String f;
        public final float g;
        private final int h;
        private final int i;

        public static boolean a(int j)
        {
            return com.google.android.m4b.maps.bo.d.a(j, 2) && !com.google.android.m4b.maps.bo.d.a(j, 1);
        }

        public final boolean a()
        {
            return com.google.android.m4b.maps.bo.d.a(a, 1);
        }

        public final boolean b()
        {
            return com.google.android.m4b.maps.bo.d.a(a, 2);
        }

        public final boolean c()
        {
            return com.google.android.m4b.maps.bo.d.a(a, 16);
        }

        public final boolean d()
        {
            return com.google.android.m4b.maps.bo.d.a(a, 8);
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (a)obj;
                if (a != ((a) (obj)).a)
                {
                    return false;
                }
                if (Float.floatToIntBits(g) != Float.floatToIntBits(((a) (obj)).g))
                {
                    return false;
                }
                if (b == null)
                {
                    if (((a) (obj)).b != null)
                    {
                        return false;
                    }
                } else
                if (!b.equals(((a) (obj)).b))
                {
                    return false;
                }
                if (e == null)
                {
                    if (((a) (obj)).e != null)
                    {
                        return false;
                    }
                } else
                if (!e.equals(((a) (obj)).e))
                {
                    return false;
                }
                if (f == null)
                {
                    if (((a) (obj)).f != null)
                    {
                        return false;
                    }
                } else
                if (!f.equals(((a) (obj)).f))
                {
                    return false;
                }
                if (Float.floatToIntBits(h) != Float.floatToIntBits(((a) (obj)).h))
                {
                    return false;
                }
                if (d == null)
                {
                    if (((a) (obj)).d != null)
                    {
                        return false;
                    }
                } else
                {
                    return d.equals(((a) (obj)).d);
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int i1 = 0;
            int j1 = a;
            int k1 = Float.floatToIntBits(g);
            int j;
            int k;
            int l;
            int l1;
            if (b == null)
            {
                j = 0;
            } else
            {
                j = b.hashCode();
            }
            if (e == null)
            {
                k = 0;
            } else
            {
                k = e.hashCode();
            }
            if (f == null)
            {
                l = 0;
            } else
            {
                l = f.hashCode();
            }
            l1 = Float.floatToIntBits(h);
            if (d != null)
            {
                i1 = d.hashCode();
            }
            return ((l + (k + (j + ((j1 + 31) * 31 + k1) * 31) * 31) * 31) * 31 + l1) * 31 + i1;
        }

        public a(int j, String s, int k, String s1, t t1, int l, String s2, 
                float f1)
        {
            a = j;
            b = s;
            h = k;
            c = 1.0F / (float)k;
            d = s1;
            e = t1;
            i = l;
            f = s2;
            g = f1;
        }
    }


    private static final w c = new w(null, null, -1);
    public final ab a;
    public final String b;
    private final List d;

    public bk(List list, ab ab1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1.b())
            {
                stringbuilder.append(a1.d);
            }
            if (a1.d())
            {
                stringbuilder.append('\n');
            }
        } while (true);
        b = stringbuilder.toString();
        a = ab1;
        d = list;
    }

    public static bk a(DataInput datainput, ae ae1, w w1)
    {
        int k = am.a(datainput);
        ArrayList arraylist = new ArrayList();
        int j = 0;
        while (j < k) 
        {
            int l = datainput.readUnsignedByte();
            w w2 = null;
            boolean flag = true;
            int i = ((flag) ? 1 : 0);
            String s = w2;
            if (com.google.android.m4b.maps.bo.d.a(l, 1))
            {
                i = ((flag) ? 1 : 0);
                s = w2;
                if (ae1.a == 10)
                {
                    s = datainput.readUTF().intern();
                    i = datainput.readUnsignedByte();
                }
            }
            String s1 = null;
            if (com.google.android.m4b.maps.bo.d.a(l, 2))
            {
                s1 = f.a(datainput.readUTF()).intern();
            }
            float f1;
            if (com.google.android.m4b.maps.bo.d.a(l, 4))
            {
                w2 = w.a(datainput, ae1);
            } else
            if (!a.a(l))
            {
                w2 = c;
            } else
            {
                w2 = w1;
            }
            if (ae1.a != 10 && com.google.android.m4b.maps.bo.d.a(l, 1))
            {
                Object obj = w2.a;
                if (com.google.android.m4b.maps.bo.d.a(((t) (obj)).a, 32))
                {
                    obj = ((t) (obj)).g;
                    s = ((bf) (obj)).a;
                    i = ((bf) (obj)).b;
                }
            }
            f1 = 0.0F;
            if (com.google.android.m4b.maps.bo.d.a(l, 16))
            {
                f1 = (float)am.a(datainput) / 8F;
            }
            if (com.google.android.m4b.maps.bo.d.a(l, 32))
            {
                am.a(datainput);
            }
            if (com.google.android.m4b.maps.bo.d.a(l, 8) && l != 8)
            {
                arraylist.add(new a(l ^ 8, s, i, s1, w2.a, w2.c, w2.b, f1));
                arraylist.add(new a(8, null, 1, null, null, -1, null, -1F));
            } else
            {
                arraylist.add(new a(l, s, i, s1, w2.a, w2.c, w2.b, f1));
            }
            j++;
        }
        if (k > 1)
        {
            datainput = ab.a(datainput);
        } else
        {
            datainput = ab.b;
        }
        return new bk(arraylist, datainput);
    }

    public final int a()
    {
        return d.size();
    }

    public final a a(int i)
    {
        return (a)d.get(i);
    }

    public final int b()
    {
        Iterator iterator = d.iterator();
        a a1;
        int i;
        int j;
        int k;
        int l;
        for (i = 0; iterator.hasNext(); i = com.google.android.m4b.maps.bo.d.a(a1.e) + (j + 24 + k + l) + i)
        {
            a1 = (a)iterator.next();
            j = com.google.android.m4b.maps.bo.d.a(a1.b);
            k = com.google.android.m4b.maps.bo.d.a(a1.d);
            l = com.google.android.m4b.maps.bo.d.a(a1.f);
        }

        return i + 24 + com.google.android.m4b.maps.bo.d.a(b) + ab.c();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (getClass() != obj.getClass()) goto _L4; else goto _L5
_L5:
        obj = (bk)obj;
        if (a != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((bk) (obj)).a != null) goto _L4; else goto _L8
_L8:
        return d.equals(((bk) (obj)).d);
_L7:
        if (!a.equals(((bk) (obj)).a))
        {
            return false;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return (i + 31) * 31 + d.hashCode();
    }

}
