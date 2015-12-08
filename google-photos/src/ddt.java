// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ddt
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ddu();
    public final Map a;
    private final ClassLoader b;

    public ddt()
    {
        a = new HashMap();
        b = getClass().getClassLoader();
    }

    public ddt(Parcel parcel)
    {
        a = new HashMap();
        b = getClass().getClassLoader();
        int j = parcel.readInt();
        int i = 0;
        while (i < j) 
        {
            Parcelable parcelable = parcel.readParcelable(b);
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a.put(parcelable, Boolean.valueOf(flag));
            i++;
        }
    }

    public ddt(Map map)
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
        Iterator iterator = a.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            parcel.writeParcelable((Parcelable)entry.getKey(), 0);
            if (((Boolean)entry.getValue()).booleanValue())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
        }
    }

}
