// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ag, ej, bs

public class be extends ag
{

    private static final String f = "SyncActivityUserInfoOperation";

    public be(bs bs1, boolean flag)
    {
        super(bs1, flag);
        a(new ej(bs1, flag), 0);
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
        return "SyncActivityUserInfoOperation";
    }
}
