// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            a, aw, p

class it> extends a
{

    final aw avT;
    final com.google.android.gms.common.api.mplementation.b avV;

    public void a(p p1)
    {
        avV.b(new init>(new Status(p1.statusCode), p1.avw));
    }

    n.b(aw aw1, com.google.android.gms.common.api.mplementation.b b)
    {
        avT = aw1;
        avV = b;
        super();
    }
}
