// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

public final class JA
{

    private final Jy mBitmapPool;

    public JA()
    {
        this(Jy.a());
    }

    private JA(Jy jy)
    {
        mBitmapPool = jy;
    }

    public final void a(Bitmap bitmap)
    {
        mBitmapPool.a(bitmap);
    }

    public final void a(ImageView imageview, boolean flag)
    {
        boolean flag2 = Ic.SUPPORTS_UNEQUAL_SIZE_BITMAP_REUSE;
        if (imageview != null)
        {
            Object obj;
            boolean flag1;
            if (flag || flag2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = imageview.getDrawable();
            if (obj != null && (obj instanceof BitmapDrawable) && flag1)
            {
                obj = ((BitmapDrawable)obj).getBitmap();
                if (obj != null)
                {
                    mBitmapPool.a(((Bitmap) (obj)));
                }
            }
            imageview.setImageBitmap(null);
        }
    }
}
