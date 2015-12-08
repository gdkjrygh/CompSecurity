// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.offline;

import com.pinterest.kit.log.PLog;
import com.squareup.picasso.Callback;

// Referenced classes of package com.pinterest.offline:
//            OfflineDataRetriever

class a
    implements Callback
{

    final String a;
    final OfflineDataRetriever b;

    private void a()
    {
        OfflineDataRetriever.c(b);
        OfflineDataRetriever.a(b, null);
    }

    public void onError()
    {
        PLog.log("OfflineDataRetriever", (new StringBuilder("Failed ")).append(a).toString(), new Object[0]);
        a();
    }

    public void onSuccess()
    {
        PLog.log("OfflineDataRetriever", (new StringBuilder("Grabbed ")).append(a).toString(), new Object[0]);
        a();
    }

    (OfflineDataRetriever offlinedataretriever, String s)
    {
        b = offlinedataretriever;
        a = s;
        super();
    }
}
