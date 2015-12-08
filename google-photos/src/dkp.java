// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class dkp
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dkq();
    final int a;
    final Set b;

    public dkp(int i)
    {
        this(i, esm.e);
    }

    public dkp(int i, Set set)
    {
        a = i;
        b = set;
    }

    dkp(Parcel parcel)
    {
        a = parcel.readInt();
        Object obj = new ArrayList();
        parcel.readStringList(((List) (obj)));
        b = new HashSet();
        for (parcel = ((List) (obj)).iterator(); parcel.hasNext(); b.add(esm.valueOf(((String) (obj)))))
        {
            obj = (String)parcel.next();
        }

    }

    public final ekf a(Class class1)
    {
        throw new UnsupportedOperationException("Getting features is not supported");
    }

    public final String a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final ekf b(Class class1)
    {
        throw new UnsupportedOperationException("Getting features is not supported");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return null;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dkp)
        {
            obj = (dkp)obj;
            flag = flag1;
            if (a == ((dkp) (obj)).a)
            {
                flag = flag1;
                if (b.equals(((dkp) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(b, a + 527);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.add(((esm)iterator.next()).name())) { }
        parcel.writeStringList(arraylist);
    }

}
