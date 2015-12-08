// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProviderService, b, e

private static final class a extends Handler
{

    private final WeakReference a;

    private boolean a(int i, Messenger messenger, int j, int k, Object obj, Bundle bundle)
    {
        MediaRouteProviderService mediarouteproviderservice = (MediaRouteProviderService)a.get();
        if (mediarouteproviderservice == null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1 10: default 72
    //                   1 74
    //                   2 84
    //                   3 92
    //                   4 118
    //                   5 128
    //                   6 138
    //                   7 148
    //                   8 172
    //                   9 196
    //                   10 219;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L2:
        return false;
_L3:
        return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k);
_L4:
        return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j);
_L5:
        obj = bundle.getString("routeId");
        if (obj != null)
        {
            return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, ((String) (obj)));
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return MediaRouteProviderService.b(mediarouteproviderservice, messenger, j, k);
_L7:
        return MediaRouteProviderService.c(mediarouteproviderservice, messenger, j, k);
_L8:
        return MediaRouteProviderService.d(mediarouteproviderservice, messenger, j, k);
_L9:
        i = bundle.getInt("volume", -1);
        if (i >= 0)
        {
            return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, i);
        }
        if (true) goto _L2; else goto _L10
_L10:
        i = bundle.getInt("volume", 0);
        if (i != 0)
        {
            return MediaRouteProviderService.b(mediarouteproviderservice, messenger, j, k, i);
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (obj instanceof Intent)
        {
            return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, (Intent)obj);
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (obj == null || (obj instanceof Bundle))
        {
            obj = b.a((Bundle)obj);
            if (obj == null || !((b) (obj)).c())
            {
                obj = null;
            }
            return MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, ((b) (obj)));
        }
        if (true) goto _L2; else goto _L13
_L13:
    }

    public void handleMessage(Message message)
    {
        Messenger messenger = message.replyTo;
        if (e.a(messenger))
        {
            int i = message.what;
            int j = message.arg1;
            int k = message.arg2;
            Object obj = message.obj;
            message = message.peekData();
            if (!a(i, messenger, j, k, obj, message))
            {
                if (MediaRouteProviderService.a())
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(MediaRouteProviderService.a(messenger)).append(": Message failed, what=").append(i).append(", requestId=").append(j).append(", arg=").append(k).append(", obj=").append(obj).append(", data=").append(message).toString());
                }
                MediaRouteProviderService.a(messenger, j);
            }
        } else
        if (MediaRouteProviderService.a())
        {
            Log.d("MediaRouteProviderSrv", "Ignoring message without valid reply messenger.");
            return;
        }
    }

    public (MediaRouteProviderService mediarouteproviderservice)
    {
        a = new WeakReference(mediarouteproviderservice);
    }
}
