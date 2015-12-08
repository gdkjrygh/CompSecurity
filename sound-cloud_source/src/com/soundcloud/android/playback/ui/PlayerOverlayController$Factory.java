// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerOverlayController, OverlayAnimator

public static class overlayAnimatorProvider
{

    private final Provider overlayAnimatorProvider;

    public PlayerOverlayController create(View view)
    {
        return new PlayerOverlayController(view, (OverlayAnimator)overlayAnimatorProvider.get());
    }

    (Provider provider)
    {
        overlayAnimatorProvider = provider;
    }
}
