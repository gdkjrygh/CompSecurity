// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.kik;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.kik.cards.web.kik:
//            c

public class KikMessageParcelable
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public HashMap t;

    private KikMessageParcelable(Parcel parcel)
    {
        t = new HashMap();
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readString();
        k = parcel.readString();
        l = parcel.readString();
        m = parcel.readString();
        n = parcel.readString();
        int j1 = parcel.readInt();
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            t.put(s1, s2);
        }

        o = parcel.readString();
        p = parcel.readString();
        q = parcel.readString();
        r = parcel.readString();
        s = parcel.readString();
    }

    KikMessageParcelable(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public KikMessageParcelable(String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8, String s9, String s10, String s11, String s12, String s13, String s14, 
            String s15, String s16, String s17, String s18, String s19)
    {
        t = new HashMap();
        a = s1;
        b = s2;
        c = s3;
        d = s13;
        e = s4;
        f = s5;
        g = s6;
        h = s7;
        i = s8;
        j = s9;
        k = s10;
        l = s11;
        m = s12;
        n = s14;
        o = s15;
        p = s16;
        q = s17;
        r = s18;
        s = s19;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(j);
        parcel.writeString(k);
        parcel.writeString(l);
        parcel.writeString(m);
        parcel.writeString(n);
        parcel.writeInt(t.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = t.entrySet().iterator(); iterator.hasNext(); parcel.writeString((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeString((String)entry.getKey());
        }

        parcel.writeString(o);
        parcel.writeString(p);
        parcel.writeString(q);
        parcel.writeString(r);
        parcel.writeString(s);
    }

}
