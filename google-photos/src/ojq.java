// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class ojq extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new ojr();
    private final ojm a;
    private final float b[];

    ojq(Parcel parcel)
    {
        super(parcel);
        a = ojm.valueOf(parcel.readString());
        b = parcel.createFloatArray();
    }

    public ojq(Parcelable parcelable, ojm ojm1, float af[])
    {
        super(parcelable);
        a = ojm1;
        b = af;
    }

    public static ojm a(ojq ojq1)
    {
        return ojq1.a;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a.toString());
        parcel.writeFloatArray(b);
    }

}
