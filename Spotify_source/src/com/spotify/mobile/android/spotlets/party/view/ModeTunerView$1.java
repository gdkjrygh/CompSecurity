// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.view;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.util.logging.Logger;
import gwi;

// Referenced classes of package com.spotify.mobile.android.spotlets.party.view:
//            ModeTunerView

public final class a
    implements gwi
{

    private ModeTunerView a;

    public final void a(Bitmap bitmap, com.squareup.picasso.om om)
    {
        ModeTunerView.a(a, bitmap);
        a.postInvalidate();
    }

    public final void a(Drawable drawable)
    {
        Logger.c("Failed to load bitmap.", new Object[0]);
    }

    public final void b(Drawable drawable)
    {
    }

    (ModeTunerView modetunerview)
    {
        a = modetunerview;
        super();
    }
}
