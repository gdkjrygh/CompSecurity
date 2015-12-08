// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;

final class h extends Paint
{

    h()
    {
        setAntiAlias(true);
        setDither(true);
        setFilterBitmap(true);
        setStyle(android.graphics.Paint.Style.FILL);
        setColor(0);
        setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
    }
}
