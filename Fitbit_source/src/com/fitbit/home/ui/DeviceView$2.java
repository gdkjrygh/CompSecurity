// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.fitbit.galileo.ui.sync.b;

// Referenced classes of package com.fitbit.home.ui:
//            DeviceView

class a
    implements Runnable
{

    final DeviceView a;

    public void run()
    {
        while (a.a == null || !DeviceView.a(a.a.d()) || a.g == null || a.g.getAnimation() != null) 
        {
            return;
        }
        a.g.startAnimation(AnimationUtils.loadAnimation(a.getContext(), 0x7f05000c));
    }

    Utils(DeviceView deviceview)
    {
        a = deviceview;
        super();
    }
}
