// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.controls.MultiClickListener;
import me.lyft.android.development.DeveloperTools;

// Referenced classes of package me.lyft.android.ui.landing:
//            IntroductionView

class nit> extends MultiClickListener
{

    final IntroductionView this$0;

    public void onMultiClick()
    {
        developerTools.toggleDeveloperMode();
    }

    ()
    {
        this$0 = IntroductionView.this;
        super();
    }
}
