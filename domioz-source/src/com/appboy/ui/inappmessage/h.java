// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.appboy.b.a.d;
import com.appboy.ui.d.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            n, a

final class h
    implements n
{

    final com.appboy.ui.inappmessage.a a;
    private final long b = 400L;
    private final int c = Resources.getSystem().getInteger(0x10e0000);

    h(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final Animation a(com.appboy.d.a a1)
    {
        if (a1 instanceof com.appboy.d.h)
        {
            if (((com.appboy.d.h)a1).t() == d.a)
            {
                a1 = com.appboy.ui.d.a.a(-1F, 0.0F);
            } else
            {
                a1 = com.appboy.ui.d.a.a(1.0F, 0.0F);
            }
        } else
        {
            a1 = new AlphaAnimation(0.0F, 1.0F);
        }
        return com.appboy.ui.d.a.a(a1, c, true);
    }

    public final Animation b(com.appboy.d.a a1)
    {
        if (a1 instanceof com.appboy.d.h)
        {
            if (((com.appboy.d.h)a1).t() == d.a)
            {
                a1 = com.appboy.ui.d.a.a(0.0F, -1F);
            } else
            {
                a1 = com.appboy.ui.d.a.a(0.0F, 1.0F);
            }
        } else
        {
            a1 = new AlphaAnimation(1.0F, 0.0F);
        }
        return com.appboy.ui.d.a.a(a1, c, false);
    }
}
