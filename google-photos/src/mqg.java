// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class mqg
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mqh();
    final Map a;

    public mqg()
    {
        a = new HashMap();
    }

    public mqg(Parcel parcel)
    {
        a = new HashMap();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            int k = parcel.readInt();
            int l = parcel.readInt();
            a.put(Integer.valueOf(k), Integer.valueOf(l));
        }

    }

    public final Integer a(Integer integer)
    {
        return (Integer)a.get(integer);
    }

    public final Set a()
    {
        return a.keySet();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); parcel.writeInt(((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeInt(((Integer)entry.getKey()).intValue());
        }

    }

}
