// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.an;

import android.widget.ImageView;
import p.ad.b;
import p.am.c;

// Referenced classes of package p.an:
//            e, j

public class d extends e
{

    private int b;
    private b c;

    public d(ImageView imageview)
    {
        this(imageview, -1);
    }

    public d(ImageView imageview, int i)
    {
        super(imageview);
        b = i;
    }

    protected volatile void a(Object obj)
    {
        a((b)obj);
    }

    public volatile void a(Object obj, c c1)
    {
        a((b)obj, c1);
    }

    protected void a(b b1)
    {
        ((ImageView)a).setImageDrawable(b1);
    }

    public void a(b b1, c c1)
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
                    obj = new j(b1, ((ImageView)a).getWidth());
                }
            }
        }
        super.a(obj, c1);
        c = ((b) (obj));
        ((b) (obj)).a(b);
        ((b) (obj)).start();
    }

    public void d()
    {
        if (c != null)
        {
            c.start();
        }
    }

    public void e()
    {
        if (c != null)
        {
            c.stop();
        }
    }
}
