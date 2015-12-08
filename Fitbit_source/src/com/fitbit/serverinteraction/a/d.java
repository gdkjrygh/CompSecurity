// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.a;

import com.fitbit.mixpanel.MixPanelTrackingHelper;
import java.net.HttpURLConnection;
import java.util.List;

// Referenced classes of package com.fitbit.serverinteraction.a:
//            a

public class d extends a
{

    public static final int c = 3;
    public static final long d = 60000L;

    public d()
    {
    }

    protected void a(List list, int i)
    {
        MixPanelTrackingHelper.b(list, i, b());
    }

    public boolean b(HttpURLConnection httpurlconnection)
    {
        return super.b(httpurlconnection) && c(httpurlconnection);
    }

    protected com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes e()
    {
        return com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes.b;
    }

    protected int f()
    {
        return 3;
    }

    protected long g()
    {
        return 60000L;
    }
}
