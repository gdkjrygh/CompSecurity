// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;

// Referenced classes of package com.kik.view.adapters:
//            e

final class f
    implements android.view.View.OnClickListener
{

    final au.b a;
    final e.a b;
    final e c;

    f(e e, au.b b1, e.a a1)
    {
        c = e;
        a = b1;
        b = a1;
        super();
    }

    public final void onClick(View view)
    {
        a.onItemClick(null, b.r, 0, 0L);
    }
}
