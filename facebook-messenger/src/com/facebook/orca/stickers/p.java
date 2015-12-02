// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.orca.emoji.an;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPopup

class p
    implements an
{

    final StickerPopup a;

    p(StickerPopup stickerpopup)
    {
        a = stickerpopup;
        super();
    }

    public void a(int i)
    {
        StickerPopup.a(a, i);
    }

    public void a(String s)
    {
        StickerPopup.a(a, s);
    }
}
