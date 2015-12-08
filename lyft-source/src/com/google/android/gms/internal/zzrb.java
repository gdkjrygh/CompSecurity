// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzrc

public final class zzrb
{

    private static int a(String s, zzrc.zza.zza azza[])
    {
        int i;
        int j;
        int l;
        l = azza.length;
        i = 0;
        j = 14;
_L5:
        zzrc.zza.zza zza;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        zza = azza[i];
        if (j != 14) goto _L2; else goto _L1
_L1:
        if (zza.a != 9 && zza.a != 2 && zza.a != 6) goto _L4; else goto _L3
_L3:
        int k = zza.a;
_L7:
        i++;
        j = k;
          goto _L5
_L4:
        k = j;
        if (zza.a == 14) goto _L7; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder()).append("Unexpected TypedValue type: ").append(zza.a).append(" for key ").append(s).toString());
_L2:
        k = j;
        if (zza.a == j) goto _L7; else goto _L8
_L8:
        throw new IllegalArgumentException((new StringBuilder()).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(s).append(" contains items of type ").append(j).append(" and ").append(zza.a).toString());
        return j;
    }

    public static DataMap a(zza zza1)
    {
        DataMap datamap = new DataMap();
        zzrc.zza azza[] = zza1.a.a;
        int j = azza.length;
        for (int i = 0; i < j; i++)
        {
            zzrc.zza zza2 = azza[i];
            a(zza1.b, datamap, zza2.a, zza2.b);
        }

        return datamap;
    }

    private static ArrayList a(List list, zzrc.zza.zza.zza zza1, int i)
    {
        ArrayList arraylist = new ArrayList(zza1.j.length);
        zza1 = zza1.j;
        int l = zza1.length;
        int j = 0;
        while (j < l) 
        {
            zzrc.zza azza[] = zza1[j];
            if (((zzrc.zza.zza) (azza)).a == 14)
            {
                arraylist.add(null);
            } else
            if (i == 9)
            {
                DataMap datamap = new DataMap();
                azza = ((zzrc.zza.zza) (azza)).b.i;
                int i1 = azza.length;
                for (int k = 0; k < i1; k++)
                {
                    zzrc.zza zza2 = azza[k];
                    a(list, datamap, zza2.a, zza2.b);
                }

                arraylist.add(datamap);
            } else
            if (i == 2)
            {
                arraylist.add(((zzrc.zza.zza) (azza)).b.b);
            } else
            if (i == 6)
            {
                arraylist.add(Integer.valueOf(((zzrc.zza.zza) (azza)).b.f));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected typeOfArrayList: ").append(i).toString());
            }
            j++;
        }
        return arraylist;
    }

    private static void a(List list, DataMap datamap, String s, zzrc.zza.zza zza1)
    {
        int i = zza1.a;
        if (i == 14)
        {
            datamap.a(s, null);
            return;
        }
        Object obj = zza1.b;
        if (i == 1)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).a);
            return;
        }
        if (i == 11)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).k);
            return;
        }
        if (i == 12)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).l);
            return;
        }
        if (i == 15)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).m);
            return;
        }
        if (i == 2)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).b);
            return;
        }
        if (i == 3)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).c);
            return;
        }
        if (i == 4)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).d);
            return;
        }
        if (i == 5)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).e);
            return;
        }
        if (i == 6)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).f);
            return;
        }
        if (i == 7)
        {
            datamap.a(s, (byte)((zzrc.zza.zza.zza) (obj)).g);
            return;
        }
        if (i == 8)
        {
            datamap.a(s, ((zzrc.zza.zza.zza) (obj)).h);
            return;
        }
        if (i == 13)
        {
            if (list == null)
            {
                throw new RuntimeException((new StringBuilder()).append("populateBundle: unexpected type for: ").append(s).toString());
            } else
            {
                datamap.a(s, (Asset)list.get((int)((zzrc.zza.zza.zza) (obj)).n));
                return;
            }
        }
        if (i == 9)
        {
            zza1 = new DataMap();
            obj = ((zzrc.zza.zza.zza) (obj)).i;
            int j = obj.length;
            for (i = 0; i < j; i++)
            {
                Object obj1 = obj[i];
                a(list, ((DataMap) (zza1)), ((zzrc.zza) (obj1)).a, ((zzrc.zza) (obj1)).b);
            }

            datamap.a(s, zza1);
            return;
        }
        if (i == 10)
        {
            i = a(s, ((zzrc.zza.zza.zza) (obj)).j);
            list = a(list, ((zzrc.zza.zza.zza) (obj)), i);
            if (i == 14)
            {
                datamap.c(s, list);
                return;
            }
            if (i == 9)
            {
                datamap.a(s, list);
                return;
            }
            if (i == 2)
            {
                datamap.c(s, list);
                return;
            }
            if (i == 6)
            {
                datamap.b(s, list);
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

    private class zza
    {

        public final zzrc a;
        public final List b;

        public zza(zzrc zzrc1, List list)
        {
            a = zzrc1;
            b = list;
        }
    }

}
