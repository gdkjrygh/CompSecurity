// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.internal:
//            fz, ga, hm

private static final class  extends fz
{

    private final com.google.android.gms.common.api.Holder yR;

    public void a(DataHolder dataholder)
    {
        yR.(new <init>(dataholder));
    }

    public (com.google.android.gms.common.api.r r)
    {
        yR = (com.google.android.gms.common.api.)hm.b(r, "Result holder must not be null");
    }
}
