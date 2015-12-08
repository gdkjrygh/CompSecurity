// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataReadRequest

public static class VR
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

    static List a(VR vr)
    {
        return vr.TY;
    }

    static List b(TY ty)
    {
        return ty.VH;
    }

    static long c(VH vh)
    {
        return vh.LW;
    }

    static long d(LW lw)
    {
        return lw.TO;
    }

    static List e(TO to)
    {
        return to.VL;
    }

    static List f(VL vl)
    {
        return vl.VM;
    }

    static int g(VM vm)
    {
        return vm.Ub;
    }

    static long h(Ub ub)
    {
        return ub.VN;
    }

    static DataSource i(VN vn)
    {
        return vn.VO;
    }

    static int j(VO vo)
    {
        return vo.VP;
    }

    static boolean k(VP vp)
    {
        return vp.VQ;
    }

    static boolean l(VQ vq)
    {
        return vq.VR;
    }

    public VR aggregate(DataSource datasource, DataType datatype)
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

    public VM aggregate(DataType datatype, DataType datatype1)
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

    public VL bucketByActivitySegment(int i1, TimeUnit timeunit)
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

    public VN bucketByActivitySegment(int i1, TimeUnit timeunit, DataSource datasource)
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

    public VN bucketByActivityType(int i1, TimeUnit timeunit)
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

    public VN bucketByActivityType(int i1, TimeUnit timeunit, DataSource datasource)
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

    public VN bucketBySession(int i1, TimeUnit timeunit)
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

    public VN bucketByTime(int i1, TimeUnit timeunit)
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
        return new DataReadRequest(this, null);
    }

    public Ub enableServerQueries()
    {
        VR = true;
        return this;
    }

    public VR read(DataSource datasource)
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

    public VH read(DataType datatype)
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

    public TY setLimit(int i1)
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

    public VP setTimeRange(long l1, long l2, TimeUnit timeunit)
    {
        LW = timeunit.toMillis(l1);
        TO = timeunit.toMillis(l2);
        return this;
    }

    public ()
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
