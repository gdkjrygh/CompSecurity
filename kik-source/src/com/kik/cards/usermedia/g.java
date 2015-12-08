// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.widget.GridView;

// Referenced classes of package com.kik.cards.usermedia:
//            CustomGalleryActivity

final class g
    implements Runnable
{

    final int a;
    final CustomGalleryActivity b;

    g(CustomGalleryActivity customgalleryactivity, int i)
    {
        b = customgalleryactivity;
        a = i;
        super();
    }

    public final void run()
    {
        CustomGalleryActivity.c(b).smoothScrollBy(0, 0);
        CustomGalleryActivity.c(b).setSelection(a);
    }
}
