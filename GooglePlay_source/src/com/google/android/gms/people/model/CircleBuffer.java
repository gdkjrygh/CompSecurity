// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.CircleRef;

// Referenced classes of package com.google.android.gms.people.model:
//            DataBufferWithSyncInfo, Circle

public final class CircleBuffer extends DataBufferWithSyncInfo
{

    public CircleBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public final Circle get(int i)
    {
        return new CircleRef(mDataHolder, i, getMetadata());
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }

    public final String toString()
    {
        return (new StringBuilder("Circles:size=")).append(getCount()).toString();
    }
}
