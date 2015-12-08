// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

public class aez extends android.view.ViewGroup.MarginLayoutParams
{

    public afn c;
    public final Rect d;
    public boolean e;
    boolean f;

    public aez(int i, int j)
    {
        super(i, j);
        d = new Rect();
        e = true;
        f = false;
    }

    public aez(aez aez1)
    {
        super(aez1);
        d = new Rect();
        e = true;
        f = false;
    }

    public aez(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new Rect();
        e = true;
        f = false;
    }

    public aez(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        d = new Rect();
        e = true;
        f = false;
    }

    public aez(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        d = new Rect();
        e = true;
        f = false;
    }
}
