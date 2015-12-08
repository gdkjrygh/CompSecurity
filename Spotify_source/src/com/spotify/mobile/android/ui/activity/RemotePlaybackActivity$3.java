// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.ConnectDevice;
import dkz;
import dwh;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            RemotePlaybackActivity

final class a
    implements dkz
{

    private RemotePlaybackActivity a;

    public final void a()
    {
    }

    public final void a(List list, com.spotify.mobile.android.connect.te te)
    {
        if (RemotePlaybackActivity.b(a) && RemotePlaybackActivity.c(a))
        {
            if ((list = ((ConnectManager)RemotePlaybackActivity.a(a).f()).d()) != null)
            {
                if (((ConnectDevice) (list)).f)
                {
                    RemotePlaybackActivity.a(a, com.spotify.mobile.android.util.vity._cls3.a);
                    a.finish();
                    return;
                }
                if (!list.equals(RemotePlaybackActivity.d(a)))
                {
                    RemotePlaybackActivity.a(a, list);
                    return;
                }
            }
        }
    }

    (RemotePlaybackActivity remoteplaybackactivity)
    {
        a = remoteplaybackactivity;
        super();
    }
}
