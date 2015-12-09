// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.FirmwareUpdate;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.dncs.DncsPairingManager;
import com.fitbit.e.a;
import com.fitbit.multipledevice.b;
import com.fitbit.pedometer.e;
import com.fitbit.pedometer.l;
import com.fitbit.savedstate.s;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.util.p;
import com.fitbit.util.v;
import com.fitbit.util.z;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ao, EntityMerger, 
//            aq, dg, o, fb, 
//            ez, am, an

public class bw extends com.fitbit.data.bl.e
{

    private static final String a = "SyncDeviceOperation";
    private static final String b = "SyncDeviceOperation";

    public bw(bs bs1, boolean flag)
    {
        super(bs1, flag);
    }

    private List a(Profile profile)
        throws ServerCommunicationException, JSONException
    {
        Object obj = e().a();
        ao ao1 = e().b();
        profile = v.b(ao1.a(((PublicAPI) (obj)).i(), profile));
        ao1.a(profile, ((PublicAPI) (obj)).x());
        ao1.b(profile, ((PublicAPI) (obj)).y());
        obj = profile.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Device device = (Device)((Iterator) (obj)).next();
            if (device.o() != null)
            {
                device.o().d();
            }
        } while (true);
        if (!com.fitbit.multipledevice.b.b())
        {
            List list = p.a(profile);
            List list1 = p.k(profile);
            if (!list1.isEmpty() && list.size() > list1.size())
            {
                com.fitbit.e.a.a("SyncDeviceOperation", "MobileTrack is not supported as a multi-device tracker. Ignoring MobileTrack...", new Object[0]);
                for (Iterator iterator = list1.iterator(); iterator.hasNext(); ((Device)iterator.next()).b(null)) { }
            }
        }
        return profile;
    }

    private static void a(List list)
    {
        list = new EntityMerger(list, com.fitbit.data.bl.aq.a().t(), new _cls1());
        list.a(new _cls2());
        list.a(new _cls3());
        list.a(new _cls4());
    }

    private void a(List list, h.a a1)
    {
        dg.d().t(false, a1);
        break MISSING_BLOCK_LABEL_8;
        Object obj;
        obj;
_L1:
        com.fitbit.e.a.a("SyncDeviceOperation", "Unable to load TrackerTypes", ((Throwable) (obj)), new Object[0]);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            list = ((Device)iterator.next()).j();
            list = com.fitbit.data.bl.o.a().a(list);
            if (list == null || list.d() != null)
            {
                continue;
            }
            try
            {
                dg.d().a(list, a1);
                continue;
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
            // Misplaced declaration of an exception variable
            catch (List list) { }
            com.fitbit.e.a.a("SyncDeviceOperation", "Unable to load TrackerInfo", list, new Object[0]);
        } while (true);
        return;
        obj;
          goto _L1
    }

    private static void a(List list, List list1)
    {
        boolean flag1 = true;
        com.fitbit.galileo.a.a.a();
        boolean flag = p.a(list, DeviceFeature.SLEEP);
        boolean flag2 = p.a(list1, DeviceFeature.SLEEP);
        if (!flag && flag2)
        {
            com.fitbit.data.bl.fb.a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT);
            com.fitbit.data.bl.fb.a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP);
        }
        b(list, list1);
        c(list, list1);
        List list2 = p.b(list);
        List list3 = p.b(list1);
        Object obj = list3.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Device device = (Device)((Iterator) (obj)).next();
            if (device.v() == null || device.v().a() != com.fitbit.data.domain.device.FirmwareUpdate.Status.LANG)
            {
                continue;
            }
            obj = new Intent("ACTION_FW_UPDATE_STATUS_RECEIVED");
            ((Intent) (obj)).putExtra("EXTRA_FW_UPDATE_STATUS", device.v().a().name());
            ((Intent) (obj)).putExtra("EXTRA_FW_UPDATE_DEVICE", device.d());
            z.a(((Intent) (obj)));
            break;
        } while (true);
        if (list2.isEmpty() && !list3.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!com.fitbit.multipledevice.a.a().a(flag))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(list, list1, flag);
        com.fitbit.widget.b.b(FitBitApplication.a());
    }

    private static void a(List list, List list1, boolean flag)
    {
        list = p.b(list, DeviceFeature.WIRELESS_SYNC);
        list1 = p.b(list1, DeviceFeature.WIRELESS_SYNC);
        if (!list.isEmpty())
        {
            list = (Device)list.get(0);
        } else
        {
            list = null;
        }
        if (!list1.isEmpty())
        {
            list1 = (Device)list1.get(0);
        } else
        {
            list1 = null;
        }
        if (flag)
        {
            if (list != null && list1 != null)
            {
                if (list.c() != null && !list.c().equals(list1.c()))
                {
                    com.fitbit.multipledevice.a.a().i();
                }
            } else
            {
                boolean flag1;
                boolean flag2;
                if (list == null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (list1 == null)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag1 != flag2)
                {
                    com.fitbit.multipledevice.a.a().i();
                    return;
                }
            }
        }
    }

    public static void b()
    {
        dg.d().c().d("SyncDeviceOperation");
    }

    private static void b(List list, List list1)
    {
        boolean flag = p.h(list);
        boolean flag1 = p.h(list1);
        boolean flag2 = e.h();
        boolean flag3 = l.a();
        if (flag && !flag1)
        {
            d();
            com.fitbit.pedometer.service.a.c();
            com.fitbit.pedometer.service.a.a();
        } else
        if (!flag && flag1)
        {
            d();
            if (flag2 && !flag3)
            {
                com.fitbit.pedometer.service.a.b();
                return;
            }
        }
    }

    private static void c(List list, List list1)
    {
        list = p.b(list, DeviceFeature.WIRELESS_SYNC);
        list1 = p.b(list1, DeviceFeature.WIRELESS_SYNC);
        break MISSING_BLOCK_LABEL_16;
        if (!list.isEmpty() && list1.isEmpty() || list.isEmpty() && !list1.isEmpty() || list.isEmpty() || list1.isEmpty());
        DncsPairingManager.a().a(list, list1);
        return;
    }

    private static void d()
    {
        com.fitbit.data.bl.am.a().d();
        com.fitbit.data.bl.am.a().e();
        s.j();
        e.g().e();
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        Profile profile;
        List list;
        List list1;
        e().a(true);
        profile = com.fitbit.data.bl.an.a().b();
        list = p.a();
        list1 = a(profile);
        a(list1, a1);
        a(list1);
        if (profile == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        profile.a(list1);
        com.fitbit.data.bl.an.a().a(profile);
        a(list, list1);
        e().a(false);
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncDeviceOperation";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
