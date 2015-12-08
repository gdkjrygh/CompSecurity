// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.follow;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.spotlets.follow:
//            FollowManager

final class t> extends HttpCallbackReceiver
{

    private String a;
    private String b;
    private String c;
    private boolean d;
    private FollowManager e;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.eceiver.ErrorCause errorcause)
    {
        boolean flag1 = true;
        Logger.b(throwable, "Failed to %s. Rolling back follow state.", new Object[] {
            a
        });
        throwable = e;
        errorcause = c;
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        FollowManager.a(throwable, errorcause, flag);
        if ((new SpotifyLink(c)).c == com.spotify.mobile.android.util.Type.g)
        {
            throwable = e;
            errorcause = c;
            if (!d)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            FollowManager.b(throwable, errorcause, flag);
        }
    }

    protected final void onResolved(Response response, Object obj)
    {
        Logger.a("%s %s succeeded", new Object[] {
            a, b
        });
    }

    protected final Object parseResponse(Response response)
    {
        return null;
    }

    rrorCause(FollowManager followmanager, Handler handler, String s, String s1, String s2, boolean flag)
    {
        e = followmanager;
        a = s;
        b = s1;
        c = s2;
        d = flag;
        super(handler);
    }
}
