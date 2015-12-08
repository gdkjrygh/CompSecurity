// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public final class aqn
    implements aqm
{

    public aqn()
    {
    }

    public final Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        return Bitmap.createBitmap(i, j, config);
    }

    public final void a()
    {
    }

    public final void a(int i)
    {
    }

    public final void a(Bitmap bitmap)
    {
        bitmap.recycle();
    }

    public final Bitmap b(int i, int j, android.graphics.Bitmap.Config config)
    {
        return Bitmap.createBitmap(i, j, config);
    }
}
