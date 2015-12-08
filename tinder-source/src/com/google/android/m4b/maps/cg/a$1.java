// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.View;
import com.google.android.m4b.maps.df.h;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            a

final class c
    implements Runnable
{

    private Bitmap a;
    private boolean b;
    private h c;
    private a d;

    public final void run()
    {
        int i = d.a.getWidth();
        int j = d.a.getHeight();
        Bitmap bitmap;
        if (a.getWidth() != i || a.getHeight() != j)
        {
            bitmap = Bitmap.createBitmap(i, j, android.graphics.ap.Config.ARGB_8888);
        } else
        {
            bitmap = a;
        }
        ((TextureView)d.a).getBitmap(bitmap);
        d.a(bitmap, b);
        d.a(c, bitmap);
    }

    (a a1, Bitmap bitmap, h h)
    {
        d = a1;
        a = bitmap;
        b = false;
        c = h;
        super();
    }
}
