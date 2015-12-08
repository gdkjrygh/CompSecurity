// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.kik.l.ab;
import kik.a.d.s;
import kik.android.i.a;
import kik.android.i.b;

// Referenced classes of package com.kik.view.adapters:
//            bf, ak, bq

final class bp
    implements a
{

    final bf.b a;
    final kik.a.d.a.a b;
    final s c;
    final bf d;

    bp(bf bf1, bf.b b1, kik.a.d.a.a a1, s s1)
    {
        d = bf1;
        a = b1;
        b = a1;
        c = s1;
        super();
    }

    public final void a(int i)
    {
        while (!kik.android.i.b.a(a.y.getContext(), d.h.c(b.o()), d.g) || a.n != i || a.x.d() || d.a != null && !d.a.z) 
        {
            return;
        }
        a.z = true;
        ak ak1 = a.x;
        a.u.setOnClickListener(new bq(this, ak1));
        com.kik.view.adapters.bf.a(d, c, b, a);
    }

    public final void b(int i)
    {
        while (!kik.android.i.b.a(a.y.getContext(), d.g) || a.n != i || d.h.c(b.o())) 
        {
            return;
        }
        d.h.b(b, c.o(), null, d.e);
    }
}
