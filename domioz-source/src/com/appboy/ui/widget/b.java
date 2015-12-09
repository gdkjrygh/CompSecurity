// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.d.a.a;
import com.appboy.ui.a.d;

// Referenced classes of package com.appboy.ui.widget:
//            a

final class b
    implements android.view.View.OnClickListener
{

    final a a;
    final com.appboy.ui.widget.a b;

    b(com.appboy.ui.widget.a a1, a a2)
    {
        b = a1;
        a = a2;
        super();
    }

    public final void onClick(View view)
    {
        if (com.appboy.ui.widget.a.a(b) != null)
        {
            com.appboy.f.a.a(com.appboy.ui.widget.a.b(), String.format("Logged click for card %s", new Object[] {
                a.j()
            }));
            a.i();
            com.appboy.ui.widget.a.a(b).a(b.a);
        }
    }
}
