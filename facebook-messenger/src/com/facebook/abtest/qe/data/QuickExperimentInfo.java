// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.abtest.qe.protocol.sync.full.SyncQuickExperimentMetaInfoResult;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.abtest.qe.data:
//            b, c

public class QuickExperimentInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final Class a = com/facebook/abtest/qe/data/QuickExperimentInfo;
    private final String b;
    private final String c;
    private final boolean d;
    private final String e;
    private final String f;
    private final ev g;
    private final SyncQuickExperimentMetaInfoResult h;

    private QuickExperimentInfo(Parcel parcel)
    {
        boolean flag = true;
        super();
        b = parcel.readString();
        c = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        d = flag;
        e = parcel.readString();
        f = parcel.readString();
        g = ev.a(parcel.readHashMap(com/facebook/abtest/qe/data/QuickExperimentInfo.getClassLoader()));
        h = (SyncQuickExperimentMetaInfoResult)parcel.readParcelable(com/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult.getClassLoader());
    }

    QuickExperimentInfo(Parcel parcel, b b1)
    {
        this(parcel);
    }

    private QuickExperimentInfo(c c1)
    {
        b = (String)Preconditions.checkNotNull(com.facebook.abtest.qe.data.c.a(c1));
        c = (String)Preconditions.checkNotNull(com.facebook.abtest.qe.data.c.b(c1));
        d = ((Boolean)Preconditions.checkNotNull(Boolean.valueOf(com.facebook.abtest.qe.data.c.c(c1)))).booleanValue();
        e = com.facebook.abtest.qe.data.c.d(c1);
        f = (String)Preconditions.checkNotNull(com.facebook.abtest.qe.data.c.e(c1));
        g = ev.a((Map)Preconditions.checkNotNull(com.facebook.abtest.qe.data.c.f(c1)));
        h = com.facebook.abtest.qe.data.c.g(c1);
    }

    QuickExperimentInfo(c c1, b b1)
    {
        this(c1);
    }

    public static boolean a(QuickExperimentInfo quickexperimentinfo, QuickExperimentInfo quickexperimentinfo1)
    {
        while (quickexperimentinfo == null && quickexperimentinfo1 != null || quickexperimentinfo1 == null && quickexperimentinfo != null || !Objects.equal(quickexperimentinfo.b(), quickexperimentinfo1.b()) || !Objects.equal(quickexperimentinfo.e(), quickexperimentinfo1.e()) || !Objects.equal(quickexperimentinfo.a(), quickexperimentinfo1.a()) || quickexperimentinfo.c() != quickexperimentinfo1.c() || !Objects.equal(quickexperimentinfo.f(), quickexperimentinfo1.f()) || !Objects.equal(quickexperimentinfo.d(), quickexperimentinfo1.d())) 
        {
            return false;
        }
        return true;
    }

    public static c newBuilder()
    {
        return new c();
    }

    public Optional a(String s)
    {
        return a(s, ((Map) (null)));
    }

    public Optional a(String s, Map map)
    {
        if (c.equals("local_default_group"))
        {
            return Optional.absent();
        }
        s = (String)g.get(s);
        if (s == null)
        {
            return Optional.absent();
        }
        if (map == null || map.isEmpty())
        {
            return Optional.of(s);
        }
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            s = s.replaceAll((new StringBuilder()).append("\\{").append((String)entry.getKey()).append("\\}").toString(), (String)entry.getValue());
        }

        return Optional.of(s);
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public boolean c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return f;
    }

    public ev f()
    {
        return g;
    }

    public SyncQuickExperimentMetaInfoResult g()
    {
        return h;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(b).append("/Group:").append(c).append("/Experiment:").append(d).append("/Locale:").append(f).append("/customStrings: ");
        java.util.Map.Entry entry;
        for (Iterator iterator = g.a().iterator(); iterator.hasNext(); stringbuilder.append("\n").append((String)entry.getKey()).append(": ").append((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        int j;
        if (d)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeMap(g);
        parcel.writeParcelable(h, i);
    }

}
