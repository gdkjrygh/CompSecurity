// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import me.lyft.android.rx.NextOrErrorAction0;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeLyftDriverView

class this._cls0 extends NextOrErrorAction0
{

    final BecomeLyftDriverView this$0;

    public void call()
    {
        progressController.enableUI();
        progressController.hideProgress();
    }

    ()
    {
        this$0 = BecomeLyftDriverView.this;
        super();
    }
}
