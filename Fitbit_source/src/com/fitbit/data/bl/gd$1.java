// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.BodyWeight;
import com.fitbit.data.repo.as;

// Referenced classes of package com.fitbit.data.bl:
//            gd, fs

class a
    implements Runnable
{

    final BodyWeight a;
    final gd b;

    public void run()
    {
        BodyWeight bodyweight = (BodyWeight)fs.a().a(com.fitbit.data.domain.eriesObject.TimeSeriesResourceType.BODY_WEIGHT, a.a());
        if (bodyweight != null)
        {
            a.setEntityId(bodyweight.getEntityId());
        }
        if (a.isNew())
        {
            gd.a(b).add(a);
            return;
        } else
        {
            gd.a(b).save(a);
            return;
        }
    }

    odyWeight(gd gd1, BodyWeight bodyweight)
    {
        b = gd1;
        a = bodyweight;
        super();
    }
}
