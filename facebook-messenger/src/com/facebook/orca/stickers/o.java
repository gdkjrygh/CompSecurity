// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.content.Context;
import android.view.View;
import com.facebook.orca.emoji.aq;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPopup

class o
    implements aq
{

    final StickerPopup a;

    o(StickerPopup stickerpopup)
    {
        a = stickerpopup;
        super();
    }

    public View a(Context context, Object obj, String s, int i)
    {
        return StickerPopup.a(a, context, obj, s, i);
    }
}
