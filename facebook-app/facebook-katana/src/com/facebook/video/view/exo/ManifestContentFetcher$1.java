// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;

// Referenced classes of package com.facebook.video.view.exo:
//            ManifestContentFetcher

class b
    implements Runnable
{

    final com.google.android.exoplayer.util.allback a;
    final MediaPresentationDescription b;
    final ManifestContentFetcher c;

    public void run()
    {
        a.a(b);
    }

    onDescription(ManifestContentFetcher manifestcontentfetcher, com.google.android.exoplayer.util.allback allback, MediaPresentationDescription mediapresentationdescription)
    {
        c = manifestcontentfetcher;
        a = allback;
        b = mediapresentationdescription;
        super();
    }
}
