// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;

final class gvp extends guz
{

    private gve k;

    gvp(Picasso picasso, ImageView imageview, gvz gvz, int i, Drawable drawable, String s, Object obj, 
            gve gve1, boolean flag)
    {
        super(picasso, imageview, gvz, i, drawable, s, obj, flag);
        k = gve1;
    }

    public final void a()
    {
        ImageView imageview = (ImageView)c.get();
        if (imageview != null)
        {
            if (e != 0)
            {
                imageview.setImageResource(e);
            } else
            if (f != null)
            {
                imageview.setImageDrawable(f);
            }
            if (k != null)
            {
                k.b();
                return;
            }
        }
    }

    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
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
            android.content.Context context = a.d;
            boolean flag = a.g;
            gvw.a(imageview, context, bitmap, loadedfrom, d, flag);
            if (k != null)
            {
                k.a();
                return;
            }
        }
    }

    final void b()
    {
        super.b();
        if (k != null)
        {
            k = null;
        }
    }
}
