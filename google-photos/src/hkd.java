// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Parcel;
import android.text.format.DateUtils;

public final class hkd
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hke();
    public final long a;
    private final long b;
    private final boolean c;

    public hkd(long l, long l1, boolean flag)
    {
        b = l;
        a = l1;
        c = flag;
    }

    hkd(Parcel parcel)
    {
        b = parcel.readLong();
        a = parcel.readLong();
        c = b.c(parcel);
    }

    public final String a(Context context)
    {
        if (c)
        {
            return DateUtils.formatDateRange(context, b, a, 0x10000);
        } else
        {
            return "";
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(b);
        parcel.writeLong(a);
        b.a(parcel, c);
    }

}
