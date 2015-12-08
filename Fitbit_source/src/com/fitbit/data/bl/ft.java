// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.TimeZone;
import com.fitbit.data.repo.at;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            aq, ao

public class ft
{

    private static ft b;
    private final String a = "TimeZoneBusinessLogic";
    private final at c = aq.a().L();
    private final PublicAPI d = new PublicAPI(ServerGateway.a());
    private final ao e = new ao();

    private ft()
    {
    }

    public static ft a()
    {
        com/fitbit/data/bl/ft;
        JVM INSTR monitorenter ;
        ft ft1;
        if (b == null)
        {
            b = new ft();
        }
        ft1 = b;
        com/fitbit/data/bl/ft;
        JVM INSTR monitorexit ;
        return ft1;
        Exception exception;
        exception;
        throw exception;
    }

    public TimeZone a(String s)
    {
        return c.getByTimeZoneId(s);
    }

    public List b()
        throws ServerCommunicationException, JSONException
    {
        org.json.JSONObject jsonobject = d.E();
        return e.Y(jsonobject);
    }

    public List c()
    {
        return c.getAll();
    }
}
