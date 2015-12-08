// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, an

public class eg extends e
{

    private static final String a = "SyncProfilePreferences";

    public eg(bs bs1)
    {
        super(bs1, false);
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        e().a(true);
        a1 = an.a();
        if (a1.b() != null)
        {
            a1.a(a1.l());
        }
        e().a(false);
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncProfilePreferences";
    }
}
