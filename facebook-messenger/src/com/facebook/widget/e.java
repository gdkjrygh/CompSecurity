// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.c.a.b;
import com.facebook.c.a.d;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.widget:
//            g

public class e extends LinearLayout
    implements g
{

    private d a;

    public e(Context context)
    {
        super(context);
    }

    public e(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private e(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
    }

    protected View a(int i)
    {
        return findViewById(i);
    }

    protected void b()
    {
        if (a != null)
        {
            a.a(getEventBus());
        }
    }

    protected void c()
    {
        if (a != null)
        {
            a.b(getEventBus());
        }
    }

    protected b getEventBus()
    {
        return null;
    }

    protected t getInjector()
    {
        return t.a(getContext());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        b();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c();
    }

    public void onFinishTemporaryDetach()
    {
        super.onFinishTemporaryDetach();
        b();
    }

    public void onStartTemporaryDetach()
    {
        super.onStartTemporaryDetach();
        c();
    }

    protected void setContentView(int i)
    {
        com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a("CustomLinearLayout.setContentView");
        LayoutInflater.from(getContext()).inflate(i, this);
        e1.a();
    }
}
