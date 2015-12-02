// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c.a;

import com.google.common.a.hq;
import com.google.common.a.ik;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.c.a:
//            c, a

public class b
{

    private final Map a = ik.a();

    public b()
    {
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(a1.getClass());
        obj = (List)a.get(a1.getClass());
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = ((List) (obj)).size();
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((c)((WeakReference)((List) (obj)).get(i)).get()).a(a1);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        a1;
        throw a1;
    }

    void a(Class class1)
    {
        class1 = (List)a.get(class1);
        if (class1 != null)
        {
            int j = 0;
            int i;
            int l;
            for (i = 0; j < class1.size(); i = l)
            {
                WeakReference weakreference = (WeakReference)class1.get(j);
                l = i;
                if (weakreference.get() != null)
                {
                    class1.set(i, weakreference);
                    l = i + 1;
                }
                j++;
            }

            for (int k = class1.size() - 1; k >= i; k--)
            {
                class1.remove(k);
            }

        }
    }

    public boolean a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (c1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Object obj;
        int j;
        obj = c1.a();
        a(((Class) (obj)));
        if (a.get(obj) == null)
        {
            java.util.ArrayList arraylist = hq.a();
            a.put(obj, arraylist);
        }
        obj = (List)a.get(obj);
        j = ((List) (obj)).size();
        for (int i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_109;
        }

        if (((WeakReference)((List) (obj)).get(i)).get() != c1)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        flag = false;
          goto _L3
        flag = ((List) (obj)).add(new WeakReference(c1));
          goto _L3
        c1;
        throw c1;
    }

    public boolean b(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (c1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        List list = (List)a.get(c1.a());
        if (list == null)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        int j = list.size();
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((WeakReference)list.get(i)).get() != c1)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ((WeakReference)list.get(i)).clear();
        flag = true;
        continue; /* Loop/switch isn't completed */
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        c1;
        throw c1;
    }
}
