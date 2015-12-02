// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.view.View;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPopup, Sticker

class s
    implements android.view.View.OnClickListener
{

    final Sticker a;
    final String b;
    final int c;
    final StickerPopup d;

    s(StickerPopup stickerpopup, Sticker sticker, String s1, int i)
    {
        d = stickerpopup;
        a = sticker;
        b = s1;
        c = i;
        super();
    }

    public void onClick(View view)
    {
        StickerPopup.a(d, a, b, c);
    }
}
