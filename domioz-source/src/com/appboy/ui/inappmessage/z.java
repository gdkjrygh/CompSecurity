// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage:
//            w, s

final class z
    implements android.view.View.OnClickListener
{

    final w a;

    z(w w1)
    {
        a = w1;
        super();
    }

    public final void onClick(View view)
    {
        view = w.c(a);
        w.b(a);
        view.b(w.a(a));
        a.d();
    }
}
