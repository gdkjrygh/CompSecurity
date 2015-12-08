// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;

// Referenced classes of package kik.android.widget:
//            KikNetworkedImageView, cs, w

public class GalleryImageView extends KikNetworkedImageView
{

    private static Bitmap a;

    public GalleryImageView(Context context)
    {
        this(context, null);
    }

    public GalleryImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GalleryImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(a);
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }

    protected final w a(Bitmap bitmap, String s)
    {
        return new cs(bitmap, s);
    }

    static 
    {
        Bitmap bitmap = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.RGB_565);
        a = bitmap;
        bitmap.eraseColor(0xffcccccc);
    }
}
