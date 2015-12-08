// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import com.google.android.m4b.maps.g.a;

// Referenced classes of package com.google.android.m4b.maps.j:
//            l

public final class a
    implements com.google.android.m4b.maps.h.a
{

    private l a;

    public final void a(a a1)
    {
        if (a1.b())
        {
            a.a(null, l.d(a));
        } else
        if (l.e(a) != null)
        {
            l.e(a).a(a1);
            return;
        }
    }

    public final void b(a a1)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }

    public (l l1)
    {
        a = l1;
        super();
    }
}
