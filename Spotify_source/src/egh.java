// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.media.automotive.NowPlayingData;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class egh
    implements eal
{

    private egd a;

    private egh(egd egd1)
    {
        a = egd1;
        super();
    }

    egh(egd egd1, byte byte0)
    {
        this(egd1);
    }

    public final void a(NowPlayingData nowplayingdata, List list)
    {
        if (a.k)
        {
            a.k = false;
            if (!nowplayingdata.j.equals(com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.c))
            {
                egd egd1 = a;
                long l = nowplayingdata.i;
                boolean flag = nowplayingdata.a();
                l = TimeUnit.MILLISECONDS.toSeconds(l);
                egd1.a.a(l, flag, egd1.d);
            }
        }
        egd egd2 = a;
        egd2.a(nowplayingdata, list);
        boolean flag1 = list.contains(MediaAction.f);
        if (!egd2.w.b() || ((Boolean)egd2.w.c()).booleanValue() != flag1)
        {
            if (flag1)
            {
                egd2.a.a(egd2.m, egd2.d);
                egd2.a.b(egd2.s, egd2.d);
                nowplayingdata = egd2.g.a.getString(0x7f0800a9);
            } else
            {
                egd2.a.a(egd2.s, egd2.d);
                egd2.a.b(egd2.m, egd2.d);
                nowplayingdata = egd2.g.a.getString(0x7f0800a8);
            }
            if (egd2.x)
            {
                egd2.a.a(nowplayingdata, egd2.d);
                egd2.x = false;
            }
        }
        egd2.w = Optional.c(Boolean.valueOf(flag1));
    }
}
