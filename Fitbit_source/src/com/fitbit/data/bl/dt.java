// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.a.a;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.t;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            dw, aq, ai, bs, 
//            dh

public class dt extends dw
{

    final List a = new ArrayList();

    public dt(bs bs)
    {
        super(bs);
    }

    private void a(dh dh)
    {
        if (!a.contains(dh))
        {
            a.add(dh);
        }
    }

    static void a(dt dt1, dh dh)
    {
        dt1.a(dh);
    }

    public a[] a(ai ai1)
        throws ServerCommunicationException
    {
        t t1 = com.fitbit.data.bl.aq.a().f();
        a(ai1.a(t1.getName()), ((com.fitbit.data.repo.ao) (t1)), ((dw.a) (new _cls1())));
        return a(true, (a[])a.toArray(new a[0]));
    }

    /* member class not found */
    class _cls1 {}

}
