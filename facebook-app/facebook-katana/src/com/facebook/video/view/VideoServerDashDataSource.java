// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.net.Uri;
import com.facebook.common.eventbus.TypedEvent;
import com.facebook.common.eventbus.TypedEventBus;
import com.facebook.common.executors.AndroidThreadUtil;
import com.facebook.ui.media.cache.FileMetadata;
import com.facebook.video.abtest.SourceType;
import com.facebook.video.server.VideoServer;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;

public class VideoServerDashDataSource
    implements DataSource
{

    private static final String a = com/facebook/video/view/VideoServerDashDataSource.getName();
    private final VideoServer b;
    private final String c;
    private com.facebook.video.server.FileResource.Reader d;
    private InputStream e;
    private boolean f;
    private final TypedEventBus g;
    private final AndroidThreadUtil h;
    private final boolean i;

    public VideoServerDashDataSource(VideoServer videoserver, Uri uri, TypedEventBus typedeventbus, AndroidThreadUtil androidthreadutil, boolean flag)
    {
        b = videoserver;
        c = VideoServer.f(uri);
        g = typedeventbus;
        h = androidthreadutil;
        i = flag;
    }

    static TypedEventBus a(VideoServerDashDataSource videoserverdashdatasource)
    {
        return videoserverdashdatasource.g;
    }

    private void a(TypedEvent typedevent)
    {
        h.a(new _cls1(typedevent));
    }

    public final int a(byte abyte0[], int j, int k)
    {
        Preconditions.checkNotNull(d);
        Preconditions.checkNotNull(e);
        return e.read(abyte0, j, k);
    }

    public final long a(DataSpec dataspec)
    {
        long l1;
        boolean flag1 = false;
        Preconditions.checkNotNull(dataspec.a);
        long l;
        boolean flag;
        if (dataspec.d >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (dataspec.e >= 0L || dataspec.e == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        flag = flag1;
        if (d == null)
        {
            flag = true;
        }
        Preconditions.checkArgument(flag);
        l = dataspec.d;
        l = dataspec.e;
        if (dataspec.e == -1L)
        {
            l = -1L;
        } else
        {
            l = dataspec.d + dataspec.e;
        }
        try
        {
            d = b.a(dataspec.a, dataspec.d, l, c, -1, SourceType.DIRECT);
        }
        // Misplaced declaration of an exception variable
        catch (DataSpec dataspec)
        {
            throw dataspec;
        }
        l1 = l;
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        l1 = d.a().a;
        e = d.b();
        f = true;
        a(((TypedEvent) (new DataSourceOpenedEvent())));
        if (l1 < 0L)
        {
            return -1L;
        } else
        {
            return l1 - dataspec.d;
        }
    }

    public final void a()
    {
        d = null;
        if (e != null)
        {
            e.close();
        }
        e = null;
        if (f)
        {
            f = false;
        }
    }


    private class _cls1
        implements Runnable
    {

        final TypedEvent a;
        final VideoServerDashDataSource b;

        public void run()
        {
            VideoServerDashDataSource.a(b).a(a);
        }

        _cls1(TypedEvent typedevent)
        {
            b = VideoServerDashDataSource.this;
            a = typedevent;
            super();
        }
    }


    private class DataSourceOpenedEvent extends TypedEvent
    {

        public final volatile void a(TypedHandler typedhandler)
        {
        }

        public DataSourceOpenedEvent()
        {
        }
    }

}
