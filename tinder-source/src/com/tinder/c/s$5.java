// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.c:
//            s

final class <init>
    implements Runnable
{

    final Context a;
    final s b;

    public final void run()
    {
        float f = ad.a(10F, a);
        float f2 = s.f(b);
        float f1 = s.g(b).getHeight() / 2;
        f2 /= 2.0F;
        float f3 = s.c(b).getHeight();
        s.c(b).setY(f1 - f2 - f3 - f);
    }

    ontext(s s1, Context context)
    {
        b = s1;
        a = context;
        super();
    }
}
