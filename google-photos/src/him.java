// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class him
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hin();
    public final List a;

    him(Parcel parcel)
    {
        a = new ArrayList();
        parcel.readList(a, getClass().getClassLoader());
    }

    public him(List list)
    {
        a = list;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(a);
    }

}
