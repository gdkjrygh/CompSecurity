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

    protected void g(Object obj)
    {
        m((com.google.android.gms.common.api.Implementation.b)obj);
    }

    protected void hx()
    {
    }

    protected void m(com.google.android.gms.common.api.Implementation.b b)
    {
        anJ.disconnect();
        if (b != null)
        {
            b.b(Eb);
        }
    }

    public ntation.b(e e1, com.google.android.gms.common.api.Implementation.b b, Status status)
    {
        anJ = e1;
        super(e1, b);
        Eb = status;
    }
}
