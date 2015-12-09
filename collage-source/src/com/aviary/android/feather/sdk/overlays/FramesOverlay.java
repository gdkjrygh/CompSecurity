// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.overlays;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.aviary.android.feather.sdk.overlays:
//            StickersOverlay

public class FramesOverlay extends StickersOverlay
{

    public FramesOverlay(Context context, int i, View view)
    {
        super(context, i, view, com.aviary.android.feather.library.filters.a.a.q, 3);
    }

    protected CharSequence a(Resources resources)
    {
        return resources.getString(com.aviary.android.feather.sdk.R.string.aviary_overlay_stickers_text_position);
    }

    protected float b(Resources resources)
    {
        return resources.getFraction(com.aviary.android.feather.sdk.R.fraction.aviary_overlay_stickers_text_width, 100, 100);
    }

    protected CharSequence c(Resources resources)
    {
        return resources.getString(com.aviary.android.feather.sdk.R.string.feather_borders);
    }

    protected CharSequence d(Resources resources)
    {
        return resources.getString(com.aviary.android.feather.sdk.R.string.feather_overlay_stickers_text);
    }
}
