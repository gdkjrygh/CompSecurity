// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.graphics.Bitmap;

// Referenced classes of package com.yume.android.player:
//            n

final class o
    implements Runnable
{

    private n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public final void run()
    {
        if (a.a && a.c != null && !a.c.isRecycled())
        {
            a.setImageBitmap(a.c);
        }
    }
}
