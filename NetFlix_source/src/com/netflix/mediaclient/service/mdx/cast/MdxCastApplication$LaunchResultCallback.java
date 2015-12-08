// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.netflix.mediaclient.Log;
import java.io.IOException;

// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            MdxCastApplication

private final class mMessageReceivedCallback
    implements ResultCallback
{

    final com.google.android.gms.cast.sultCallback.onResult mMessageReceivedCallback;
    final MdxCastApplication this$0;

    public void onResult(com.google.android.gms.cast.sultCallback sultcallback)
    {
        if (sultcallback.us().isSuccess())
        {
            Log.d(MdxCastApplication.access$000(), "launchApplication(), success");
            try
            {
                Cast.CastApi.(MdxCastApplication.access$100(MdxCastApplication.this), "urn:x-cast:mdx-netflix-com:service:target:2", mMessageReceivedCallback);
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.cast.sultCallback sultcallback)
            {
                sultcallback.printStackTrace();
                MdxCastApplication.access$200(MdxCastApplication.this).onFailToLaunch();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.cast.sultCallback sultcallback)
            {
                MdxCastApplication.access$200(MdxCastApplication.this).onFailToLaunch();
                sultcallback.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.cast.sultCallback sultcallback)
            {
                MdxCastApplication.access$200(MdxCastApplication.this).onFailToLaunch();
                sultcallback.printStackTrace();
                return;
            }
            MdxCastApplication.access$302(MdxCastApplication.this, false);
            MdxCastApplication.access$200(MdxCastApplication.this).onLaunched();
            return;
        }
        if (sultcallback.us().getStatusCode() == 2002)
        {
            Log.d(MdxCastApplication.access$000(), "launchApplication(), cancelled & ignored");
            return;
        }
        if (sultcallback.us().getStatusCode() == 15)
        {
            Log.d(MdxCastApplication.access$000(), "launchApplication(), timeout, wait - JUST A WORKAROUND");
            MdxCastApplication.access$200(MdxCastApplication.this).onFailToLaunch();
            return;
        } else
        {
            Log.d(MdxCastApplication.access$000(), (new StringBuilder()).append("launchApplication(), failure, result: ").append(sultcallback.us().getStatusCode()).toString());
            MdxCastApplication.access$200(MdxCastApplication.this).onFailToLaunch();
            return;
        }
    }

    public volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.cast.sultCallback.onResult)result);
    }

    k(com.google.android.gms.cast.sultCallback sultcallback)
    {
        this$0 = MdxCastApplication.this;
        super();
        mMessageReceivedCallback = sultcallback;
    }
}
