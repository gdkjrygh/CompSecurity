// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.Button;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            o, bk, gd

private class setFocusable extends Button
{

    final o a;

    public (o o1, Context context)
    {
        a = o1;
        super(context);
        o1 = o.a(o1).r().a(.v);
        setBackgroundDrawable(new BitmapDrawable(o1));
        setWidth(o1.getWidth());
        setHeight(o1.getHeight());
        setFocusable(false);
    }
}
