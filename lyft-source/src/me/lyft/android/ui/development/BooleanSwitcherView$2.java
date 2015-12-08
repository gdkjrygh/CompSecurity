// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.view.View;
import me.lyft.android.features.IFeatureFlagsManager;

// Referenced classes of package me.lyft.android.ui.development:
//            BooleanSwitcherView

class this._cls0
    implements android.view.eanSwitcherView._cls2
{

    final BooleanSwitcherView this$0;

    public void onClick(View view)
    {
        featureFlagsManager.resetFlag(BooleanSwitcherView.access$000(BooleanSwitcherView.this));
        updateToggleState();
    }

    ()
    {
        this$0 = BooleanSwitcherView.this;
        super();
    }
}
