// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class epk
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new epl();
    public int a;
    public int b;
    public int c;
    private boolean d;

    public epk(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
        d = b.c(parcel);
    }

    epk(epm epm1)
    {
        a = epm1.a;
        b = epm1.b;
        c = epm1.c;
        d = epm1.d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        int i = a;
        int j = b;
        int k = c;
        boolean flag = d;
        return (new StringBuilder(123)).append("SourceConstraints {minMedia: ").append(i).append(", maxMedia: ").append(j).append(", maxDurationDays: ").append(k).append(", animatedMediaAllowed: ").append(flag).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        b.a(parcel, d);
    }

}
