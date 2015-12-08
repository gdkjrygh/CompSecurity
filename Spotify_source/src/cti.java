// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class cti extends brl
{

    private final int d;

    public cti(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        d = j;
    }

    public final String toString()
    {
        String s;
        if (a("event_type") == 1)
        {
            s = "changed";
        } else
        if (a("event_type") == 2)
        {
            s = "deleted";
        } else
        {
            s = "unknown";
        }
        return (new StringBuilder("DataEventRef{ type=")).append(s).append(", dataitem=").append(new cqv(a, b, d)).append(" }").toString();
    }
}
