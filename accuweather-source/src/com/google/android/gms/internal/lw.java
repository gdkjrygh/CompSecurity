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
//            lx

public final class lw
{
    public static class a
    {

        public final lx amm;
        public final List amn;

        public a(lx lx1, List list)
        {
            amm = lx1;
            amn = list;
        }
    }


    private static int a(String s, lx.a.a aa[])
    {
        int i;
        int j;
        int l;
        l = aa.length;
        i = 0;
        j = 14;
_L5:
        lx.a.a a1;
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
        lx lx1 = new lx();
        ArrayList arraylist = new ArrayList();
        lx1.amo = a(datamap, ((List) (arraylist)));
        return new a(lx1, arraylist);
    }

    private static lx.a.a a(List list, Object obj)
    {
        lx.a.a a1;
        a1 = new lx.a.a();
        if (obj == null)
        {
            a1.type = 14;
            return a1;
        }
        a1.ams = new lx.a.a.a();
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        a1.type = 2;
        a1.ams.amu = (String)obj;
_L8:
        return a1;
_L2:
        ArrayList arraylist;
        lx.a.a aa1[];
        int j;
        int k;
        int l;
        if (obj instanceof Integer)
        {
            a1.type = 6;
            a1.ams.amy = ((Integer)obj).intValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Long)
        {
            a1.type = 5;
            a1.ams.amx = ((Long)obj).longValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Double)
        {
            a1.type = 3;
            a1.ams.amv = ((Double)obj).doubleValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Float)
        {
            a1.type = 4;
            a1.ams.amw = ((Float)obj).floatValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Boolean)
        {
            a1.type = 8;
            a1.ams.amA = ((Boolean)obj).booleanValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Byte)
        {
            a1.type = 7;
            a1.ams.amz = ((Byte)obj).byteValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof byte[])
        {
            a1.type = 1;
            a1.ams.amt = (byte[])(byte[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof String[])
        {
            a1.type = 11;
            a1.ams.amD = (String[])(String[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof long[])
        {
            a1.type = 12;
            a1.ams.amE = (long[])(long[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof float[])
        {
            a1.type = 15;
            a1.ams.amF = (float[])(float[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Asset)
        {
            a1.type = 13;
            a1.ams.amG = a(list, (Asset)obj);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof DataMap)
        {
            a1.type = 9;
            obj = (DataMap)obj;
            Object obj2 = ((DataMap) (obj)).keySet();
            lx.a aa[] = new lx.a[((Set) (obj2)).size()];
            obj2 = ((Set) (obj2)).iterator();
            for (int i = 0; ((Iterator) (obj2)).hasNext(); i++)
            {
                String s = (String)((Iterator) (obj2)).next();
                aa[i] = new lx.a();
                aa[i].name = s;
                aa[i].amq = a(list, ((DataMap) (obj)).get(s));
            }

            a1.ams.amB = aa;
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof ArrayList))
        {
            break; /* Loop/switch isn't completed */
        }
        a1.type = 10;
        arraylist = (ArrayList)obj;
        aa1 = new lx.a.a[arraylist.size()];
        obj = null;
        l = arraylist.size();
        k = 0;
        j = 14;
_L4:
        Object obj1;
        lx.a.a a2;
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
        a1.ams.amC = aa1;
        if (true) goto _L8; else goto _L7
_L7:
        throw new RuntimeException((new StringBuilder()).append("newFieldValueFromValue: unexpected value ").append(obj.getClass().getSimpleName()).toString());
    }

    public static DataMap a(a a1)
    {
        DataMap datamap = new DataMap();
        lx.a aa[] = a1.amm.amo;
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            lx.a a2 = aa[i];
            a(a1.amn, datamap, a2.name, a2.amq);
        }

        return datamap;
    }

    private static ArrayList a(List list, lx.a.a.a a1, int i)
    {
        ArrayList arraylist = new ArrayList(a1.amC.length);
        a1 = a1.amC;
        int l = a1.length;
        int j = 0;
        while (j < l) 
        {
            lx.a aa[] = a1[j];
            if (((lx.a.a) (aa)).type == 14)
            {
                arraylist.add(null);
            } else
            if (i == 9)
            {
                DataMap datamap = new DataMap();
                aa = ((lx.a.a) (aa)).ams.amB;
                int i1 = aa.length;
                for (int k = 0; k < i1; k++)
                {
                    lx.a a2 = aa[k];
                    a(list, datamap, a2.name, a2.amq);
                }

                arraylist.add(datamap);
            } else
            if (i == 2)
            {
                arraylist.add(((lx.a.a) (aa)).ams.amu);
            } else
            if (i == 6)
            {
                arraylist.add(Integer.valueOf(((lx.a.a) (aa)).ams.amy));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected typeOfArrayList: ").append(i).toString());
            }
            j++;
        }
        return arraylist;
    }

    private static void a(List list, DataMap datamap, String s, lx.a.a a1)
    {
        int i = a1.type;
        if (i == 14)
        {
            datamap.putString(s, null);
            return;
        }
        Object obj = a1.ams;
        if (i == 1)
        {
            datamap.putByteArray(s, ((lx.a.a.a) (obj)).amt);
            return;
        }
        if (i == 11)
        {
            datamap.putStringArray(s, ((lx.a.a.a) (obj)).amD);
            return;
        }
        if (i == 12)
        {
            datamap.putLongArray(s, ((lx.a.a.a) (obj)).amE);
            return;
        }
        if (i == 15)
        {
            datamap.putFloatArray(s, ((lx.a.a.a) (obj)).amF);
            return;
        }
        if (i == 2)
        {
            datamap.putString(s, ((lx.a.a.a) (obj)).amu);
            return;
        }
        if (i == 3)
        {
            datamap.putDouble(s, ((lx.a.a.a) (obj)).amv);
            return;
        }
        if (i == 4)
        {
            datamap.putFloat(s, ((lx.a.a.a) (obj)).amw);
            return;
        }
        if (i == 5)
        {
            datamap.putLong(s, ((lx.a.a.a) (obj)).amx);
            return;
        }
        if (i == 6)
        {
            datamap.putInt(s, ((lx.a.a.a) (obj)).amy);
            return;
        }
        if (i == 7)
        {
            datamap.putByte(s, (byte)((lx.a.a.a) (obj)).amz);
            return;
        }
        if (i == 8)
        {
            datamap.putBoolean(s, ((lx.a.a.a) (obj)).amA);
            return;
        }
        if (i == 13)
        {
            if (list == null)
            {
                throw new RuntimeException((new StringBuilder()).append("populateBundle: unexpected type for: ").append(s).toString());
            } else
            {
                datamap.putAsset(s, (Asset)list.get((int)((lx.a.a.a) (obj)).amG));
                return;
            }
        }
        if (i == 9)
        {
            a1 = new DataMap();
            obj = ((lx.a.a.a) (obj)).amB;
            int j = obj.length;
            for (i = 0; i < j; i++)
            {
                Object obj1 = obj[i];
                a(list, ((DataMap) (a1)), ((lx.a) (obj1)).name, ((lx.a) (obj1)).amq);
            }

            datamap.putDataMap(s, a1);
            return;
        }
        if (i == 10)
        {
            i = a(s, ((lx.a.a.a) (obj)).amC);
            list = a(list, ((lx.a.a.a) (obj)), i);
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

    private static lx.a[] a(DataMap datamap, List list)
    {
        Object obj = datamap.keySet();
        lx.a aa[] = new lx.a[((Set) (obj)).size()];
        obj = ((Set) (obj)).iterator();
        for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
        {
            String s = (String)((Iterator) (obj)).next();
            Object obj1 = datamap.get(s);
            aa[i] = new lx.a();
            aa[i].name = s;
            aa[i].amq = a(list, obj1);
        }

        return aa;
    }
}
