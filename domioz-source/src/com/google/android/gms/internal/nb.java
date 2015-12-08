// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            nd, nc, nf, ng, 
//            ne

public final class nb
{

    public static nc a(g g1)
    {
        nd nd1 = new nd();
        ArrayList arraylist = new ArrayList();
        nd1.a = a(g1, ((List) (arraylist)));
        return new nc(nd1, arraylist);
    }

    private static nf a(List list, Object obj)
    {
        nf nf1;
        nf1 = new nf();
        if (obj == null)
        {
            nf1.a = 14;
            return nf1;
        }
        nf1.b = new ng();
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        nf1.a = 2;
        nf1.b.b = (String)obj;
_L8:
        return nf1;
_L2:
        ArrayList arraylist;
        nf anf[];
        int j;
        int k;
        int l;
        if (obj instanceof Integer)
        {
            nf1.a = 6;
            nf1.b.f = ((Integer)obj).intValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Long)
        {
            nf1.a = 5;
            nf1.b.e = ((Long)obj).longValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Double)
        {
            nf1.a = 3;
            nf1.b.c = ((Double)obj).doubleValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Float)
        {
            nf1.a = 4;
            nf1.b.d = ((Float)obj).floatValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Boolean)
        {
            nf1.a = 8;
            nf1.b.h = ((Boolean)obj).booleanValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Byte)
        {
            nf1.a = 7;
            nf1.b.g = ((Byte)obj).byteValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof byte[])
        {
            nf1.a = 1;
            nf1.b.a = (byte[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof String[])
        {
            nf1.a = 11;
            nf1.b.k = (String[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof long[])
        {
            nf1.a = 12;
            nf1.b.l = (long[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof float[])
        {
            nf1.a = 15;
            nf1.b.m = (float[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Asset)
        {
            nf1.a = 13;
            ng ng1 = nf1.b;
            list.add((Asset)obj);
            ng1.n = list.size() - 1;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof g)
        {
            nf1.a = 9;
            obj = (g)obj;
            Object obj2 = ((g) (obj)).a();
            ne ane[] = new ne[((Set) (obj2)).size()];
            obj2 = ((Set) (obj2)).iterator();
            for (int i = 0; ((Iterator) (obj2)).hasNext(); i++)
            {
                String s = (String)((Iterator) (obj2)).next();
                ane[i] = new ne();
                ane[i].a = s;
                ane[i].b = a(list, ((g) (obj)).a(s));
            }

            nf1.b.i = ane;
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof ArrayList))
        {
            break; /* Loop/switch isn't completed */
        }
        nf1.a = 10;
        arraylist = (ArrayList)obj;
        anf = new nf[arraylist.size()];
        obj = null;
        l = arraylist.size();
        k = 0;
        j = 14;
_L4:
        Object obj1;
        nf nf2;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_735;
        }
        obj1 = arraylist.get(k);
        nf2 = a(list, obj1);
        if (nf2.a != 14 && nf2.a != 2 && nf2.a != 6 && nf2.a != 9)
        {
            throw new IllegalArgumentException((new StringBuilder("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ")).append(obj1.getClass()).toString());
        }
        if (j != 14 || nf2.a == 14)
        {
            break; /* Loop/switch isn't completed */
        }
        j = nf2.a;
        obj = obj1;
_L6:
        anf[k] = nf2;
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        if (nf2.a == j) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException((new StringBuilder("ArrayList elements must all be of the sameclass, but this one contains a ")).append(obj.getClass()).append(" and a ").append(obj1.getClass()).toString());
        nf1.b.j = anf;
        if (true) goto _L8; else goto _L7
_L7:
        throw new RuntimeException((new StringBuilder("newFieldValueFromValue: unexpected value ")).append(obj.getClass().getSimpleName()).toString());
    }

    private static ne[] a(g g1, List list)
    {
        Object obj = g1.a();
        ne ane[] = new ne[((Set) (obj)).size()];
        obj = ((Set) (obj)).iterator();
        for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
        {
            String s = (String)((Iterator) (obj)).next();
            Object obj1 = g1.a(s);
            ane[i] = new ne();
            ane[i].a = s;
            ane[i].b = a(list, obj1);
        }

        return ane;
    }
}
