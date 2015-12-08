// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;

// Referenced classes of package com.kik.view.adapters:
//            w

final class y
    implements android.view.View.OnClickListener
{

    final au.b a;
    final w.a b;
    final w c;

    y(w w, au.b b1, w.a a1)
    {
        c = w;
        a = b1;
        b = a1;
        super();
    }

    public final void onClick(View view)
    {
        a.onItemClick(null, b.a, 0, 0L);
    }
}
