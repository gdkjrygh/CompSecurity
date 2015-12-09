// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.b:
//            f

public static class d extends d
{

    private final Enum c;
    private final String d;

    public void b(Parcel parcel)
    {
        parcel.writeInt(c.ordinal());
    }

    public (Enum enum)
    {
        super(enum.getClass());
        c = enum;
        d = enum.name();
    }
}
