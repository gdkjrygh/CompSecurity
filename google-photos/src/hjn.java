// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class hjn
    implements Parcelable, ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hjo();
    public final boolean a;
    public final List b;

    hjn(Parcel parcel)
    {
        a = b.c(parcel);
        b = a(parcel);
    }

    public hjn(boolean flag, List list)
    {
        a = flag;
        b = list;
    }

    private static List a(Parcel parcel)
    {
        parcel = parcel.createIntArray();
        ArrayList arraylist = new ArrayList(parcel.length);
        int j = parcel.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(Integer.valueOf(parcel[i]));
        }

        return arraylist;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(parcel, a);
        List list = b;
        int ai[] = new int[list.size()];
        for (i = 0; i < list.size(); i++)
        {
            ai[i] = ((Integer)list.get(i)).intValue();
        }

        parcel.writeIntArray(ai);
    }

}
