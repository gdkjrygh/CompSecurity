// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.b.a.b;
import com.appboy.d.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            ao, w

final class ac
    implements ao
{

    final w a;

    ac(w w1)
    {
        a = w1;
        super();
    }

    public final void a()
    {
        com.appboy.ui.inappmessage.w.b(a).removeCallbacks(w.e(a));
    }

    public final void b()
    {
        if (com.appboy.ui.inappmessage.w.a(a).p() == b.a)
        {
            w.f(a);
        }
    }
}
