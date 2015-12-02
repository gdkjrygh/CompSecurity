// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.widget.ListView;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.orca.server.FetchStickerPacksResult;
import com.facebook.orca.server.v;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.d.a.h;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerStoreFragment, StickerPack, ag

class ac
    implements h
{

    final v a;
    final ag b;
    final ListView c;
    final StickerStoreFragment d;

    ac(StickerStoreFragment stickerstorefragment, v v1, ag ag1, ListView listview)
    {
        d = stickerstorefragment;
        a = v1;
        b = ag1;
        c = listview;
        super();
    }

    public void a(OperationResult operationresult)
    {
        operationresult = ((FetchStickerPacksResult)operationresult.h()).a();
        if (a == v.USER_PACKS)
        {
            StickerStoreFragment.d(d).clear();
            StickerPack stickerpack;
            for (Iterator iterator = operationresult.iterator(); iterator.hasNext(); StickerStoreFragment.d(d).add(stickerpack.a()))
            {
                stickerpack = (StickerPack)iterator.next();
            }

        }
        if (b == ag.FEATURED)
        {
            et et1 = new et();
            operationresult = operationresult.iterator();
            do
            {
                if (!operationresult.hasNext())
                {
                    break;
                }
                StickerPack stickerpack1 = (StickerPack)operationresult.next();
                if (stickerpack1.h())
                {
                    et1.b(stickerpack1);
                }
            } while (true);
            operationresult = et1.b();
        }
        StickerStoreFragment.a(d, c, operationresult);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        com.facebook.debug.log.b.e(StickerStoreFragment.a(), "Error loading pack list", throwable);
        d.a(b);
        StickerStoreFragment.a(d, c);
    }
}
