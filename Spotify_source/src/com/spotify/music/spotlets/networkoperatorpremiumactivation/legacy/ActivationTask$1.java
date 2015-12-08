// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import gey;
import gnz;

// Referenced classes of package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy:
//            ActivationTask

public final class a extends JsonHttpCallbackReceiver
{

    private ActivationTask a;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ceiver.ErrorCause errorcause)
    {
        if (a.e)
        {
            return;
        } else
        {
            Logger.a(throwable, "Error when communicating with backend (%s)", new Object[] {
                errorcause
            });
            a.b.a(false);
            return;
        }
    }

    protected final void onResolved(Response response, Object obj)
    {
        boolean flag = true;
        response = (sponseMessage)obj;
        if (!a.e)
        {
            obj = a;
            ((ActivationTask) (obj)).b.a(true);
            if (((ActivationTask) (obj)).c != null)
            {
                obj = ((ActivationTask) (obj)).c;
                if (!response.isSuccess())
                {
                    flag = false;
                }
                ((gnz) (obj)).a(flag, response.getMessage());
            }
        }
    }

    public sponseMessage(ActivationTask activationtask, Handler handler, Class class1)
    {
        a = activationtask;
        super(handler, class1);
    }
}
