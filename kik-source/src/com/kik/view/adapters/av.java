// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;
import android.widget.AdapterView;
import kik.a.d.s;

// Referenced classes of package com.kik.view.adapters:
//            aq, au

final class av
    implements au.b
{

    final aq a;
    final s b;
    final int c;
    final au d;

    av(au au1, aq aq1, s s, int i)
    {
        d = au1;
        a = aq1;
        b = s;
        c = i;
        super();
    }

    public final void a()
    {
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.b(b);
        d.getView(c, view, adapterview);
    }
}
