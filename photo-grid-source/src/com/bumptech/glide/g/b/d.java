// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.widget.ImageView;
import com.bumptech.glide.load.resource.a.b;

// Referenced classes of package com.bumptech.glide.g.b:
//            e, i

public class d extends e
{

    private int b;
    private b c;

    public d(ImageView imageview)
    {
        this(imageview, (byte)0);
    }

    private d(ImageView imageview, byte byte0)
    {
        super(imageview);
        b = -1;
    }

    public void a(b b1, com.bumptech.glide.g.a.d d1)
    {
        Object obj = b1;
        if (!b1.a())
        {
            float f = (float)((ImageView)a).getWidth() / (float)((ImageView)a).getHeight();
            float f1 = (float)b1.getIntrinsicWidth() / (float)b1.getIntrinsicHeight();
            obj = b1;
            if (Math.abs(f - 1.0F) <= 0.05F)
            {
                obj = b1;
                if (Math.abs(f1 - 1.0F) <= 0.05F)
                {
                    obj = new i(b1, ((ImageView)a).getWidth());
                }
            }
        }
        super.a(obj, d1);
        c = ((b) (obj));
        ((b) (obj)).a(b);
        ((b) (obj)).start();
    }

    protected final void a(Object obj)
    {
        obj = (b)obj;
        ((ImageView)a).setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
    }

    public volatile void a(Object obj, com.bumptech.glide.g.a.d d1)
    {
        a((b)obj, d1);
    }

    public final void b()
    {
        if (c != null)
        {
            c.start();
        }
    }

    public final void c()
    {
        if (c != null)
        {
            c.stop();
        }
    }
}
