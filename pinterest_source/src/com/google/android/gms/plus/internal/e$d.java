// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class Eb extends com.google.android.gms.internal.
{

    private final Status Eb;
    final e anJ;

    protected final void g(Object obj)
    {
        m((com.google.android.gms.common.api.Implementation.b)obj);
    }

    protected final void hx()
    {
    }

    protected final void m(com.google.android.gms.common.api.Implementation.b b)
    {
        if (b != null)
        {
            b.b(Eb);
        }
    }

    public ntation.b(e e, com.google.android.gms.common.api.Implementation.b b, Status status)
    {
        anJ = e;
        super(e, b);
        Eb = status;
    }
}
