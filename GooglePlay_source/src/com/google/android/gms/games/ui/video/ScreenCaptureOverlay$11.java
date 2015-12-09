// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

static final class  extends ViewOutlineProvider
{

    public final void getOutline(View view, Outline outline)
    {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }

    ()
    {
    }
}
