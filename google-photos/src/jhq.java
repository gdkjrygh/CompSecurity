// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;

final class jhq
    implements Runnable
{

    private jhp a;

    jhq(jhp jhp1)
    {
        a = jhp1;
        super();
    }

    public final void run()
    {
        if (a.b)
        {
            a.b = false;
            if (a.a.getAnimation() == null || a.a.getAnimation().hasEnded())
            {
                jhp jhp1 = a;
                jhp1.a.animate().scaleX(1.0F).scaleY(1.0F).setDuration(200L).setInterpolator(b.e(jhm.e(jhp1.e).O_())).setListener(new jhr(jhp1)).start();
            }
        }
    }
}
