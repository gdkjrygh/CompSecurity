// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.a.a;

import android.view.View;
import android.view.animation.Animation;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.qihoo.security.a.a:
//            a

class c
    implements android.view.animation.ation.AnimationListener
{

    final View a;
    final BlockingQueue b;
    final int c;
    final a d;

    public void onAnimationEnd(Animation animation)
    {
        a.setVisibility(4);
        if (com.qihoo.security.a.a.a.e(d) != 1) goto _L2; else goto _L1
_L1:
        if (b.isEmpty()) goto _L4; else goto _L3
_L3:
        com.qihoo.security.a.a.a.b(d, b, c);
_L6:
        return;
_L4:
        if (com.qihoo.security.a.a.a.f(d) != null && com.qihoo.security.a.a.a.g(d))
        {
            com.qihoo.security.a.a.a.a(d, false);
            com.qihoo.security.a.a.a.f(d).a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (c == 1 && com.qihoo.security.a.a.a.f(d) != null && com.qihoo.security.a.a.a.g(d))
        {
            com.qihoo.security.a.a.a.a(d, false);
            com.qihoo.security.a.a.a.f(d).a();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ngQueue(a a1, View view, BlockingQueue blockingqueue, int i)
    {
        d = a1;
        a = view;
        b = blockingqueue;
        c = i;
        super();
    }
}
