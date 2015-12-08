// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.Profile;
import com.fitbit.data.repo.am;

// Referenced classes of package com.fitbit.data.bl:
//            an

class a
    implements Runnable
{

    final Profile a;
    final an b;

    public void run()
    {
        if (a.isNew())
        {
            an.a(b).add(a);
            return;
        } else
        {
            an.a(b).save(a);
            return;
        }
    }

    rofile(an an1, Profile profile)
    {
        b = an1;
        a = profile;
        super();
    }
}
