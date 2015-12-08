// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;
import kik.a.d.s;

// Referenced classes of package com.kik.view.adapters:
//            ak, bf

final class br
    implements android.view.View.OnClickListener
{

    final bf.b a;
    final s b;
    final bf c;

    br(bf bf1, bf.b b1, s s)
    {
        c = bf1;
        a = b1;
        b = s;
        super();
    }

    public final void onClick(View view)
    {
        a.x.c();
        c.a(a, b, true);
        a.x.a(false);
    }
}
