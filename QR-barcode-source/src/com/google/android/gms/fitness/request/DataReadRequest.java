// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
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

        private long KS;
        private List SB;
        private int SE;
        private long Sr;
        private List Uk;
        private List Uo;
        private List Up;
        private long Uq;
        private DataSource Ur;
        private int Us;
        private boolean Ut;
        private boolean Uu;
        private boolean Uv;

        static List a(Builder builder)
        {
            return builder.SB;
        }

        static List b(Builder builder)
        {
            return builder.Uk;
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
            return builder.Uo;
        }

        static List f(Builder builder)
        {
            return builder.Up;
        }

        static int g(Builder builder)
        {
            return builder.SE;
        }

        static long h(Builder builder)
        {
            return builder.Uq;
        }

        static DataSource i(Builder builder)
        {
            return builder.Ur;
        }

        static int j(Builder builder)
        {
            return builder.Us;
        }

        static boolean k(Builder builder)
        {
            return builder.Ut;
        }

        static boolean l(Builder builder)
        {
            return builder.Uu;
        }

        static boolean m(Builder builder)
        {
            return builder.Uv;
        }

        public Builder aggregate(DataSource datasource, DataType datatype)
        {
            o.b(datasource, "Attempting to add a null data source");
            DataType datatype1;
            boolean flag;
            if (!Uk.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Cannot add the same data source for aggregated and detailed");
            datatype1 = datasource.getDataType();
            o.b(DataType.AGGREGATE_INPUT_TYPES.contains(datatype1), "Unsupported input data type specified for aggregation: %s", new Object[] {
                datatype1
            });
            o.b(DataType.getAggregatesForInput(datatype1).contains(datatype), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
                datatype1, datatype
            });
            if (!Up.contains(datasource))
            {
                Up.add(datasource);
            }
            return this;
        }

        public Builder aggregate(DataType datatype, DataType datatype1)
        {
            o.b(datatype, "Attempting to use a null data type");
            boolean flag;
            if (!SB.contains(datatype))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Cannot add the same data type as aggregated and detailed");
            o.b(DataType.AGGREGATE_INPUT_TYPES.contains(datatype), "Unsupported input data type specified for aggregation: %s", new Object[] {
                datatype
            });
            o.b(DataType.getAggregatesForInput(datatype).contains(datatype1), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
                datatype, datatype1
            });
            if (!Uo.contains(datatype))
            {
                Uo.add(datatype);
            }
            return this;
        }

        public Builder bucketByActivitySegment(int i1, TimeUnit timeunit)
        {
            boolean flag;
            if (SE == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(SE)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            SE = 4;
            Uq = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketByActivitySegment(int i1, TimeUnit timeunit, DataSource datasource)
        {
            boolean flag;
            if (SE == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(SE)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            if (datasource != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Invalid activity data source specified");
            o.b(datasource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] {
                datasource
            });
            Ur = datasource;
            SE = 4;
            Uq = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketByActivityType(int i1, TimeUnit timeunit)
        {
            boolean flag;
            if (SE == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(SE)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            SE = 3;
            Uq = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketByActivityType(int i1, TimeUnit timeunit, DataSource datasource)
        {
            boolean flag;
            if (SE == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(SE)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            if (datasource != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Invalid activity data source specified");
            o.b(datasource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] {
                datasource
            });
            Ur = datasource;
            SE = 3;
            Uq = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketBySession(int i1, TimeUnit timeunit)
        {
            boolean flag;
            if (SE == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(SE)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            SE = 2;
            Uq = timeunit.toMillis(i1);
            return this;
        }

        public Builder bucketByTime(int i1, TimeUnit timeunit)
        {
            boolean flag;
            if (SE == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(SE)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i1)
            });
            SE = 1;
            Uq = timeunit.toMillis(i1);
            return this;
        }

        public DataReadRequest build()
        {
label0:
            {
                boolean flag2 = true;
                boolean flag;
                boolean flag1;
                if (!Uk.isEmpty() || !SB.isEmpty() || !Up.isEmpty() || !Uo.isEmpty())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                o.a(flag1, "Must add at least one data source (aggregated or detailed)");
                if (KS > 0L)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                o.a(flag1, "Invalid start time: %s", new Object[] {
                    Long.valueOf(KS)
                });
                if (Sr > 0L && Sr > KS)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                o.a(flag1, "Invalid end time: %s", new Object[] {
                    Long.valueOf(Sr)
                });
                if (Up.isEmpty() && Uo.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    flag1 = flag2;
                    if (SE == 0)
                    {
                        break label0;
                    }
                }
                if (!flag && SE != 0)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
            }
            o.a(flag1, "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest(this);
        }

        public Builder enableServerQueries()
        {
            Uv = true;
            return this;
        }

        public Builder read(DataSource datasource)
        {
            o.b(datasource, "Attempting to add a null data source");
            boolean flag;
            if (!Up.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Cannot add the same data source as aggregated and detailed");
            if (!Uk.contains(datasource))
            {
                Uk.add(datasource);
            }
            return this;
        }

        public Builder read(DataType datatype)
        {
            o.b(datatype, "Attempting to use a null data type");
            boolean flag;
            if (!Uo.contains(datatype))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Cannot add the same data type as aggregated and detailed");
            if (!SB.contains(datatype))
            {
                SB.add(datatype);
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
            o.b(flag, "Invalid limit %d is specified", new Object[] {
                Integer.valueOf(i1)
            });
            Us = i1;
            return this;
        }

        public Builder setTimeRange(long l1, long l2, TimeUnit timeunit)
        {
            KS = timeunit.toMillis(l1);
            Sr = timeunit.toMillis(l2);
            return this;
        }

        public Builder()
        {
            SB = new ArrayList();
            Uk = new ArrayList();
            Uo = new ArrayList();
            Up = new ArrayList();
            SE = 0;
            Uq = 0L;
            Us = 0;
            Ut = false;
            Uu = false;
            Uv = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new g();
    public static final int NO_LIMIT = 0;
    private final int BR;
    private final long KS;
    private final List SB;
    private final int SE;
    private final long Sr;
    private final List Uk;
    private final List Uo;
    private final List Up;
    private final long Uq;
    private final DataSource Ur;
    private final int Us;
    private final boolean Ut;
    private final boolean Uu;
    private final boolean Uv;

    DataReadRequest(int i, List list, List list1, long l, long l1, 
            List list2, List list3, int j, long l2, DataSource datasource, int k, 
            boolean flag, boolean flag1, boolean flag2)
    {
        BR = i;
        SB = Collections.unmodifiableList(list);
        Uk = Collections.unmodifiableList(list1);
        KS = l;
        Sr = l1;
        Uo = Collections.unmodifiableList(list2);
        Up = Collections.unmodifiableList(list3);
        SE = j;
        Uq = l2;
        Ur = datasource;
        Us = k;
        Ut = flag;
        Uu = flag1;
        Uv = flag2;
    }

    private DataReadRequest(Builder builder)
    {
        BR = 2;
        SB = Collections.unmodifiableList(Builder.a(builder));
        Uk = Collections.unmodifiableList(Builder.b(builder));
        KS = Builder.c(builder);
        Sr = Builder.d(builder);
        Uo = Collections.unmodifiableList(Builder.e(builder));
        Up = Collections.unmodifiableList(Builder.f(builder));
        SE = Builder.g(builder);
        Uq = Builder.h(builder);
        Ur = Builder.i(builder);
        Us = Builder.j(builder);
        Ut = Builder.k(builder);
        Uu = Builder.l(builder);
        Uv = Builder.m(builder);
    }


    private boolean a(DataReadRequest datareadrequest)
    {
        return SB.equals(datareadrequest.SB) && Uk.equals(datareadrequest.Uk) && KS == datareadrequest.KS && Sr == datareadrequest.Sr && SE == datareadrequest.SE && Up.equals(datareadrequest.Up) && Uo.equals(datareadrequest.Uo) && n.equal(Ur, datareadrequest.Ur) && Uq == datareadrequest.Uq && Uv == datareadrequest.Uv;
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
        return Ur;
    }

    public List getAggregatedDataSources()
    {
        return Up;
    }

    public List getAggregatedDataTypes()
    {
        return Uo;
    }

    public long getBucketDuration(TimeUnit timeunit)
    {
        return timeunit.convert(Uq, TimeUnit.MILLISECONDS);
    }

    public int getBucketType()
    {
        return SE;
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

    public int getLimit()
    {
        return Us;
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
            Integer.valueOf(SE), Long.valueOf(KS), Long.valueOf(Sr)
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

    public boolean jk()
    {
        return Ut;
    }

    public boolean jl()
    {
        return Uv;
    }

    public boolean jm()
    {
        return Uu;
    }

    public long jn()
    {
        return Uq;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataReadRequest{");
        if (!SB.isEmpty())
        {
            for (Iterator iterator = SB.iterator(); iterator.hasNext(); stringbuilder.append(((DataType)iterator.next()).iQ()).append(" ")) { }
        }
        if (!Uk.isEmpty())
        {
            for (Iterator iterator1 = Uk.iterator(); iterator1.hasNext(); stringbuilder.append(((DataSource)iterator1.next()).toDebugString()).append(" ")) { }
        }
        if (SE != 0)
        {
            stringbuilder.append("bucket by ").append(Bucket.cy(SE));
            if (Uq > 0L)
            {
                stringbuilder.append(" >").append(Uq).append("ms");
            }
            stringbuilder.append(": ");
        }
        if (!Uo.isEmpty())
        {
            for (Iterator iterator2 = Uo.iterator(); iterator2.hasNext(); stringbuilder.append(((DataType)iterator2.next()).iQ()).append(" ")) { }
        }
        if (!Up.isEmpty())
        {
            for (Iterator iterator3 = Up.iterator(); iterator3.hasNext(); stringbuilder.append(((DataSource)iterator3.next()).toDebugString()).append(" ")) { }
        }
        stringbuilder.append(String.format("(%tF %tT - %tF %tT)", new Object[] {
            Long.valueOf(KS), Long.valueOf(KS), Long.valueOf(Sr), Long.valueOf(Sr)
        }));
        if (Ur != null)
        {
            stringbuilder.append("activities: ").append(Ur.toDebugString());
        }
        if (Uv)
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
