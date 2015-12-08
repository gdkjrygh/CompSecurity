// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.repo.n;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, aq, bs, ao, 
//            EntityMerger

public class bg extends e
{

    private static final String a = "SyncAlarmsOperation";

    public bg(bs bs1, boolean flag)
    {
        super(bs1, flag);
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = aq.a().t().getAll();
        a1 = new ArrayList();
        com.fitbit.data.repo.g g = aq.a().j();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Device device = (Device)((Iterator) (obj)).next();
            if (device.a(DeviceFeature.ALARMS))
            {
                Object obj1 = e().a().D(device.c());
                obj1 = e().b().A(((org.json.JSONObject) (obj1)));
                Alarm alarm;
                for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); alarm.b(device.getEntityId().longValue()))
                {
                    alarm = (Alarm)iterator.next();
                    alarm.a(device);
                }

                a1.addAll(((java.util.Collection) (obj1)));
            }
        } while (true);
        (new EntityMerger(a1, g, new _cls1())).a();
    }

    public String c()
    {
        return "SyncAlarmsOperation";
    }

    /* member class not found */
    class _cls1 {}

}
