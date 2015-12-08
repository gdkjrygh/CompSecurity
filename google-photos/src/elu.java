// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class elu
    implements elt
{

    public static final android.os.Parcelable.Creator CREATOR = new elv();
    private final gap a;

    public elu(Parcel parcel)
    {
        a = (gap)parcel.readParcelable(gap.getClassLoader());
    }

    public elu(gap gap1)
    {
        a = gap1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final gap e()
    {
        return a;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }

}
