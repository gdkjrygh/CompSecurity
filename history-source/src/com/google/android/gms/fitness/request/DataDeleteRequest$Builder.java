// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataDeleteRequest

public static class VK
{

    private long LW;
    private long TO;
    private List TY;
    private List VH;
    private List VI;
    private boolean VJ;
    private boolean VK;

    static long a(VK vk)
    {
        return vk.LW;
    }

    static long b(LW lw)
    {
        return lw.TO;
    }

    static List c(TO to)
    {
        return to.VH;
    }

    static List d(VH vh)
    {
        return vh.TY;
    }

    static List e(TY ty)
    {
        return ty.VI;
    }

    static boolean f(VI vi)
    {
        return vi.VJ;
    }

    static boolean g(VJ vj)
    {
        return vj.VK;
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

    public TO addDataSource(DataSource datasource)
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

    public VH addDataType(DataType datatype)
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

    public TY addSession(Session session)
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
        return new DataDeleteRequest(this, null);
    }

    public jT deleteAllData()
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

    public VJ deleteAllSessions()
    {
        jx.b(VI.isEmpty(), "Specific sessions already added for deletion: %s", new Object[] {
            VI
        });
        VK = true;
        return this;
    }

    public VK setTimeInterval(long l, long l1, TimeUnit timeunit)
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

    public ()
    {
        VH = new ArrayList();
        TY = new ArrayList();
        VI = new ArrayList();
        VJ = false;
        VK = false;
    }
}
