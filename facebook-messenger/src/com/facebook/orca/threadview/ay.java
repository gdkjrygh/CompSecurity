// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.l.a;
import com.facebook.l.x;
import com.facebook.messages.threads.ui.name.ThreadNameView;
import com.facebook.orca.p.b;
import com.facebook.widget.d;

// Referenced classes of package com.facebook.orca.threadview:
//            az, v

public class ay extends d
{

    private final b a;
    private final ImageView b;
    private final ThreadNameView c;
    private x d;

    public ay(Context context)
    {
        this(context, null);
    }

    public ay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ay(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        d = x.a;
        a = (b)getInjector().a(com/facebook/orca/p/b);
        setContentView(k.orca_thread_title_header);
        c = (ThreadNameView)c(i.thread_title_header_view);
        b = (ImageView)c(i.thread_title_header_image);
        context = new az(this);
        a.a(context);
    }

    private void a()
    {
        if (d.a() == a.AVAILABLE)
        {
            b.setImageResource(h.orca_online_icon);
            b.setVisibility(0);
            return;
        }
        if (d.b())
        {
            b.setImageResource(h.orca_mobile_icon);
            b.setVisibility(0);
            return;
        } else
        {
            b.setVisibility(8);
            return;
        }
    }

    private void a(x x1)
    {
        if (d == x1)
        {
            return;
        } else
        {
            b(x1);
            return;
        }
    }

    static void a(ay ay1, x x1)
    {
        ay1.a(x1);
    }

    private void b(x x1)
    {
        d = x1;
        a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a.a(true);
        b(a.c());
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a.a(false);
    }

    public void setThreadNameViewData(v v)
    {
        c.setData(v);
        a.a(v);
        b(a.c());
    }
}
