// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.List;

final class aqb
    implements ano, aom
{

    private final aon a;
    private final aoo b;
    private int c;
    private int d;
    private ane e;
    private List f;
    private int g;
    private volatile atn h;
    private File i;
    private aqc j;

    public aqb(aoo aoo1, aon aon1)
    {
        c = 0;
        d = -1;
        b = aoo1;
        a = aon1;
    }

    private boolean c()
    {
        return g < f.size();
    }

    public final void a(Exception exception)
    {
        a.a(j, exception, h.c, amz.d);
    }

    public final void a(Object obj)
    {
        a.a(e, obj, h.c, amz.d, j);
    }

    public final boolean a()
    {
        List list;
        Object obj;
        list = b.c();
        obj = b;
        obj = ((aoo) (obj)).c.b.b(((aoo) (obj)).d.getClass(), ((aoo) (obj)).g, ((aoo) (obj)).k);
_L7:
        if (f != null && c()) goto _L2; else goto _L1
_L1:
        d = d + 1;
        if (d < ((List) (obj)).size()) goto _L4; else goto _L3
_L3:
        c = c + 1;
        if (c < list.size()) goto _L6; else goto _L5
_L5:
        boolean flag1 = false;
_L9:
        return flag1;
_L6:
        d = 0;
_L4:
        ane ane1 = (ane)list.get(c);
        Class class1 = (Class)((List) (obj)).get(d);
        anl anl = b.c(class1);
        j = new aqc(ane1, b.n, b.e, b.f, anl, class1, b.i);
        i = b.a().a(j);
        if (i != null)
        {
            e = ane1;
            f = b.a(i);
            g = 0;
        }
          goto _L7
_L2:
        boolean flag;
        h = null;
        flag = false;
_L11:
        flag1 = flag;
        if (flag) goto _L9; else goto _L8
_L8:
        flag1 = flag;
        if (!c()) goto _L9; else goto _L10
_L10:
        List list1 = f;
        int k = g;
        g = k + 1;
        h = ((atm)list1.get(k)).a(i, b.e, b.f, b.i);
        if (h != null && b.a(h.c.d()))
        {
            flag = true;
            h.c.a(b.o, this);
        }
          goto _L11
    }

    public final void b()
    {
        atn atn1 = h;
        if (atn1 != null)
        {
            atn1.c.b();
        }
    }
}
