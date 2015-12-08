// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;

// Referenced classes of package com.kik.view.adapters:
//            n

final class q
    implements android.view.View.OnClickListener
{

    final au.b a;
    final n.a b;
    final n c;

    q(n n, au.b b1, n.a a1)
    {
        c = n;
        a = b1;
        b = a1;
        super();
    }

    public final void onClick(View view)
    {
        a.onItemClick(null, b.r, 0, 0L);
    }
}
