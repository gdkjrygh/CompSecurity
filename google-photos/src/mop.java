// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class mop
    implements moo
{

    private final mmv a;
    private final mnh b;

    mop(Context context)
    {
        a = (mmv)olm.a(context, mmv);
        b = (mnh)olm.a(context, mnh);
    }

    private void a(int i, List list)
    {
        Object obj = a.a(i);
        if (!((mmx) (obj)).c("is_managed_account"))
        {
            obj = ((mmx) (obj)).b("account_name");
            List list1 = a.a();
            int j = list1.size();
            i = 0;
            while (i < j) 
            {
                Integer integer = (Integer)list1.get(i);
                mmx mmx1 = a.a(integer.intValue());
                if (mmx1.c("is_managed_account") && mmx1.b("account_name").equals(obj))
                {
                    list.add(integer);
                }
                i++;
            }
        }
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        mne amne[];
        int k;
        hashmap = new HashMap();
        amne = b.a();
        k = amne.length;
        int i = 0;
_L2:
        Object obj;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = amne[i];
        hashmap.put(((mne) (obj)).a, Integer.valueOf(((mne) (obj)).b));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = a.a().iterator();
_L3:
        do
        {
            mmx mmx1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_254;
                }
                i = ((Integer)((Iterator) (obj)).next()).intValue();
                mmx1 = a.a(i);
            } while (mmx1.b("effective_gaia_id") != null);
            String s = mmx1.b("account_name");
            if (!hashmap.containsKey(s))
            {
                break MISSING_BLOCK_LABEL_232;
            }
            if (((Integer)hashmap.get(s)).intValue() != mmx1.a("device_index", -1))
            {
                a.b(i).c("device_index", ((Integer)hashmap.get(s)).intValue()).d();
            }
        } while (true);
        Exception exception;
        exception;
        throw exception;
        arraylist.add(Integer.valueOf(i));
        a(i, ((List) (arraylist)));
          goto _L3
        int j;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); a.f(j))
        {
            j = ((Integer)iterator.next()).intValue();
        }

        this;
        JVM INSTR monitorexit ;
    }
}
