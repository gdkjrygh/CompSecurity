// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.internal.kt;
import com.google.android.gms.internal.le;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public final class PersonBuffer extends DataBuffer
{

    private final e adW;

    public PersonBuffer(DataHolder dataholder)
    {
        super(dataholder);
        if (dataholder.eP() != null && dataholder.eP().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false))
        {
            adW = new e(dataholder, kt.CREATOR);
            return;
        } else
        {
            adW = null;
            return;
        }
    }

    public Person get(int i)
    {
        if (adW != null)
        {
            return (Person)adW.ad(i);
        } else
        {
            return new le(DD, i);
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
