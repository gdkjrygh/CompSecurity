// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.service.s;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.server:
//            x, y

public class FetchThreadListParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new x();
    private final s a;
    private final FolderName b;
    private final long c;
    private final int d;
    private final boolean e;

    private FetchThreadListParams(Parcel parcel)
    {
        a = s.valueOf(parcel.readString());
        b = (FolderName)parcel.readParcelable(com/facebook/orca/threads/FolderName.getClassLoader());
        c = parcel.readLong();
        d = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }

    FetchThreadListParams(Parcel parcel, x x1)
    {
        this(parcel);
    }

    FetchThreadListParams(y y1)
    {
        a = y1.a();
        b = y1.b();
        c = y1.c();
        d = y1.d();
        e = y1.e();
    }

    public static y newBuilder()
    {
        return new y();
    }

    public s a()
    {
        return a;
    }

    public FolderName b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        parcel.writeParcelable(b, i);
        parcel.writeLong(c);
        parcel.writeInt(d);
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
