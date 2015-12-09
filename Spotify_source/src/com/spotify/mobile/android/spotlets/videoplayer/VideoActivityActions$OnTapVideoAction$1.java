// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import android.view.View;
import flq;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            FullscreenVideoActivity

final class nit> extends nit>
{

    public final void a(FullscreenVideoActivity fullscreenvideoactivity)
    {
        flq flq1 = fullscreenvideoactivity.d;
        if (flq1.p.getVisibility() == 0)
        {
            flq1.b();
        } else
        {
            flq1.a();
        }
        fullscreenvideoactivity.i();
    }

    (String s)
    {
        super(s, 0, (byte)0);
    }
}
