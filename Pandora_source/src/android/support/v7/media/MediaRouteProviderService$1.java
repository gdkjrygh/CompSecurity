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

class e extends e
{

    final e a;
    final int b;
    final Intent c;
    final Messenger d;
    final int e;
    final MediaRouteProviderService f;

    public void a(Bundle bundle)
    {
        if (MediaRouteProviderService.a())
        {
            Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a).append(": Route control request succeeded").append(", controllerId=").append(b).append(", intent=").append(c).append(", data=").append(bundle).toString());
        }
        if (MediaRouteProviderService.a(f, d) >= 0)
        {
            MediaRouteProviderService.a(d, 3, e, 0, bundle, null);
        }
    }

    public void a(String s, Bundle bundle)
    {
label0:
        {
            if (MediaRouteProviderService.a())
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a).append(": Route control request failed").append(", controllerId=").append(b).append(", intent=").append(c).append(", error=").append(s).append(", data=").append(bundle).toString());
            }
            if (MediaRouteProviderService.a(f, d) >= 0)
            {
                if (s == null)
                {
                    break label0;
                }
                Bundle bundle1 = new Bundle();
                bundle1.putString("error", s);
                MediaRouteProviderService.a(d, 4, e, 0, bundle, bundle1);
            }
            return;
        }
        MediaRouteProviderService.a(d, 4, e, 0, bundle, null);
    }

    (MediaRouteProviderService mediarouteproviderservice,  , int i, Intent intent, Messenger messenger, int j)
    {
        f = mediarouteproviderservice;
        a = ;
        b = i;
        c = intent;
        d = messenger;
        e = j;
        super();
    }
}
