// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class hzj
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hzk();
    public final Set a;

    public hzj()
    {
        a = new HashSet();
    }

    public hzj(Parcel parcel)
    {
        int j = parcel.readInt();
        a = new HashSet(j);
        for (int i = 0; i < j; i++)
        {
            ekp ekp1 = (ekp)parcel.readParcelable(ekp.getClassLoader());
            a.add(ekp1);
        }

    }

    public static Set a(hzj hzj1)
    {
        return hzj1.a;
    }

    public final Set a()
    {
        return Collections.unmodifiableSet(new HashSet(a));
    }

    public final void a(ekp ekp1)
    {
        a.add(ekp1);
    }

    public final void b(ekp ekp1)
    {
        a.remove(ekp1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.size());
        for (Iterator iterator = a.iterator(); iterator.hasNext(); parcel.writeParcelable((ekp)iterator.next(), i)) { }
    }

}
