// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class dqs extends dqx
{

    private final ViewGroup k;

    public dqs(Context context, doh doh)
    {
        super(new FrameLayout(context), doh);
        k = (ViewGroup)a;
        k.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    protected final void a(drf drf, doj doj)
    {
        drf = (drc)drf;
        k.removeAllViews();
        drf = ((drc) (drf)).b;
        if (drf.getParent() != k)
        {
            ggp.b(drf);
            k.addView(drf, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    protected final void u()
    {
        k.removeAllViews();
    }
}
