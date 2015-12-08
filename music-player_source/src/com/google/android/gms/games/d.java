// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;

// Referenced classes of package com.google.android.gms.games:
//            Player, g, PlayerEntity

public final class d extends e
    implements Player
{

    private final g c;

    public d(DataHolder dataholder, int l)
    {
        this(dataholder, l, null);
    }

    public d(DataHolder dataholder, int l, String s)
    {
        super(dataholder, l);
        c = new g(s);
    }

    private Player k()
    {
        return new PlayerEntity(this);
    }

    public final Object a()
    {
        return k();
    }

    public final String b()
    {
        return e(c.a);
    }

    public final String c()
    {
        return e(c.b);
    }

    public final Uri d()
    {
        return g(c.c);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return e(c.d);
    }

    public final boolean equals(Object obj)
    {
        return PlayerEntity.a(this, obj);
    }

    public final Uri f()
    {
        return g(c.e);
    }

    public final String g()
    {
        return e(c.f);
    }

    public final long h()
    {
        return b(c.g);
    }

    public final int hashCode()
    {
        return PlayerEntity.a(this);
    }

    public final long i()
    {
        if (!a_(c.i))
        {
            return -1L;
        } else
        {
            return b(c.i);
        }
    }

    public final int j()
    {
        return c(c.h);
    }

    public final String toString()
    {
        return PlayerEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        ((PlayerEntity)k()).writeToParcel(parcel, l);
    }
}
