// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzac, zzv

public final class zzw extends zzc
    implements DataEvent
{

    private final int c;

    public zzw(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        c = j;
    }

    public Object a()
    {
        return d();
    }

    public DataItem b()
    {
        return new zzac(a, b, c);
    }

    public int c()
    {
        return b("event_type");
    }

    public DataEvent d()
    {
        return new zzv(this);
    }

    public String toString()
    {
        String s;
        if (c() == 1)
        {
            s = "changed";
        } else
        if (c() == 2)
        {
            s = "deleted";
        } else
        {
            s = "unknown";
        }
        return (new StringBuilder()).append("DataEventRef{ type=").append(s).append(", dataitem=").append(b()).append(" }").toString();
    }
}
