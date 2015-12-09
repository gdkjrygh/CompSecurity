// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.rj;

// Referenced classes of package com.google.android.gms.people.model:
//            Owner

public final class OwnerBuffer extends DataBuffer
{

    public OwnerBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    private Owner get(int i)
    {
        return new rj(mDataHolder, i);
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
