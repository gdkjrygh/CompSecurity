// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.skype.android.widget.ViewPagerWrapper;
import com.skype.android.widget.fabmenu.FabMenu;
import com.skype.android.widget.fabmenu.FabMenuItem;

// Referenced classes of package com.skype.android.app.main:
//            HubMaterialActivity, HubSectionMaterial

final class this._cls0 extends AnimatorListenerAdapter
{

    final HubMaterialActivity this$0;

    public final void onAnimationEnd(Animator animator)
    {
        animator = HubSectionMaterial.forIndex(viewPager.b());
        .SwitchMap.com.skype.android.app.main.HubSectionMaterial[animator.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 91
    //                   2 135
    //                   3 179;
           goto _L1 _L2 _L3 _L4
_L1:
        fabMenu.c().animate().scaleY(1.0F).scaleX(1.0F).setListener(null).setDuration(100L).setInterpolator(new DecelerateInterpolator());
        return;
_L2:
        fabMenu.c().setSymbolCode(com.skype.android.widget.de.cc);
        fabMenu.c().setContentDescription(getResources().getString(0x7f08006e));
        continue; /* Loop/switch isn't completed */
_L3:
        fabMenu.c().setSymbolCode(com.skype.android.widget.de.an);
        fabMenu.c().setContentDescription(getResources().getString(0x7f08004b));
        continue; /* Loop/switch isn't completed */
_L4:
        fabMenu.c().setSymbolCode(com.skype.android.widget.de.y);
        fabMenu.c().setContentDescription(getResources().getString(0x7f080118));
        if (true) goto _L1; else goto _L5
_L5:
    }

    ()
    {
        this$0 = HubMaterialActivity.this;
        super();
    }
}
