// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.w;
import com.fitbit.synclair.config.SynclairConfigType;
import com.fitbit.util.z;
import java.util.Collections;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ao, aq, 
//            EntityMerger

public class fh extends e
{

    public static final String a = "SyncTrackerInfoOperation.ACTION_TRACKER_INFO_SYNCED";
    public static final String b = "SyncTrackerInfoOperation.EXTRA_TRACKER_TYPE";
    private static final String d = "SyncDeviceTypeOperation";
    private final TrackerType e;

    public fh(bs bs1, TrackerType trackertype)
    {
        super(bs1, true);
        e = trackertype;
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        e().a(true);
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        com.fitbit.e.a.a("SyncDeviceTypeOperation", "Unable to sync tracker infos: TrackerType is null", new Object[0]);
        e().a(false);
        return;
        a1 = w.a().a(e, SynclairConfigType.c);
        a1 = e().b().a(a1, e);
        e.a(a1);
        a1 = com.fitbit.data.bl.aq.a().I();
        a1 = new EntityMerger(Collections.singletonList(e), a1, new _cls1());
        a1.a(new _cls2());
        a1.a(new _cls3());
        a1 = new Intent("SyncTrackerInfoOperation.ACTION_TRACKER_INFO_SYNCED");
        a1.putExtra("SyncTrackerInfoOperation.EXTRA_TRACKER_TYPE", e);
        z.a(a1);
        e().a(false);
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncDeviceTypeOperation";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
