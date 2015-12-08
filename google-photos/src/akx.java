// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.media.filterpacks.image.BitmapTarget;

public final class akx
    implements Runnable
{

    private Bitmap a;
    private BitmapTarget b;

    public akx(BitmapTarget bitmaptarget, Bitmap bitmap)
    {
        b = bitmaptarget;
        a = bitmap;
        super();
    }

    public final void run()
    {
        BitmapTarget.a(b).setImageBitmap(a);
    }
}
