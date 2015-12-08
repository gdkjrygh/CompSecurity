// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.d.a.d;

// Referenced classes of package com.appboy.ui.widget:
//            h, c

final class i
    implements android.view.View.OnClickListener
{

    final d a;
    final h b;

    i(h h1, d d)
    {
        b = h1;
        a = d;
        super();
    }

    public final void onClick(View view)
    {
        view = b.a;
        d d = a;
        com.appboy.ui.a.d d1 = h.a(b);
        h.b();
        c.a(view, d, d1);
    }
}
