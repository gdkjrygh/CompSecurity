// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class yw extends com.google.android.gms.internal.
{

    final e abJ;
    private final Status yw;

    protected void d(Object obj)
    {
        n((com.google.android.gms.common.api.)obj);
    }

    protected void fp()
    {
    }

    protected void n(com.google.android.gms.common.api..h h1)
    {
        abJ.disconnect();
        if (h1 != null)
        {
            h1.a(yw);
        }
    }

    public (e e1, com.google.android.gms.common.api. , Status status)
    {
        abJ = e1;
        super(e1, );
        yw = status;
    }
}
