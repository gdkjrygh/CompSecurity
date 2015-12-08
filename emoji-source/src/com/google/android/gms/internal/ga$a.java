// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            fz, ga, hm

private static final class  extends fz
{

    private final com.google.android.gms.common.api.s yR;

    public void b(int i, int j)
    {
        Status status = new Status(i);
        yR.(new <init>(status, j));
    }

    public (com.google.android.gms.common.api.s s)
    {
        yR = (com.google.android.gms.common.api.)hm.b(s, "Result holder must not be null");
    }
}
