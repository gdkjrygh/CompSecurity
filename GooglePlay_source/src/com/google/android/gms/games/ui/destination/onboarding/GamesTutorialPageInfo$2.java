// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.onboarding;

import com.google.android.play.onboard.OnboardHostControl;

// Referenced classes of package com.google.android.gms.games.ui.destination.onboarding:
//            GamesTutorialPageInfo

final class val.hostControl
    implements Runnable
{

    final GamesTutorialPageInfo this$0;
    final OnboardHostControl val$hostControl;

    public final void run()
    {
        val$hostControl.goToNextPage();
    }

    ()
    {
        this$0 = final_gamestutorialpageinfo;
        val$hostControl = OnboardHostControl.this;
        super();
    }
}
