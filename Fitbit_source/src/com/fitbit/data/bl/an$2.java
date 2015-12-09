// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.repo.n;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            an

class a
    implements Runnable
{

    final Device a;
    final an b;

    public void run()
    {
        List list = b.f();
        Profile profile = b.b();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Device device = (Device)iterator.next();
            device.a(profile);
            if (!a.d().equals(device.d()))
            {
                continue;
            }
            device.a(a.e());
            break;
        } while (true);
        profile.a(list);
        an.b(b).saveAll(list);
    }

    evice.Device(an an1, Device device)
    {
        b = an1;
        a = device;
        super();
    }
}
