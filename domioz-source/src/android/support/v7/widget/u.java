// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.bp;
import android.support.v4.view.cy;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            ab, q, bv

final class u extends ab
{

    final bv a;
    final cy b;
    final q c;

    u(q q1, bv bv, cy cy1)
    {
        c = q1;
        a = bv;
        b = cy1;
        super((byte)0);
    }

    public final void a(View view)
    {
    }

    public final void b(View view)
    {
        b.a(null);
        bp.c(view, 1.0F);
        c.d(a);
        q.d(c).remove(a);
        q.e(c);
    }
}
