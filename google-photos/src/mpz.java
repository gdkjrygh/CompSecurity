// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class mpz
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mqa();
    final Map a;
    private final Class b;

    public mpz(Parcel parcel)
    {
        a = new HashMap();
        b = a(parcel.readString());
        ClassLoader classloader = b.getClassLoader();
        int k = parcel.readInt();
        for (int i = 0; i < k; i++)
        {
            int l = parcel.readInt();
            int i1 = parcel.readInt();
            ArrayList arraylist = new ArrayList(i1);
            for (int j = 0; j < i1; j++)
            {
                arraylist.add(parcel.readParcelable(classloader));
            }

            a.put(Integer.valueOf(l), arraylist);
        }

    }

    public mpz(Class class1)
    {
        a = new HashMap();
        b = class1;
    }

    private static Class a(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b.getName());
        parcel.writeInt(a.size());
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (Integer)iterator.next();
            parcel.writeInt(((Integer) (obj)).intValue());
            obj = (List)a.get(obj);
            parcel.writeInt(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                parcel.writeParcelable((Parcelable)((Iterator) (obj)).next(), i);
            }
        }

    }

}
