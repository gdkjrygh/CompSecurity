// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.a;

import com.google.android.apps.gsa.a.c.a;
import com.google.f.e.l;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.gsa.a.a:
//            d

public final class c extends a
{

    private final d b;

    public c(Future future, com.google.f.e.c c1, String s, String s1, d d1)
    {
        super(future, c1, s, s1);
        b = d1;
    }

    protected final l a()
    {
        l l = super.a();
        b.a(l);
        return l;
    }
}
