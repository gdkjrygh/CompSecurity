// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.a.ev;

// Referenced classes of package com.facebook.orca.server:
//            r

public class FetchMoreThreadsResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new r();
    private final FolderName a;
    private final ThreadsCollection b;
    private final es c;
    private final ev d;

    private FetchMoreThreadsResult(Parcel parcel)
    {
        super(parcel);
        a = (FolderName)parcel.readParcelable(com/facebook/orca/threads/FolderName.getClassLoader());
        b = (ThreadsCollection)parcel.readParcelable(com/facebook/orca/threads/ThreadsCollection.getClassLoader());
        c = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
        d = (ev)parcel.readSerializable();
    }

    FetchMoreThreadsResult(Parcel parcel, r r1)
    {
        this(parcel);
    }

    public FetchMoreThreadsResult(b b1, FolderName foldername, ThreadsCollection threadscollection, es es1, long l)
    {
        super(b1, l);
        a = foldername;
        b = threadscollection;
        c = es1;
        d = null;
    }

    public FetchMoreThreadsResult(b b1, FolderName foldername, ThreadsCollection threadscollection, es es1, long l, ev ev1)
    {
        super(b1, l);
        a = foldername;
        b = threadscollection;
        c = es1;
        d = ev1;
    }

    public FolderName a()
    {
        return a;
    }

    public ThreadsCollection b()
    {
        return b;
    }

    public es c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
        parcel.writeList(c);
        parcel.writeSerializable(d);
    }

}
