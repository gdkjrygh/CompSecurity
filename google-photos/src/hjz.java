// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class hjz
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hka();
    public final List a;
    public final int b;

    hjz(Parcel parcel)
    {
        a = parcel.createTypedArrayList(diy.CREATOR);
        b = parcel.readInt();
    }

    public hjz(List list, int i)
    {
        p.b(list, "recipients must be non-null");
        a = new ArrayList(list);
        b = i;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(a);
        parcel.writeInt(b);
    }

}
