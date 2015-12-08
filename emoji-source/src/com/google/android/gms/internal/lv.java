// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            lw

public final class lv
{
    public static class a
    {

        public final lw amp;
        public final List amq;

        public a(lw lw1, List list)
        {
            amp = lw1;
            amq = list;
        }
    }


    private static int a(String s, lw.a.a aa[])
    {
        int i;
        int j;
        int l;
        l = aa.length;
        i = 0;
        j = 14;
_L5:
        lw.a.a a1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        a1 = aa[i];
        if (j != 14) goto _L2; else goto _L1
_L1:
        if (a1.type != 9 && a1.type != 2 && a1.type != 6) goto _L4; else goto _L3
_L3:
        int k = a1.type;
_L7:
        i++;
        j = k;
          goto _L5
_L4:
        k = j;
        if (a1.type == 14) goto _L7; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder()).append("Unexpected TypedValue type: ").append(a1.type).append(" for key ").append(s).toString());
_L2:
        k = j;
        if (a1.type == j) goto _L7; else goto _L8
_L8:
        throw new IllegalArgumentException((new StringBuilder()).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(s).append(" contains items of type ").append(j).append(" and ").append(a1.type).toString());
        return j;
    }

    static int a(List list, Asset asset)
    {
        list.add(asset);
        return list.size() - 1;
    }

    public static a a(DataMap datamap)
    {
        lw lw1 = new lw();
        ArrayList arraylist = new ArrayList();
        lw1.amr = a(datamap, ((List) (arraylist)));
        return new a(lw1, arraylist);
    }

    private static lw.a.a a(List list, Object obj)
    {
        lw.a.a a1;
        a1 = new lw.a.a();
        if (obj == null)
        {
            a1.type = 14;
            return a1;
        }
        a1.amv = new lw.a.a.a();
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        a1.type = 2;
        a1.amv.amx = (String)obj;
_L8:
        return a1;
_L2:
        ArrayList arraylist;
        lw.a.a aa1[];
        int j;
        int k;
        int l;
        if (obj instanceof Integer)
        {
            a1.type = 6;
            a1.amv.amB = ((Integer)obj).intValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Long)
        {
            a1.type = 5;
            a1.amv.amA = ((Long)obj).longValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Double)
        {
            a1.type = 3;
            a1.amv.amy = ((Double)obj).doubleValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Float)
        {
            a1.type = 4;
            a1.amv.amz = ((Float)obj).floatValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Boolean)
        {
            a1.type = 8;
            a1.amv.amD = ((Boolean)obj).booleanValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Byte)
        {
            a1.type = 7;
            a1.amv.amC = ((Byte)obj).byteValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof byte[])
        {
            a1.type = 1;
            a1.amv.amw = (byte[])(byte[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof String[])
        {
            a1.type = 11;
            a1.amv.amG = (String[])(String[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof long[])
        {
            a1.type = 12;
            a1.amv.amH = (long[])(long[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof float[])
        {
            a1.type = 15;
            a1.amv.amI = (float[])(float[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Asset)
        {
            a1.type = 13;
            a1.amv.amJ = a(list, (Asset)obj);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof DataMap)
        {
            a1.type = 9;
            obj = (DataMap)obj;
            Object obj2 = ((DataMap) (obj)).keySet();
            lw.a aa[] = new lw.a[((Set) (obj2)).size()];
            obj2 = ((Set) (obj2)).iterator();
            for (int i = 0; ((Iterator) (obj2)).hasNext(); i++)
            {
                String s = (String)((Iterator) (obj2)).next();
                aa[i] = new lw.a();
                aa[i].name = s;
                aa[i].amt = a(list, ((DataMap) (obj)).get(s));
            }

            a1.amv.amE = aa;
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof ArrayList))
        {
            break; /* Loop/switch isn't completed */
        }
        a1.type = 10;
        arraylist = (ArrayList)obj;
        aa1 = new lw.a.a[arraylist.size()];
        obj = null;
        l = arraylist.size();
        k = 0;
        j = 14;
_L4:
        Object obj1;
        lw.a.a a2;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_740;
        }
        obj1 = arraylist.get(k);
        a2 = a(list, obj1);
        if (a2.type != 14 && a2.type != 2 && a2.type != 6 && a2.type != 9)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ").append(obj1.getClass()).toString());
        }
        if (j != 14 || a2.type == 14)
        {
            break; /* Loop/switch isn't completed */
        }
        j = a2.type;
        obj = obj1;
_L6:
        aa1[k] = a2;
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        if (a2.type == j) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException((new StringBuilder()).append("ArrayList elements must all be of the sameclass, but this one contains a ").append(obj.getClass()).append(" and a ").append(obj1.getClass()).toString());
        a1.amv.amF = aa1;
        if (true) goto _L8; else goto _L7
_L7:
        throw new RuntimeException((new StringBuilder()).append("newFieldValueFromValue: unexpected value ").append(obj.getClass().getSimpleName()).toString());
    }

    public static DataMap a(a a1)
    {
        DataMap datamap = new DataMap();
        lw.a aa[] = a1.amp.amr;
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            lw.a a2 = aa[i];
            a(a1.amq, datamap, a2.name, a2.amt);
        }

        return datamap;
    }

    private static ArrayList a(List list, lw.a.a.a a1, int i)
    {
        ArrayList arraylist = new ArrayList(a1.amF.length);
        a1 = a1.amF;
        int l = a1.length;
        int j = 0;
        while (j < l) 
        {
            lw.a aa[] = a1[j];
            if (((lw.a.a) (aa)).type == 14)
            {
                arraylist.add(null);
            } else
            if (i == 9)
            {
                DataMap datamap = new DataMap();
                aa = ((lw.a.a) (aa)).amv.amE;
                int i1 = aa.length;
                for (int k = 0; k < i1; k++)
                {
                    lw.a a2 = aa[k];
                    a(list, datamap, a2.name, a2.amt);
                }

                arraylist.add(datamap);
            } else
            if (i == 2)
            {
                arraylist.add(((lw.a.a) (aa)).amv.amx);
            } else
            if (i == 6)
            {
                arraylist.add(Integer.valueOf(((lw.a.a) (aa)).amv.amB));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected typeOfArrayList: ").append(i).toString());
            }
            j++;
        }
        return arraylist;
    }

    private static void a(List list, DataMap datamap, String s, lw.a.a a1)
    {
        int i = a1.type;
        if (i == 14)
        {
            datamap.putString(s, null);
            return;
        }
        Object obj = a1.amv;
        if (i == 1)
        {
            datamap.putByteArray(s, ((lw.a.a.a) (obj)).amw);
            return;
        }
        if (i == 11)
        {
            datamap.putStringArray(s, ((lw.a.a.a) (obj)).amG);
            return;
        }
        if (i == 12)
        {
            datamap.putLongArray(s, ((lw.a.a.a) (obj)).amH);
            return;
        }
        if (i == 15)
        {
            datamap.putFloatArray(s, ((lw.a.a.a) (obj)).amI);
            return;
        }
        if (i == 2)
        {
            datamap.putString(s, ((lw.a.a.a) (obj)).amx);
            return;
        }
        if (i == 3)
        {
            datamap.putDouble(s, ((lw.a.a.a) (obj)).amy);
            return;
        }
        if (i == 4)
        {
            datamap.putFloat(s, ((lw.a.a.a) (obj)).amz);
            return;
        }
        if (i == 5)
        {
            datamap.putLong(s, ((lw.a.a.a) (obj)).amA);
            return;
        }
        if (i == 6)
        {
            datamap.putInt(s, ((lw.a.a.a) (obj)).amB);
            return;
        }
        if (i == 7)
        {
            datamap.putByte(s, (byte)((lw.a.a.a) (obj)).amC);
            return;
        }
        if (i == 8)
        {
            datamap.putBoolean(s, ((lw.a.a.a) (obj)).amD);
            return;
        }
        if (i == 13)
        {
            if (list == null)
            {
                throw new RuntimeException((new StringBuilder()).append("populateBundle: unexpected type for: ").append(s).toString());
            } else
            {
                datamap.putAsset(s, (Asset)list.get((int)((lw.a.a.a) (obj)).amJ));
                return;
            }
        }
        if (i == 9)
        {
            a1 = new DataMap();
            obj = ((lw.a.a.a) (obj)).amE;
            int j = obj.length;
            for (i = 0; i < j; i++)
            {
                Object obj1 = obj[i];
                a(list, ((DataMap) (a1)), ((lw.a) (obj1)).name, ((lw.a) (obj1)).amt);
            }

            datamap.putDataMap(s, a1);
            return;
        }
        if (i == 10)
        {
            i = a(s, ((lw.a.a.a) (obj)).amF);
            list = a(list, ((lw.a.a.a) (obj)), i);
            if (i == 14)
            {
                datamap.putStringArrayList(s, list);
                return;
            }
            if (i == 9)
            {
                datamap.putDataMapArrayList(s, list);
                return;
            }
            if (i == 2)
            {
                datamap.putStringArrayList(s, list);
                return;
            }
            if (i == 6)
            {
                datamap.putIntegerArrayList(s, list);
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Unexpected typeOfArrayList: ").append(i).toString());
            }
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("populateBundle: unexpected type ").append(i).toString());
        }
    }

    private static lw.a[] a(DataMap datamap, List list)
    {
        Object obj = datamap.keySet();
        lw.a aa[] = new lw.a[((Set) (obj)).size()];
        obj = ((Set) (obj)).iterator();
        for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
        {
            String s = (String)((Iterator) (obj)).next();
            Object obj1 = datamap.get(s);
            aa[i] = new lw.a();
            aa[i].name = s;
            aa[i].amt = a(list, obj1);
        }

        return aa;
    }
}
