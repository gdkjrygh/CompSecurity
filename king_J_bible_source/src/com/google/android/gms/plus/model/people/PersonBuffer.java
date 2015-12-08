// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.c;
import com.google.android.gms.internal.ih;
import com.google.android.gms.internal.is;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public final class PersonBuffer extends DataBuffer
{

    private final c Wr;

    public PersonBuffer(DataHolder dataholder)
    {
        super(dataholder);
        if (dataholder.getMetadata() != null && dataholder.getMetadata().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false))
        {
            Wr = new c(dataholder, ih.CREATOR);
            return;
        } else
        {
            Wr = null;
            return;
        }
    }

    public Person get(int i)
    {
        if (Wr != null)
        {
            return (Person)Wr.F(i);
        } else
        {
            return new is(BB, i);
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
