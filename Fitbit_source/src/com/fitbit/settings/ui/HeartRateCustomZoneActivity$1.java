// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.view.View;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.fitbit.settings.ui:
//            HeartRateCustomZoneActivity

class a
    implements Runnable
{

    final HeartRateCustomZoneActivity a;

    public void run()
    {
        a.f.setVisibility(0);
        a.f.setAnimation(AnimationUtils.loadAnimation(a, 0x7f050009));
    }

    (HeartRateCustomZoneActivity heartratecustomzoneactivity)
    {
        a = heartratecustomzoneactivity;
        super();
    }
}
