// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.List;

final class aok
    implements ano, aom
{

    private List a;
    private final aoo b;
    private final aon c;
    private int d;
    private ane e;
    private List f;
    private int g;
    private volatile atn h;
    private File i;

    aok(aoo aoo1, aon aon1)
    {
        this(aoo1.c(), aoo1, aon1);
    }

    aok(List list, aoo aoo1, aon aon1)
    {
        d = -1;
        a = list;
        b = aoo1;
        c = aon1;
    }

    private boolean c()
    {
        return g < f.size();
    }

    public final void a(Exception exception)
    {
        c.a(e, exception, h.c, amz.c);
    }

    public final void a(Object obj)
    {
        c.a(e, obj, h.c, amz.c, e);
    }

    public final boolean a()
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
_L5:
        if (f != null && c()) goto _L2; else goto _L1
_L1:
        d = d + 1;
        if (d < a.size()) goto _L4; else goto _L3
_L3:
        return flag1;
_L4:
        ane ane1 = (ane)a.get(d);
        aol aol1 = new aol(ane1, b.n);
        i = b.a().a(aol1);
        if (i != null)
        {
            e = ane1;
            f = b.a(i);
            g = 0;
        }
          goto _L5
_L2:
        h = null;
_L8:
        flag1 = flag;
        if (flag) goto _L3; else goto _L6
_L6:
        flag1 = flag;
        if (!c()) goto _L3; else goto _L7
_L7:
        List list = f;
        int j = g;
        g = j + 1;
        h = ((atm)list.get(j)).a(i, b.e, b.f, b.i);
        if (h != null && b.a(h.c.d()))
        {
            flag = true;
            h.c.a(b.o, this);
        }
          goto _L8
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
