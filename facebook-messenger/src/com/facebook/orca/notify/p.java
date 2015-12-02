// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.view.animation.Animation;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.orca.notify:
//            j, q, k

class p
    implements android.view.animation.Animation.AnimationListener
{

    final j a;

    private p(j j1)
    {
        a = j1;
        super();
    }

    p(j j1, k k)
    {
        this(j1);
    }

    public void onAnimationEnd(Animation animation)
    {
        j.a(a, false);
        if (j.e(a) != null)
        {
            animation = j.e(a);
            j.b(a, null);
            j.f(a).execute(new q(this, animation));
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        j.a(a, true);
    }
}
