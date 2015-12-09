// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.appboy.d.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            ag, w, s

final class af extends ag
{

    final w a;
    private final long b = 400L;

    af(w w1, Context context)
    {
        a = w1;
        super(context);
    }

    private void a(Animation animation)
    {
        s s1 = w.c(a);
        w.b(a);
        s1.b(com.appboy.ui.inappmessage.w.a(a));
        w.g(a);
        w.b(a).clearAnimation();
        w.b(a).setAnimation(animation);
        animation.startNow();
        w.b(a).invalidate();
        com.appboy.ui.inappmessage.w.a(a).a(false);
        w.h(a);
    }

    public final void a()
    {
        a(com.appboy.ui.d.a.a(-1F));
    }

    public final void b()
    {
        a(com.appboy.ui.d.a.a(1.0F));
    }
}
