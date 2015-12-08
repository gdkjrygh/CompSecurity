// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            g

public class DataReadRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private long LW;
        private long TO;
        private List TY;
        private int Ub;
        private List VH;
        private List VL;
        private List VM;
        private long VN;
        private DataSource VO;
        private int VP;
        private boolean VQ;
        private boolean VR;

        static List a(Builder builder)
        {
            return builder.TY;
        }

        static List b(Builder builder)
        {
            return builder.VH;
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
            return builder.VL;
        }

        static List f(Builder builder)
        {
            return builder.VM;
        }

        static int g(Builder builder)
        {
            return builder.Ub;
        }

        static long h(Builder builder)
        {
            return builder.VN;
        }

        static DataSource i(Builder builder)
        {
            return builder.VO;
        }

        static int j(Builder builder)
        {
            return builder.VP;
        }

        static boolean k(Builder builder)
        {
            return builder.VQ;
        }

        static boolean l(Builder builder)
        {
            return builder.VR;
        }

        public Builder aggregate(DataSource datasource, DataType datatype)
        {
            jx.b(datasource, "Attempting to add a null data source");
            DataType datatype1;
            boolean flag;
            if (!VH.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Cannot add the same data source for aggregated and detailed");
            datatype1 = datasource.getDataType();
            jx.b(DataType.AGGREGATE_INPUT_TYPES.contains(datatype1), "Unsupported input data type specified for aggregation: %s", new Object[] {
                datatype1
            });
            jx.b(DataType.getAggregatesForInput(datatype1).contains(datatype), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
                datatype1, datatype
            });
            if (!VM.contains(datasource))
            {
                VM.add(datasource);
            }
            return this;
        }

        public Builder aggregate(DataType datatype, DataType datatype1)
        {
            jx.b(datatype, "Attempting to use a null data type");
            boolean flag;
            if (!TY.contains(datatype))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Cannot add the same data type as aggregated and detailed");
            jx.b(DataType.AGGREGATE_INPUT_TYPES.contains(datatype), "Unsupported input data type specified for aggregation: %s", new Object[] {
                datatype
            });
            jx.b(DataType.getAggregatesForInput(datatype).contains(datatype1), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
                datatype, datatype1
            });
            if (!VL.contains(datatype))
            {
                VL.add(datatype);
            }
            return this;
        }

        public Builder bucketByActivitySegment(int i1, TimeUnit timeunit)
        {
            boolean flag;
            if (Ub == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(Ub)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            Ub = 4;
            VN = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketByActivitySegment(int i1, TimeUnit timeunit, DataSource datasource)
        {
            boolean flag;
            if (Ub == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(Ub)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            if (datasource != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Invalid activity data source specified");
            jx.b(datasource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] {
                datasource
            });
            VO = datasource;
            Ub = 4;
            VN = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketByActivityType(int i1, TimeUnit timeunit)
        {
            boolean flag;
            if (Ub == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(Ub)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            Ub = 3;
            VN = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketByActivityType(int i1, TimeUnit timeunit, DataSource datasource)
        {
            boolean flag;
            if (Ub == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(Ub)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            if (datasource != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Invalid activity data source specified");
            jx.b(datasource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] {
                datasource
            });
            VO = datasource;
            Ub = 3;
            VN = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketBySession(int i1, TimeUnit timeunit)
        {
            boolean flag;
            if (Ub == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(Ub)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            Ub = 2;
            VN = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketByTime(int i1, TimeUnit timeunit)
        {
            boolean flag;
            if (Ub == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(Ub)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            Ub = 1;
            VN = timeunit.toMillis(i1);
            return this;
        }

        public DataReadRequest build()
        {
label0:
            {
                boolean flag2 = true;
                boolean flag;
                boolean flag1;
                if (!VH.isEmpty() || !TY.isEmpty() || !VM.isEmpty() || !VL.isEmpty())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                jx.a(flag1, "Must add at least one data source (aggregated or detailed)");
                if (LW > 0L)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                jx.a(flag1, "Invalid start time: %s", new Object[] {
                    Long.valueOf(LW)
                });
                if (TO > 0L && TO > LW)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                jx.a(flag1, "Invalid end time: %s", new Object[] {
                    Long.valueOf(TO)
                });
                if (VM.isEmpty() && VL.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    flag1 = flag2;
                    if (Ub == 0)
                    {
                        break label0;
                    }
                }
                if (!flag && Ub != 0)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
            }
            jx.a(flag1, "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest(this);
        }

        public Builder enableServerQueries()
        {
            VR = true;
            return this;
        }

        public Builder read(DataSource datasource)
        {
            jx.b(datasource, "Attempting to add a null data source");
            boolean flag;
            if (!VM.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Cannot add the same data source as aggregated and detailed");
            if (!VH.contains(datasource))
            {
                VH.add(datasource);
            }
            return this;
        }

        public Builder read(DataType datatype)
        {
            jx.b(datatype, "Attempting to use a null data type");
            boolean flag;
            if (!VL.contains(datatype))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Cannot add the same data type as aggregated and detailed");
            if (!TY.contains(datatype))
            {
                TY.add(datatype);
            }
            return this;
        }

        public Builder setLimit(int i1)
        {
            boolean flag;
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Invalid limit %d is specified", new Object[] {
                Integer.valueOf(i1)
            });
            VP = i1;
            return this;
        }

        public Builder setTimeRange(long l1, long l2, TimeUnit timeunit)
        {
            LW = timeunit.toMillis(l1);
            TO = timeunit.toMillis(l2);
            return this;
        }

        public Builder()
        {
            TY = new ArrayList();
            VH = new ArrayList();
            VL = new ArrayList();
            VM = new ArrayList();
            Ub = 0;
            VN = 0L;
            VP = 0;
            VQ = false;
            VR = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new g();
    public static final int NO_LIMIT = 0;
    private final int CK;
    private final long LW;
    private final long TO;
    private final List TY;
    private final int Ub;
    private final List VH;
    private final List VL;
    private final List VM;
    private final long VN;
    private final DataSource VO;
    private final int VP;
    private final boolean VQ;
    private final boolean VR;

    DataReadRequest(int i, List list, List list1, long l, long l1, 
            List list2, List list3, int j, long l2, DataSource datasource, int k, 
            boolean flag, boolean flag1)
    {
        CK = i;
        TY = Collections.unmodifiableList(list);
        VH = Collections.unmodifiableList(list1);
        LW = l;
        TO = l1;
        VL = Collections.unmodifiableList(list2);
        VM = Collections.unmodifiableList(list3);
        Ub = j;
        VN = l2;
        VO = datasource;
        VP = k;
        VQ = flag;
        VR = flag1;
    }

    private DataReadRequest(Builder builder)
    {
        CK = 2;
        TY = Collections.unmodifiableList(Builder.a(builder));
        VH = Collections.unmodifiableList(Builder.b(builder));
        LW = Builder.c(builder);
        TO = Builder.d(builder);
        VL = Collections.unmodifiableList(Builder.e(builder));
        VM = Collections.unmodifiableList(Builder.f(builder));
        Ub = Builder.g(builder);
        VN = Builder.h(builder);
        VO = Builder.i(builder);
        VP = Builder.j(builder);
        VQ = Builder.k(builder);
        VR = Builder.l(builder);
    }


    private boolean a(DataReadRequest datareadrequest)
    {
        return TY.equals(datareadrequest.TY) && VH.equals(datareadrequest.VH) && LW == datareadrequest.LW && TO == datareadrequest.TO && Ub == datareadrequest.Ub && VM.equals(datareadrequest.VM) && VL.equals(datareadrequest.VL) && jv.equal(VO, datareadrequest.VO) && VN == datareadrequest.VN && VR == datareadrequest.VR;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataReadRequest) && a((DataReadRequest)obj);
    }

    public DataSource getActivityDataSource()
    {
        return VO;
    }

    public List getAggregatedDataSources()
    {
        return VM;
    }

    public List getAggregatedDataTypes()
    {
        return VL;
    }

    public long getBucketDuration(TimeUnit timeunit)
    {
        return timeunit.convert(VN, TimeUnit.MILLISECONDS);
    }

    public int getBucketType()
    {
        return Ub;
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

    public int getLimit()
    {
        return VP;
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
            Integer.valueOf(Ub), Long.valueOf(LW), Long.valueOf(TO)
        });
    }

    public boolean jV()
    {
        return VR;
    }

    public boolean jW()
    {
        return VQ;
    }

    public long jX()
    {
        return VN;
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
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataReadRequest{");
        if (!TY.isEmpty())
        {
            for (Iterator iterator = TY.iterator(); iterator.hasNext(); stringbuilder.append(((DataType)iterator.next()).jB()).append(" ")) { }
        }
        if (!VH.isEmpty())
        {
            for (Iterator iterator1 = VH.iterator(); iterator1.hasNext(); stringbuilder.append(((DataSource)iterator1.next()).toDebugString()).append(" ")) { }
        }
        if (Ub != 0)
        {
            stringbuilder.append("bucket by ").append(Bucket.cJ(Ub));
            if (VN > 0L)
            {
                stringbuilder.append(" >").append(VN).append("ms");
            }
            stringbuilder.append(": ");
        }
        if (!VL.isEmpty())
        {
            for (Iterator iterator2 = VL.iterator(); iterator2.hasNext(); stringbuilder.append(((DataType)iterator2.next()).jB()).append(" ")) { }
        }
        if (!VM.isEmpty())
        {
            for (Iterator iterator3 = VM.iterator(); iterator3.hasNext(); stringbuilder.append(((DataSource)iterator3.next()).toDebugString()).append(" ")) { }
        }
        stringbuilder.append(String.format("(%tF %tT - %tF %tT)", new Object[] {
            Long.valueOf(LW), Long.valueOf(LW), Long.valueOf(TO), Long.valueOf(TO)
        }));
        if (VO != null)
        {
            stringbuilder.append("activities: ").append(VO.toDebugString());
        }
        if (VR)
        {
            stringbuilder.append(" +server");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
