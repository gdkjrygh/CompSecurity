// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service;

import android.os.Bundle;
import android.util.Pair;
import com.facebook.abtest.qe.b;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.abtest.qe.protocol.sync.c;
import com.facebook.abtest.qe.protocol.sync.full.SyncQuickExperimentMetaInfoResult;
import com.facebook.abtest.qe.protocol.sync.user.SyncQuickExperimentUserInfoResult;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.am;
import com.facebook.http.protocol.j;
import com.facebook.http.protocol.y;
import com.facebook.http.protocol.z;
import com.facebook.prefs.shared.d;
import java.util.Iterator;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.abtest.qe.service:
//            a

public class g
    implements e
{

    private final am a;
    private final a b;
    private final com.facebook.abtest.qe.g.a c;
    private final d d;
    private final com.facebook.abtest.qe.protocol.sync.user.a e;
    private final com.facebook.abtest.qe.protocol.sync.full.a f;
    private final a g;
    private final com.facebook.abtest.qe.b.a h;
    private final b i;

    public g(am am1, a a1, com.facebook.abtest.qe.g.a a2, d d1, com.facebook.abtest.qe.protocol.sync.user.a a3, com.facebook.abtest.qe.protocol.sync.full.a a4, a a5, 
            com.facebook.abtest.qe.b.a a6, b b1)
    {
        a = am1;
        b = a1;
        c = a2;
        d = d1;
        e = a3;
        f = a4;
        g = a5;
        h = a6;
        i = b1;
    }

    private OperationResult b(ad ad1)
    {
        ad1 = a.a();
        if ((String)b.b() == null)
        {
            return OperationResult.a(t.OTHER, "No user ID available");
        }
        Object obj = d.b();
        ((com.facebook.prefs.shared.e) (obj)).a(com.facebook.abtest.qe.data.a.b, System.currentTimeMillis());
        ((com.facebook.prefs.shared.e) (obj)).a(com.facebook.abtest.qe.data.a.c, c.a());
        ((com.facebook.prefs.shared.e) (obj)).a();
        obj = h.b().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            if (!i.a(s))
            {
                Object obj1 = (new c()).a(s).b((String)b.b());
                QuickExperimentInfo quickexperimentinfo = h.a(s);
                if (quickexperimentinfo != null)
                {
                    ((c) (obj1)).c(quickexperimentinfo.d());
                }
                obj1 = ((c) (obj1)).a();
                ad1.a(y.a(e, obj1).a((new StringBuilder()).append("sync_user_").append(s).toString()).a());
                if (((Boolean)g.b()).booleanValue())
                {
                    ad1.a(y.a(f, obj1).a((new StringBuilder()).append("sync_meta_").append(s).toString()).a());
                }
            }
        } while (true);
        ad1.b("handleGetQEs");
        obj = new Bundle();
        Bundle bundle = new Bundle();
        Bundle bundle1 = new Bundle();
        Iterator iterator = h.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!i.a(s1))
            {
                Object obj2 = (SyncQuickExperimentUserInfoResult)ad1.a((new StringBuilder()).append("sync_user_").append(s1).toString());
                if (obj2 != null)
                {
                    ((Bundle) (obj)).putBoolean(s1, true);
                    bundle.putParcelable(s1, ((android.os.Parcelable) (obj2)));
                }
                obj2 = (SyncQuickExperimentMetaInfoResult)ad1.a((new StringBuilder()).append("sync_meta_").append(s1).toString());
                if (obj2 != null)
                {
                    ((Bundle) (obj)).putBoolean(s1, true);
                    bundle1.putParcelable(s1, ((android.os.Parcelable) (obj2)));
                }
            }
        } while (true);
        return OperationResult.a(((android.os.Parcelable) (obj)), new Pair[] {
            Pair.create("sync_user", bundle), Pair.create("sync_meta", bundle1)
        });
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (com.facebook.abtest.qe.service.a.a.equals(operationtype))
        {
            return b(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }
}
