// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.view.View;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPopup

class n
    implements android.view.View.OnClickListener
{

    final StickerPopup a;

    n(StickerPopup stickerpopup)
    {
        a = stickerpopup;
        super();
    }

    public void onClick(View view)
    {
        StickerPopup.b(a);
    }
}
