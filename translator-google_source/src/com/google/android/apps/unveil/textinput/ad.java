// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import com.google.android.goggles.a;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            ac, ae

final class ad
    implements a
{

    boolean a;
    final ac b;
    private final long c;

    public ad(ac ac1, long l)
    {
        b = ac1;
        super();
        c = l;
    }

    private boolean a()
    {
        return c == b.f();
    }

    public final void b(List list)
    {
        a = true;
        if (!a() || b.a())
        {
            return;
        }
        if (list.isEmpty())
        {
            b.b.j();
            return;
        } else
        {
            b.a(list);
            return;
        }
    }

    public final void e()
    {
        a = true;
        if (a())
        {
            b.b.l();
        }
    }
}
