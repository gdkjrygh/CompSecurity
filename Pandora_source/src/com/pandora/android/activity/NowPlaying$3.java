// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.support.v4.view.ViewPager;

// Referenced classes of package com.pandora.android.activity:
//            NowPlaying

class a
    implements Runnable
{

    final NowPlaying a;

    public void run()
    {
        NowPlaying.g(a)._(NowPlaying.f(a).getCurrentItem());
    }

    (NowPlaying nowplaying)
    {
        a = nowplaying;
        super();
    }
}
