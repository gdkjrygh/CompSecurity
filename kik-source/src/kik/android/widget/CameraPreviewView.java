// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

// Referenced classes of package kik.android.widget:
//            a

public class CameraPreviewView extends SurfaceView
    implements a
{

    private int a;
    private int b;

    public CameraPreviewView(Context context)
    {
        this(context, null);
    }

    public CameraPreviewView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CameraPreviewView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = -1;
        b = -1;
        getHolder().setType(3);
    }

    public final int a()
    {
        return a;
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
        return b;
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        if (a >= 0 && b >= 0)
        {
            float f = (float)a / (float)b;
            if ((float)k / (float)l > f)
            {
                j = (int)Math.floor((float)l * f);
                i = l;
            } else
            {
                i = (int)Math.floor((float)k / f);
                j = k;
            }
            setMeasuredDimension(j, i);
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }
}
