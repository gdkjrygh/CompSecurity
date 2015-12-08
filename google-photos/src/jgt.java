// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class jgt extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new jgu();
    public int a;
    public int b;

    jgt(Parcel parcel)
    {
        super(parcel);
        a = parcel.readInt();
        b = parcel.readInt();
    }

    public jgt(Parcelable parcelable)
    {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(a);
        parcel.writeInt(b);
    }

}
