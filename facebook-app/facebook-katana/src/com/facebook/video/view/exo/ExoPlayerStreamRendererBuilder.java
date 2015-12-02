// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;

public abstract class ExoPlayerStreamRendererBuilder
{

    protected final Uri c;
    protected Context d;
    protected final Handler e;
    protected final FBMediaCodecVideoTrackRenderer.EventListener f;
    protected final FBMediaCodecAudioTrackRenderer.EventListener g;

    public ExoPlayerStreamRendererBuilder(Uri uri, Context context, Handler handler, FBMediaCodecVideoTrackRenderer.EventListener eventlistener, FBMediaCodecAudioTrackRenderer.EventListener eventlistener1)
    {
        c = uri;
        d = context;
        e = handler;
        f = eventlistener;
        g = eventlistener1;
    }

    public abstract com.facebook.video.analytics.VideoAnalytics.StreamingFormat a();

    public abstract void a(BuilderCallback buildercallback);
}
