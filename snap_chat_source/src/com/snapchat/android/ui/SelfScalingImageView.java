// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.snapchat.android.Timber;

public class SelfScalingImageView extends ImageView
{
    public static final class a
    {

        final int a;
        final int b;

        a(int i, int j)
        {
            a = i;
            b = j;
        }
    }


    private int a;

    public SelfScalingImageView(Context context)
    {
        this(context, null);
    }

    public SelfScalingImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SelfScalingImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 17;
    }

    private void a()
    {
        Object obj;
        byte byte0;
        byte0 = -2;
        obj = c();
        if (obj != null) goto _L2; else goto _L1
_L1:
        Drawable drawable;
        return;
_L2:
        if ((drawable = getDrawable()) == null || getScaleType() == null) goto _L1; else goto _L3
_L3:
        int i;
        int j;
        int k;
        int l;
        i = drawable.getIntrinsicWidth();
        j = drawable.getIntrinsicHeight();
        k = ((View) (obj)).getWidth();
        l = ((View) (obj)).getHeight();
        obj = getScaleType();
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((android.widget.ImageView.ScaleType) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 104
    //                   1 137
    //                   2 185
    //                   3 251;
           goto _L4 _L5 _L6 _L7
_L4:
        throw new RuntimeException((new StringBuilder("ScaleType ")).append(((android.widget.ImageView.ScaleType) (obj)).name()).append(" is not supported.").toString());
_L5:
        obj = new a(k, l);
_L9:
        i = ((a) (obj)).a;
        j = ((a) (obj)).b;
        obj = getLayoutParams();
        if (obj == null)
        {
            throw new IllegalStateException("You need to add this to a View first.");
        }
        break; /* Loop/switch isn't completed */
_L6:
        float f2 = (float)i / (float)j;
        float f4 = k;
        float f = l;
        f2 /= f4 / f;
        if (f2 > 1.0F)
        {
            obj = new a(k, (int)(f / f2));
        } else
        {
            obj = new a((int)(f2 * (float)k), l);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        float f3 = (float)i / (float)j;
        float f5 = k;
        float f1 = l;
        f3 /= f5 / f1;
        if (f3 > 1.0F)
        {
            obj = new a((int)(f3 * (float)k), l);
        } else
        {
            obj = new a(k, (int)(f1 / f3));
        }
        if (true) goto _L9; else goto _L8
_L8:
        if (i == 0)
        {
            i = -2;
        }
        obj.width = i;
        if (j == 0)
        {
            i = byte0;
        } else
        {
            i = j;
        }
        obj.height = i;
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        return;
    }

    private void b()
    {
        Object obj;
        Object obj1;
        obj = c();
        if (obj == null)
        {
            Timber.e("SelfScalingImageView", "View has no parent. Aborting.", new Object[0]);
            return;
        }
        obj1 = getDrawable();
        if (obj1 == null)
        {
            Timber.e("SelfScalingImageView", "View has no background drawable. Aborting.", new Object[0]);
            return;
        }
        if (getScaleType() != android.widget.ImageView.ScaleType.CENTER_CROP) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        int i1;
        int i = ((Drawable) (obj1)).getIntrinsicWidth();
        int j = ((Drawable) (obj1)).getIntrinsicHeight();
        k = ((View) (obj)).getWidth();
        l = ((View) (obj)).getHeight();
        i1 = a;
        if ((float)i / (float)j / ((float)k / (float)l) > 1.0F)
        {
            obj = new a((int)((float)(i * l) / (float)j), l);
        } else
        {
            obj = new a(k, (int)((float)(j * k) / (float)i));
        }
        obj1 = new Rect();
        if (!Jo.e(i1)) goto _L4; else goto _L3
_L3:
        obj1.left = ((a) (obj)).a - k;
_L9:
        if (!Jo.c(i1)) goto _L6; else goto _L5
_L5:
        obj1.top = ((a) (obj)).b - l;
_L7:
        setPadding(((Rect) (obj1)).left, ((Rect) (obj1)).top, ((Rect) (obj1)).right, ((Rect) (obj1)).bottom);
        return;
_L4:
        if (Jo.f(i1))
        {
            obj1.right = ((a) (obj)).a - k;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (Jo.d(i1))
        {
            obj1.bottom = ((a) (obj)).b - l;
        }
        if (true) goto _L7; else goto _L2
_L2:
        setPadding(0, 0, 0, 0);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private ViewGroup c()
    {
        android.view.ViewParent viewparent = getParent();
        if (viewparent instanceof ViewGroup)
        {
            return (ViewGroup)viewparent;
        } else
        {
            return null;
        }
    }

    public void setGravity(int i)
    {
        a = i;
        b();
        a();
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        super.setScaleType(scaletype);
        b();
        a();
    }
}
