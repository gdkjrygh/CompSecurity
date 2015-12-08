// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            o

final class p
    implements Runnable
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public final void run()
    {
        android.graphics.drawable.Drawable drawable = BitmapDrawable.createFromPath(a.a);
        a.c.setImageDrawable(drawable);
    }
}
