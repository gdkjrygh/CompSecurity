// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.savedstate.m;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ez, aa

public class el extends e
{

    private static final String a = "SyncRecommendedLocaleOperation";
    private static final long b = 0x36ee80L;

    public el(bs bs1, boolean flag)
    {
        super(bs1, flag);
        bs1.c().a(Long.valueOf(0x36ee80L), c());
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        a1 = Locale.getDefault();
        m.a(aa.a().a(a1.getLanguage(), a1.getCountry()));
    }

    public String c()
    {
        return "SyncRecommendedLocaleOperation";
    }
}
