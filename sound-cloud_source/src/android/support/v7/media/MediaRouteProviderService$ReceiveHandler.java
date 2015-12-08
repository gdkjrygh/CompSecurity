// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProviderService, MediaRouteDiscoveryRequest, MediaRouteProviderProtocol

private static final class mServiceRef extends Handler
{

    private final WeakReference mServiceRef;

    private boolean processMessage(int i, Messenger messenger, int j, int k, Object obj, Bundle bundle)
    {
        MediaRouteProviderService mediarouteproviderservice;
        boolean flag;
        flag = false;
        mediarouteproviderservice = (MediaRouteProviderService)mServiceRef.get();
        if (mediarouteproviderservice == null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1 10: default 76
    //                   1 78
    //                   2 88
    //                   3 96
    //                   4 122
    //                   5 132
    //                   6 142
    //                   7 173
    //                   8 197
    //                   9 221
    //                   10 244;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L2:
        return false;
_L3:
        return MediaRouteProviderService.access$1200(mediarouteproviderservice, messenger, j, k);
_L4:
        return MediaRouteProviderService.access$1300(mediarouteproviderservice, messenger, j);
_L5:
        obj = bundle.getString("routeId");
        if (obj != null)
        {
            return MediaRouteProviderService.access$1400(mediarouteproviderservice, messenger, j, k, ((String) (obj)));
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return MediaRouteProviderService.access$1500(mediarouteproviderservice, messenger, j, k);
_L7:
        return MediaRouteProviderService.access$1600(mediarouteproviderservice, messenger, j, k);
_L8:
        if (bundle == null)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = bundle.getInt("unselectReason", 0);
        }
        return MediaRouteProviderService.access$1700(mediarouteproviderservice, messenger, j, k, i);
_L9:
        i = bundle.getInt("volume", -1);
        if (i >= 0)
        {
            return MediaRouteProviderService.access$1800(mediarouteproviderservice, messenger, j, k, i);
        }
        if (true) goto _L2; else goto _L10
_L10:
        i = bundle.getInt("volume", 0);
        if (i != 0)
        {
            return MediaRouteProviderService.access$1900(mediarouteproviderservice, messenger, j, k, i);
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (obj instanceof Intent)
        {
            return MediaRouteProviderService.access$2000(mediarouteproviderservice, messenger, j, k, (Intent)obj);
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (obj == null || (obj instanceof Bundle))
        {
            obj = MediaRouteDiscoveryRequest.fromBundle((Bundle)obj);
            if (obj == null || !((MediaRouteDiscoveryRequest) (obj)).isValid())
            {
                obj = null;
            }
            return MediaRouteProviderService.access$2100(mediarouteproviderservice, messenger, j, ((MediaRouteDiscoveryRequest) (obj)));
        }
        if (true) goto _L2; else goto _L13
_L13:
    }

    public final void handleMessage(Message message)
    {
        Messenger messenger = message.replyTo;
        if (MediaRouteProviderProtocol.isValidRemoteMessenger(messenger))
        {
            int i = message.what;
            int j = message.arg1;
            int k = message.arg2;
            Object obj = message.obj;
            message = message.peekData();
            if (!processMessage(i, messenger, j, k, obj, message))
            {
                if (MediaRouteProviderService.access$200())
                {
                    (new StringBuilder()).append(MediaRouteProviderService.access$1000(messenger)).append(": Message failed, what=").append(i).append(", requestId=").append(j).append(", arg=").append(k).append(", obj=").append(obj).append(", data=").append(message);
                }
                MediaRouteProviderService.access$1100(messenger, j);
            }
            return;
        } else
        {
            MediaRouteProviderService.access$200();
            return;
        }
    }

    public (MediaRouteProviderService mediarouteproviderservice)
    {
        mServiceRef = new WeakReference(mediarouteproviderservice);
    }
}
