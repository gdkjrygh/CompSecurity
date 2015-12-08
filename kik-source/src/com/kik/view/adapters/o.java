// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;
import kik.a.d.s;
import kik.android.net.a.b;
import kik.android.widget.ProgressWidget;

// Referenced classes of package com.kik.view.adapters:
//            n

final class o
    implements android.view.View.OnClickListener
{

    final b a;
    final ProgressWidget b;
    final n.a c;
    final s d;
    final n e;

    o(n n1, b b1, ProgressWidget progresswidget, n.a a1, s s)
    {
        e = n1;
        a = b1;
        b = progresswidget;
        c = a1;
        d = s;
        super();
    }

    public final void onClick(View view)
    {
        e.a(a, b, c, d);
    }
}
