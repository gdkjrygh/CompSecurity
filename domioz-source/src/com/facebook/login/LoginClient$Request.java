// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.bc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.login:
//            k, g, a

public class <init>
    implements Parcelable
{

    public static final android.os.Request.f CREATOR = new k();
    private final g a;
    private Set b;
    private final a c;
    private final String d;
    private final String e;
    private boolean f;

    final Set a()
    {
        return b;
    }

    final void a(Set set)
    {
        bc.a(set, "permissions");
        b = set;
    }

    final g b()
    {
        return a;
    }

    final a c()
    {
        return c;
    }

    final String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    final String e()
    {
        return e;
    }

    final boolean f()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        String s;
        if (a != null)
        {
            s = a.name();
        } else
        {
            s = null;
        }
        parcel.writeString(s);
        parcel.writeStringList(new ArrayList(b));
        s = obj;
        if (c != null)
        {
            s = c.name();
        }
        parcel.writeString(s);
        parcel.writeString(d);
        parcel.writeString(e);
        if (f)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }


    private (Parcel parcel)
    {
        Object obj1 = null;
        super();
        f = false;
        Object obj = parcel.readString();
        String s;
        boolean flag;
        if (obj != null)
        {
            obj = g.valueOf(((String) (obj)));
        } else
        {
            obj = null;
        }
        a = ((g) (obj));
        obj = new ArrayList();
        parcel.readStringList(((java.util.List) (obj)));
        b = new HashSet(((java.util.Collection) (obj)));
        s = parcel.readString();
        obj = obj1;
        if (s != null)
        {
            obj = com.facebook.login.a.valueOf(s);
        }
        c = ((a) (obj));
        d = parcel.readString();
        e = parcel.readString();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    f(Parcel parcel, byte byte0)
    {
        this(parcel);
    }
}
