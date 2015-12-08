// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import kik.a.e.n;
import kik.android.util.e;

// Referenced classes of package kik.android.widget:
//            v

public class LegacyLazyLoadingImage extends ImageView
{

    protected v a;
    private String b;
    private Bitmap c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Drawable j;
    private boolean k;

    public LegacyLazyLoadingImage(Context context)
    {
        super(context);
        e = true;
        f = 204;
        g = 204;
        h = 142;
        i = 142;
        k = false;
    }

    public LegacyLazyLoadingImage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = true;
        f = 204;
        g = 204;
        h = 142;
        i = 142;
        k = false;
        context = context.obtainStyledAttributes(attributeset, kik.android.ag.b.m);
        j = context.getDrawable(0);
        k = context.getBoolean(1, false);
        a = new v();
        if (getDrawable() == null)
        {
            e = false;
        }
        a.setCallback(this);
    }

    private void a(Bitmap bitmap)
    {
        a.setCallback(null);
        a = new v(bitmap, b);
    }

    private void a(v v1)
    {
        if (!e)
        {
            Object obj = v1;
            if (v1.a())
            {
                obj = j;
            }
            setImageDrawable(((Drawable) (obj)));
            return;
        }
        Object obj1 = v1;
        if (v1.a())
        {
            obj1 = j;
        }
        setBackgroundDrawable(((Drawable) (obj1)));
    }

    public final void a(String s, String s1, n n1)
    {
        if (s == null)
        {
            a = new v(null, b);
            a(a);
        } else
        {
            b = s;
            d = 2;
            s = (new StringBuilder()).append(b).append("-f").toString();
            boolean flag;
            if (k)
            {
                flag = false;
            } else
            {
                c = kik.android.util.e.a(s);
                a(c);
                a(a);
                if (c == null || c.isRecycled())
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                c = (Bitmap)n1.a(b, false);
                if (c == null && s1 != null)
                {
                    byte abyte0[] = n1.e(s1);
                    if (abyte0 != null)
                    {
                        c = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
                    }
                }
                if (c == null)
                {
                    if (d == 2)
                    {
                        setImageResource(0x7f0201a8);
                        return;
                    }
                } else
                {
                    if (n1.d(s1))
                    {
                        c = kik.android.util.e.a(c, h, i);
                    } else
                    {
                        c = kik.android.util.e.a(c, f, g);
                    }
                    kik.android.util.e.a(c, s);
                    a(c);
                    a(a);
                    return;
                }
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        a.setCallback(null);
        super.onDetachedFromWindow();
    }
}
