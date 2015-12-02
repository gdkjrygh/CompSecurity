// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync:
//            b, c

public class SyncQuickExperimentParams
    implements Parcelable
{

    public static android.os.Parcelable.Creator a = new b();
    private final String b;
    private final String c;
    private final String d;

    public SyncQuickExperimentParams(Parcel parcel)
    {
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
    }

    private SyncQuickExperimentParams(c c1)
    {
        b = (String)Preconditions.checkNotNull(com.facebook.abtest.qe.protocol.sync.c.a(c1));
        c = (String)Preconditions.checkNotNull(com.facebook.abtest.qe.protocol.sync.c.b(c1));
        d = com.facebook.abtest.qe.protocol.sync.c.c(c1);
    }

    SyncQuickExperimentParams(c c1, b b1)
    {
        this(c1);
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(" : ").append(c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
