// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.automotive.NowPlayingData;
import com.spotify.mobile.android.spotlets.applink.service.AppLinkStateListener;
import com.spotify.mobile.android.util.Assertion;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class egd
{

    private static boolean y;
    public final efy a;
    public final MediaService b;
    final egl c;
    final egf d;
    public final egh e;
    public final ege f;
    final egq g;
    public final efz h;
    final eaj i;
    boolean j;
    boolean k;
    public AppLinkStateListener l;
    egb m;
    egb n;
    egb o;
    egb p;
    egb q;
    egb r;
    egb s;
    egb t;
    egb u;
    egb v;
    Optional w;
    boolean x;

    public egd(efy efy1, MediaService mediaservice, eaj eaj1, egl egl1, egq egq1, efz efz)
    {
        w = Optional.c(null);
        a = (efy)ctz.a(efy1);
        b = (MediaService)ctz.a(mediaservice);
        c = (egl)ctz.a(egl1);
        g = (egq)ctz.a(egq1);
        d = new egf((byte)0);
        efy1 = new egg(this, (byte)0);
        f = new ege(this, (byte)0);
        e = new egh(this, (byte)0);
        h = efz;
        a.a(efy1);
        a.a();
_L2:
        i = eaj1;
        i.c = e;
        i.a = true;
        return;
        efy1;
        if (!y)
        {
            y = true;
            Assertion.a("Permission problem using Bluetooth", efy1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void a(egd egd1)
    {
        egd1.b.o();
        egd1.b.e();
    }

    final void a()
    {
        a.b(d);
    }

    final void a(NowPlayingData nowplayingdata, List list)
    {
label0:
        {
            boolean flag = true;
            if (a.c())
            {
                if (nowplayingdata.c)
                {
                    break label0;
                }
                boolean flag1 = nowplayingdata.j.equals(com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.b);
                String s1;
                String s2;
                if (!nowplayingdata.j.equals(com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.c))
                {
                    long l1 = nowplayingdata.i;
                    l1 = TimeUnit.MILLISECONDS.toSeconds(l1);
                    a.a(l1, flag1, d);
                } else
                {
                    a.b(d);
                }
                s1 = nowplayingdata.d;
                s2 = nowplayingdata.e;
                flag1 = list.contains(MediaAction.m);
                list = a;
                if (nowplayingdata.b())
                {
                    flag = false;
                }
                list.a(s1, s2, flag, flag1, d);
                nowplayingdata = nowplayingdata.g;
                if (!TextUtils.isEmpty(nowplayingdata))
                {
                    a.a(Uri.parse(nowplayingdata), d);
                }
            }
            return;
        }
        a.a("", "", true, false, d);
        a.a(d);
        a();
        a.a(nowplayingdata.a, nowplayingdata.b, d);
        a.a(g.a.getString(0x7f08009f), d);
    }

    public final void a(com.spotify.mobile.android.spotlets.applink.service.AppLinkStateListener.AppLinkState applinkstate)
    {
        if (l != null)
        {
            l.a(applinkstate);
        }
    }

    final void b()
    {
        a(i.d, i.e);
    }

    final void c()
    {
        a.a(g.a.getString(0x7f08009c), "", d);
    }

    final void d()
    {
        Object obj = i.d;
        if (!((NowPlayingData) (obj)).j.equals(com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.c))
        {
            obj = String.format(g.a.getString(0x7f0800a1), new Object[] {
                ((NowPlayingData) (obj)).d, ((NowPlayingData) (obj)).e, ((NowPlayingData) (obj)).f
            });
            a.b(((String) (obj)), d);
            a.a(((String) (obj)), d);
        }
    }
}
