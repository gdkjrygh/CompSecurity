// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.net.Uri;
import com.facebook.video.server.VideoServer;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;

// Referenced classes of package com.facebook.video.view.exo:
//            VideoServerUriDataSource

public class VideoServerHLSUriDataSource extends VideoServerUriDataSource
{

    public VideoServerHLSUriDataSource(DefaultUriDataSource defaulturidatasource, String s, VideoServer videoserver)
    {
        super(defaulturidatasource, s, videoserver);
    }

    public final long a(DataSpec dataspec)
    {
        if (dataspec.a.getPath().endsWith("m3u8"))
        {
            return a.a(dataspec);
        } else
        {
            return super.a(dataspec);
        }
    }
}
