// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.katana.app;

import com.facebook.nobreak.RecoveryModeHelper;

// Referenced classes of package com.facebook.katana.app:
//            RecoveryModeFacebookApplicationImpl

class a
    implements Runnable
{

    final RecoveryModeFacebookApplicationImpl a;

    public void run()
    {
        RecoveryModeFacebookApplicationImpl.b(a).b(RecoveryModeFacebookApplicationImpl.a(a));
        RecoveryModeHelper.b();
    }

    (RecoveryModeFacebookApplicationImpl recoverymodefacebookapplicationimpl)
    {
        a = recoverymodefacebookapplicationimpl;
        super();
    }
}
