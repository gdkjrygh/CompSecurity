// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.List;

final class niu
    implements ngp
{

    private nih a;
    private nir b;

    niu(nir nir1)
    {
        b = nir1;
        super();
    }

    public final int a(mmz mmz1)
    {
        if (((nxx) (a)).l != 200)
        {
            throw new IOException("Could not update account status");
        }
        boolean flag;
        if (!a.b && a.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mmz1.b("PlusiAccountUpdateExtension.wants_full_update", flag);
        if (flag)
        {
            return ngq.b;
        } else
        {
            return ngq.a;
        }
    }

    public final void a(mmx mmx, nyg nyg, List list)
    {
        a = new nih(nir.a(b), nyg);
        list.add(a);
    }
}
