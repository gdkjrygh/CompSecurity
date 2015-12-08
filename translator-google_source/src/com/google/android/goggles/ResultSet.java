// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.bionics.goggles.api2.o;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.goggles:
//            b

public class ResultSet
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private int a;
    private List b;
    private ArrayList c;
    private int d;
    private String e;

    public ResultSet()
    {
        b = Collections.EMPTY_LIST;
        c = new ArrayList();
        a = -1;
        d = 0;
    }

    ResultSet(Parcel parcel)
    {
        a = parcel.readInt();
        b = a(parcel);
        c = a(parcel);
        d = parcel.readInt();
        e = parcel.readString();
    }

    private static ArrayList a(Parcel parcel)
    {
        int j = parcel.readInt();
        ArrayList arraylist = new ArrayList(j);
        int i = 0;
        while (i < j) 
        {
            o o1 = new o();
            try
            {
                g.mergeFrom(o1, parcel.createByteArray());
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception) { }
            arraylist.add(o1);
            i++;
        }
        return arraylist;
    }

    private static void a(Parcel parcel, List list)
    {
        parcel.writeInt(list.size());
        for (list = list.iterator(); list.hasNext(); parcel.writeByteArray(g.toByteArray((o)list.next()))) { }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        a(parcel, b);
        a(parcel, c);
        parcel.writeInt(d);
        parcel.writeString(e);
    }

}
