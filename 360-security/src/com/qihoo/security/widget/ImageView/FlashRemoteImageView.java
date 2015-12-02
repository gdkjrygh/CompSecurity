// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.ImageView;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;
import com.nineoldandroids.a.o;

// Referenced classes of package com.qihoo.security.widget.ImageView:
//            ColorFilterImageView, a

public class FlashRemoteImageView extends ColorFilterImageView
{

    boolean b;
    private int d;
    private int e;
    private int f;
    private long g;
    private com.qihoo.security.widget.ImageView.a h;
    private int i;
    private float j;
    private String k;
    private String l;

    public FlashRemoteImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        g = 3500L;
        h = null;
        i = 0;
    }

    static int a(FlashRemoteImageView flashremoteimageview, int i1)
    {
        flashremoteimageview.i = i1;
        return i1;
    }

    public void a(long l1)
    {
        if (h == null)
        {
            h = new com.qihoo.security.widget.ImageView.a();
        }
        h.b(d);
        h.c(e);
        h.a(f);
        h.a(j);
        o o1 = o.b(new int[] {
            0, 255, 50, 255, 50, 0
        });
        o1.d(g);
        o1.a(l1);
        o1.a(new com.nineoldandroids.a.o.b() {

            final FlashRemoteImageView a;

            public void a(o o2)
            {
                com.qihoo.security.widget.ImageView.FlashRemoteImageView.a(a, ((Integer)o2.o()).intValue());
                a.invalidate();
            }

            
            {
                a = FlashRemoteImageView.this;
                super();
            }
        });
        o1.a(new b() {

            final FlashRemoteImageView a;

            public void a(a a1)
            {
                super.a(a1);
                a.b = true;
                com.qihoo.security.widget.ImageView.FlashRemoteImageView.a(a, 0);
                a.invalidate();
            }

            public void b(a a1)
            {
                super.b(a1);
                a.b = false;
                a.invalidate();
            }

            
            {
                a = FlashRemoteImageView.this;
                super();
            }
        });
        o1.a();
    }

    public void b(String s, int i1)
    {
        super.b(s, i1);
        k = s;
    }

    public void draw(Canvas canvas)
    {
label0:
        {
            super.draw(canvas);
            if (h != null)
            {
                if (!b || TextUtils.isEmpty(l) || !l.equals(k))
                {
                    break label0;
                }
                if (h.a() != null)
                {
                    super.draw(h.a());
                }
                h.setLevel(i);
                h.draw(canvas);
            }
            return;
        }
        h.c();
    }

    public float getBlurWidth()
    {
        return j;
    }

    public int getShadowColor()
    {
        return f;
    }

    public int getShadowHeight()
    {
        return e;
    }

    public int getShadowWidth()
    {
        return d;
    }

    public void setAnimateTime(long l1)
    {
        g = l1;
    }

    public void setBlurWidth(float f1)
    {
        j = f1;
    }

    public void setFlashPkg(String s)
    {
        l = s;
    }

    public void setShadowColor(int i1)
    {
        f = i1;
    }

    public void setShadowHeight(int i1)
    {
        e = i1;
    }

    public void setShadowWidth(int i1)
    {
        d = i1;
    }
}
