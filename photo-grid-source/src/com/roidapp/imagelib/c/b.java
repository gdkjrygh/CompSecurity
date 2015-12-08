// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.c;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.roidapp.baselib.b.i;
import com.roidapp.baselib.c.c;
import com.roidapp.baselib.c.l;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.roidapp.imagelib.c:
//            h, g, d, f, 
//            c

public final class b
{

    private static final Lock b = new ReentrantLock();
    private final i a;
    private f c;
    private Boolean d;

    public b(i j)
    {
        d = Boolean.valueOf(false);
        a = j;
    }

    static Lock a()
    {
        return b;
    }

    public final void a(ImageView imageview, h h1, Drawable drawable)
    {
        if (c == null)
        {
            throw new RuntimeException("not set bitmap loader");
        }
        android.graphics.Bitmap bitmap = a.a(h1.a);
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
        } else
        {
            imageview.setImageDrawable(drawable);
            drawable = (g)imageview.getTag();
            boolean flag;
            if (drawable == null)
            {
                flag = true;
            } else
            if (g.a(drawable).a.equals(h1.a) && drawable.getStatus$2cfd0ac4() != l.c)
            {
                flag = false;
            } else
            {
                drawable.cancel(true);
                flag = true;
            }
            if (flag)
            {
                h1 = new g(imageview, h1, a);
                imageview.setTag(h1);
                h1.executeOnExecutor(c.SINGLE_EXECUTOR, new Object[] {
                    d, c
                });
                return;
            }
        }
    }

    public final void a(com.roidapp.imagelib.c.c c1)
    {
        if (d.booleanValue())
        {
            return;
        }
        b.lock();
        d = Boolean.valueOf(true);
        if (a != null)
        {
            a.a();
        }
        (new d(c1)).executeOnExecutor(c.SINGLE_EXECUTOR, new Object[0]);
        b.unlock();
        return;
        c1;
        b.unlock();
        throw c1;
    }

    public final void a(f f)
    {
        c = f;
    }

}
