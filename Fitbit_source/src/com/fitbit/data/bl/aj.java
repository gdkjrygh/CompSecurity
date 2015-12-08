// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ag, ak, bw, eu, 
//            bs

public class aj extends ag
{

    private static final String f = "PairSoftTrackerAndUpdateDevicesOperation";

    public aj(bs bs1, String s)
    {
        super(bs1, true);
        a(new ak(bs1, s));
        a(new bw(bs1, true));
        a(new eu(e(), false));
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
        return "PairSoftTrackerAndUpdateDevicesOperation";
    }
}
