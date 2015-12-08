// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, FacebookBusinessLogic, bs

public class bz extends e
{

    private static final String a = "SyncFacebookLinkOperation";
    private String b;
    private String d;

    public bz(bs bs, boolean flag, String s, String s1)
    {
        super(bs, flag);
        b = s;
        d = s1;
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        FacebookBusinessLogic.a(b, d);
    }

    public String c()
    {
        return "SyncFacebookLinkOperation";
    }
}
