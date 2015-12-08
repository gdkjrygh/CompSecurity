// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.ApplicationForegroundController;
import com.fitbit.d.a;
import com.fitbit.data.bl.exceptions.MobileTrackBackOffException;
import com.fitbit.data.bl.exceptions.NotLinkedTrackerException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.TrackerSigningKeyExpiredException;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.data.domain.p;
import com.fitbit.pedometer.e;
import com.fitbit.pedometer.l;
import com.fitbit.savedstate.s;
import com.fitbit.savedstate.w;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            e, am, bs

public class eu extends com.fitbit.data.bl.e
{

    private static final String a = "SyncSoftTrackerDataOperation";
    private static final String b = "SyncSoftTrackerDataOperation";
    private final boolean d;

    public eu(bs bs1, boolean flag)
    {
        super(bs1, true);
        d = flag;
    }

    private JSONObject a(Date date)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        date = com.fitbit.data.bl.am.a().b(date);
        int i = date.getSteps();
        double d1 = date.getCalories();
        double d2 = date.getDistance().a(com.fitbit.data.domain.Length.LengthUnits.KM).b();
        com.fitbit.d.a.a(jsonobject, "steps", Integer.valueOf(i));
        com.fitbit.d.a.a(jsonobject, "calories", Double.valueOf(d1));
        com.fitbit.d.a.a(jsonobject, "distance", Double.valueOf(d2));
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", "Summary: %s %s %s", new Object[] {
            Integer.valueOf(i), Double.valueOf(d1), Double.valueOf(d2)
        });
        return jsonobject;
    }

    private void a(List list)
    {
        PedometerMinuteData pedometerminutedata;
        for (list = list.iterator(); list.hasNext(); com.fitbit.data.bl.am.a().a(pedometerminutedata))
        {
            pedometerminutedata = (PedometerMinuteData)list.next();
            pedometerminutedata.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        }

    }

    private void a(JSONObject jsonobject)
        throws JSONException
    {
        int i = jsonobject.getInt("steps");
        double d1 = jsonobject.getDouble("calories");
        double d2 = jsonobject.getDouble("distance");
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", "New offset: %s %s %s", new Object[] {
            Integer.valueOf(i), Double.valueOf(d1), Double.valueOf(d2)
        });
        jsonobject = new HashMap();
        jsonobject.put("soft_tracker_data_offset_date_milliseconds_key", Long.valueOf((new Date()).getTime()));
        jsonobject.put("soft_tracker_data_offset_steps_key", Integer.valueOf(i));
        jsonobject.put("soft_tracker_data_offset_calories_key", Double.valueOf(d1));
        jsonobject.put("soft_tracker_data_offset_distance_key", Double.valueOf(d2));
        s.a(jsonobject);
    }

    private List b(List list)
    {
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        list = arraylist;
    /* block-local class not found */
    class a {}

        PedometerMinuteData pedometerminutedata;
        for (; iterator.hasNext(); list.add(pedometerminutedata))
        {
            pedometerminutedata = (PedometerMinuteData)iterator.next();
            if (list.size() > 0 && (double)(pedometerminutedata.a() - ((PedometerMinuteData)list.get(list.size() - 1)).a()) > 90000D)
            {
                arraylist1.add(new a(list));
                list = new ArrayList();
            }
        }

        if (list.size() > 0)
        {
            arraylist1.add(new a(list));
        }
        return arraylist1;
    }

    private void b()
    {
        com.fitbit.pedometer.service.a.c();
        com.fitbit.pedometer.service.a.a();
        com.fitbit.multipledevice.a.a().b();
        d();
    }

    private JSONObject c(List list)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = a(new Date());
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(((a)list.next()).toPublicApiJsonObject())) { }
        jsonobject.putOpt("trackerSummary", jsonobject1);
        com.fitbit.d.a.a(jsonobject, "wireId", s.a());
        com.fitbit.d.a.a(jsonobject, "data", jsonarray);
        return jsonobject;
    }

    private void d()
    {
        com.fitbit.data.bl.am.a().d();
        com.fitbit.data.bl.am.a().e();
        s.j();
        e.g().e();
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        if (s.e())
        {
            if (d)
            {
                a(true);
            }
            throw new MobileTrackBackOffException(com.fitbit.data.bl.exceptions.MobileTrackBackOffException.BackOffType.b, s.g(), (int)(s.f() / 1000L));
        }
        break MISSING_BLOCK_LABEL_73;
        a1;
        com.fitbit.e.a.f("SyncSoftTrackerDataOperation", "Performed sync of not linked tracker", a1, new Object[0]);
        s.b(null);
        b();
        e().a(false);
        return;
        e().a(true);
        if (com.fitbit.util.p.l())
        {
            break MISSING_BLOCK_LABEL_112;
        }
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", "SoftTracker is not linked to account. Skip sync request.", new Object[0]);
        e().a(false);
        return;
        Object obj;
        obj = s.a();
        a1 = s.b();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", "WireId is null. Pedometer data not synced", new Object[0]);
        e().a(false);
        return;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", "TrackerId is null. Pedometer data not synced", new Object[0]);
        e().a(false);
        return;
        obj = com.fitbit.data.bl.am.a().c();
        if (((List) (obj)).size() != 0 || ApplicationForegroundController.a().b() || w.h())
        {
            break MISSING_BLOCK_LABEL_228;
        }
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", "SyncSoftTrackerData not performed:\n1) No tracker data\n2) App in background\n3) No widgets", new Object[0]);
        e().a(false);
        return;
        String s1 = c(b(((List) (obj)))).toString();
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", "Sending SoftTracker data", new Object[0]);
        a1 = e().a().f(a1, s1);
        s.h();
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", "SoftTracker data synced", new Object[0]);
        a(a1.getJSONObject("offsets"));
        a(((List) (obj)));
        e().a(false);
        return;
        a1;
        com.fitbit.e.a.f("SyncSoftTrackerDataOperation", "Signing key expired while syncing", a1, new Object[0]);
        l.a(true);
        throw a1;
        a1;
        e().a(false);
        throw a1;
        a1;
        com.fitbit.e.a.a("SyncSoftTrackerDataOperation", a1.toString(), new Object[0]);
        if (a1.c() == com.fitbit.data.bl.exceptions.MobileTrackBackOffException.BackOffType.b)
        {
            s.a(a1.g(), a1.getMessage());
        }
        if (d)
        {
            a(true);
        }
        throw a1;
    }

    public String c()
    {
        return "SyncSoftTrackerDataOperation";
    }
}
