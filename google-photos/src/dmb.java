// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class dmb
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dmc();
    final int a;
    final List b;
    public final List c;

    public dmb(int i, List list)
    {
        b = new ArrayList();
        c = new ArrayList();
        a = i;
        b.addAll(list);
    }

    dmb(Parcel parcel)
    {
        b = new ArrayList();
        c = new ArrayList();
        a = parcel.readInt();
        parcel.readStringList(b);
        parcel.readStringList(c);
    }

    public final ekf a(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    public final String a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final List a(String s)
    {
        ArrayList arraylist = new ArrayList(b.size() + c.size());
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.add(djf.a((String)iterator.next()))) { }
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); arraylist.add(djf.a((String)iterator1.next(), s))) { }
        return arraylist;
    }

    public final ekf b(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    public int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return null;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dmb)
        {
            obj = (dmb)obj;
            flag = flag1;
            if (a == ((dmb) (obj)).a)
            {
                flag = flag1;
                if (b.equals(((dmb) (obj)).b))
                {
                    flag = flag1;
                    if (c.equals(((dmb) (obj)).c))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, Integer.valueOf(Arrays.hashCode(new Object[] {
                b, Integer.valueOf(17 + a * 31)
            }))
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeStringList(b);
        parcel.writeStringList(c);
    }

}
