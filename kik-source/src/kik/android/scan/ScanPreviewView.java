// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import android.content.Context;
import android.util.AttributeSet;
import kik.android.widget.CameraPreviewView;

public class ScanPreviewView extends CameraPreviewView
{

    public ScanPreviewView(Context context)
    {
        super(context);
    }

    public ScanPreviewView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ScanPreviewView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        if (a() >= 0 && b() >= 0)
        {
            float f = (float)a() / (float)b();
            if ((float)k / (float)l < f)
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
