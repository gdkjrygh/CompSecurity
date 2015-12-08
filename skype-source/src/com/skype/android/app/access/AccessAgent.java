// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.access;

import android.app.Application;
import android.content.Context;
import com.skype.SkyLib;
import com.skype.android.app.Agent;
import com.skype.android.app.AgentComponent;

// Referenced classes of package com.skype.android.app.access:
//            a

public class AccessAgent extends Agent
{

    SkyLib lib;
    private a receiver;

    public AccessAgent(Application application)
    {
        super(application);
        getComponent().inject(this);
    }

    public void onLogin()
    {
        super.onLogin();
        receiver = new a(lib);
        receiver.register(getContext());
    }

    public void onLogout()
    {
        if (receiver != null)
        {
            try
            {
                getContext().unregisterReceiver(receiver);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        super.onLogout();
    }
}
