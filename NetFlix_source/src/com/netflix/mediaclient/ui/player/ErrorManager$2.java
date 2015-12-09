// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.event.nrdp.device.ReasonCode;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            ErrorManager, PlayerActivity

class val.json
    implements Runnable
{

    final ErrorManager this$0;
    final JSONObject val$json;

    public void run()
    {
        Log.d("ErrorManager", "Publish NCCP reason code event to UI");
        ErrorManager.access$100(ErrorManager.this).getNetflixApplication().publishEvent(new ReasonCode(val$json));
        Log.d("ErrorManager", "Exit from playback after UI is alerted to handle");
        ErrorManager.access$100(ErrorManager.this).finish();
    }

    ode()
    {
        this$0 = final_errormanager;
        val$json = JSONObject.this;
        super();
    }
}
