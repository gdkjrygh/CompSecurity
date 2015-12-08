// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.data.bl.ao;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.w;
import com.fitbit.synclair.config.SynclairConfigType;
import com.fitbit.synclair.config.a;
import com.fitbit.synclair.config.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.synclair.operation:
//            d

public class e extends d
{

    private static final String a = "LoadFirmwareUpdateConfigOperation";
    private final GalileoTrackerType e;

    public e(GalileoTrackerType galileotrackertype)
    {
        e = galileotrackertype;
    }

    protected a a(JSONObject jsonobject)
    {
        return new b(jsonobject, r(), t());
    }

    protected String p()
    {
        return "LoadFirmwareUpdateConfigOperation";
    }

    protected JSONObject q()
        throws ServerCommunicationException, JSONException
    {
        Iterator iterator;
        if (e == null)
        {
            return null;
        }
        Object obj = dg.d().a().A();
        if (obj == null)
        {
            a("Device types not loaded");
            return null;
        }
        obj = dg.d().b().J(((JSONObject) (obj)));
        if (obj == null || ((List) (obj)).isEmpty())
        {
            a("Could not parse the device types");
            return null;
        }
        iterator = ((List) (obj)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        TrackerType trackertype = (TrackerType)iterator.next();
        if (GalileoTrackerType.a(trackertype.a()) != e) goto _L4; else goto _L3
_L3:
        if (trackertype == null)
        {
            a((new StringBuilder()).append("Could find device type for ").append(e).toString());
            return null;
        } else
        {
            a(trackertype, SynclairConfigType.b);
            return w.a().a(trackertype, SynclairConfigType.b);
        }
_L2:
        trackertype = null;
        if (true) goto _L3; else goto _L5
_L5:
    }
}
