// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.util;

import android.graphics.Paint;
import android.graphics.Typeface;

// Referenced classes of package com.google.android.libraries.wordlens.util:
//            AndroidFontRenderer

final class a extends ThreadLocal
{

    a()
    {
    }

    protected final Object initialValue()
    {
        Paint paint = new Paint();
        paint.setTypeface((Typeface)AndroidFontRenderer.access$000().get());
        paint.setTextSize(10000F);
        paint.setAntiAlias(true);
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setARGB(255, 0, 0, 0);
        return paint;
    }
}
