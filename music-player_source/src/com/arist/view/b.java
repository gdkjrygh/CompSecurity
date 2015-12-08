// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.view;

import android.view.View;

// Referenced classes of package com.arist.view:
//            c, a

final class b
    implements android.view.View.OnClickListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    static a a(b b1)
    {
        return b1.a;
    }

    public final void onClick(View view)
    {
        view = new com.arist.model.a.b();
        c c1 = new c(this);
        view.a(a.getContext(), c1);
    }
}
