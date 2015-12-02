// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.c.a.b;
import com.facebook.c.a.d;
import com.facebook.debug.d.e;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.widget:
//            g

public class CustomRelativeLayout extends RelativeLayout
    implements g
{

    private d a;

    public CustomRelativeLayout(Context context)
    {
        super(context);
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
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
        e e1 = e.a("CustomRelativeLayout.setContentView");
        LayoutInflater.from(getContext()).inflate(i, this);
        e1.a();
    }
}
