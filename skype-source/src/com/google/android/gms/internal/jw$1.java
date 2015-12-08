// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.tagmanager.b;

// Referenced classes of package com.google.android.gms.internal:
//            jw, ju

final class a
    implements h
{

    final jw a;

    public final void onResult(g g)
    {
        g = (b)g;
        if (g.getStatus().d())
        {
            g = g.b();
        } else
        {
            g = null;
        }
        g = new ju(jw.a(a), g, a.a());
        jw.a(a, g.a());
        com.google.android.gms.internal.jw.b(a);
    }

    tus(jw jw1)
    {
        a = jw1;
        super();
    }
}
