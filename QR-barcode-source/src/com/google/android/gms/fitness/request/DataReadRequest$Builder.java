// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataReadRequest

public static class Uv
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

    static List a(Uv uv)
    {
        return uv.SB;
    }

    static List b(SB sb)
    {
        return sb.Uk;
    }

    static long c(Uk uk)
    {
        return uk.KS;
    }

    static long d(KS ks)
    {
        return ks.Sr;
    }

    static List e(Sr sr)
    {
        return sr.Uo;
    }

    static List f(Uo uo)
    {
        return uo.Up;
    }

    static int g(Up up)
    {
        return up.SE;
    }

    static long h(SE se)
    {
        return se.Uq;
    }

    static DataSource i(Uq uq)
    {
        return uq.Ur;
    }

    static int j(Ur ur)
    {
        return ur.Us;
    }

    static boolean k(Us us)
    {
        return us.Ut;
    }

    static boolean l(Ut ut)
    {
        return ut.Uu;
    }

    static boolean m(Uu uu)
    {
        return uu.Uv;
    }

    public Uv aggregate(DataSource datasource, DataType datatype)
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

    public Up aggregate(DataType datatype, DataType datatype1)
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

    public Uo bucketByActivitySegment(int i1, TimeUnit timeunit)
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

    public Uq bucketByActivitySegment(int i1, TimeUnit timeunit, DataSource datasource)
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

    public Uq bucketByActivityType(int i1, TimeUnit timeunit)
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

    public Uq bucketByActivityType(int i1, TimeUnit timeunit, DataSource datasource)
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

    public Uq bucketBySession(int i1, TimeUnit timeunit)
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

    public Uq bucketByTime(int i1, TimeUnit timeunit)
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
        return new DataReadRequest(this, null);
    }

    public SE enableServerQueries()
    {
        Uv = true;
        return this;
    }

    public Uv read(DataSource datasource)
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

    public Uk read(DataType datatype)
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

    public SB setLimit(int i1)
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

    public Us setTimeRange(long l1, long l2, TimeUnit timeunit)
    {
        KS = timeunit.toMillis(l1);
        Sr = timeunit.toMillis(l2);
        return this;
    }

    public ()
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
