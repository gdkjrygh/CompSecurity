// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.User;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.server:
//            ad

public class FetchThreadResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ad();
    public static final FetchThreadResult a;
    private final ThreadSummary b;
    private final MessagesCollection c;
    private final es d;
    private final User e;

    private FetchThreadResult(Parcel parcel)
    {
        super(parcel);
        b = (ThreadSummary)parcel.readParcelable(com/facebook/orca/threads/ThreadSummary.getClassLoader());
        c = (MessagesCollection)parcel.readParcelable(com/facebook/orca/threads/MessagesCollection.getClassLoader());
        d = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
        e = (User)parcel.readParcelable(com/facebook/user/User.getClassLoader());
    }

    FetchThreadResult(Parcel parcel, ad ad1)
    {
        this(parcel);
    }

    public FetchThreadResult(b b1, FetchThreadResult fetchthreadresult)
    {
        this(b1, fetchthreadresult.a(), fetchthreadresult.b(), fetchthreadresult.c(), fetchthreadresult.d(), fetchthreadresult.f());
    }

    public FetchThreadResult(b b1, ThreadSummary threadsummary, MessagesCollection messagescollection, es es1, User user, long l)
    {
        super(b1, l);
        b = threadsummary;
        c = messagescollection;
        d = es1;
        e = user;
    }

    public ThreadSummary a()
    {
        return b;
    }

    public MessagesCollection b()
    {
        return c;
    }

    public es c()
    {
        return d;
    }

    public User d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
        parcel.writeList(d);
        parcel.writeParcelable(e, i);
    }

    static 
    {
        a = new FetchThreadResult(b.NO_DATA, null, null, es.d(), null, -1L);
    }
}
