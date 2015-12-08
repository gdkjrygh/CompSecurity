// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.ImageView;
import com.roidapp.baselib.view.j;

// Referenced classes of package com.roidapp.photogrid.release:
//            c

final class g
    implements j
{

    final c a;

    g(c c1)
    {
        a = c1;
        super();
    }

    public final void a()
    {
    }

    public final void a(float f)
    {
        if (f == 0.0F)
        {
            c.e(a);
        }
    }

    public final void a(int i)
    {
        if (i == 1)
        {
            c.d(a).setVisibility(8);
        }
    }

    public final void b()
    {
        c.a(a, c.f(a));
    }
}
