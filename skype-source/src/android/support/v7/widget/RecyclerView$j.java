// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static class d extends android.view.nLayoutParams
{

     a;
    final Rect b;
    boolean c;
    boolean d;

    public (int i)
    {
        super(i, -2);
        b = new Rect();
        c = true;
        d = false;
    }

    public d(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Rect();
        c = true;
        d = false;
    }

    public d(d d1)
    {
        super(d1);
        b = new Rect();
        c = true;
        d = false;
    }

    public d(android.view.tParams tparams)
    {
        super(tparams);
        b = new Rect();
        c = true;
        d = false;
    }

    public (android.view.nLayoutParams nlayoutparams)
    {
        super(nlayoutparams);
        b = new Rect();
        c = true;
        d = false;
    }
}
