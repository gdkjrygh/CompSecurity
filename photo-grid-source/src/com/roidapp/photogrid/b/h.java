// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import com.cm.kinfoc.a.a;
import com.cm.kinfoc.a.c;
import com.cm.kinfoc.a.g;
import com.cm.kinfoc.a.i;
import com.cm.kinfoc.a.j;
import com.roidapp.baselib.c.aj;

// Referenced classes of package com.roidapp.photogrid.b:
//            i, k, d

public final class h extends g
{

    private static h b = null;

    public h()
    {
        a = (new c()).b().a(new com.roidapp.photogrid.b.i(this)).a();
    }

    static void b(j j1)
    {
        if (j1 == null)
        {
            return;
        }
        android.app.Application application = aj.a();
        String as[] = com.roidapp.photogrid.b.k.a().a("InfocReportAvailable", "0-1").split("-");
        int l;
        long l1;
        long l2;
        if (as.length < 2)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        l1 = Long.parseLong(as[0], 10);
        l2 = System.currentTimeMillis();
        if ((l2 - l1 > 0xdbba00L || l != 0) && com.roidapp.photogrid.b.d.a(application))
        {
            com.roidapp.photogrid.b.k.a().a(l2, "1");
            l = i.d;
            j1.a(true);
            return;
        }
        if (l != 0)
        {
            l = i.d;
            j1.a(true);
            com.roidapp.photogrid.b.k.a().a(l2, "1");
            return;
        } else
        {
            boolean flag = as[1].equalsIgnoreCase("1");
            l = i.d;
            j1.a(flag);
            return;
        }
    }

    public final void a(j j1)
    {
        j1 = new com.cm.kinfoc.a.h(this, j1);
        a.a(j1);
    }

}
