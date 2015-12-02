// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import android.net.Uri;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;

// Referenced classes of package com.facebook.exoplayer:
//            VideoPlayerService

class c
    implements DataSource
{

    final DefaultUriDataSource a;
    final String b;
    final Boolean c;
    final VideoPlayerService d;

    private Uri a(Uri uri, String s)
    {
        if (uri != null) goto _L2; else goto _L1
_L1:
        Uri uri1 = null;
_L4:
        return uri1;
_L2:
        uri1 = uri;
        if (VideoPlayerService.i(d) == null) goto _L4; else goto _L3
_L3:
        if (uri.getHost() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        uri1 = uri;
        if ("127.0.0.1".equals(uri.getHost())) goto _L4; else goto _L5
_L5:
        return VideoPlayerService.i(d).buildUpon().d("remote-uri", uri.toString()).d("vid", s).d();
    }

    public final int a(byte abyte0[], int i, int j)
    {
        return a.a(abyte0, i, j);
    }

    public final long a(DataSpec dataspec)
    {
        if (!c.booleanValue() || VideoPlayerService.i(d) == null)
        {
            return a.a(dataspec);
        } else
        {
            dataspec = new DataSpec(a(dataspec.a, b), dataspec.b, dataspec.c, dataspec.d, dataspec.e, dataspec.f, dataspec.g);
            return a.a(dataspec);
        }
    }

    public final void a()
    {
        a.a();
    }

    public A(VideoPlayerService videoplayerservice, DefaultUriDataSource defaulturidatasource, String s, Boolean boolean1)
    {
        d = videoplayerservice;
        super();
        a = defaulturidatasource;
        b = s;
        c = boolean1;
    }
}
