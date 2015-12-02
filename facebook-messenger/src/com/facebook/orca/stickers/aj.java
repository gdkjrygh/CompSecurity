// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.widget.Button;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.o;
import com.facebook.ui.d.a;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerStorePackFragment, StickerPack

class aj
    implements h
{

    final StickerPack a;
    final StickerStorePackFragment b;

    aj(StickerStorePackFragment stickerstorepackfragment, StickerPack stickerpack)
    {
        b = stickerstorepackfragment;
        a = stickerpack;
        super();
    }

    public void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.c(com.facebook.orca.stickers.StickerStorePackFragment.a(), (new StringBuilder()).append("Successfully added sticker pack ").append(a.a()).toString());
        b.a("sticker_pack_downloaded", a);
        StickerStorePackFragment.c(b).setText(o.sticker_store_downloaded);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        com.facebook.debug.log.b.e(com.facebook.orca.stickers.StickerStorePackFragment.a(), (new StringBuilder()).append("Unable to add sticker pack ").append(a.a()).toString(), throwable);
        b.a("sticker_pack_download_error", a);
        StickerStorePackFragment.c(b).setText(o.sticker_store_download);
        StickerStorePackFragment.c(b).setEnabled(true);
        com.facebook.ui.d.a.a(b.n()).a(o.app_error_dialog_title).b(o.generic_error_message).a();
    }
}
