// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class jgj
    implements jgi
{

    public static final android.os.Parcelable.Creator CREATOR = new jgk();
    private final float a;
    private final float b;

    public jgj(float f, float f1)
    {
        a = f;
        b = f1;
    }

    jgj(Parcel parcel)
    {
        a = parcel.readFloat();
        b = parcel.readFloat();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final float r()
    {
        return a;
    }

    public final float s()
    {
        return b;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(a);
        parcel.writeFloat(b);
    }

}
