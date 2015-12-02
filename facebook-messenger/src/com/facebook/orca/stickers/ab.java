// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.orca.server.FetchStickerPacksResult;
import com.google.common.a.es;
import com.google.common.d.a.h;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerStoreFragment, StickerPack

class ab
    implements h
{

    final StickerStoreFragment a;

    ab(StickerStoreFragment stickerstorefragment)
    {
        a = stickerstorefragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        operationresult = ((FetchStickerPacksResult)operationresult.h()).a();
        StickerStoreFragment.d(a).clear();
        StickerPack stickerpack;
        for (operationresult = operationresult.iterator(); operationresult.hasNext(); StickerStoreFragment.d(a).add(stickerpack.a()))
        {
            stickerpack = (StickerPack)operationresult.next();
        }

        StickerStoreFragment.a(a);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        b.e(StickerStoreFragment.a(), "Error loading pack list", throwable);
        StickerStoreFragment.a(a);
    }
}
