// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.media;


// Referenced classes of package com.snapchat.android.discover.ui.media:
//            DiscoverMediaController, DiscoverVideoSeekBar

final class a
    implements Runnable
{

    private DiscoverMediaController a;

    public final void run()
    {
        if (DiscoverMediaController.b(a) != null)
        {
            DiscoverMediaController.c(a);
            DiscoverMediaController.e(a).postDelayed(DiscoverMediaController.d(a), 100L);
        }
    }

    (DiscoverMediaController discovermediacontroller)
    {
        a = discovermediacontroller;
        super();
    }
}
