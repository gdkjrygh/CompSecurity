// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.a.a;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.am;
import com.fitbit.data.repo.t;
import com.fitbit.data.repo.v;
import com.fitbit.util.c;
import java.util.Map;

// Referenced classes of package com.fitbit.data.bl:
//            dw, aq, ce, ek, 
//            cb, dh, ck, cg, 
//            fb, cn, ai, an, 
//            ef, bs

public class dz extends dw
{

    public dz(bs bs)
    {
        super(bs);
    }

    private void a()
    {
        com.fitbit.data.bl.aq.a().f().unpopulateAll();
        com.fitbit.data.bl.aq.a().e().clear(true);
        ce.d();
        ek.b();
        cb.b();
        dh.b();
        ck.b();
        cg.d();
        com.fitbit.data.bl.fb.a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES);
        FitBitApplication.a().startService(com.fitbit.data.bl.cn.a(FitBitApplication.a(), true));
    }

    static void a(dz dz1)
    {
        dz1.a();
    }

    public a[] a(ai ai1)
        throws ServerCommunicationException
    {
        c.a();
        am am1 = com.fitbit.data.bl.aq.a().i();
        ai1 = ai1.a(am1.getName());
        boolean flag;
        if (ai1 == null || ai1.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(((Map) (ai1)), ((com.fitbit.data.repo.ao) (am1)), ((dw.a) (new _cls1())));
        com.fitbit.data.bl.an.a().a(true);
        return a(flag, new a[] {
            new ef(b(), true)
        });
    }

    /* member class not found */
    class _cls1 {}

}
