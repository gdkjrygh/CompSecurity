// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.o;
import com.facebook.orca.emoji.TabbedPageView;
import com.facebook.orca.server.FetchStickerPacksResult;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPopup

class m
    implements h
{

    final StickerPopup a;

    m(StickerPopup stickerpopup)
    {
        a = stickerpopup;
        super();
    }

    public void a(OperationResult operationresult)
    {
        b.b(StickerPopup.U(), "Sticker fetch succeeded");
        operationresult = (FetchStickerPacksResult)operationresult.h();
        StickerPopup.a(a, operationresult.a(), operationresult.b());
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        b.e(StickerPopup.U(), "Sticker fetch failed", throwable);
        StickerPopup.a(a).a(o.generic_error_message);
    }
}
