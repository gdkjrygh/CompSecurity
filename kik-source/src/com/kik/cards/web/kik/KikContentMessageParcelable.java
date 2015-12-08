// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.kik;

import android.os.Parcel;
import android.os.Parcelable;
import com.kik.f.a.a.a;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.kik.cards.web.kik:
//            a

public class KikContentMessageParcelable
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.kik.cards.web.kik.a();
    public String a;
    public String b;
    public String c;
    public String d;
    public final ArrayList e;
    public final Hashtable f;
    public final Hashtable g;

    private KikContentMessageParcelable(Parcel parcel)
    {
        boolean flag = false;
        super();
        e = new ArrayList();
        f = new Hashtable();
        g = new Hashtable();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        a = parcel.readString();
        int l = parcel.readInt();
        for (int i = 0; i < l; i++)
        {
            String s = parcel.readString();
            String s3 = parcel.readString();
            f.put(s, s3);
        }

        l = parcel.readInt();
        for (int j = 0; j < l; j++)
        {
            String s1 = parcel.readString();
            String s4 = parcel.readString();
            g.put(s1, s4);
        }

        l = parcel.readInt();
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            Object obj = parcel.readString();
            String s8 = parcel.readString();
            String s2 = parcel.readString();
            String s5 = parcel.readString();
            String s6 = parcel.readString();
            String s7 = parcel.readString();
            obj = new a(((String) (obj)), s8);
            ((a) (obj)).a(s2);
            ((a) (obj)).b(s5);
            ((a) (obj)).c(s6);
            ((a) (obj)).d(s7);
            e.add(obj);
        }

    }

    KikContentMessageParcelable(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public KikContentMessageParcelable(kik.a.d.a.a a1, String s)
    {
        e = new ArrayList();
        f = new Hashtable();
        g = new Hashtable();
        b = a1.o();
        c = a1.u();
        d = a1.p();
        a = s;
        e.addAll(a1.f());
        g.putAll(a1.r());
        f.putAll(a1.q());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(a);
        parcel.writeInt(f.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = f.entrySet().iterator(); iterator.hasNext(); parcel.writeString((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeString((String)entry.getKey());
        }

        parcel.writeInt(g.size());
        java.util.Map.Entry entry1;
        for (Iterator iterator1 = g.entrySet().iterator(); iterator1.hasNext(); parcel.writeString((String)entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
            parcel.writeString((String)entry1.getKey());
        }

        parcel.writeInt(e.size());
        a a1;
        for (Iterator iterator2 = e.iterator(); iterator2.hasNext(); parcel.writeString(a1.g()))
        {
            a1 = (a)iterator2.next();
            parcel.writeString(a1.f());
            parcel.writeString(a1.h());
            parcel.writeString(a1.c());
            parcel.writeString(a1.d());
            parcel.writeString(a1.e());
        }

    }

}
