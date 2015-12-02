// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.facebook.video.server.VideoServer;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;

public class VideoServerUriDataSource
    implements DataSource
{

    protected final DefaultUriDataSource a;
    private final String b;
    private final VideoServer c;

    public VideoServerUriDataSource(DefaultUriDataSource defaulturidatasource, String s, VideoServer videoserver)
    {
        a = defaulturidatasource;
        b = s;
        c = videoserver;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        return a.a(abyte0, i, j);
    }

    public long a(DataSpec dataspec)
    {
        VideoServer videoserver = c;
        android.net.Uri uri = dataspec.a;
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        dataspec = new DataSpec(videoserver.a(uri, s, true), dataspec.b, dataspec.c, dataspec.d, dataspec.e, dataspec.f, dataspec.g);
        return a.a(dataspec);
    }

    public final void a()
    {
        a.a();
    }
}
