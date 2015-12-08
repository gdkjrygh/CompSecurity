// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            t

public class SessionReadRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private long KS;
        private List SB;
        private long Sr;
        private String UN;
        private boolean UO;
        private List UP;
        private List Uk;
        private boolean Uv;
        private String vL;

        static String a(Builder builder)
        {
            return builder.UN;
        }

        static String b(Builder builder)
        {
            return builder.vL;
        }

        static long c(Builder builder)
        {
            return builder.KS;
        }

        static long d(Builder builder)
        {
            return builder.Sr;
        }

        static List e(Builder builder)
        {
            return builder.SB;
        }

        static List f(Builder builder)
        {
            return builder.Uk;
        }

        static boolean g(Builder builder)
        {
            return builder.UO;
        }

        static boolean h(Builder builder)
        {
            return builder.Uv;
        }

        static List i(Builder builder)
        {
            return builder.UP;
        }

        public SessionReadRequest build()
        {
            boolean flag;
            if (KS > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Invalid start time: %s", new Object[] {
                Long.valueOf(KS)
            });
            if (Sr > 0L && Sr > KS)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Invalid end time: %s", new Object[] {
                Long.valueOf(Sr)
            });
            return new SessionReadRequest(this);
        }

        public Builder enableServerQueries()
        {
            Uv = true;
            return this;
        }

        public Builder excludePackage(String s)
        {
            o.b(s, "Attempting to use a null package name");
            if (!UP.contains(s))
            {
                UP.add(s);
            }
            return this;
        }

        public Builder read(DataSource datasource)
        {
            o.b(datasource, "Attempting to add a null data source");
            if (!Uk.contains(datasource))
            {
                Uk.add(datasource);
            }
            return this;
        }

        public Builder read(DataType datatype)
        {
            o.b(datatype, "Attempting to use a null data type");
            if (!SB.contains(datatype))
            {
                SB.add(datatype);
            }
            return this;
        }

        public Builder readSessionsFromAllApps()
        {
            UO = true;
            return this;
        }

        public Builder setSessionId(String s)
        {
            vL = s;
            return this;
        }

        public Builder setSessionName(String s)
        {
            UN = s;
            return this;
        }

        public Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            KS = timeunit.toMillis(l);
            Sr = timeunit.toMillis(l1);
            return this;
        }

        public Builder()
        {
            KS = 0L;
            Sr = 0L;
            SB = new ArrayList();
            Uk = new ArrayList();
            UO = false;
            Uv = false;
            UP = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new t();
    private final int BR;
    private final long KS;
    private final List SB;
    private final long Sr;
    private final String UN;
    private boolean UO;
    private final List UP;
    private final List Uk;
    private final boolean Uv;
    private final String vL;

    SessionReadRequest(int i, String s, String s1, long l, long l1, 
            List list, List list1, boolean flag, boolean flag1, List list2)
    {
        BR = i;
        UN = s;
        vL = s1;
        KS = l;
        Sr = l1;
        SB = Collections.unmodifiableList(list);
        Uk = Collections.unmodifiableList(list1);
        UO = flag;
        Uv = flag1;
        UP = list2;
    }

    private SessionReadRequest(Builder builder)
    {
        BR = 3;
        UN = Builder.a(builder);
        vL = Builder.b(builder);
        KS = Builder.c(builder);
        Sr = Builder.d(builder);
        SB = Collections.unmodifiableList(Builder.e(builder));
        Uk = Collections.unmodifiableList(Builder.f(builder));
        UO = Builder.g(builder);
        Uv = Builder.h(builder);
        UP = Collections.unmodifiableList(Builder.i(builder));
    }


    private boolean a(SessionReadRequest sessionreadrequest)
    {
        return n.equal(UN, sessionreadrequest.UN) && vL.equals(sessionreadrequest.vL) && KS == sessionreadrequest.KS && Sr == sessionreadrequest.Sr && n.equal(SB, sessionreadrequest.SB) && n.equal(Uk, sessionreadrequest.Uk) && UO == sessionreadrequest.UO && UP.equals(sessionreadrequest.UP) && Uv == sessionreadrequest.Uv;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionReadRequest) && a((SessionReadRequest)obj);
    }

    public List getDataSources()
    {
        return Uk;
    }

    public List getDataTypes()
    {
        return SB;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(Sr, TimeUnit.MILLISECONDS);
    }

    public List getExcludedPackages()
    {
        return UP;
    }

    public String getSessionId()
    {
        return vL;
    }

    public String getSessionName()
    {
        return UN;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(KS, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            UN, vL, Long.valueOf(KS), Long.valueOf(Sr)
        });
    }

    public long iD()
    {
        return KS;
    }

    public long iE()
    {
        return Sr;
    }

    public boolean includeSessionsFromAllApps()
    {
        return UO;
    }

    public boolean jl()
    {
        return Uv;
    }

    public boolean jz()
    {
        return UO;
    }

    public String toString()
    {
        return n.h(this).a("sessionName", UN).a("sessionId", vL).a("startTimeMillis", Long.valueOf(KS)).a("endTimeMillis", Long.valueOf(Sr)).a("dataTypes", SB).a("dataSources", Uk).a("sessionsFromAllApps", Boolean.valueOf(UO)).a("excludedPackages", UP).a("useServer", Boolean.valueOf(Uv)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel, i);
    }

}
