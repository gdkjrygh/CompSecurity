// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.a.e;
import com.facebook.a.f;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.utils.a;

// Referenced classes of package com.tinder.fragments:
//            bd, ac

final class a
    implements Runnable
{

    final bd a;

    public final void run()
    {
        ac ac1 = ((ActivityMain)a.getActivity()).i.b;
        if (ac1 != null && !ac1.z && !ac1.z)
        {
            ac1.z = true;
            ac1.y.setAlpha(0.0F);
            ac1.y.animate().alpha(1.0F).setDuration(200L).setStartDelay(300L).setListener(new <init>(ac1)).start();
            ac1.A = com.tinder.utils.a.a();
            ac1.A.c(100D);
            ac1.A.a(f.b(13D, 17D));
            ac1.A.a(new <init>(ac1));
            ac1.x.setPivotX(ac1.x.getWidth());
            ac1.x.setPivotY(0.0F);
            ac1.A.a(0.0D);
            ac1.A.b(1.0D);
        }
    }

    imator(bd bd1)
    {
        a = bd1;
        super();
    }
}
