// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.view.View;

// Referenced classes of package com.arist.a:
//            a

final class b
    implements android.view.View.OnClickListener
{

    final a a;
    private final int b;
    private final com.arist.b.b c;

    b(a a1, int i, com.arist.b.b b1)
    {
        a = a1;
        b = i;
        c = b1;
        super();
    }

    public final void onClick(View view)
    {
        com.arist.a.a.a(a, b);
        a.a(view, c);
    }
}
