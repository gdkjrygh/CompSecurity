// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import dfv;

// Referenced classes of package com.spotify.mobile.android.ui.stuff:
//            BadgesFactory

public final class c
    implements dfv
{

    private dfv a;
    private Context b;
    private dgeSize c;

    public final Drawable a(Bitmap bitmap)
    {
        Context context;
        dgeSize dgesize;
        if (a != null)
        {
            bitmap = a.a(bitmap);
        } else
        {
            bitmap = new BitmapDrawable(b.getResources(), bitmap);
        }
        context = b;
        dgesize = c;
        return BadgesFactory.a(context, bitmap, context.getResources().getDimensionPixelSize(dgesize.sizeRes), context.getResources().getDimensionPixelSize(dgesize.marginRes));
    }

    public dgeSize(dfv dfv1, Context context, dgeSize dgesize)
    {
        a = dfv1;
        b = context;
        c = dgesize;
        super();
    }
}
