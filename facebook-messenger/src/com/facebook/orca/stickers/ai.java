// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import com.facebook.widget.images.k;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerStorePackFragment

class ai
    implements k
{

    final StickerStorePackFragment a;

    ai(StickerStorePackFragment stickerstorepackfragment)
    {
        a = stickerstorepackfragment;
        super();
    }

    public void a(Drawable drawable)
    {
        StickerStorePackFragment.b(a).setVisibility(8);
    }
}
