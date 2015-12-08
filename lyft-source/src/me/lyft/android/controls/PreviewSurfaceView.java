// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class PreviewSurfaceView extends SurfaceView
{

    public PreviewSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            setZOrderMediaOverlay(true);
            getHolder().setType(3);
            return;
        }
    }

    private void setLayoutSize(int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (layoutparams.width != i || layoutparams.height != i)
        {
            layoutparams.width = i;
            layoutparams.height = i;
            setLayoutParams(layoutparams);
        }
    }

    public void expand()
    {
        setLayoutSize(-1);
    }

    public void shrink()
    {
        setLayoutSize(1);
    }
}
