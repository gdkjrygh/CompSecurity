// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.internal:
//            ga, gb, hn

private static final class  extends ga
{

    private final com.google.android.gms.common.api.Holder yO;

    public void a(DataHolder dataholder)
    {
        yO.(new <init>(dataholder));
    }

    public (com.google.android.gms.common.api.r r)
    {
        yO = (com.google.android.gms.common.api.)hn.b(r, "Result holder must not be null");
    }
}
