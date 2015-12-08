// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.OwnerRef;

// Referenced classes of package com.google.android.gms.people.model:
//            Owner

public final class OwnerBuffer extends AbstractDataBuffer
{

    public OwnerBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public final Owner get(int i)
    {
        return new OwnerRef(mDataHolder, i);
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }

    public final String toString()
    {
        return (new StringBuilder("Owner:size=")).append(getCount()).toString();
    }
}
