// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
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

        private long LW;
        private long TO;
        private List TY;
        private List VH;
        private boolean VR;
        private String Wj;
        private boolean Wk;
        private List Wl;
        private String vZ;

        static String a(Builder builder)
        {
            return builder.Wj;
        }

        static String b(Builder builder)
        {
            return builder.vZ;
        }

        static long c(Builder builder)
        {
            return builder.LW;
        }

        static long d(Builder builder)
        {
            return builder.TO;
        }

        static List e(Builder builder)
        {
            return builder.TY;
        }

        static List f(Builder builder)
        {
            return builder.VH;
        }

        static boolean g(Builder builder)
        {
            return builder.Wk;
        }

        static boolean h(Builder builder)
        {
            return builder.VR;
        }

        static List i(Builder builder)
        {
            return builder.Wl;
        }

        public SessionReadRequest build()
        {
            boolean flag;
            if (LW > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Invalid start time: %s", new Object[] {
                Long.valueOf(LW)
            });
            if (TO > 0L && TO > LW)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Invalid end time: %s", new Object[] {
                Long.valueOf(TO)
            });
            return new SessionReadRequest(this);
        }

        public Builder enableServerQueries()
        {
            VR = true;
            return this;
        }

        public Builder excludePackage(String s)
        {
            jx.b(s, "Attempting to use a null package name");
            if (!Wl.contains(s))
            {
                Wl.add(s);
            }
            return this;
        }

        public Builder read(DataSource datasource)
        {
            jx.b(datasource, "Attempting to add a null data source");
            if (!VH.contains(datasource))
            {
                VH.add(datasource);
            }
            return this;
        }

        public Builder read(DataType datatype)
        {
            jx.b(datatype, "Attempting to use a null data type");
            if (!TY.contains(datatype))
            {
                TY.add(datatype);
            }
            return this;
        }

        public Builder readSessionsFromAllApps()
        {
            Wk = true;
            return this;
        }

        public Builder setSessionId(String s)
        {
            vZ = s;
            return this;
        }

        public Builder setSessionName(String s)
        {
            Wj = s;
            return this;
        }

        public Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            LW = timeunit.toMillis(l);
            TO = timeunit.toMillis(l1);
            return this;
        }

        public Builder()
        {
            LW = 0L;
            TO = 0L;
            TY = new ArrayList();
            VH = new ArrayList();
            Wk = false;
            VR = false;
            Wl = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new t();
    private final int CK;
    private final long LW;
    private final long TO;
    private final List TY;
    private final List VH;
    private final boolean VR;
    private final String Wj;
    private boolean Wk;
    private final List Wl;
    private final String vZ;

    SessionReadRequest(int i, String s, String s1, long l, long l1, 
            List list, List list1, boolean flag, boolean flag1, List list2)
    {
        CK = i;
        Wj = s;
        vZ = s1;
        LW = l;
        TO = l1;
        TY = Collections.unmodifiableList(list);
        VH = Collections.unmodifiableList(list1);
        Wk = flag;
        VR = flag1;
        Wl = list2;
    }

    private SessionReadRequest(Builder builder)
    {
        CK = 3;
        Wj = Builder.a(builder);
        vZ = Builder.b(builder);
        LW = Builder.c(builder);
        TO = Builder.d(builder);
        TY = Collections.unmodifiableList(Builder.e(builder));
        VH = Collections.unmodifiableList(Builder.f(builder));
        Wk = Builder.g(builder);
        VR = Builder.h(builder);
        Wl = Collections.unmodifiableList(Builder.i(builder));
    }


    private boolean a(SessionReadRequest sessionreadrequest)
    {
        return jv.equal(Wj, sessionreadrequest.Wj) && vZ.equals(sessionreadrequest.vZ) && LW == sessionreadrequest.LW && TO == sessionreadrequest.TO && jv.equal(TY, sessionreadrequest.TY) && jv.equal(VH, sessionreadrequest.VH) && Wk == sessionreadrequest.Wk && Wl.equals(sessionreadrequest.Wl) && VR == sessionreadrequest.VR;
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
        return VH;
    }

    public List getDataTypes()
    {
        return TY;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(TO, TimeUnit.MILLISECONDS);
    }

    public List getExcludedPackages()
    {
        return Wl;
    }

    public String getSessionId()
    {
        return vZ;
    }

    public String getSessionName()
    {
        return Wj;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(LW, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Wj, vZ, Long.valueOf(LW), Long.valueOf(TO)
        });
    }

    public boolean includeSessionsFromAllApps()
    {
        return Wk;
    }

    public boolean jV()
    {
        return VR;
    }

    public long jo()
    {
        return LW;
    }

    public long jp()
    {
        return TO;
    }

    public boolean kj()
    {
        return Wk;
    }

    public String toString()
    {
        return jv.h(this).a("sessionName", Wj).a("sessionId", vZ).a("startTimeMillis", Long.valueOf(LW)).a("endTimeMillis", Long.valueOf(TO)).a("dataTypes", TY).a("dataSources", VH).a("sessionsFromAllApps", Boolean.valueOf(Wk)).a("excludedPackages", Wl).a("useServer", Boolean.valueOf(VR)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel, i);
    }

}
