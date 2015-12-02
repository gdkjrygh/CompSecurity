// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.eventbus.TypedEventBus;
import com.facebook.common.executors.AndroidThreadUtil;
import com.facebook.video.abtest.SourceType;
import com.facebook.video.server.VideoServer;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

// Referenced classes of package com.facebook.video.view.exo:
//            VideoServerDataSource

public class DirectDataSourceFactory
{

    private static final String a = com/facebook/video/view/exo/DirectDataSourceFactory.getName();
    private static final Set b = ImmutableSet.of("http", "https");

    public DirectDataSourceFactory()
    {
    }

    private static DataSource a(Context context)
    {
        return new DefaultUriDataSource(context, "DefaultUriSourceExo");
    }

    public static DataSource a(Context context, VideoServer videoserver, Uri uri, TypedEventBus typedeventbus, AndroidThreadUtil androidthreadutil, SourceType sourcetype)
    {
        if (VideoServer.e(uri))
        {
            return a(videoserver, typedeventbus, androidthreadutil, sourcetype);
        } else
        {
            return a(context);
        }
    }

    private static DataSource a(VideoServer videoserver, TypedEventBus typedeventbus, AndroidThreadUtil androidthreadutil, SourceType sourcetype)
    {
        return new VideoServerDataSource(videoserver, typedeventbus, androidthreadutil, sourcetype);
    }

}
