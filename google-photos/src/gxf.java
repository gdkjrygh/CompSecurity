// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class gxf
    implements nug, opp, opr, opv
{

    boolean a;
    private gwu b;

    public gxf(gwu gwu1, opd opd1)
    {
        b = gwu1;
        super();
        opd1.a(this);
    }

    public final void al_()
    {
        ((grt)gwu.r(b).a(grt)).a.a(this, true);
    }

    public final void am_()
    {
        ((grt)gwu.s(b).a(grt)).a.a(this);
    }

    public final void b_(Object obj)
    {
        boolean flag1 = true;
        int i = ((grt)obj).b;
        boolean flag = flag1;
        if (i != 1)
        {
            if (i == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        if (flag != a)
        {
            a = flag;
            if (a)
            {
                for (obj = gwu.l(b).iterator(); ((Iterator) (obj)).hasNext(); ((gxs)((Iterator) (obj)).next()).c()) { }
            } else
            {
                for (obj = gwu.l(b).iterator(); ((Iterator) (obj)).hasNext(); ((gxs)((Iterator) (obj)).next()).d()) { }
            }
        }
    }
}
