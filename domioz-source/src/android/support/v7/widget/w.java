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

final class w extends ab
{

    final bv a;
    final int b;
    final int c;
    final cy d;
    final q e;

    w(q q1, bv bv, int i, int j, cy cy1)
    {
        e = q1;
        a = bv;
        b = i;
        c = j;
        d = cy1;
        super((byte)0);
    }

    public final void a(View view)
    {
    }

    public final void b(View view)
    {
        d.a(null);
        e.e(a);
        q.g(e).remove(a);
        q.e(e);
    }

    public final void c(View view)
    {
        if (b != 0)
        {
            bp.a(view, 0.0F);
        }
        if (c != 0)
        {
            bp.b(view, 0.0F);
        }
    }
}
