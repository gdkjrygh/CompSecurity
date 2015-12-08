// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.View;

// Referenced classes of package com.soundcloud.android.collections:
//            OnboardingItemCellRenderer

class val.position
    implements android.view.ingItemCellRenderer._cls1
{

    final OnboardingItemCellRenderer this$0;
    final int val$position;

    public void onClick(View view)
    {
        OnboardingItemCellRenderer.access$000(OnboardingItemCellRenderer.this).onCollectionsOnboardingItemClosed(val$position);
    }

    stener()
    {
        this$0 = final_onboardingitemcellrenderer;
        val$position = I.this;
        super();
    }
}
