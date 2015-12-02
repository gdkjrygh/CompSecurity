// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.view.View;

// Referenced classes of package com.facebook.orca.stickers:
//            q, StickerPopup, StickerPack

class r
    implements android.view.View.OnClickListener
{

    final StickerPack a;
    final q b;

    r(q q1, StickerPack stickerpack)
    {
        b = q1;
        a = stickerpack;
        super();
    }

    public void onClick(View view)
    {
        StickerPopup.a(b.b, a);
    }
}
