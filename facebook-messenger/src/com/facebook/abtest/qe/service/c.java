// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service;

import android.os.Bundle;
import com.facebook.abtest.qe.g.a;
import com.facebook.abtest.qe.protocol.sync.full.SyncQuickExperimentMetaInfoResult;
import com.facebook.abtest.qe.protocol.sync.user.SyncQuickExperimentUserInfoResult;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.f;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.abtest.qe.service:
//            a

public class c
    implements f
{

    private final a a;
    private final com.facebook.abtest.qe.b.a b;

    public c(a a1, com.facebook.abtest.qe.b.a a2)
    {
        a = (a)Preconditions.checkNotNull(a1);
        b = (com.facebook.abtest.qe.b.a)Preconditions.checkNotNull(a2);
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
                Object obj2 = (String)((Iterator) (obj)).next();
                Object obj1 = (SyncQuickExperimentUserInfoResult)e1.get(((String) (obj2)));
                obj2 = (SyncQuickExperimentMetaInfoResult)bundle.get(((String) (obj2)));
                if (obj1 != null || obj2 != null)
                {
                    obj1 = (new com.facebook.abtest.qe.data.c()).a(((SyncQuickExperimentUserInfoResult) (obj1)).a()).b(((SyncQuickExperimentUserInfoResult) (obj1)).b()).c(((SyncQuickExperimentUserInfoResult) (obj1)).c()).a(((SyncQuickExperimentUserInfoResult) (obj1)).d()).d(s).a(((SyncQuickExperimentUserInfoResult) (obj1)).e()).a(((SyncQuickExperimentMetaInfoResult) (obj2))).a();
                    b.a(((com.facebook.abtest.qe.data.QuickExperimentInfo) (obj1)), com.facebook.abtest.qe.c.f.FROM_SERVER);
                }
            } while (true);
            b.c();
        }
        return ad1;
    }

    public OperationResult a(ad ad1, e e1)
    {
        OperationType operationtype = ad1.a();
        if (com.facebook.abtest.qe.service.a.a.equals(operationtype))
        {
            return b(ad1, e1);
        } else
        {
            return e1.a(ad1);
        }
    }
}
