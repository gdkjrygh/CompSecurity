// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;
import kik.a.d.a.a;
import kik.a.d.s;

// Referenced classes of package com.kik.view.adapters:
//            bf

final class bo
    implements android.view.View.OnClickListener
{

    final bf.b a;
    final s b;
    final a c;
    final bf d;

    bo(bf bf1, bf.b b1, s s, a a1)
    {
        d = bf1;
        a = b1;
        b = s;
        c = a1;
        super();
    }

    public final void onClick(View view)
    {
        a.z = false;
        com.kik.view.adapters.bf.a(d, b, c, a);
    }
}
