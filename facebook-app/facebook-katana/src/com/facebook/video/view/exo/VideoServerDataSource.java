// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

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
import java.io.InputStream;

public class VideoServerDataSource
    implements DataSource
{

    private static final String a = com/facebook/video/view/exo/VideoServerDataSource.getName();
    private final VideoServer b;
    private final SourceType c;
    private Uri d;
    private String e;
    private int f;
    private com.facebook.video.server.FileResource.Reader g;
    private InputStream h;
    private final TypedEventBus i;
    private final AndroidThreadUtil j;

    public VideoServerDataSource(VideoServer videoserver, TypedEventBus typedeventbus, AndroidThreadUtil androidthreadutil, SourceType sourcetype)
    {
        b = videoserver;
        i = typedeventbus;
        j = androidthreadutil;
        c = sourcetype;
    }

    static TypedEventBus a(VideoServerDataSource videoserverdatasource)
    {
        return videoserverdatasource.i;
    }

    private void a(TypedEvent typedevent)
    {
        j.a(new _cls1(typedevent));
    }

    public final int a(byte abyte0[], int k, int l)
    {
        Preconditions.checkNotNull(g);
        Preconditions.checkNotNull(h);
        return h.read(abyte0, k, l);
    }

    public final long a(DataSpec dataspec)
    {
        boolean flag1 = true;
        Preconditions.checkNotNull(dataspec.a);
        long l;
        long l1;
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
        if (g == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        l = dataspec.d;
        l = dataspec.e;
        d = VideoServer.d(dataspec.a);
        f = VideoServer.b(dataspec.a);
        e = VideoServer.f(dataspec.a);
        if (dataspec.e == -1L)
        {
            l = -1L;
        } else
        {
            l = dataspec.d + dataspec.e;
        }
        g = b.a(d, dataspec.d, l, e, f, c);
        l1 = l;
        if (l <= 0L)
        {
            l1 = g.a().a;
        }
        h = g.b();
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
        Preconditions.checkNotNull(g);
        g = null;
        h.close();
        h = null;
        f = 0;
        e = null;
        d = null;
    }


    private class _cls1
        implements Runnable
    {

        final TypedEvent a;
        final VideoServerDataSource b;

        public void run()
        {
            VideoServerDataSource.a(b).a(a);
        }

        _cls1(TypedEvent typedevent)
        {
            b = VideoServerDataSource.this;
            a = typedevent;
            super();
        }
    }


    private class DataSourceOpenedEvent extends TypedEvent
    {

        private void a(Handler handler)
        {
            class Handler
                implements TypedHandler
            {

                public abstract void h();
            }

            handler.h();
        }

        public final volatile void a(TypedHandler typedhandler)
        {
            a((Handler)typedhandler);
        }

        public DataSourceOpenedEvent()
        {
        }
    }

}
