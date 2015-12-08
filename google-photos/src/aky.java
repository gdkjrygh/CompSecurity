// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import androidx.media.filterpacks.image.BitmapTarget;

public final class aky
    implements Runnable
{

    private Bitmap a;
    private BitmapTarget b;

    public aky(BitmapTarget bitmaptarget, Bitmap bitmap)
    {
        b = bitmaptarget;
        a = bitmap;
        super();
    }

    public final void run()
    {
    }
}
