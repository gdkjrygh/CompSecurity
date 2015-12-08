// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.kik.cache.ContentPreviewImageView;
import java.lang.reflect.Field;
import kik.android.chat.KikApplication;
import kik.android.util.e;

public class ClampedContentPreviewView extends ContentPreviewImageView
{

    private Point h;
    private Field i;
    private Field j;
    private Field k;
    private Field l;
    private int m;

    public ClampedContentPreviewView(Context context)
    {
        super(context);
        h = new Point();
        a();
    }

    public ClampedContentPreviewView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new Point();
        a();
    }

    private void a()
    {
        try
        {
            i = android/widget/ImageView.getDeclaredField("mMaxWidth");
            j = android/widget/ImageView.getDeclaredField("mMaxHeight");
            k = android/view/View.getDeclaredField("mMinWidth");
            l = android/view/View.getDeclaredField("mMinHeight");
            i.setAccessible(true);
            j.setAccessible(true);
            k.setAccessible(true);
            l.setAccessible(true);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    protected final Point b(int i1, int j1)
    {
        int k1;
        int i2;
        k1 = KikApplication.a(205);
        i2 = KikApplication.a(267);
        int l1 = ((Integer)i.get(this)).intValue();
        k1 = l1;
        int j2 = ((Integer)j.get(this)).intValue();
        k1 = j2;
        i2 = l1;
        l1 = k1;
_L2:
        return e.a(i1, j1, i2, l1);
        Exception exception;
        exception;
        l1 = i2;
        i2 = k1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void d(int i1)
    {
        m = i1;
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        Drawable drawable = getDrawable();
        if (drawable == null)
        {
            super.onMeasure(i1, j1);
            return;
        }
        i2 = drawable.getIntrinsicHeight();
        int j2 = drawable.getIntrinsicWidth();
        int k2;
        int i3;
        int j3;
        if (a == null)
        {
            h = b(j2, i2);
        } else
        {
            h = a;
        }
        if (h != null)
        {
            j2 = h.x;
            i2 = h.y;
        }
        k2 = 0;
        j1 = 0;
        i3 = 0;
        i1 = i3;
        k1 = k2;
        l1 = ((Integer)i.get(this)).intValue();
        i1 = i3;
        j1 = l1;
        k1 = k2;
        k2 = ((Integer)j.get(this)).intValue();
        i1 = i3;
        j1 = l1;
        k1 = k2;
        i3 = ((Integer)k.get(this)).intValue();
        i1 = i3;
        j1 = l1;
        k1 = k2;
        j3 = ((Integer)l.get(this)).intValue();
        k1 = l1;
        i1 = k2;
        j1 = j3;
        l1 = i3;
_L1:
        k2 = j2;
        if (l1 > 0)
        {
            k2 = j2;
            if (j2 < l1)
            {
                k2 = l1;
            }
        }
        j2 = k2;
        if (k1 > 0)
        {
            j2 = k2;
            if (k2 > k1)
            {
                j2 = k1;
            }
        }
        int l2;
        if (j1 > 0 && i2 < j1)
        {
            l2 = j1;
        } else
        {
            l2 = i2;
        }
        i2 = l2;
        if (i1 > 0)
        {
            i2 = l2;
            if (l2 > i1)
            {
                i2 = i1;
            }
        }
        if ((double)j2 / (double)i2 < 0.5625D)
        {
            double d1;
            double d2;
            Exception exception;
            boolean flag;
            if (j2 > i2)
            {
                d2 = j2;
                d1 = i2;
            } else
            {
                d1 = KikApplication.a(267);
                d2 = (double)KikApplication.a(267) * 0.5625D;
            }
            i2 = (int)Math.ceil(d1 - (double)m);
            j2 = (int)Math.ceil(d2);
        }
        l2 = j2;
        if (l1 > 0)
        {
            l2 = j2;
            if (j2 < l1)
            {
                l2 = l1;
            }
        }
        l1 = l2;
        if (k1 > 0)
        {
            l1 = l2;
            if (l2 > k1)
            {
                l1 = k1;
            }
        }
        k1 = i2;
        if (j1 > 0)
        {
            k1 = i2;
            if (i2 < j1)
            {
                k1 = j1;
            }
        }
        j1 = k1;
        if (i1 > 0)
        {
            j1 = k1;
            if (k1 > i1)
            {
                j1 = i1;
            }
        }
        setMeasuredDimension(l1 + (b + c), j1);
        return;
        exception;
        flag = false;
        l1 = i1;
        l2 = j1;
        i1 = k1;
        j1 = ((flag) ? 1 : 0);
        k1 = l2;
          goto _L1
    }
}
