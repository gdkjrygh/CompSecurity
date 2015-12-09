// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.d.a.e;

// Referenced classes of package com.appboy.ui.widget:
//            k, c

final class l
    implements android.view.View.OnClickListener
{

    final e a;
    final k b;

    l(k k1, e e)
    {
        b = k1;
        a = e;
        super();
    }

    public final void onClick(View view)
    {
        c.a(b.a, a, k.a(b), k.b());
    }
}
