// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.internal.pi;
import com.google.android.gms.internal.pt;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public final class PersonBuffer extends DataBuffer
{

    private final e apT;

    public PersonBuffer(DataHolder dataholder)
    {
        super(dataholder);
        if (dataholder.gV() != null && dataholder.gV().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false))
        {
            apT = new e(dataholder, pi.CREATOR);
            return;
        } else
        {
            apT = null;
            return;
        }
    }

    public Person get(int i)
    {
        if (apT != null)
        {
            return (Person)apT.at(i);
        } else
        {
            return new pt(JG, i);
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
