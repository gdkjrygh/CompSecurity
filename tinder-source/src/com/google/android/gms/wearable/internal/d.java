// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.wearable.h;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            b

public final class d extends f
    implements h
{

    public d(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public final Object a()
    {
        return new b(this);
    }

    public final String b()
    {
        return c("asset_id");
    }

    public final String c()
    {
        return c("asset_key");
    }
}
