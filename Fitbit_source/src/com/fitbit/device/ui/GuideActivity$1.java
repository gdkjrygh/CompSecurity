// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.View;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.fitbit.device.ui:
//            GuideActivity

class a
    implements Runnable
{

    final GuideActivity a;

    public void run()
    {
        a.c.setVisibility(0);
        a.c.setAnimation(AnimationUtils.loadAnimation(a, 0x7f050009));
    }

    (GuideActivity guideactivity)
    {
        a = guideactivity;
        super();
    }
}
