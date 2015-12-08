// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.bp;
import android.support.v4.view.cy;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            ab, z, q

final class y extends ab
{

    final z a;
    final cy b;
    final View c;
    final q d;

    y(q q1, z z1, cy cy1, View view)
    {
        d = q1;
        a = z1;
        b = cy1;
        c = view;
        super((byte)0);
    }

    public final void a(View view)
    {
    }

    public final void b(View view)
    {
        b.a(null);
        bp.c(c, 1.0F);
        bp.a(c, 0.0F);
        bp.b(c, 0.0F);
        d.g(a.b);
        q.h(d).remove(a.b);
        q.e(d);
    }
}
