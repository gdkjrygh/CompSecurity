// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.TextureView;

// Referenced classes of package kik.android.widget:
//            a

public class ICSCameraPreviewView extends TextureView
    implements a
{

    private int a;
    private int b;
    private Context c;

    public ICSCameraPreviewView(Context context)
    {
        this(context, null);
    }

    public ICSCameraPreviewView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ICSCameraPreviewView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = -1;
        b = -1;
        setScaleX(1.00001F);
        c = context;
    }

    public final int a()
    {
        return b;
    }

    public final void a(int i, int j)
    {
        boolean flag = false;
        if (b != j || a != i)
        {
            flag = true;
        }
        b = j;
        a = i;
        if (flag)
        {
            requestLayout();
        }
    }

    public final int b()
    {
        return a;
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        if (a >= 0 && b >= 0)
        {
            float f = (float)a / (float)b;
            i = k;
            if ((float)k / (float)l < f)
            {
                i = (int)Math.min(c.getResources().getDisplayMetrics().widthPixels, Math.floor((float)l * f));
            }
            setMeasuredDimension(i, (int)Math.floor((float)i / f));
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }
}
