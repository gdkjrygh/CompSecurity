// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.os.Handler;
import com.roidapp.photogrid.video.onlinemusic.Genre;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;

// Referenced classes of package com.roidapp.photogrid.video:
//            f, TrackSelector, q

final class bd
    implements f
{

    final TrackSelector a;

    bd(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final int a()
    {
        if (a.a != null)
        {
            return a.a.d();
        } else
        {
            return 0;
        }
    }

    public final Genre a(int i)
    {
        if (a.a != null)
        {
            return a.a.b(i);
        } else
        {
            return null;
        }
    }

    public final int b()
    {
        return TrackSelector.f(a);
    }

    public final LocalTrack b(int i)
    {
        if (a.a != null)
        {
            return a.a.a(i, TrackSelector.e(a));
        } else
        {
            return null;
        }
    }

    public final boolean c()
    {
        if (a.a != null)
        {
            return a.a.a(TrackSelector.e(a));
        } else
        {
            return false;
        }
    }

    public final Handler d()
    {
        return TrackSelector.w(a);
    }
}
