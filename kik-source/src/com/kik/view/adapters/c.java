// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;

// Referenced classes of package com.kik.view.adapters:
//            b

final class c
    implements android.view.View.OnClickListener
{

    final au.b a;
    final b.a b;
    final b c;

    c(b b1, au.b b2, b.a a1)
    {
        c = b1;
        a = b2;
        b = a1;
        super();
    }

    public final void onClick(View view)
    {
        a.onItemClick(null, b.r, 0, 0L);
    }
}
