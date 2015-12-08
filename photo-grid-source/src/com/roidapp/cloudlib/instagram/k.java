// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            j, InstagramListCloud

final class k
    implements Runnable
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public final void run()
    {
        if (!a.d.isFinishing())
        {
            android.graphics.drawable.Drawable drawable = BitmapDrawable.createFromPath(a.a);
            a.c.setImageDrawable(drawable);
        }
    }
}
