// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            SharedElementCircularCrunch

final class val.radius extends ViewOutlineProvider
{

    final val.radius this$1;
    final float val$radius;

    public final void getOutline(View view, Outline outline)
    {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int)val$radius);
    }

    ()
    {
        this$1 = final_;
        val$radius = F.this;
        super();
    }
}
