// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.c;

import com.google.common.base.p;
import com.google.f.e.l;

// Referenced classes of package com.google.android.apps.gsa.a.c:
//            d

public abstract class c
    implements d
{

    private boolean a;

    public c()
    {
    }

    public abstract l a();

    public final l b()
    {
        if (a)
        {
            return null;
        } else
        {
            a = true;
            return (l)p.a(a());
        }
    }

    public void close()
    {
        a = true;
    }
}
