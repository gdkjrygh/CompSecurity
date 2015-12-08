// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device;

import com.samsung.multiscreen.a.a;

// Referenced classes of package com.samsung.multiscreen.device:
//            f, e, c, g

final class d
    implements f
{

    final c a;

    d(c c)
    {
        a = c;
        super();
    }

    public final void onError(g g)
    {
    }

    public final void onResult(Object obj)
    {
        ((a)obj).a(new e(this));
    }
}
