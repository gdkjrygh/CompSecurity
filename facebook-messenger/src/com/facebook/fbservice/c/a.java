// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.c;

import android.os.Parcel;

// Referenced classes of package com.facebook.fbservice.c:
//            b

public class a
{

    private final long clientTimeMs;
    private final b freshness;

    protected a(Parcel parcel)
    {
        freshness = (b)parcel.readSerializable();
        clientTimeMs = parcel.readLong();
    }

    protected a(b b1, long l)
    {
        freshness = b1;
        clientTimeMs = l;
    }

    public b e()
    {
        return freshness;
    }

    public long f()
    {
        return clientTimeMs;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(e());
        parcel.writeLong(clientTimeMs);
    }
}
