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

final class x extends ab
{

    final z a;
    final cy b;
    final q c;

    x(q q1, z z1, cy cy1)
    {
        c = q1;
        a = z1;
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
        bp.a(view, 0.0F);
        bp.b(view, 0.0F);
        c.g(a.a);
        q.h(c).remove(a.a);
        q.e(c);
    }
}
