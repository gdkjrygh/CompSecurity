// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import efa;
import efb;

// Referenced classes of package com.spotify.music:
//            MainActivity

final class a
    implements efa
{

    private MainActivity a;

    public final void a(Ad ad)
    {
        MainActivity.h(a).a(ad);
    }

    ts.ads.model.Ad(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }
}
