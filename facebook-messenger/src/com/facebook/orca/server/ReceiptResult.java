// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.orca.threads.ThreadSummary;

// Referenced classes of package com.facebook.orca.server:
//            as

public class ReceiptResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new as();
    private ThreadSummary a;

    public ReceiptResult(Parcel parcel)
    {
        super(parcel);
        a = (ThreadSummary)parcel.readParcelable(com/facebook/orca/threads/ThreadSummary.getClassLoader());
    }

    public ReceiptResult(b b, ThreadSummary threadsummary, long l)
    {
        super(b, l);
        a = threadsummary;
    }

    public ThreadSummary a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(a, i);
    }

}
