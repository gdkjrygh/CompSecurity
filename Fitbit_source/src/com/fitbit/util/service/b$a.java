// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import android.os.Bundle;

// Referenced classes of package com.fitbit.util.service:
//            d, b, c

public static class a
    implements d
{

    private final a a;

    public void a(c c1, int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            a.b();
            return;

        case 2: // '\002'
            a.a();
            c1.k();
            return;

        case 0: // '\0'
            a.a((Exception)bundle.get("exception"));
            c1.k();
            return;
        }
    }

    public eption(eption eption)
    {
        a = eption;
    }
}
