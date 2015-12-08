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
//            pd

public final class pc
{
    public static class a
    {

        public final pd awb;
        public final List awc;

        public a(pd pd1, List list)
        {
            awb = pd1;
            awc = list;
        }
    }


    private static int a(String s, pd.a.a aa[])
    {
        int i;
        int j;
        int l;
        l = aa.length;
        i = 0;
        j = 14;
_L5:
        pd.a.a a1;
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
        pd pd1 = new pd();
        ArrayList arraylist = new ArrayList();
        pd1.awd = a(datamap, ((List) (arraylist)));
        return new a(pd1, arraylist);
    }

    private static pd.a.a a(List list, Object obj)
    {
        pd.a.a a1;
        a1 = new pd.a.a();
        if (obj == null)
        {
            a1.type = 14;
            return a1;
        }
        a1.awh = new pd.a.a.a();
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        a1.type = 2;
        a1.awh.awj = (String)obj;
_L8:
        return a1;
_L2:
        ArrayList arraylist;
        pd.a.a aa1[];
        int j;
        int k;
        int l;
        if (obj instanceof Integer)
        {
            a1.type = 6;
            a1.awh.awn = ((Integer)obj).intValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Long)
        {
            a1.type = 5;
            a1.awh.awm = ((Long)obj).longValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Double)
        {
            a1.type = 3;
            a1.awh.awk = ((Double)obj).doubleValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Float)
        {
            a1.type = 4;
            a1.awh.awl = ((Float)obj).floatValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Boolean)
        {
            a1.type = 8;
            a1.awh.awp = ((Boolean)obj).booleanValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Byte)
        {
            a1.type = 7;
            a1.awh.awo = ((Byte)obj).byteValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof byte[])
        {
            a1.type = 1;
            a1.awh.awi = (byte[])(byte[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof String[])
        {
            a1.type = 11;
            a1.awh.aws = (String[])(String[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof long[])
        {
            a1.type = 12;
            a1.awh.awt = (long[])(long[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof float[])
        {
            a1.type = 15;
            a1.awh.awu = (float[])(float[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Asset)
        {
            a1.type = 13;
            a1.awh.awv = a(list, (Asset)obj);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof DataMap)
        {
            a1.type = 9;
            obj = (DataMap)obj;
            Object obj2 = ((DataMap) (obj)).keySet();
            pd.a aa[] = new pd.a[((Set) (obj2)).size()];
            obj2 = ((Set) (obj2)).iterator();
            for (int i = 0; ((Iterator) (obj2)).hasNext(); i++)
            {
                String s = (String)((Iterator) (obj2)).next();
                aa[i] = new pd.a();
                aa[i].name = s;
                aa[i].awf = a(list, ((DataMap) (obj)).get(s));
            }

            a1.awh.awq = aa;
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof ArrayList))
        {
            break; /* Loop/switch isn't completed */
        }
        a1.type = 10;
        arraylist = (ArrayList)obj;
        aa1 = new pd.a.a[arraylist.size()];
        obj = null;
        l = arraylist.size();
        k = 0;
        j = 14;
_L4:
        Object obj1;
        pd.a.a a2;
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
        a1.awh.awr = aa1;
        if (true) goto _L8; else goto _L7
_L7:
        throw new RuntimeException((new StringBuilder()).append("newFieldValueFromValue: unexpected value ").append(obj.getClass().getSimpleName()).toString());
    }

    public static DataMap a(a a1)
    {
        DataMap datamap = new DataMap();
        pd.a aa[] = a1.awb.awd;
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            pd.a a2 = aa[i];
            a(a1.awc, datamap, a2.name, a2.awf);
        }

        return datamap;
    }

    private static ArrayList a(List list, pd.a.a.a a1, int i)
    {
        ArrayList arraylist = new ArrayList(a1.awr.length);
        a1 = a1.awr;
        int l = a1.length;
        int j = 0;
        while (j < l) 
        {
            pd.a aa[] = a1[j];
            if (((pd.a.a) (aa)).type == 14)
            {
                arraylist.add(null);
            } else
            if (i == 9)
            {
                DataMap datamap = new DataMap();
                aa = ((pd.a.a) (aa)).awh.awq;
                int i1 = aa.length;
                for (int k = 0; k < i1; k++)
                {
                    pd.a a2 = aa[k];
                    a(list, datamap, a2.name, a2.awf);
                }

                arraylist.add(datamap);
            } else
            if (i == 2)
            {
                arraylist.add(((pd.a.a) (aa)).awh.awj);
            } else
            if (i == 6)
            {
                arraylist.add(Integer.valueOf(((pd.a.a) (aa)).awh.awn));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected typeOfArrayList: ").append(i).toString());
            }
            j++;
        }
        return arraylist;
    }

    private static void a(List list, DataMap datamap, String s, pd.a.a a1)
    {
        int i = a1.type;
        if (i == 14)
        {
            datamap.putString(s, null);
            return;
        }
        Object obj = a1.awh;
        if (i == 1)
        {
            datamap.putByteArray(s, ((pd.a.a.a) (obj)).awi);
            return;
        }
        if (i == 11)
        {
            datamap.putStringArray(s, ((pd.a.a.a) (obj)).aws);
            return;
        }
        if (i == 12)
        {
            datamap.putLongArray(s, ((pd.a.a.a) (obj)).awt);
            return;
        }
        if (i == 15)
        {
            datamap.putFloatArray(s, ((pd.a.a.a) (obj)).awu);
            return;
        }
        if (i == 2)
        {
            datamap.putString(s, ((pd.a.a.a) (obj)).awj);
            return;
        }
        if (i == 3)
        {
            datamap.putDouble(s, ((pd.a.a.a) (obj)).awk);
            return;
        }
        if (i == 4)
        {
            datamap.putFloat(s, ((pd.a.a.a) (obj)).awl);
            return;
        }
        if (i == 5)
        {
            datamap.putLong(s, ((pd.a.a.a) (obj)).awm);
            return;
        }
        if (i == 6)
        {
            datamap.putInt(s, ((pd.a.a.a) (obj)).awn);
            return;
        }
        if (i == 7)
        {
            datamap.putByte(s, (byte)((pd.a.a.a) (obj)).awo);
            return;
        }
        if (i == 8)
        {
            datamap.putBoolean(s, ((pd.a.a.a) (obj)).awp);
            return;
        }
        if (i == 13)
        {
            if (list == null)
            {
                throw new RuntimeException((new StringBuilder()).append("populateBundle: unexpected type for: ").append(s).toString());
            } else
            {
                datamap.putAsset(s, (Asset)list.get((int)((pd.a.a.a) (obj)).awv));
                return;
            }
        }
        if (i == 9)
        {
            a1 = new DataMap();
            obj = ((pd.a.a.a) (obj)).awq;
            int j = obj.length;
            for (i = 0; i < j; i++)
            {
                Object obj1 = obj[i];
                a(list, ((DataMap) (a1)), ((pd.a) (obj1)).name, ((pd.a) (obj1)).awf);
            }

            datamap.putDataMap(s, a1);
            return;
        }
        if (i == 10)
        {
            i = a(s, ((pd.a.a.a) (obj)).awr);
            list = a(list, ((pd.a.a.a) (obj)), i);
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

    private static pd.a[] a(DataMap datamap, List list)
    {
        Object obj = datamap.keySet();
        pd.a aa[] = new pd.a[((Set) (obj)).size()];
        obj = ((Set) (obj)).iterator();
        for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
        {
            String s = (String)((Iterator) (obj)).next();
            Object obj1 = datamap.get(s);
            aa[i] = new pd.a();
            aa[i].name = s;
            aa[i].awf = a(list, obj1);
        }

        return aa;
    }
}
