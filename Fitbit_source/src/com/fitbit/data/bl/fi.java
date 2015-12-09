// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.TrackerType;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ag, o, fh, bs

class fi extends ag
{

    private static final String f = "SyncTrackerInfosOperation";

    public fi(bs bs1, boolean flag)
    {
        super(bs1, flag);
        bs1 = o.a().b();
        for (int i = 0; i < bs1.size(); i++)
        {
            a(new fh(e(), (TrackerType)bs1.get(i)), i);
        }

    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        e().a(true);
        super.a(a1);
        e().a(false);
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncTrackerInfosOperation";
    }
}
