// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.internal.ks;
import com.google.android.gms.internal.ld;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public final class PersonBuffer extends DataBuffer
{

    private final e adZ;

    public PersonBuffer(DataHolder dataholder)
    {
        super(dataholder);
        if (dataholder.eU() != null && dataholder.eU().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false))
        {
            adZ = new e(dataholder, ks.CREATOR);
            return;
        } else
        {
            adZ = null;
            return;
        }
    }

    public Person get(int i)
    {
        if (adZ != null)
        {
            return (Person)adZ.ad(i);
        } else
        {
            return new ld(DG, i);
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
