// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            d

public class DataDeleteRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private long LW;
        private long TO;
        private List TY;
        private List VH;
        private List VI;
        private boolean VJ;
        private boolean VK;

        static long a(Builder builder)
        {
            return builder.LW;
        }

        static long b(Builder builder)
        {
            return builder.TO;
        }

        static List c(Builder builder)
        {
            return builder.VH;
        }

        static List d(Builder builder)
        {
            return builder.TY;
        }

        static List e(Builder builder)
        {
            return builder.VI;
        }

        static boolean f(Builder builder)
        {
            return builder.VJ;
        }

        static boolean g(Builder builder)
        {
            return builder.VK;
        }

        private void jT()
        {
            if (!VI.isEmpty())
            {
                Iterator iterator = VI.iterator();
                while (iterator.hasNext()) 
                {
                    Session session = (Session)iterator.next();
                    boolean flag;
                    if (session.getStartTime(TimeUnit.MILLISECONDS) >= LW && session.getEndTime(TimeUnit.MILLISECONDS) <= TO)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    jx.a(flag, "Session %s is outside the time interval [%d, %d]", new Object[] {
                        session, Long.valueOf(LW), Long.valueOf(TO)
                    });
                }
            }
        }

        public Builder addDataSource(DataSource datasource)
        {
            boolean flag1 = true;
            boolean flag;
            if (!VJ)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "All data is already marked for deletion");
            if (datasource != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid data source");
            if (!VH.contains(datasource))
            {
                VH.add(datasource);
            }
            return this;
        }

        public Builder addDataType(DataType datatype)
        {
            boolean flag1 = true;
            boolean flag;
            if (!VJ)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "All data is already marked for deletion");
            if (datatype != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid data type");
            if (!TY.contains(datatype))
            {
                TY.add(datatype);
            }
            return this;
        }

        public Builder addSession(Session session)
        {
            boolean flag1 = true;
            boolean flag;
            if (!VK)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "All sessions already marked for deletion");
            if (session != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid session");
            if (session.getEndTime(TimeUnit.MILLISECONDS) > 0L)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a session that has already ended");
            VI.add(session);
            return this;
        }

        public DataDeleteRequest build()
        {
label0:
            {
                boolean flag3 = false;
                boolean flag;
                boolean flag1;
                boolean flag2;
                if (LW > 0L && TO > LW)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                jx.a(flag2, "Must specify a valid time interval");
                if (VJ || !VH.isEmpty() || !TY.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (VK || !VI.isEmpty())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!flag)
                {
                    flag2 = flag3;
                    if (!flag1)
                    {
                        break label0;
                    }
                }
                flag2 = true;
            }
            jx.a(flag2, "No data or session marked for deletion");
            jT();
            return new DataDeleteRequest(this);
        }

        public Builder deleteAllData()
        {
            boolean flag;
            if (TY.isEmpty() && VH.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Specific data source/type already specified for deletion. DataSources: %s DataTypes: %s", new Object[] {
                VH, TY
            });
            VJ = true;
            return this;
        }

        public Builder deleteAllSessions()
        {
            jx.b(VI.isEmpty(), "Specific sessions already added for deletion: %s", new Object[] {
                VI
            });
            VK = true;
            return this;
        }

        public Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            boolean flag;
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Invalid start time :%d", new Object[] {
                Long.valueOf(l)
            });
            if (l1 > l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Invalid end time :%d", new Object[] {
                Long.valueOf(l1)
            });
            LW = timeunit.toMillis(l);
            TO = timeunit.toMillis(l1);
            return this;
        }

        public Builder()
        {
            VH = new ArrayList();
            TY = new ArrayList();
            VI = new ArrayList();
            VJ = false;
            VK = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final int CK;
    private final long LW;
    private final long TO;
    private final List TY;
    private final List VH;
    private final List VI;
    private final boolean VJ;
    private final boolean VK;

    DataDeleteRequest(int i, long l, long l1, List list, List list1, 
            List list2, boolean flag, boolean flag1)
    {
        CK = i;
        LW = l;
        TO = l1;
        VH = Collections.unmodifiableList(list);
        TY = Collections.unmodifiableList(list1);
        VI = list2;
        VJ = flag;
        VK = flag1;
    }

    private DataDeleteRequest(Builder builder)
    {
        CK = 1;
        LW = Builder.a(builder);
        TO = Builder.b(builder);
        VH = Collections.unmodifiableList(Builder.c(builder));
        TY = Collections.unmodifiableList(Builder.d(builder));
        VI = Collections.unmodifiableList(Builder.e(builder));
        VJ = Builder.f(builder);
        VK = Builder.g(builder);
    }


    private boolean a(DataDeleteRequest datadeleterequest)
    {
        return LW == datadeleterequest.LW && TO == datadeleterequest.TO && jv.equal(VH, datadeleterequest.VH) && jv.equal(TY, datadeleterequest.TY) && jv.equal(VI, datadeleterequest.VI) && VJ == datadeleterequest.VJ && VK == datadeleterequest.VK;
    }

    public boolean deleteAllData()
    {
        return VJ;
    }

    public boolean deleteAllSessions()
    {
        return VK;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataDeleteRequest) && a((DataDeleteRequest)obj);
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

    public List getSessions()
    {
        return VI;
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
            Long.valueOf(LW), Long.valueOf(TO)
        });
    }

    public boolean jR()
    {
        return VJ;
    }

    public boolean jS()
    {
        return VK;
    }

    public long jo()
    {
        return LW;
    }

    public long jp()
    {
        return TO;
    }

    public String toString()
    {
        return jv.h(this).a("startTimeMillis", Long.valueOf(LW)).a("endTimeMillis", Long.valueOf(TO)).a("dataSources", VH).a("dateTypes", TY).a("sessions", VI).a("deleteAllData", Boolean.valueOf(VJ)).a("deleteAllSessions", Boolean.valueOf(VK)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
