// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.social;

import android.os.Bundle;
import android.os.RemoteException;

// Referenced classes of package com.htc.lib2.opensense.social:
//            AbstractSocialPlugin, SocialPluginResponse, ISocialPluginResponse

class val.features
    implements Runnable
{

    final val.response this$1;
    final String val$features[];
    final ISocialPluginResponse val$response;

    public void run()
    {
        Bundle bundle;
        bundle = getDataSources(new SocialPluginResponse(val$response), val$features);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        val$response.onResult(bundle);
        return;
        RemoteException remoteexception;
        remoteexception;
        Bundle bundle1 = new Bundle();
        try
        {
            val$response.onResult(bundle1);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return;
    }

    ()
    {
        this$1 = final_;
        val$response = isocialpluginresponse;
        val$features = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
