// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.Button;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bm, bk, gd

private class setHeight extends Button
{

    final bm a;

    public (bm bm1, Context context)
    {
        a = bm1;
        super(context);
        bm1 = bm.a(bm1).r().a(v);
        setBackgroundDrawable(new BitmapDrawable(bm1));
        setWidth(bm1.getWidth());
        setHeight(bm1.getHeight());
    }
}
