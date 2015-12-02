// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.ev;
import com.google.common.base.Preconditions;
import java.util.Map;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.user:
//            b, c

public class SyncQuickExperimentUserInfoResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final String b;
    private final boolean c;
    private final String d;
    private final ev e;

    public SyncQuickExperimentUserInfoResult(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readString();
        b = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        c = flag;
        d = parcel.readString();
        e = ev.a(parcel.readHashMap(com/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult.getClassLoader()));
    }

    private SyncQuickExperimentUserInfoResult(c c1)
    {
        a = (String)Preconditions.checkNotNull(com.facebook.abtest.qe.protocol.sync.user.c.a(c1));
        b = (String)Preconditions.checkNotNull(com.facebook.abtest.qe.protocol.sync.user.c.b(c1));
        c = com.facebook.abtest.qe.protocol.sync.user.c.c(c1);
        d = com.facebook.abtest.qe.protocol.sync.user.c.d(c1);
        e = ev.a((Map)Preconditions.checkNotNull(com.facebook.abtest.qe.protocol.sync.user.c.e(c1)));
    }

    SyncQuickExperimentUserInfoResult(c c1, b b1)
    {
        this(c1);
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return d;
    }

    public boolean d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public ev e()
    {
        return ev.a(e);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(d);
        parcel.writeMap(e);
    }

}
