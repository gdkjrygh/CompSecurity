// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import kik.a.d.a.a;
import kik.a.d.d;
import kik.a.e.n;
import kik.android.util.e;

public class IconImageView extends ImageView
{

    private Drawable a;

    public IconImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public IconImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, kik.android.ag.b.e);
        a = context.getDrawable(0);
        context.recycle();
    }

    public final void a(String s, n n1)
    {
        if (s == null)
        {
            setImageBitmap(null);
        } else
        {
            Bitmap bitmap = e.a(s);
            boolean flag;
            if (bitmap == null)
            {
                flag = false;
            } else
            {
                setImageBitmap(bitmap);
                flag = true;
            }
            if (!flag)
            {
                n1 = (Bitmap)n1.a(s, false);
                if (n1 != null)
                {
                    e.a(n1, s);
                    setImageBitmap(n1);
                    return;
                }
            }
        }
    }

    public final boolean a(a a1, n n1)
    {
        if (a1 == null)
        {
            a(((String) (null)), n1);
            return false;
        }
        boolean flag;
        boolean flag2;
        if (a1 != null && ("com.kik.ext.gallery".equals(a1.u()) || "com.kik.ext.video-gallery".equals(a1.u())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            setImageResource(0x7f020009);
            flag2 = true;
        } else
        {
            boolean flag1;
            if (a1 != null && ("com.kik.ext.camera".equals(a1.u()) || "com.kik.ext.video-camera".equals(a1.u())))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                setImageResource(0x7f020008);
                flag2 = true;
            } else
            {
                a1 = a1.a("icon");
                if (a1 == null || !(a1 instanceof d))
                {
                    a(((String) (null)), n1);
                    return false;
                }
                a1 = (d)a1;
                a(a1.b(), n1);
                if (a1.b() != null)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
            }
        }
        return flag2;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null)
        {
            a.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            a.draw(canvas);
        }
    }
}
