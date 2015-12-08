// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.util.AttributeSet;
import kik.a.d.d;
import kik.a.e.n;
import kik.android.util.bx;
import kik.android.widget.KikNetworkedImageView;
import kik.android.widget.c;
import kik.android.widget.cs;
import kik.android.widget.w;

// Referenced classes of package com.kik.cache:
//            i, ad

public abstract class ContentPreviewImageView extends KikNetworkedImageView
{

    protected Point a;
    protected int b;
    protected int c;
    protected int d;
    private String h;
    private int i;

    public ContentPreviewImageView(Context context)
    {
        super(context);
        i = kik.android.widget.c.a.c;
        d = 0;
    }

    public ContentPreviewImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = kik.android.widget.c.a.c;
        d = 0;
    }

    public ContentPreviewImageView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        i = kik.android.widget.c.a.c;
        d = 0;
    }

    protected w a(Bitmap bitmap, String s)
    {
        if (isInEditMode())
        {
            return new cs(bitmap, null);
        } else
        {
            bitmap = new c(bitmap, i);
            bitmap.a(b, c);
            bitmap.a(a);
            bitmap.b(d);
            return bitmap;
        }
    }

    public final void a(int j)
    {
        i = j;
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof c))
        {
            ((c)drawable).a(i);
        }
        invalidate();
    }

    public final void a(int j, int k)
    {
        b = j;
        c = k;
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof c))
        {
            ((c)drawable).a(b, c);
        }
    }

    public final void a(d d1, String s, ad ad1, boolean flag, n n1)
    {
        i j;
        if (ad1 == null)
        {
            return;
        }
        h = s;
        j = null;
        s = j;
        if (h == null) goto _L2; else goto _L1
_L1:
        s = j;
        if (d1 == null) goto _L2; else goto _L3
_L3:
        boolean flag1;
        s = d1.b();
        flag1 = n1.b(s);
        j = com.kik.cache.i.a(d1, h, f, e, flag, n1);
        if (!flag1) goto _L5; else goto _L4
_L4:
        d1 = n1.c(s);
        a = b(d1[0], d1[1]);
        s = j;
_L2:
        a(((z) (s)), ad1, 0, 0, false, true);
        return;
_L5:
        s = j;
        if (ad1.a(j))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = null;
        n1 = n1.e(h);
        d1 = s;
        if (n1 != null)
        {
            try
            {
                d1 = BitmapFactory.decodeByteArray(n1, 0, n1.length);
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                bx.a(d1);
                d1 = s;
            }
        }
        s = j;
        if (d1 != null)
        {
            ad1.a(d1, j);
            d(d1);
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected abstract Point b(int j, int k);

    public final void b(int j)
    {
        d = j;
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof c))
        {
            ((c)drawable).b(d);
        }
        invalidate();
    }

    protected final void b(Bitmap bitmap)
    {
        super.b(bitmap);
    }

    protected final void c(Bitmap bitmap)
    {
        super.c(bitmap);
    }
}
