// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.ui.viewflipper;

import Dq;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.snapchat.android.ui.VerticalSwipeLayout;
import rN;
import rO;
import rP;

public class CameraViewFlipper extends VerticalSwipeLayout
{
    public static interface a
    {

        public abstract void i();
    }


    public boolean a;
    public a b;
    private final rN e;
    private final rO f;
    private int g;

    public CameraViewFlipper(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, new rN(), new rO());
    }

    private CameraViewFlipper(Context context, AttributeSet attributeset, rN rn, rO ro)
    {
        super(context, attributeset);
        a = false;
        b = null;
        a(new Dq(this));
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100d4
        });
        g = context.getColor(0, 0);
        context.recycle();
        e = rn;
        f = ro;
        d = true;
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected final void a(boolean flag)
    {
        if (flag)
        {
            super.a(flag);
        }
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        Object obj = e;
        i = j / ((rN) (obj)).c;
        float f1 = ((rN) (obj)).b.a(i, j);
        float f2 = ((rN) (obj)).b.a(i + 1, j);
        float f3 = ((rN) (obj)).a.a(i);
        setBackgroundColor(Color.argb((int)(255F * (((rN) (obj)).a.a(i + 1) * f2 + f1 * f3)), Color.red(g), Color.green(g), Color.blue(g)));
        obj = findViewById(0x7f0d00b0);
        if (obj != null)
        {
            ((View) (obj)).setAlpha(f.a(0, j));
        }
        obj = findViewById(0x7f0d00b1);
        if (obj != null)
        {
            ((View) (obj)).setAlpha(f.a(1, j));
        }
    }

    public void setBackgroundViewVisibility(int i)
    {
        if (i == 0)
        {
            i = Color.argb(Color.alpha(g), Color.red(g), Color.green(g), Color.blue(g));
        } else
        {
            i = 0;
        }
        setBackgroundColor(i);
    }

    public void setCameraViewFlipperListener(a a1)
    {
        b = a1;
    }

    public void setInProfilePictureView(boolean flag)
    {
        a = flag;
    }
}
