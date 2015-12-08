// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataDeleteRequest

public static class Un
{

    private long KS;
    private List SB;
    private long Sr;
    private List Uk;
    private List Ul;
    private boolean Um;
    private boolean Un;

    static long a(Un un)
    {
        return un.KS;
    }

    static long b(KS ks)
    {
        return ks.Sr;
    }

    static List c(Sr sr)
    {
        return sr.Uk;
    }

    static List d(Uk uk)
    {
        return uk.SB;
    }

    static List e(SB sb)
    {
        return sb.Ul;
    }

    static boolean f(Ul ul)
    {
        return ul.Um;
    }

    static boolean g(Um um)
    {
        return um.Un;
    }

    private void ji()
    {
        if (!Ul.isEmpty())
        {
            Iterator iterator = Ul.iterator();
            while (iterator.hasNext()) 
            {
                Session session = (Session)iterator.next();
                boolean flag;
                if (session.getStartTime(TimeUnit.MILLISECONDS) >= KS && session.getEndTime(TimeUnit.MILLISECONDS) <= Sr)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                o.a(flag, "Session %s is outside the time interval [%d, %d]", new Object[] {
                    session, Long.valueOf(KS), Long.valueOf(Sr)
                });
            }
        }
    }

    public Sr addDataSource(DataSource datasource)
    {
        boolean flag1 = true;
        boolean flag;
        if (!Um)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "All data is already marked for deletion");
        if (datasource != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.b(flag, "Must specify a valid data source");
        if (!Uk.contains(datasource))
        {
            Uk.add(datasource);
        }
        return this;
    }

    public Uk addDataType(DataType datatype)
    {
        boolean flag1 = true;
        boolean flag;
        if (!Um)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "All data is already marked for deletion");
        if (datatype != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.b(flag, "Must specify a valid data type");
        if (!SB.contains(datatype))
        {
            SB.add(datatype);
        }
        return this;
    }

    public SB addSession(Session session)
    {
        boolean flag1 = true;
        boolean flag;
        if (!Un)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "All sessions already marked for deletion");
        if (session != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Must specify a valid session");
        if (session.getEndTime(TimeUnit.MILLISECONDS) > 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.b(flag, "Must specify a session that has already ended");
        Ul.add(session);
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
            if (KS > 0L && Sr > KS)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            o.a(flag2, "Must specify a valid time interval");
            if (Um || !Uk.isEmpty() || !SB.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (Un || !Ul.isEmpty())
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
        o.a(flag2, "No data or session marked for deletion");
        ji();
        return new DataDeleteRequest(this, null);
    }

    public ji deleteAllData()
    {
        boolean flag;
        if (SB.isEmpty() && Uk.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Specific data source/type already specified for deletion. DataSources: %s DataTypes: %s", new Object[] {
            Uk, SB
        });
        Um = true;
        return this;
    }

    public Um deleteAllSessions()
    {
        o.b(Ul.isEmpty(), "Specific sessions already added for deletion: %s", new Object[] {
            Ul
        });
        Un = true;
        return this;
    }

    public Un setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Invalid start time :%d", new Object[] {
            Long.valueOf(l)
        });
        if (l1 > l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Invalid end time :%d", new Object[] {
            Long.valueOf(l1)
        });
        KS = timeunit.toMillis(l);
        Sr = timeunit.toMillis(l1);
        return this;
    }

    public ()
    {
        Uk = new ArrayList();
        SB = new ArrayList();
        Ul = new ArrayList();
        Um = false;
        Un = false;
    }
}
