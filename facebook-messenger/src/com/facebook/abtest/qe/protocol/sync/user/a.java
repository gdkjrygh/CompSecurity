// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.user;

import com.facebook.abtest.qe.protocol.sync.SyncQuickExperimentParams;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.user:
//            d, SyncQuickExperimentUserInfoResult

public class a
    implements f
{

    private static final Class a = com/facebook/abtest/qe/protocol/sync/user/a;
    private final d b;

    public a(d d1)
    {
        b = d1;
    }

    public SyncQuickExperimentUserInfoResult a(SyncQuickExperimentParams syncquickexperimentparams, r r1)
    {
        return b.a(r1.c(), syncquickexperimentparams);
    }

    public n a(SyncQuickExperimentParams syncquickexperimentparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("hash", syncquickexperimentparams.c()));
        return new n("syncUserQE", "GET", com.facebook.abtest.qe.protocol.sync.a.b(syncquickexperimentparams), arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((SyncQuickExperimentParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((SyncQuickExperimentParams)obj, r1);
    }

}
