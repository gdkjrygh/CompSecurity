// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.c.a.b;
import com.facebook.debug.d.e;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.widget:
//            g

public class d extends FrameLayout
    implements g
{

    private com.facebook.c.a.d a;

    public d(Context context)
    {
        super(context);
    }

    public d(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public d(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected View c(int i)
    {
        return findViewById(i);
    }

    protected b getEventBus()
    {
        return null;
    }

    protected t getInjector()
    {
        return t.a(getContext());
    }

    protected void m()
    {
        if (a != null)
        {
            a.a(getEventBus());
        }
    }

    protected void n()
    {
        if (a != null)
        {
            a.b(getEventBus());
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        m();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        n();
    }

    public void onFinishTemporaryDetach()
    {
        super.onFinishTemporaryDetach();
        m();
    }

    public void onStartTemporaryDetach()
    {
        super.onStartTemporaryDetach();
        n();
    }

    protected void setContentView(int i)
    {
        e e1 = e.a("CustomFrameLayout.setContentView");
        LayoutInflater.from(getContext()).inflate(i, this);
        e1.a();
    }
}
