// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class hyw
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hyx();
    public final Collection a;
    public boolean b;
    public boolean c;

    hyw(Parcel parcel)
    {
        c = a(parcel.readInt());
        b = a(parcel.readInt());
        a = new HashSet();
        parcel = parcel.readParcelableArray(ekp.getClassLoader());
        int j = parcel.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = parcel[i];
            a.add((ekp)obj);
        }

    }

    public hyw(Collection collection)
    {
        a = collection;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            euv euv1 = ((ekp)collection.next()).c();
            if (euv1 == euv.b)
            {
                c = true;
            } else
            if (euv1 == euv.c)
            {
                b = true;
            }
        } while (true);
    }

    private static int a(boolean flag)
    {
        return !flag ? 0 : 1;
    }

    private static boolean a(int i)
    {
        return i != 0;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a(c));
        parcel.writeInt(a(b));
        parcel.writeParcelableArray((ekp[])a.toArray(new ekp[a.size()]), i);
    }

}
