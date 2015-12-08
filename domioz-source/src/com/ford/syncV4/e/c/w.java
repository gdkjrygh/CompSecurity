// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.g;
import com.ford.syncV4.util.c;
import java.util.Hashtable;

// Referenced classes of package com.ford.syncV4.e.c:
//            s, o

public final class w extends g
{

    public w()
    {
        super("GetVehicleData");
    }

    public w(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final s i()
    {
        Object obj = b.get("gps");
        if (obj instanceof s)
        {
            return (s)obj;
        }
        if (obj instanceof Hashtable)
        {
            try
            {
                obj = new s((Hashtable)obj);
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".gps").toString(), exception);
                return null;
            }
            return ((s) (obj));
        } else
        {
            return null;
        }
    }

    public final Double j()
    {
        return (Double)b.get("speed");
    }

    public final o k()
    {
        Object obj;
        obj = b.get("deviceStatus");
        if (obj instanceof o)
        {
            return (o)obj;
        }
        if (!(obj instanceof Hashtable))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = new o((Hashtable)obj);
        return ((o) (obj));
        Exception exception;
        exception;
        c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".deviceStatus").toString(), exception);
        return null;
    }

    public final com.ford.syncV4.e.c.a.w l()
    {
        Object obj = b.get("driverBraking");
        if (obj instanceof com.ford.syncV4.e.c.a.w)
        {
            return (com.ford.syncV4.e.c.a.w)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = com.ford.syncV4.e.c.a.w.a((String)obj);
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".driverBraking").toString(), exception);
                return null;
            }
            return ((com.ford.syncV4.e.c.a.w) (obj));
        } else
        {
            return null;
        }
    }
}
