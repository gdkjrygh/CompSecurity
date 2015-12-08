// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class iqs
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new iqt();
    HashSet a;
    HashSet b;
    int c;
    int d;
    boolean e;

    public iqs()
    {
        a = new HashSet();
        b = new HashSet();
    }

    iqs(Parcel parcel)
    {
        a = new HashSet();
        b(parcel, a);
        b = new HashSet();
        b(parcel, b);
    }

    private static void a(Parcel parcel, HashSet hashset)
    {
        parcel.writeInt(hashset.size());
        for (hashset = hashset.iterator(); hashset.hasNext(); parcel.writeParcelable(new mvf(((iqu)hashset.next()).a), 0)) { }
    }

    private static void b(Parcel parcel, HashSet hashset)
    {
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            hashset.add(new iqu((pex)((mvf)parcel.readParcelable(mvf.getClassLoader())).a(new pex())));
        }

    }

    public final Collection a(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        if (flag)
        {
            obj = b;
        } else
        {
            obj = a;
        }
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((iqu)((Iterator) (obj)).next()).a)) { }
        return arraylist;
    }

    public final void a(int i)
    {
        c = i;
        if (c >= 5)
        {
            e = true;
        }
    }

    public final boolean a(iqm iqm1)
    {
        iqu iqu1 = new iqu(iqm1.c());
        if (a.contains(iqu1))
        {
            return true;
        }
        if (b.contains(iqu1))
        {
            return false;
        } else
        {
            return iqm1.a();
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a(parcel, a);
        a(parcel, b);
    }

}
