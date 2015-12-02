// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.full;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.ev;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.full:
//            b, c

public class SyncQuickExperimentMetaInfoResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final List b;
    private final ev c;
    private final String d;
    private final long e;

    public SyncQuickExperimentMetaInfoResult(Parcel parcel)
    {
        a = parcel.readString();
        b = new ArrayList();
        parcel.readStringList(b);
        c = ev.a(parcel.readHashMap(com/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult.getClassLoader()));
        d = parcel.readString();
        e = parcel.readLong();
    }

    private SyncQuickExperimentMetaInfoResult(c c1)
    {
        a = (String)Preconditions.checkNotNull(com.facebook.abtest.qe.protocol.sync.full.c.a(c1));
        b = (List)Preconditions.checkNotNull(com.facebook.abtest.qe.protocol.sync.full.c.b(c1));
        c = com.facebook.abtest.qe.protocol.sync.full.c.c(c1);
        d = com.facebook.abtest.qe.protocol.sync.full.c.d(c1);
        e = com.facebook.abtest.qe.protocol.sync.full.c.e(c1);
    }

    SyncQuickExperimentMetaInfoResult(c c1, b b1)
    {
        this(c1);
    }

    public String a()
    {
        return a;
    }

    public List b()
    {
        return b;
    }

    public ev c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeStringArray((String[])b.toArray(new String[b.size()]));
        parcel.writeMap(c);
        parcel.writeString(d);
        parcel.writeLong(e);
    }

}
