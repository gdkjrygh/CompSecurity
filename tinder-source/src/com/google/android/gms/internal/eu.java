// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.internal:
//            ev

public final class eu
{
    public static final class a
    {

        public final ev a;
        public final List b;

        public a(ev ev1, List list)
        {
            a = ev1;
            b = list;
        }
    }


    private static int a(String s, ev.a.a aa[])
    {
        int j;
        int k;
        int i1;
        i1 = aa.length;
        j = 0;
        k = 14;
_L5:
        ev.a.a a1;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        a1 = aa[j];
        if (k != 14) goto _L2; else goto _L1
_L1:
        if (a1.a != 9 && a1.a != 2 && a1.a != 6) goto _L4; else goto _L3
_L3:
        int l = a1.a;
_L7:
        j++;
        k = l;
          goto _L5
_L4:
        l = k;
        if (a1.a == 14) goto _L7; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder("Unexpected TypedValue type: ")).append(a1.a).append(" for key ").append(s).toString());
_L2:
        l = k;
        if (a1.a == k) goto _L7; else goto _L8
_L8:
        throw new IllegalArgumentException((new StringBuilder("The ArrayList elements should all be the same type, but ArrayList with key ")).append(s).append(" contains items of type ").append(k).append(" and ").append(a1.a).toString());
        return k;
    }

    private static ev.a.a a(List list, Object obj)
    {
        ev.a.a a2;
        a2 = new ev.a.a();
        if (obj == null)
        {
            a2.a = 14;
            return a2;
        }
        a2.b = new ev.a.a.a();
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        a2.a = 2;
        a2.b.b = (String)obj;
_L8:
        return a2;
_L2:
        ArrayList arraylist;
        ev.a.a aa1[];
        int k;
        int l;
        int i1;
        if (obj instanceof Integer)
        {
            a2.a = 6;
            a2.b.f = ((Integer)obj).intValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Long)
        {
            a2.a = 5;
            a2.b.e = ((Long)obj).longValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Double)
        {
            a2.a = 3;
            a2.b.c = ((Double)obj).doubleValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Float)
        {
            a2.a = 4;
            a2.b.d = ((Float)obj).floatValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Boolean)
        {
            a2.a = 8;
            a2.b.h = ((Boolean)obj).booleanValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Byte)
        {
            a2.a = 7;
            a2.b.g = ((Byte)obj).byteValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof byte[])
        {
            a2.a = 1;
            a2.b.a = (byte[])(byte[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof String[])
        {
            a2.a = 11;
            a2.b.k = (String[])(String[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof long[])
        {
            a2.a = 12;
            a2.b.l = (long[])(long[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof float[])
        {
            a2.a = 15;
            a2.b.m = (float[])(float[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Asset)
        {
            a2.a = 13;
            ev.a.a.a a1 = a2.b;
            list.add((Asset)obj);
            a1.n = list.size() - 1;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof i)
        {
            a2.a = 9;
            obj = (i)obj;
            Object obj2 = new TreeSet(((i) (obj)).a.keySet());
            ev.a aa[] = new ev.a[((TreeSet) (obj2)).size()];
            obj2 = ((TreeSet) (obj2)).iterator();
            for (int j = 0; ((Iterator) (obj2)).hasNext(); j++)
            {
                String s = (String)((Iterator) (obj2)).next();
                aa[j] = new ev.a();
                aa[j].a = s;
                aa[j].b = a(list, ((i) (obj)).b(s));
            }

            a2.b.i = aa;
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof ArrayList))
        {
            break; /* Loop/switch isn't completed */
        }
        a2.a = 10;
        arraylist = (ArrayList)obj;
        aa1 = new ev.a.a[arraylist.size()];
        obj = null;
        i1 = arraylist.size();
        l = 0;
        k = 14;
_L4:
        Object obj1;
        ev.a.a a3;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_753;
        }
        obj1 = arraylist.get(l);
        a3 = a(list, obj1);
        if (a3.a != 14 && a3.a != 2 && a3.a != 6 && a3.a != 9)
        {
            throw new IllegalArgumentException((new StringBuilder("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ")).append(obj1.getClass()).toString());
        }
        if (k != 14 || a3.a == 14)
        {
            break; /* Loop/switch isn't completed */
        }
        k = a3.a;
        obj = obj1;
_L6:
        aa1[l] = a3;
        l++;
        if (true) goto _L4; else goto _L3
_L3:
        if (a3.a == k) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException((new StringBuilder("ArrayList elements must all be of the sameclass, but this one contains a ")).append(obj.getClass()).append(" and a ").append(obj1.getClass()).toString());
        a2.b.j = aa1;
        if (true) goto _L8; else goto _L7
_L7:
        throw new RuntimeException((new StringBuilder("newFieldValueFromValue: unexpected value ")).append(obj.getClass().getSimpleName()).toString());
    }

    public static i a(a a1)
    {
        i j = new i();
        ev.a aa[] = a1.a.a;
        int l = aa.length;
        for (int k = 0; k < l; k++)
        {
            ev.a a2 = aa[k];
            a(a1.b, j, a2.a, a2.b);
        }

        return j;
    }

    private static ArrayList a(List list, ev.a.a.a a1, int j)
    {
        ArrayList arraylist = new ArrayList(a1.j.length);
        a1 = a1.j;
        int j1 = a1.length;
        int l = 0;
        while (l < j1) 
        {
            ev.a aa[] = a1[l];
            if (((ev.a.a) (aa)).a == 14)
            {
                arraylist.add(null);
            } else
            if (j == 9)
            {
                i k = new i();
                aa = ((ev.a.a) (aa)).b.i;
                int k1 = aa.length;
                for (int i1 = 0; i1 < k1; i1++)
                {
                    ev.a a2 = aa[i1];
                    a(list, k, a2.a, a2.b);
                }

                arraylist.add(k);
            } else
            if (j == 2)
            {
                arraylist.add(((ev.a.a) (aa)).b.b);
            } else
            if (j == 6)
            {
                arraylist.add(Integer.valueOf(((ev.a.a) (aa)).b.f));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Unexpected typeOfArrayList: ")).append(j).toString());
            }
            l++;
        }
        return arraylist;
    }

    private static void a(List list, i j, String s, ev.a.a a1)
    {
        int k = a1.a;
        if (k == 14)
        {
            j.a(s, null);
            return;
        }
        Object obj = a1.b;
        if (k == 1)
        {
            list = ((ev.a.a.a) (obj)).a;
            j.a.put(s, list);
            return;
        }
        if (k == 11)
        {
            list = ((ev.a.a.a) (obj)).k;
            j.a.put(s, list);
            return;
        }
        if (k == 12)
        {
            list = ((ev.a.a.a) (obj)).l;
            j.a.put(s, list);
            return;
        }
        if (k == 15)
        {
            list = ((ev.a.a.a) (obj)).m;
            j.a.put(s, list);
            return;
        }
        if (k == 2)
        {
            j.a(s, ((ev.a.a.a) (obj)).b);
            return;
        }
        if (k == 3)
        {
            double d = ((ev.a.a.a) (obj)).c;
            j.a.put(s, Double.valueOf(d));
            return;
        }
        if (k == 4)
        {
            float f = ((ev.a.a.a) (obj)).d;
            j.a.put(s, Float.valueOf(f));
            return;
        }
        if (k == 5)
        {
            j.a(s, ((ev.a.a.a) (obj)).e);
            return;
        }
        if (k == 6)
        {
            k = ((ev.a.a.a) (obj)).f;
            j.a.put(s, Integer.valueOf(k));
            return;
        }
        if (k == 7)
        {
            byte byte0 = (byte)((ev.a.a.a) (obj)).g;
            j.a.put(s, Byte.valueOf(byte0));
            return;
        }
        if (k == 8)
        {
            boolean flag = ((ev.a.a.a) (obj)).h;
            j.a.put(s, Boolean.valueOf(flag));
            return;
        }
        if (k == 13)
        {
            if (list == null)
            {
                throw new RuntimeException((new StringBuilder("populateBundle: unexpected type for: ")).append(s).toString());
            } else
            {
                j.a(s, (Asset)list.get((int)((ev.a.a.a) (obj)).n));
                return;
            }
        }
        if (k == 9)
        {
            a1 = new i();
            obj = ((ev.a.a.a) (obj)).i;
            int l = obj.length;
            for (k = 0; k < l; k++)
            {
                Object obj1 = obj[k];
                a(list, ((i) (a1)), ((ev.a) (obj1)).a, ((ev.a) (obj1)).b);
            }

            j.a.put(s, a1);
            return;
        }
        if (k == 10)
        {
            k = a(s, ((ev.a.a.a) (obj)).j);
            list = a(list, ((ev.a.a.a) (obj)), k);
            if (k == 14)
            {
                j.b(s, list);
                return;
            }
            if (k == 9)
            {
                j.a(s, list);
                return;
            }
            if (k == 2)
            {
                j.b(s, list);
                return;
            }
            if (k == 6)
            {
                j.a.put(s, list);
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder("Unexpected typeOfArrayList: ")).append(k).toString());
            }
        } else
        {
            throw new RuntimeException((new StringBuilder("populateBundle: unexpected type ")).append(k).toString());
        }
    }

    public static ev.a[] a(i j, List list)
    {
        Object obj = new TreeSet(j.a.keySet());
        ev.a aa[] = new ev.a[((TreeSet) (obj)).size()];
        obj = ((TreeSet) (obj)).iterator();
        for (int k = 0; ((Iterator) (obj)).hasNext(); k++)
        {
            String s = (String)((Iterator) (obj)).next();
            Object obj1 = j.b(s);
            aa[k] = new ev.a();
            aa[k].a = s;
            aa[k].b = a(list, obj1);
        }

        return aa;
    }
}
