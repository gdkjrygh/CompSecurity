// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import me.lyft.android.features.IFeatureFlagsManager;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.development:
//            BooleanSwitcherView

class this._cls0
    implements Action1
{

    final BooleanSwitcherView this$0;

    public void call(Boolean boolean1)
    {
        featureFlagsManager.overrideFlag(BooleanSwitcherView.access$000(BooleanSwitcherView.this), boolean1.booleanValue());
        updateToggleState();
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = BooleanSwitcherView.this;
        super();
    }
}
