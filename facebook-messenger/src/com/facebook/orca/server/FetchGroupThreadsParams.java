// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.n;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.server:
//            i, j, k

public class FetchGroupThreadsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final j a;
    private final int b;
    private final String c;

    private FetchGroupThreadsParams(Parcel parcel)
    {
        a = j.valueOf(parcel.readString());
        b = parcel.readInt();
        c = parcel.readString();
        d();
    }

    FetchGroupThreadsParams(Parcel parcel, i l)
    {
        this(parcel);
    }

    FetchGroupThreadsParams(k k1)
    {
        a = k1.a();
        b = k1.b();
        c = k1.c();
        d();
    }

    private void d()
    {
        Preconditions.checkNotNull(a);
        boolean flag;
        if (a != j.TOP_RANKED || n.c(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
    }

    public static k newBuilder()
    {
        return new k();
    }

    public j a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeString(a.name());
        parcel.writeInt(b);
        parcel.writeString(c);
    }

}
