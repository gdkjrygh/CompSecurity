// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import me.lyft.android.IAppStateHandler;
import me.lyft.android.infrastructure.lyft.AppStateDTO;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

class val.handler
    implements me.lyft.android.infrastructure.lyft.andler
{

    final InfrastructureServicesModule this$0;
    final IAppStateHandler val$handler;

    public void onAppStateReceived(AppStateDTO appstatedto)
    {
        val$handler.setAppState(appstatedto);
    }

    ()
    {
        this$0 = final_infrastructureservicesmodule;
        val$handler = IAppStateHandler.this;
        super();
    }
}
