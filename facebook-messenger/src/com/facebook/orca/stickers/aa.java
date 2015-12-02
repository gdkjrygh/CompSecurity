// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.view.View;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerStoreFragment

class aa
    implements android.view.View.OnClickListener
{

    final StickerStoreFragment a;

    aa(StickerStoreFragment stickerstorefragment)
    {
        a = stickerstorefragment;
        super();
    }

    public void onClick(View view)
    {
        StickerStoreFragment.c(a);
    }
}
