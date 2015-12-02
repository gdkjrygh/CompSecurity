// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.server:
//            t, FetchThreadResult

public class FetchMultipleThreadsResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
    public static final FetchMultipleThreadsResult a = new FetchMultipleThreadsResult(es.d());
    private final es b;

    private FetchMultipleThreadsResult(Parcel parcel)
    {
        b = es.a(parcel.readArrayList(com/facebook/orca/server/FetchThreadResult.getClassLoader()));
    }

    FetchMultipleThreadsResult(Parcel parcel, t t1)
    {
        this(parcel);
    }

    public FetchMultipleThreadsResult(es es1)
    {
        boolean flag;
        if (es1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        b = es1;
    }

    public es a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(b);
    }

}
