// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.appboy.d.a;
import com.appboy.ui.inappmessage.a.c;
import com.appboy.ui.inappmessage.a.e;

// Referenced classes of package com.appboy.ui.inappmessage:
//            v

final class E extends e
{

    final v a;
    private final long b = 400L;

    E(v v1, Context context)
    {
        a = v1;
        super(context);
    }

    private void a(Animation animation)
    {
        c c1 = com.appboy.ui.inappmessage.v.c(a);
        v.b(a);
        com.appboy.ui.inappmessage.v.a(a);
        c1.c();
        v.g(a);
        v.b(a).clearAnimation();
        v.b(a).setAnimation(animation);
        animation.startNow();
        v.b(a).invalidate();
        com.appboy.ui.inappmessage.v.a(a).a(false);
        v.h(a);
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
