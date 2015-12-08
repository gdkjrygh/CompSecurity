// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;
import com.google.android.gms.wearable.a;
import com.google.android.gms.wearable.c;

// Referenced classes of package com.google.android.gms.internal:
//            kg, kb

public final class kc extends b
    implements a
{

    private final int LE;

    public kc(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        LE = j;
    }

    public Object freeze()
    {
        return me();
    }

    public int getType()
    {
        return getInteger("event_type");
    }

    public c lZ()
    {
        return new kg(BB, BD, LE);
    }

    public a me()
    {
        return new kb(this);
    }
}
