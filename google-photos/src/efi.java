// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class efi
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new efj();
    private final eey a;
    private final Map b;

    efi(Parcel parcel)
    {
        a = (eey)parcel.readParcelable(eey.getClassLoader());
        int j = parcel.readInt();
        b = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            String s = parcel.readString();
            long l = parcel.readLong();
            b.put(s, Long.valueOf(l));
        }

    }

    public efi(eey eey1, Map map)
    {
        a = eey1;
        b = map;
    }

    static eey a(efi efi1)
    {
        return efi1.a;
    }

    static Map b(efi efi1)
    {
        return efi1.b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeInt(b.size());
        String s;
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); parcel.writeLong(((Long)b.get(s)).longValue()))
        {
            s = (String)iterator.next();
            parcel.writeString(s);
        }

    }

}
