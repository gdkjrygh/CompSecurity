// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.b.a.b.a.h;
import com.b.a.c.c;
import java.lang.ref.Reference;
import java.lang.reflect.Field;

// Referenced classes of package com.b.a.b.e:
//            d

public final class b extends d
{

    public b(ImageView imageview)
    {
        super(imageview);
    }

    private static int a(Object obj, String s)
    {
        int i;
        s = android/widget/ImageView.getDeclaredField(s);
        s.setAccessible(true);
        i = ((Integer)s.get(obj)).intValue();
        if (i > 0 && i < 0x7fffffff)
        {
            return i;
        }
        break MISSING_BLOCK_LABEL_41;
        obj;
        com.b.a.c.c.a(((Throwable) (obj)));
        return 0;
    }

    public final int a()
    {
        int i = super.a();
        if (i <= 0)
        {
            ImageView imageview = (ImageView)a.get();
            if (imageview != null)
            {
                return a(imageview, "mMaxWidth");
            }
        }
        return i;
    }

    protected final void a(Bitmap bitmap, View view)
    {
        ((ImageView)view).setImageBitmap(bitmap);
    }

    protected final void a(Drawable drawable, View view)
    {
        ((ImageView)view).setImageDrawable(drawable);
    }

    public final int b()
    {
        int i = super.b();
        if (i <= 0)
        {
            ImageView imageview = (ImageView)a.get();
            if (imageview != null)
            {
                return a(imageview, "mMaxHeight");
            }
        }
        return i;
    }

    public final int c()
    {
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            return h.a(imageview);
        } else
        {
            return super.c();
        }
    }

    public final volatile View d()
    {
        return (ImageView)super.d();
    }
}
