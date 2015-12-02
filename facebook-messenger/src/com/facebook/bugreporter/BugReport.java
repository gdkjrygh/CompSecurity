// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.fi;
import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.facebook.bugreporter:
//            a, b

public class BugReport
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final Uri a;
    private final String b;
    private final Uri c;
    private final Uri d;
    private final ev e;
    private final ev f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    private BugReport(Parcel parcel)
    {
        a = (Uri)parcel.readParcelable(null);
        b = parcel.readString();
        c = (Uri)parcel.readParcelable(null);
        d = (Uri)parcel.readParcelable(null);
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readString();
        k = parcel.readString();
        l = parcel.readString();
        m = parcel.readString();
        n = parcel.readString();
        ew ew1 = ev.k();
        int k1 = parcel.readInt();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ew1.b(parcel.readString(), parcel.readString());
        }

        e = ew1.b();
        ew1 = ev.k();
        k1 = parcel.readInt();
        for (int j1 = 0; j1 < k1; j1++)
        {
            ew1.b(parcel.readString(), parcel.readString());
        }

        f = ew1.b();
    }

    BugReport(Parcel parcel, a a1)
    {
        this(parcel);
    }

    BugReport(b b1)
    {
        a = b1.a();
        b = b1.b();
        c = b1.c();
        d = b1.d();
        e = b1.e();
        f = b1.f();
        g = b1.g();
        h = b1.h();
        i = b1.i();
        j = b1.j();
        k = b1.k();
        l = b1.l();
        m = b1.m();
        n = b1.n();
        a(a, false);
        a(d, true);
        a(c, true);
        Preconditions.checkNotNull(g);
    }

    private void a(Uri uri, boolean flag)
    {
        if (!flag)
        {
            Preconditions.checkNotNull(uri);
        }
        if (uri != null)
        {
            Preconditions.checkArgument("file".equals(uri.getScheme()));
            Preconditions.checkArgument(uri.isAbsolute());
        }
    }

    public static b newBuilder()
    {
        return new b();
    }

    public Uri a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public Uri c()
    {
        return c;
    }

    public Uri d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public ev e()
    {
        return e;
    }

    public ev f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return j;
    }

    public String k()
    {
        return k;
    }

    public String l()
    {
        return l;
    }

    public String m()
    {
        return m;
    }

    public String n()
    {
        return n;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeParcelable(a, i1);
        parcel.writeString(b);
        parcel.writeParcelable(c, i1);
        parcel.writeParcelable(d, i1);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(j);
        parcel.writeString(k);
        parcel.writeString(l);
        parcel.writeString(m);
        parcel.writeString(n);
        parcel.writeInt(e.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = e.a().iterator(); iterator.hasNext(); parcel.writeString((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeString((String)entry.getKey());
        }

        parcel.writeInt(f.size());
        java.util.Map.Entry entry1;
        for (Iterator iterator1 = f.a().iterator(); iterator1.hasNext(); parcel.writeString((String)entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
            parcel.writeString((String)entry1.getKey());
        }

    }

}
