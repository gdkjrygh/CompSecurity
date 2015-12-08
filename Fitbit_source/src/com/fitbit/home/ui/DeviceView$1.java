// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.view.animation.Animation;
import com.fitbit.galileo.ui.sync.b;

// Referenced classes of package com.fitbit.home.ui:
//            DeviceView

class a
    implements android.view.animation.mationListener
{

    final DeviceView a;

    public void onAnimationEnd(Animation animation)
    {
        if (a.a != null)
        {
            a.a.c(DeviceView.a(a));
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    (DeviceView deviceview)
    {
        a = deviceview;
        super();
    }
}
