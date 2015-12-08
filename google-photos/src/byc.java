// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

final class byc extends bxh
{

    private bxr a;

    transient byc(bxr bxr1, bmb bmb, bxg abxg[])
    {
        a = bxr1;
        super(bmb, abxg);
    }

    public final void b()
    {
        c();
        if (!c.c()) goto _L2; else goto _L1
_L1:
        List list;
        cyt cyt1;
        List list1;
        List list2;
        List list3;
        cyt1 = c.c(bxr.b(a));
        list = c.a();
        list3 = c.b();
        list1 = cyt.b(list);
        list2 = cyt.b(list3);
        Object obj = cyt1.b;
        obj;
        JVM INSTR monitorenter ;
        if (list != null) goto _L4; else goto _L3
_L3:
        list = Collections.emptyList();
_L9:
        cyt1.c = list;
        if (list3 != null) goto _L6; else goto _L5
_L5:
        list = Collections.emptyList();
_L7:
        cyt1.d = list;
        if (!list1.equals(cyt1.e))
        {
            cyt1.e = list1;
            cyt1.a(cys.a);
        }
        if (!list2.equals(cyt1.f))
        {
            cyt1.f = list2;
            cyt1.a(cys.a);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        list = Collections.unmodifiableList(list);
        continue; /* Loop/switch isn't completed */
_L6:
        list = Collections.unmodifiableList(list3);
          goto _L7
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
