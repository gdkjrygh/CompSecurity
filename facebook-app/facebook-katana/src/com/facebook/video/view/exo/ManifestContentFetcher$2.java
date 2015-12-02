// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import java.io.IOException;

// Referenced classes of package com.facebook.video.view.exo:
//            ManifestContentFetcher

class b
    implements Runnable
{

    final com.google.android.exoplayer.util.allback a;
    final IOException b;
    final ManifestContentFetcher c;

    public void run()
    {
        a.a(b);
    }

    ifestCallback(ManifestContentFetcher manifestcontentfetcher, com.google.android.exoplayer.util.allback allback, IOException ioexception)
    {
        c = manifestcontentfetcher;
        a = allback;
        b = ioexception;
        super();
    }
}
