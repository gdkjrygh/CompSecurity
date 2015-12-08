// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;
import com.kik.android.a;
import kik.a.d.f;
import kik.a.d.s;
import kik.android.net.a.b;
import kik.android.widget.ProgressWidget;

// Referenced classes of package com.kik.view.adapters:
//            bf

final class bi
    implements android.view.View.OnClickListener
{

    final b a;
    final bf.b b;
    final ProgressWidget c;
    final f d;
    final s e;
    final bf f;

    bi(bf bf1, b b1, bf.b b2, ProgressWidget progresswidget, f f1, s s1)
    {
        f = bf1;
        a = b1;
        b = b2;
        c = progresswidget;
        d = f1;
        e = s1;
        super();
    }

    public final void onClick(View view)
    {
        f.e.b("Content Upload Cancelled").b();
        if (a != null)
        {
            f.a(a, b.s, c, d, e.b());
        }
    }
}
