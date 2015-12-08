// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.mixpanel.f;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ag, fe, ee, cm, 
//            v, bs

public class x extends ag
{

    private static final String f = "InitialSyncOperation";

    public x(bs bs1)
    {
        super(bs1, true);
        b = true;
        a(new fe(bs1, false), 0);
        a(new ee(bs1, c), 0);
        a(new cm(bs1, c), 0);
        a(new v(bs1, false), 0);
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        e().a(true);
        super.a(a1);
        e().a(false);
        com.fitbit.mixpanel.f.c();
        return;
        a1;
        e().a(false);
        com.fitbit.mixpanel.f.c();
        throw a1;
    }

    public String c()
    {
        return "InitialSyncOperation";
    }
}
