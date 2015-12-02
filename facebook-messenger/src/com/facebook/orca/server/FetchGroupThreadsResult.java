// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.server:
//            l, m

public class FetchGroupThreadsResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    private final ThreadsCollection a;
    private final es b;
    private final es c;
    private final es d;
    private final boolean e;
    private final long f;
    private final ServiceException g;

    private FetchGroupThreadsResult(Parcel parcel)
    {
        super(parcel);
        a = (ThreadsCollection)parcel.readParcelable(com/facebook/orca/threads/ThreadsCollection.getClassLoader());
        b = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
        c = es.a(parcel.createStringArrayList());
        d = es.a(parcel.createStringArrayList());
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        f = parcel.readLong();
        g = (ServiceException)parcel.readParcelable(com/facebook/fbservice/service/ServiceException.getClassLoader());
    }

    FetchGroupThreadsResult(Parcel parcel, l l1)
    {
        this(parcel);
    }

    FetchGroupThreadsResult(m m1)
    {
        super(m1.a(), m1.g());
        Preconditions.checkNotNull(m1.a());
        a = m1.b();
        b = es.a(m1.c());
        c = es.a(m1.d());
        d = es.a(m1.e());
        e = m1.f();
        f = m1.h();
        g = m1.i();
    }

    public static m newBuilder()
    {
        return new m();
    }

    public ThreadsCollection a()
    {
        return a;
    }

    public es b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(a, i);
        parcel.writeList(b);
        parcel.writeStringList(c);
        parcel.writeStringList(d);
        int j;
        if (e)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeLong(f);
        parcel.writeParcelable(g, i);
    }

}
