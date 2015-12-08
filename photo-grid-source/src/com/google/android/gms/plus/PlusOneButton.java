// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.plus:
//            a, b

public final class PlusOneButton extends FrameLayout
{

    private View a;
    private int b;
    private int c;
    private String d;
    private int e;
    private b f;

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        byte byte0 = 2;
        super(context, attributeset);
        String s = com.google.android.gms.common.internal.f.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, "PlusOneButton");
        int i;
        if ("SMALL".equalsIgnoreCase(s))
        {
            i = 0;
        } else
        if ("MEDIUM".equalsIgnoreCase(s))
        {
            i = 1;
        } else
        if ("TALL".equalsIgnoreCase(s))
        {
            i = 2;
        } else
        {
            i = 3;
        }
        b = i;
        context = com.google.android.gms.common.internal.f.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(context))
        {
            i = byte0;
        } else
        if ("NONE".equalsIgnoreCase(context))
        {
            i = 0;
        } else
        {
            i = 1;
        }
        c = i;
        e = -1;
        context = getContext();
        if (a != null)
        {
            removeView(a);
        }
        a = com.google.android.gms.plus.internal.e.a(context, b, c, d, e);
        context = f;
        f = context;
        a.setOnClickListener(new a(this, context));
        addView(a);
        if (!isInEditMode());
    }

    static View a(PlusOneButton plusonebutton)
    {
        return plusonebutton.a;
    }

    static int b(PlusOneButton plusonebutton)
    {
        return plusonebutton.e;
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.layout(0, 0, k - i, l - j);
    }

    protected final void onMeasure(int i, int j)
    {
        View view = a;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
