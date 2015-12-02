// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.facebook.common.executors.AndroidThreadUtil;
import com.facebook.tools.dextr.runtime.detour.ExecutorDetour;
import com.facebook.tools.dextr.runtime.detour.TracerDetour;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescriptionParser;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ManifestContentFetcher
{

    private final MediaPresentationDescriptionParser a;
    private final String b;
    private final String c;
    private final ListeningExecutorService d;
    private final AndroidThreadUtil e;

    public ManifestContentFetcher(MediaPresentationDescriptionParser mediapresentationdescriptionparser, String s, String s1, ListeningExecutorService listeningexecutorservice, AndroidThreadUtil androidthreadutil)
    {
        Preconditions.checkNotNull(mediapresentationdescriptionparser);
        a = mediapresentationdescriptionparser;
        c = s;
        b = s1;
        d = listeningexecutorservice;
        e = androidthreadutil;
    }

    static void a(ManifestContentFetcher manifestcontentfetcher, com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback manifestcallback, boolean flag)
    {
        manifestcontentfetcher.a(manifestcallback, flag);
    }

    private void a(com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback manifestcallback, boolean flag)
    {
        Object obj;
        TracerDetour.a("ManifestContentFetcher.startParsing", 0xcb18fe62);
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkNotNull(manifestcallback);
        obj = new ByteArrayInputStream(b.getBytes("UTF-8"));
        obj = a.a(c, ((java.io.InputStream) (obj)));
        if (!flag) goto _L2; else goto _L1
_L1:
        e.b(new _cls1(manifestcallback, ((MediaPresentationDescription) (obj))));
_L3:
        TracerDetour.a(0xd72d0294);
        return;
_L2:
        manifestcallback.a(obj);
          goto _L3
        IOException ioexception;
        ioexception;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        e.b(new _cls2(manifestcallback, ioexception));
          goto _L3
        manifestcallback;
        TracerDetour.a(0x73148e5d);
        throw manifestcallback;
        manifestcallback.a(ioexception);
          goto _L3
    }

    public final void a(com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback manifestcallback)
    {
        a(manifestcallback, false);
    }

    public final void b(com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback manifestcallback)
    {
        ExecutorDetour.a(d, new _cls3(manifestcallback), 0x6abc34c2);
    }

    private class _cls1
        implements Runnable
    {

        final com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback a;
        final MediaPresentationDescription b;
        final ManifestContentFetcher c;

        public void run()
        {
            a.a(b);
        }

        _cls1(com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback manifestcallback, MediaPresentationDescription mediapresentationdescription)
        {
            c = ManifestContentFetcher.this;
            a = manifestcallback;
            b = mediapresentationdescription;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback a;
        final IOException b;
        final ManifestContentFetcher c;

        public void run()
        {
            a.a(b);
        }

        _cls2(com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback manifestcallback, IOException ioexception)
        {
            c = ManifestContentFetcher.this;
            a = manifestcallback;
            b = ioexception;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback a;
        final ManifestContentFetcher b;

        public void run()
        {
            ManifestContentFetcher.a(b, a, true);
        }

        _cls3(com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback manifestcallback)
        {
            b = ManifestContentFetcher.this;
            a = manifestcallback;
            super();
        }
    }

}
