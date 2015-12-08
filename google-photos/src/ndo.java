// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.mtp.MtpDevice;
import android.mtp.MtpObjectInfo;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public final class ndo
    implements Runnable
{

    private static ndp d = new ndp();
    private final MtpDevice a;
    private ndl b;
    private final long c;
    private nds e;

    ndo(ndl ndl1)
    {
        e = new nds();
        b = ndl1;
        a = ndl1.b();
        c = ndl1.c;
    }

    private int a(SortedMap sortedmap)
    {
        int ai[];
        int i;
        int j;
        int i1;
        ai = a.getStorageIds();
        i1 = ai.length;
        j = 0;
        i = 0;
_L2:
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = ai[j];
        if (!b.a(a, c))
        {
            throw new ndq(this);
        }
        Stack stack = new Stack();
        stack.add(Integer.valueOf(-1));
        while (!stack.isEmpty()) 
        {
            if (!b.a(a, c))
            {
                throw new ndq(this);
            }
            int k = ((Integer)stack.pop()).intValue();
            int ai1[] = a.getObjectHandles(j1, 0, k);
            int k1 = ai1.length;
            k = 0;
            while (k < k1) 
            {
                int l = ai1[k];
                MtpObjectInfo mtpobjectinfo = a.getObjectInfo(l);
                if (mtpobjectinfo == null)
                {
                    throw new ndq(this);
                }
                int l1 = mtpobjectinfo.getFormat();
                if (l1 == 12289)
                {
                    stack.add(Integer.valueOf(l));
                    l = i;
                } else
                {
                    l = i;
                    if (ndl.a(l1))
                    {
                        l = i + 1;
                        ndg ndg1 = new ndg(mtpobjectinfo);
                        Object obj1 = e;
                        long l2 = ndg1.b;
                        synchronized (nds.f)
                        {
                            nds.f.setTimeInMillis(l2);
                            obj1.b = nds.f.get(5);
                            obj1.a = nds.f.get(2);
                            obj1.c = nds.f.get(1);
                            obj1.d = l2;
                            obj1.e = DateFormat.getDateInstance(3).format(Long.valueOf(l2));
                        }
                        obj1 = (List)sortedmap.get(e);
                        obj = obj1;
                        if (obj1 == null)
                        {
                            obj = new ArrayList();
                            sortedmap.put(e, obj);
                            e = new nds();
                        }
                        ((List) (obj)).add(ndg1);
                        b.a(ndg1, l);
                    }
                }
                k++;
                i = l;
            }
        }
        break MISSING_BLOCK_LABEL_422;
        sortedmap;
        obj;
        JVM INSTR monitorexit ;
        throw sortedmap;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        return i;
    }

    public static ndp a()
    {
        return d;
    }

    public final void run()
    {
        ndd andd[];
        ndg andg[];
        int ai[];
        Object obj;
        obj = new TreeMap();
        int i = a(((SortedMap) (obj)));
        b.f();
        int k = ((SortedMap) (obj)).size();
        andd = new ndd[k];
        andg = new ndg[i];
        ai = new int[i + k];
        int j;
        int i1;
        i1 = 0;
        j = 0;
        obj = ((SortedMap) (obj)).entrySet().iterator();
        int j1 = 0;
_L4:
        java.util.Map.Entry entry;
        List list;
        int i2;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        list = (List)entry.getValue();
        Collections.sort(list);
        i2 = list.size();
        int l1 = i1 + i2 + 1;
        Arrays.fill(ai, i1, l1, j1);
        int l;
        int k1;
        k1 = 0;
        l = j;
_L2:
        if (k1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        andg[l] = (ndg)list.get(k1);
        l++;
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        andd[j1] = new ndd((nds)entry.getKey(), i1, l1 - 1, j, i2);
        j1++;
        j = l;
        i1 = l1;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            if (!b.a(a, c, new ndr(ai, andg, andd)))
            {
                throw new ndq(this);
            }
        }
        catch (ndq ndq1)
        {
            b.a(false);
        }
        return;
    }

}
