// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;

import android.view.View;

// Referenced classes of package com.spotify.mobile.android.spotlets.tinkerbell:
//            TooltipContainer

final class a
    implements android.view.hangeListener
{

    private TooltipContainer a;

    public final void onViewAttachedToWindow(View view)
    {
    }

    public final void onViewDetachedFromWindow(View view)
    {
        a.a(com.spotify.mobile.android.util., com.spotify.mobile.android.util.t.ba);
        a.dismiss();
    }

    (TooltipContainer tooltipcontainer)
    {
        a = tooltipcontainer;
        super();
    }
}
