// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.widget.GridView;
import com.kik.g.i;

// Referenced classes of package com.kik.cards.usermedia:
//            q, CustomGalleryActivity

final class f extends i
{

    final CustomGalleryActivity a;

    f(CustomGalleryActivity customgalleryactivity)
    {
        a = customgalleryactivity;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (q)obj1;
        obj1 = (CustomGalleryActivity.b)CustomGalleryActivity.c(a).getAdapter();
        ((CustomGalleryActivity.b) (obj1)).a(((q) (obj)));
        ((CustomGalleryActivity.b) (obj1)).notifyDataSetChanged();
        CustomGalleryActivity.c(a).requestLayout();
    }
}
