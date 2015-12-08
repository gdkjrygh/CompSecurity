// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class wJ extends com.google.android.gms.internal.
{

    final e Ud;
    private final Status wJ;

    protected void a(Object obj)
    {
        c((com.google.android.gms.common.api.)obj);
    }

    protected void c(com.google.android.gms.common.api..h h1)
    {
        Ud.disconnect();
        if (h1 != null)
        {
            h1.b(wJ);
        }
    }

    protected void dx()
    {
    }

    public (e e1, com.google.android.gms.common.api. , Status status)
    {
        Ud = e1;
        super(e1, );
        wJ = status;
    }
}
