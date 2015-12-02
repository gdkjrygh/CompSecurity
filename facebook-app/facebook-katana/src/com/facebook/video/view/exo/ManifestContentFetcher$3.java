// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;


// Referenced classes of package com.facebook.video.view.exo:
//            ManifestContentFetcher

class a
    implements Runnable
{

    final com.google.android.exoplayer.util.allback a;
    final ManifestContentFetcher b;

    public void run()
    {
        ManifestContentFetcher.a(b, a, true);
    }

    ifestCallback(ManifestContentFetcher manifestcontentfetcher, com.google.android.exoplayer.util.allback allback)
    {
        b = manifestcontentfetcher;
        a = allback;
        super();
    }
}
