// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity

final class this._cls0
    implements android.view.ifiedSetupProfileActivity._cls4
{

    final SimplifiedSetupProfileActivity this$0;

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        float f = SimplifiedSetupProfileActivity.access$500(SimplifiedSetupProfileActivity.this)[0].logoSpot.getX();
        float f1 = (float)(SimplifiedSetupProfileActivity.access$500(SimplifiedSetupProfileActivity.this)[0].logoSpot.getWidth() - SimplifiedSetupProfileActivity.access$600(SimplifiedSetupProfileActivity.this).getWidth()) / 2.0F;
        float f2 = SimplifiedSetupProfileActivity.access$500(SimplifiedSetupProfileActivity.this)[0].logoSpot.getY();
        float f3 = (float)(SimplifiedSetupProfileActivity.access$500(SimplifiedSetupProfileActivity.this)[0].logoSpot.getHeight() - SimplifiedSetupProfileActivity.access$600(SimplifiedSetupProfileActivity.this).getHeight()) / 2.0F;
        float f4 = (float)SimplifiedSetupProfileActivity.access$500(SimplifiedSetupProfileActivity.this)[0].logoSpot.getWidth() / (float)SimplifiedSetupProfileActivity.access$600(SimplifiedSetupProfileActivity.this).getWidth();
        SimplifiedSetupProfileActivity.access$600(SimplifiedSetupProfileActivity.this).animate().translationX(f + f1).translationY(f2 + f3).scaleX(f4).scaleY(f4).setDuration(0L).start();
        SimplifiedSetupProfileActivity.access$700(SimplifiedSetupProfileActivity.this).removeOnLayoutChangeListener(this);
    }

    reen()
    {
        this$0 = SimplifiedSetupProfileActivity.this;
        super();
    }
}
