// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.b.a.b;
import com.appboy.d.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            v

final class B
    implements com.appboy.ui.inappmessage.a.j.a
{

    final v a;

    B(v v1)
    {
        a = v1;
        super();
    }

    public final void a()
    {
        com.appboy.ui.inappmessage.v.b(a).removeCallbacks(v.e(a));
    }

    public final void b()
    {
        if (com.appboy.ui.inappmessage.v.a(a).o() == b.a)
        {
            v.f(a);
        }
    }
}
