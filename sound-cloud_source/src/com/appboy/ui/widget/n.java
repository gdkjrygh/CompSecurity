// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.d.a.f;

// Referenced classes of package com.appboy.ui.widget:
//            m, c

final class n
    implements android.view.View.OnClickListener
{

    final f a;
    final m b;

    n(m m1, f f)
    {
        b = m1;
        a = f;
        super();
    }

    public final void onClick(View view)
    {
        view = b.a;
        f f = a;
        com.appboy.ui.a.d d = m.a(b);
        m.b();
        c.a(view, f, d);
    }
}
