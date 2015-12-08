// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.internal.nz;
import com.google.android.gms.internal.ok;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public final class PersonBuffer extends DataBuffer
{

    private final e anJ;

    public PersonBuffer(DataHolder dataholder)
    {
        super(dataholder);
        if (dataholder.gy() != null && dataholder.gy().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false))
        {
            anJ = new e(dataholder, nz.CREATOR);
            return;
        } else
        {
            anJ = null;
            return;
        }
    }

    public Person get(int i)
    {
        if (anJ != null)
        {
            return (Person)anJ.aq(i);
        } else
        {
            return new ok(II, i);
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
