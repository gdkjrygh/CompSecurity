// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.orca.emoji.TabbedPageView;
import com.facebook.orca.emoji.ao;
import com.facebook.orca.server.FetchStickerPacksResult;
import com.google.common.a.es;
import com.google.common.d.a.h;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPopup, StickerPack, r

class q
    implements h
{

    final Set a;
    final StickerPopup b;

    q(StickerPopup stickerpopup, Set set)
    {
        b = stickerpopup;
        a = set;
        super();
    }

    public void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.b(StickerPopup.U(), "Sticker fetch succeeded");
        operationresult = ((FetchStickerPacksResult)operationresult.h()).a().iterator();
        do
        {
            if (!operationresult.hasNext())
            {
                break;
            }
            StickerPack stickerpack = (StickerPack)operationresult.next();
            if (!a.contains(stickerpack.a()) && stickerpack.i())
            {
                r r1 = new r(this, stickerpack);
                StickerPopup.a(b).a(new ao(Integer.valueOf(com.facebook.h.orca_emoji_category_people), stickerpack.f(), Integer.valueOf(com.facebook.h.orca_stickers_promoted_tab_icon), r1));
            }
        } while (true);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        com.facebook.debug.log.b.e(StickerPopup.U(), "Promoted sticker fetch failed", throwable);
    }
}
