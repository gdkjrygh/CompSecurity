// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.internal:
//            ia, ib

private static final class l.o.b extends ia
{

    private final com.google.android.gms.common.api.mplementation.b De;

    public void e(int i, int j)
    {
        Status status = new Status(i);
        De.b(new <init>(status, j));
    }

    public ementation.b(com.google.android.gms.common.api.mplementation.b b)
    {
        De = (com.google.android.gms.common.api.mplementation.b)o.b(b, "Result holder must not be null");
    }
}
