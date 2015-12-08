// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.List;

public final class crb
    implements crd
{

    public static final android.os.Parcelable.Creator CREATOR = new crc();
    private final int a;
    private final int b;

    public crb(int i, int j)
    {
        a = i;
        b = j;
    }

    crb(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
    }

    public final void a(List list)
    {
        cnq cnq1 = (cnq)list.get(a);
        list.remove(a);
        list.add(b, cnq1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
    }

}
