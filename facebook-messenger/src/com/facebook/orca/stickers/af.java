// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.view.View;

// Referenced classes of package com.facebook.orca.stickers:
//            ae, StickerStoreFragment, StickerPack

class af
    implements android.view.View.OnClickListener
{

    final StickerPack a;
    final boolean b;
    final ae c;

    af(ae ae1, StickerPack stickerpack, boolean flag)
    {
        c = ae1;
        a = stickerpack;
        b = flag;
        super();
    }

    public void onClick(View view)
    {
        StickerStoreFragment.a(c.a, a, b);
    }
}
