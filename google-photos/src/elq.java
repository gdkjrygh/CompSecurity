// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class elq
    implements elm
{

    public static final android.os.Parcelable.Creator CREATOR = new elr();
    private final Map b;

    public elq()
    {
        b = new jk();
    }

    public elq(Parcel parcel)
    {
        b = new jk();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            Class class1 = (Class)parcel.readSerializable();
            ekf ekf1 = (ekf)parcel.readParcelable(ekf.getClassLoader());
            b.put(class1, ekf1);
        }

    }

    public final ekf a(Class class1)
    {
        ekf ekf1 = b(class1);
        if (ekf1 == null)
        {
            throw new ekh(class1);
        } else
        {
            return ekf1;
        }
    }

    public final void a(Class class1, ekf ekf1)
    {
        b.put(class1, ekf1);
    }

    public final ekf b(Class class1)
    {
        return (ekf)b.get(class1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return Arrays.toString(b.values().toArray(new ekf[b.size()]));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(b.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); parcel.writeParcelable((Parcelable)entry.getValue(), i))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeSerializable((Serializable)entry.getKey());
        }

    }

}
