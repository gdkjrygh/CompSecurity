// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.a.a;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.g;
import java.lang.reflect.Array;
import java.util.Map;

// Referenced classes of package com.fitbit.data.bl:
//            dw, aq, ai, bg, 
//            bs

public class do extends dw
{

    public do(bs bs)
    {
        super(bs);
    }

    public a[] a(ai ai1)
        throws ServerCommunicationException
    {
        g g1 = com.fitbit.data.bl.aq.a().j();
        ai1 = ai1.a(g1.getName());
        bg abg[][];
        boolean flag;
        if (ai1 == null || ai1.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        abg = (bg[][])Array.newInstance(com/fitbit/data/bl/bg, new int[] {
            1, 1
        });
        abg[0] = null;
        a(((Map) (ai1)), ((com.fitbit.data.repo.ao) (g1)), ((dw.a) (new _cls1(abg))));
        return a(flag, ((a []) (abg[0])));
    }

    /* member class not found */
    class _cls1 {}

}
