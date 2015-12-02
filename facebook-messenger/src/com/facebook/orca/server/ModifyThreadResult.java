// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.User;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.server:
//            ao

public class ModifyThreadResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ao();
    private final ThreadSummary a;
    private final es b;

    private ModifyThreadResult(Parcel parcel)
    {
        super(parcel);
        a = (ThreadSummary)parcel.readParcelable(com/facebook/orca/threads/ThreadSummary.getClassLoader());
        b = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
    }

    ModifyThreadResult(Parcel parcel, ao ao1)
    {
        this(parcel);
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
    }

}
