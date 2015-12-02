// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.service.s;

// Referenced classes of package com.facebook.orca.server:
//            ab, ThreadCriteria, ac

public class FetchThreadParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    private final ThreadCriteria a;
    private final s b;
    private final s c;
    private final boolean d;
    private final long e;
    private final int f;
    private final long g;

    private FetchThreadParams(Parcel parcel)
    {
        a = (ThreadCriteria)parcel.readParcelable(com/facebook/orca/server/ThreadCriteria.getClassLoader());
        b = s.valueOf(parcel.readString());
        c = s.valueOf(parcel.readString());
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = parcel.readLong();
        f = parcel.readInt();
        g = parcel.readLong();
    }

    FetchThreadParams(Parcel parcel, ab ab1)
    {
        this(parcel);
    }

    FetchThreadParams(ac ac1)
    {
        a = ac1.a();
        b = ac1.b();
        c = ac1.c();
        d = ac1.d();
        e = ac1.e();
        f = ac1.f();
        g = ac1.g();
    }

    public static ac newBuilder()
    {
        return new ac();
    }

    public ThreadCriteria a()
    {
        return a;
    }

    public s b()
    {
        return b;
    }

    public s c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public long g()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeString(b.toString());
        parcel.writeString(c.toString());
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(e);
        parcel.writeInt(f);
        parcel.writeLong(g);
    }

}
