// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service;

import android.os.Bundle;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.abtest.qe.data.c;
import com.facebook.abtest.qe.g.a;
import com.facebook.abtest.qe.protocol.sync.full.SyncQuickExperimentMetaInfoResult;
import com.facebook.abtest.qe.protocol.sync.user.SyncQuickExperimentUserInfoResult;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.f;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.abtest.qe.service:
//            a

public class b
    implements f
{

    private final a a;
    private final com.facebook.abtest.qe.c.e b;

    public b(a a1, com.facebook.abtest.qe.c.e e1)
    {
        a = a1;
        b = e1;
    }

    private OperationResult b(ad ad1, e e1)
    {
        ad1 = e1.a(ad1);
        if (ad1.c())
        {
            Object obj = (Bundle)ad1.b("result");
            e1 = (Bundle)ad1.b("sync_user");
            Bundle bundle = (Bundle)ad1.b("sync_meta");
            String s = a.a();
            obj = ((Bundle) (obj)).keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (String)((Iterator) (obj)).next();
                obj1 = a((SyncQuickExperimentUserInfoResult)e1.get(((String) (obj1))), (SyncQuickExperimentMetaInfoResult)bundle.get(((String) (obj1))), s);
                if (obj1 != null)
                {
                    b.a(((QuickExperimentInfo) (obj1)), com.facebook.abtest.qe.c.f.FROM_SERVER);
                }
            } while (true);
        }
        return ad1;
    }

    QuickExperimentInfo a(SyncQuickExperimentUserInfoResult syncquickexperimentuserinforesult, SyncQuickExperimentMetaInfoResult syncquickexperimentmetainforesult, String s)
    {
        if (syncquickexperimentuserinforesult == null)
        {
            return null;
        } else
        {
            return (new c()).a(syncquickexperimentuserinforesult.a()).b(syncquickexperimentuserinforesult.b()).c(syncquickexperimentuserinforesult.c()).a(syncquickexperimentuserinforesult.d()).d(s).a(syncquickexperimentuserinforesult.e()).a(syncquickexperimentmetainforesult).a();
        }
    }

    public OperationResult a(ad ad1, e e1)
    {
        OperationType operationtype = ad1.a();
        if (com.facebook.abtest.qe.service.a.a.equals(operationtype))
        {
            return b(ad1, e1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }
}
