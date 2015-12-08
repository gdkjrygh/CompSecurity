// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import crittercism.android.az;
import crittercism.android.dl;
import crittercism.android.dw;

// Referenced classes of package com.crittercism.app:
//            CritterUserDataRequest, CritterUserData, CritterCallback

final class a
    implements Runnable
{

    final CritterUserDataRequest a;

    public final void run()
    {
        CritterUserDataRequest.a(a).run();
        CritterUserDataRequest.a(a, CritterUserDataRequest.a(a).a);
        boolean flag = CritterUserDataRequest.b(a).f.b();
        CritterUserDataRequest.d(a).onCritterDataReceived(new CritterUserData(CritterUserDataRequest.c(a), flag));
    }

    (CritterUserDataRequest critteruserdatarequest)
    {
        a = critteruserdatarequest;
        super();
    }
}
