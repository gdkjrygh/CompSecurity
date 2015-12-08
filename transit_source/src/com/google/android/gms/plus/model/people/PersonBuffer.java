// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.c;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.gg;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public final class PersonBuffer extends DataBuffer
{

    private final c tt;

    public PersonBuffer(d d1)
    {
        super(d1);
        if (d1.aM() != null && d1.aM().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false))
        {
            tt = new c(d1, fv.CREATOR);
            return;
        } else
        {
            tt = null;
            return;
        }
    }

    public Person get(int i)
    {
        if (tt != null)
        {
            return (Person)tt.p(i);
        } else
        {
            return new gg(jf, i);
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
