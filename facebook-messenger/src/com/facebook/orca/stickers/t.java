// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPopup, Sticker

class t
    implements h
{

    final Sticker a;
    final StickerPopup b;

    t(StickerPopup stickerpopup, Sticker sticker)
    {
        b = stickerpopup;
        a = sticker;
        super();
    }

    public void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.b(StickerPopup.U(), (new StringBuilder()).append("Sticker added to recent list: ").append(a.a()).toString());
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        com.facebook.debug.log.b.e(StickerPopup.U(), "Failed to add sticker to recent list", throwable);
    }
}
