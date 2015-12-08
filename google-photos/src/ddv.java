// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ddv
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ddw();
    public final Map a;
    private final ClassLoader b;

    public ddv()
    {
        a = new HashMap();
        b = getClass().getClassLoader();
    }

    public ddv(Parcel parcel)
    {
        a = new HashMap();
        b = getClass().getClassLoader();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            Parcelable parcelable = parcel.readParcelable(b);
            Parcelable parcelable1 = parcel.readParcelable(b);
            a.put(parcelable, parcelable1);
        }

    }

    public ddv(Map map)
    {
        a = new HashMap();
        b = getClass().getClassLoader();
        a.clear();
        a.putAll(map);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); parcel.writeParcelable((Parcelable)entry.getValue(), 0))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeParcelable((Parcelable)entry.getKey(), 0);
        }

    }

}
