// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.lt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            s

public class SessionInsertRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private Session TQ;
        private List Ua;
        private List Wh;
        private List Wi;

        static Session a(Builder builder)
        {
            return builder.TQ;
        }

        static List b(Builder builder)
        {
            return builder.Ua;
        }

        static List c(Builder builder)
        {
            return builder.Wh;
        }

        private void d(DataPoint datapoint)
        {
            f(datapoint);
            e(datapoint);
        }

        private void e(DataPoint datapoint)
        {
            long l2 = TQ.getStartTime(TimeUnit.NANOSECONDS);
            long l3 = TQ.getEndTime(TimeUnit.NANOSECONDS);
            long l4 = datapoint.getStartTime(TimeUnit.NANOSECONDS);
            long l1 = datapoint.getEndTime(TimeUnit.NANOSECONDS);
            if (l4 != 0L && l1 != 0L)
            {
                TimeUnit timeunit = TimeUnit.MILLISECONDS;
                long l = l1;
                if (l1 > l3)
                {
                    l = lt.a(l1, TimeUnit.NANOSECONDS, timeunit);
                }
                boolean flag;
                if (l4 >= l2 && l <= l3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                jx.a(flag, "Data point %s has start and end times outside session interval [%d, %d]", new Object[] {
                    datapoint, Long.valueOf(l2), Long.valueOf(l3)
                });
                if (l != datapoint.getEndTime(TimeUnit.NANOSECONDS))
                {
                    Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] {
                        Long.valueOf(datapoint.getEndTime(TimeUnit.NANOSECONDS)), Long.valueOf(l), timeunit
                    }));
                    datapoint.setTimeInterval(l4, l, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void f(DataPoint datapoint)
        {
label0:
            {
                TimeUnit timeunit;
                long l;
                long l2;
                long l3;
label1:
                {
                    l2 = TQ.getStartTime(TimeUnit.NANOSECONDS);
                    l3 = TQ.getEndTime(TimeUnit.NANOSECONDS);
                    long l1 = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
                    if (l1 == 0L)
                    {
                        break label0;
                    }
                    timeunit = TimeUnit.MILLISECONDS;
                    if (l1 >= l2)
                    {
                        l = l1;
                        if (l1 <= l3)
                        {
                            break label1;
                        }
                    }
                    l = lt.a(l1, TimeUnit.NANOSECONDS, timeunit);
                }
                boolean flag;
                if (l >= l2 && l <= l3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                jx.a(flag, "Data point %s has time stamp outside session interval [%d, %d]", new Object[] {
                    datapoint, Long.valueOf(l2), Long.valueOf(l3)
                });
                if (datapoint.getTimestamp(TimeUnit.NANOSECONDS) != l)
                {
                    Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] {
                        Long.valueOf(datapoint.getTimestamp(TimeUnit.NANOSECONDS)), Long.valueOf(l), timeunit
                    }));
                    datapoint.setTimestamp(l, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void ki()
        {
            for (Iterator iterator = Ua.iterator(); iterator.hasNext();)
            {
                Iterator iterator2 = ((DataSet)iterator.next()).getDataPoints().iterator();
                while (iterator2.hasNext()) 
                {
                    d((DataPoint)iterator2.next());
                }
            }

            for (Iterator iterator1 = Wh.iterator(); iterator1.hasNext(); d((DataPoint)iterator1.next())) { }
        }

        public Builder addAggregateDataPoint(DataPoint datapoint)
        {
            com.google.android.gms.fitness.data.DataSource datasource;
            long l;
            long l1;
            boolean flag;
            if (datapoint != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid aggregate data point.");
            l = datapoint.getStartTime(TimeUnit.NANOSECONDS);
            l1 = datapoint.getEndTime(TimeUnit.NANOSECONDS);
            if (l > 0L && l1 > l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Aggregate data point should have valid start and end times: %s", new Object[] {
                datapoint
            });
            datasource = datapoint.getDataSource();
            if (!Wi.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Data set/Aggregate data point for this data source %s is already added.", new Object[] {
                datasource
            });
            Wi.add(datasource);
            Wh.add(datapoint);
            return this;
        }

        public Builder addDataSet(DataSet dataset)
        {
            boolean flag1 = true;
            com.google.android.gms.fitness.data.DataSource datasource;
            boolean flag;
            if (dataset != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Must specify a valid data set.");
            datasource = dataset.getDataSource();
            if (!Wi.contains(datasource))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Data set for this data source %s is already added.", new Object[] {
                datasource
            });
            if (!dataset.getDataPoints().isEmpty())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.b(flag, "No data points specified in the input data set.");
            Wi.add(datasource);
            Ua.add(dataset);
            return this;
        }

        public SessionInsertRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (TQ != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must specify a valid session.");
            if (TQ.getEndTime(TimeUnit.MILLISECONDS) != 0L)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must specify a valid end time, cannot insert a continuing session.");
            ki();
            return new SessionInsertRequest(this);
        }

        public Builder setSession(Session session)
        {
            TQ = session;
            return this;
        }

        public Builder()
        {
            Ua = new ArrayList();
            Wh = new ArrayList();
            Wi = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new s();
    private final int CK;
    private final Session TQ;
    private final List Ua;
    private final List Wh;

    SessionInsertRequest(int i, Session session, List list, List list1)
    {
        CK = i;
        TQ = session;
        Ua = Collections.unmodifiableList(list);
        Wh = Collections.unmodifiableList(list1);
    }

    private SessionInsertRequest(Builder builder)
    {
        CK = 1;
        TQ = Builder.a(builder);
        Ua = Collections.unmodifiableList(Builder.b(builder));
        Wh = Collections.unmodifiableList(Builder.c(builder));
    }


    private boolean a(SessionInsertRequest sessioninsertrequest)
    {
        return jv.equal(TQ, sessioninsertrequest.TQ) && jv.equal(Ua, sessioninsertrequest.Ua) && jv.equal(Wh, sessioninsertrequest.Wh);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionInsertRequest) && a((SessionInsertRequest)obj);
    }

    public List getAggregateDataPoints()
    {
        return Wh;
    }

    public List getDataSets()
    {
        return Ua;
    }

    public Session getSession()
    {
        return TQ;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            TQ, Ua, Wh
        });
    }

    public String toString()
    {
        return jv.h(this).a("session", TQ).a("dataSets", Ua).a("aggregateDataPoints", Wh).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel, i);
    }

}
