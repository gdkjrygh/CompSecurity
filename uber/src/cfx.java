// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

final class cfx extends cfe
{

    cfj m;

    cfx(cgh cgh1, ImageView imageview, cgr cgr, int i, int j, int k, Drawable drawable, 
            String s, Object obj, cfj cfj1, boolean flag)
    {
        super(cgh1, imageview, cgr, i, j, k, drawable, s, obj, flag);
        m = cfj1;
    }

    public final void a()
    {
        ImageView imageview = (ImageView)c.get();
        if (imageview != null)
        {
            if (g != 0)
            {
                imageview.setImageResource(g);
            } else
            if (h != null)
            {
                imageview.setImageDrawable(h);
            }
            if (m != null)
            {
                m.b();
                return;
            }
        }
    }

    public final void a(Bitmap bitmap, cgl cgl)
    {
        if (bitmap == null)
        {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] {
                this
            }));
        }
        ImageView imageview = (ImageView)c.get();
        if (imageview != null)
        {
            android.content.Context context = a.c;
            boolean flag = a.k;
            cgo.a(imageview, context, bitmap, cgl, d, flag);
            if (m != null)
            {
                m.a();
                return;
            }
        }
    }

    final void b()
    {
        super.b();
        if (m != null)
        {
            m = null;
        }
    }
}
