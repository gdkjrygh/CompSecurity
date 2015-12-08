// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            eh, ei, fq

final class  extends eh
{

    private final com.google.android.gms.common.api.s wH;
    final ei wI;

    public void b(int i, int j)
    {
        Status status = new Status(i);
        wI.a(new <init>(wI, wH, status, j));
    }

    public (ei ei1, com.google.android.gms.common.api.s s)
    {
        wI = ei1;
        super();
        wH = (com.google.android.gms.common.api.)fq.b(s, "Result holder must not be null");
    }
}
