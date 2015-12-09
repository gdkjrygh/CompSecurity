// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import com.spotify.mobile.android.util.logging.Logger;
import gve;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart.view:
//            MomentImageSwitcher

final class a
    implements gve
{

    private MomentImageSwitcher a;

    public final void a()
    {
        a.showNext();
    }

    public final void b()
    {
        Logger.c("Exception when loading the image", new Object[0]);
    }

    Q(MomentImageSwitcher momentimageswitcher)
    {
        a = momentimageswitcher;
        super();
    }
}
