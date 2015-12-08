// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.g;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            bj, g

public final class bk extends f
    implements e
{

    private final int c;

    public bk(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        c = j;
    }

    public final Object a()
    {
        return new bj(this);
    }

    public final g b()
    {
        return new com.google.android.gms.wearable.internal.g(a, b, c);
    }

    public final int c()
    {
        return b("event_type");
    }

    public final String toString()
    {
        String s;
        if (b("event_type") == 1)
        {
            s = "changed";
        } else
        if (b("event_type") == 2)
        {
            s = "deleted";
        } else
        {
            s = "unknown";
        }
        return (new StringBuilder("DataEventRef{ type=")).append(s).append(", dataitem=").append(b()).append(" }").toString();
    }
}
