// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cleanmaster.ui.app.market.Ad;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.e;
import com.picksinit.ErrorInfo;
import com.picksinit.ICallBack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            y, m

final class z
    implements ICallBack
{

    final y a;

    z(y y1)
    {
        a = y1;
        super();
    }

    public final void onLoadError(ErrorInfo errorinfo)
    {
        b.a("PicksNativeLoader", (new StringBuilder("CMPicks onLoadError:")).append(errorinfo.toString()).toString());
        y.a(a).set(false);
        y.a(a, String.valueOf(errorinfo.toString()));
    }

    public final void onLoadSuccess(List list)
    {
        y.a(a).set(false);
        ArrayList arraylist = new ArrayList();
        b.a("PicksNativeLoader", (new StringBuilder("CMPicks onLoadSuccess,size :")).append(list.size()).toString());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (Ad)list.next();
            obj = new m(a.mContext, a.mPositionId, ((Ad) (obj)), a.mNativeAdListener);
            if (((m) (obj)).n())
            {
                b.a("PicksNativeLoader", (new StringBuilder(" ad title: ")).append(((m) (obj)).d()).append("is valid, adpool add").toString());
                if (a.requestParams != null)
                {
                    ((m) (obj)).a(a.requestParams.b());
                    ((m) (obj)).b(a.requestParams.c());
                }
                arraylist.add(obj);
            }
        } while (true);
        synchronized (com.cmcm.adsdk.nativead.y.b(a))
        {
            y.c(a).addAll(arraylist);
            b.a("PicksNativeLoader", (new StringBuilder("adpool size:")).append(y.c(a).size()).toString());
        }
        y.d(a);
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onPreExecute()
    {
    }
}
