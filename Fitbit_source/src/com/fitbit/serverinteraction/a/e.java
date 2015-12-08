// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.a;

import com.fitbit.ui.b;
import java.net.HttpURLConnection;

// Referenced classes of package com.fitbit.serverinteraction.a:
//            b

class e
    implements com.fitbit.serverinteraction.a.b
{

    e()
    {
    }

    public boolean a(HttpURLConnection httpurlconnection)
    {
        return com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.b);
    }

    public boolean b(HttpURLConnection httpurlconnection)
    {
        return true;
    }
}
