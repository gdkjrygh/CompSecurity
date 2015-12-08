// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class gtk
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new gtl();
    public final gum a;

    gtk(Parcel parcel)
    {
        a = (gum)parcel.readParcelable(gum.getClassLoader());
    }

    public gtk(gum gum1)
    {
        a = gum1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }

}
