// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            ActivityStickyHeaderView

public final class ActivityStickyHeaderView_ extends ActivityStickyHeaderView
    implements a, b
{

    private boolean d;
    private final c e;

    public ActivityStickyHeaderView_(Context context)
    {
        super(context);
        d = false;
        e = new c();
        a();
    }

    public ActivityStickyHeaderView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = false;
        e = new c();
        a();
    }

    public ActivityStickyHeaderView_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = false;
        e = new c();
        a();
    }

    public static ActivityStickyHeaderView a(Context context, AttributeSet attributeset)
    {
        context = new ActivityStickyHeaderView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static ActivityStickyHeaderView a(Context context, AttributeSet attributeset, int i)
    {
        context = new ActivityStickyHeaderView_(context, attributeset, i);
        context.onFinishInflate();
        return context;
    }

    private void a()
    {
        c c1 = c.a(e);
        c.a(this);
        c.a(c1);
    }

    public static ActivityStickyHeaderView b(Context context)
    {
        context = new ActivityStickyHeaderView_(context);
        context.onFinishInflate();
        return context;
    }

    public void a(a a1)
    {
        a = (ViewGroup)a1.findViewById(0x7f110231);
        c = (TextView)a1.findViewById(0x7f11006b);
        b = (TextView)a1.findViewById(0x7f110391);
    }

    public void onFinishInflate()
    {
        if (!d)
        {
            d = true;
            inflate(getContext(), 0x7f040115, this);
            e.a(this);
        }
        super.onFinishInflate();
    }
}
