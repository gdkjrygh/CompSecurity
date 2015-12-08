// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.d.a.b;

// Referenced classes of package com.appboy.ui.widget:
//            f, c

final class g
    implements android.view.View.OnClickListener
{

    final b a;
    final f b;

    g(f f1, b b1)
    {
        b = f1;
        a = b1;
        super();
    }

    public final void onClick(View view)
    {
        view = b.a;
        b b1 = a;
        com.appboy.ui.a.d d = f.a(b);
        com.appboy.ui.widget.f.b();
        c.a(view, b1, d);
    }
}
