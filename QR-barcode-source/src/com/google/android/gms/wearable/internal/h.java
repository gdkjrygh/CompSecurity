// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            o, g

public final class h extends d
    implements DataEvent
{

    private final int aaK;

    public h(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        aaK = j;
    }

    public Object freeze()
    {
        return pW();
    }

    public DataItem getDataItem()
    {
        return new o(II, JX, aaK);
    }

    public int getType()
    {
        return getInteger("event_type");
    }

    public DataEvent pW()
    {
        return new g(this);
    }
}
