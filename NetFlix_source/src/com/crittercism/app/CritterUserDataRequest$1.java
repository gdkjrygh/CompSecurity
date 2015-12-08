// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import crittercism.android.at;
import crittercism.android.z;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crittercism.app:
//            CritterUserDataRequest, CritterUserData, CritterCallback

final class a
    implements Runnable
{

    final CritterUserDataRequest a;

    public final void run()
    {
        z z1;
        for (Iterator iterator = CritterUserDataRequest.a(a).iterator(); iterator.hasNext(); CritterUserDataRequest.a(a, z1.c()))
        {
            z1 = (z)iterator.next();
            z1.a();
        }

        CritterUserDataRequest.d(a).onCritterDataReceived(new CritterUserData(CritterUserDataRequest.b(a), CritterUserDataRequest.c(a).d()));
    }

    (CritterUserDataRequest critteruserdatarequest)
    {
        a = critteruserdatarequest;
        super();
    }
}
