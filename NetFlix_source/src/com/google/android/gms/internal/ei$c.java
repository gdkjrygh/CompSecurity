// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.internal:
//            eh, ei, fq

final class  extends eh
{

    private final com.google.android.gms.common.api.s wH;
    final ei wI;

    public void a(DataHolder dataholder)
    {
        Status status = new Status(dataholder.getStatusCode());
        wI.a(new <init>(wI, wH, status, dataholder));
    }

    public (ei ei1, com.google.android.gms.common.api.r r)
    {
        wI = ei1;
        super();
        wH = (com.google.android.gms.common.api.)fq.b(r, "Result holder must not be null");
    }
}
