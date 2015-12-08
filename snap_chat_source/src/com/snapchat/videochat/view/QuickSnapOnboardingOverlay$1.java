// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.view.ViewPropertyAnimator;

// Referenced classes of package com.snapchat.videochat.view:
//            QuickSnapOnboardingOverlay

final class a
    implements Runnable
{

    private QuickSnapOnboardingOverlay a;

    public final void run()
    {
        QuickSnapOnboardingOverlay.a(a, a);
        ViewPropertyAnimator viewpropertyanimator = a.animate();
        viewpropertyanimator.alpha(0.0F);
        viewpropertyanimator.setDuration(2000L);
        viewpropertyanimator.start();
    }

    (QuickSnapOnboardingOverlay quicksnaponboardingoverlay)
    {
        a = quicksnaponboardingoverlay;
        super();
    }
}
