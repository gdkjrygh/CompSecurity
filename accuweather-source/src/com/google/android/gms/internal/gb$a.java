// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            ga, gb, hn

private static final class  extends ga
{

    private final com.google.android.gms.common.api.s yO;

    public void b(int i, int j)
    {
        Status status = new Status(i);
        yO.(new <init>(status, j));
    }

    public (com.google.android.gms.common.api.s s)
    {
        yO = (com.google.android.gms.common.api.)hn.b(s, "Result holder must not be null");
    }
}
