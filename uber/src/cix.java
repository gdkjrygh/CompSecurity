// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLocation;

public final class cix
{

    private cev a;
    private UberLocation b;

    public cix(cev cev1)
    {
        a = cev1;
    }

    public final void a()
    {
        if (a != null)
        {
            a.a(this);
        }
    }

    public final void a(UberLocation uberlocation)
    {
        if (uberlocation != null)
        {
            b = uberlocation;
            if (a != null)
            {
                a.c(produceLocationEvent());
                return;
            }
        }
    }

    public final void b()
    {
        b = null;
    }

    public final UberLocation c()
    {
        this;
        JVM INSTR monitorenter ;
        UberLocation uberlocation = b;
        this;
        JVM INSTR monitorexit ;
        return uberlocation;
        Exception exception;
        exception;
        throw exception;
    }

    public final Double d()
    {
        UberLocation uberlocation = c();
        if (uberlocation != null && uberlocation.g() != null)
        {
            return Double.valueOf(uberlocation.g().a());
        } else
        {
            return null;
        }
    }

    public final Double e()
    {
        UberLocation uberlocation = c();
        if (uberlocation != null && uberlocation.g() != null)
        {
            return Double.valueOf(uberlocation.g().b());
        } else
        {
            return null;
        }
    }

    public final Float f()
    {
        UberLocation uberlocation = c();
        if (uberlocation != null)
        {
            return Float.valueOf(uberlocation.c());
        } else
        {
            return null;
        }
    }

    public final Float g()
    {
        UberLocation uberlocation = c();
        if (uberlocation != null)
        {
            return Float.valueOf(uberlocation.d());
        } else
        {
            return null;
        }
    }

    public final Double h()
    {
        UberLocation uberlocation = c();
        if (uberlocation != null)
        {
            return Double.valueOf(uberlocation.b());
        } else
        {
            return null;
        }
    }

    public final Float i()
    {
        UberLocation uberlocation = c();
        if (uberlocation != null)
        {
            return Float.valueOf(uberlocation.a());
        } else
        {
            return null;
        }
    }

    public final Float j()
    {
        UberLocation uberlocation = c();
        if (uberlocation != null)
        {
            return Float.valueOf(uberlocation.a());
        } else
        {
            return null;
        }
    }

    public final Long k()
    {
        UberLocation uberlocation = c();
        if (uberlocation != null)
        {
            return Long.valueOf(uberlocation.e());
        } else
        {
            return null;
        }
    }

    public final ciy produceLocationEvent()
    {
        UberLocation uberlocation = b;
        if (uberlocation == null)
        {
            return null;
        } else
        {
            return new ciy(uberlocation);
        }
    }
}
