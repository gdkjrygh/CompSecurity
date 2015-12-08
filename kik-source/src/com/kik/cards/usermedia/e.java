// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.view.View;

// Referenced classes of package com.kik.cards.usermedia:
//            CustomGalleryActivity

final class e
    implements android.view.View.OnClickListener
{

    final CustomGalleryActivity a;

    e(CustomGalleryActivity customgalleryactivity)
    {
        a = customgalleryactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
    }
}
