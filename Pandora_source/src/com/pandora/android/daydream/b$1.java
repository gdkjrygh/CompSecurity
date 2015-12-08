// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.pandora.android.daydream:
//            b

class a
    implements Runnable
{

    final Bitmap a;
    final b b;

    public void run()
    {
        com.pandora.android.daydream.b.a(b).setImageBitmap(a);
        com.pandora.android.daydream.b.a(b).setScrollX(com.pandora.android.daydream.b.b(b).getScrollX());
        com.pandora.android.daydream.b.a(b).setScrollY(com.pandora.android.daydream.b.b(b).getScrollY());
        com.pandora.android.daydream.b.a(b).setVisibility(0);
        com.pandora.android.daydream.b.b(b).setVisibility(4);
        com.pandora.android.daydream.b.c(b).c();
        com.pandora.android.daydream.b.c(b).a(a.getWidth(), a.getHeight());
        com.pandora.android.daydream.b.c(b).b();
    }

    (b b1, Bitmap bitmap)
    {
        b = b1;
        a = bitmap;
        super();
    }
}
