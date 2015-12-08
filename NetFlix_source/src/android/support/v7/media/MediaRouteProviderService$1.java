// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProviderService

class llback extends llback
{

    final MediaRouteProviderService this$0;
    final ientRecord val$client;
    final int val$controllerId;
    final Intent val$intent;
    final Messenger val$messenger;
    final int val$requestId;

    public void onError(String s, Bundle bundle)
    {
label0:
        {
            if (MediaRouteProviderService.access$200())
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(val$client).append(": Route control request failed").append(", controllerId=").append(val$controllerId).append(", intent=").append(val$intent).append(", error=").append(s).append(", data=").append(bundle).toString());
            }
            if (MediaRouteProviderService.access$300(MediaRouteProviderService.this, val$messenger) >= 0)
            {
                if (s == null)
                {
                    break label0;
                }
                Bundle bundle1 = new Bundle();
                bundle1.putString("error", s);
                MediaRouteProviderService.access$400(val$messenger, 4, val$requestId, 0, bundle, bundle1);
            }
            return;
        }
        MediaRouteProviderService.access$400(val$messenger, 4, val$requestId, 0, bundle, null);
    }

    public void onResult(Bundle bundle)
    {
        if (MediaRouteProviderService.access$200())
        {
            Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(val$client).append(": Route control request succeeded").append(", controllerId=").append(val$controllerId).append(", intent=").append(val$intent).append(", data=").append(bundle).toString());
        }
        if (MediaRouteProviderService.access$300(MediaRouteProviderService.this, val$messenger) >= 0)
        {
            MediaRouteProviderService.access$400(val$messenger, 3, val$requestId, 0, bundle, null);
        }
    }

    ientRecord()
    {
        this$0 = final_mediarouteproviderservice;
        val$client = ientrecord;
        val$controllerId = i;
        val$intent = intent1;
        val$messenger = messenger1;
        val$requestId = I.this;
        super();
    }
}
