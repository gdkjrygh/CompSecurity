// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.galileo.ui:
//            TrackerView

public final class TrackerView_ extends TrackerView
    implements a, b
{

    private boolean d;
    private final c e;

    public TrackerView_(Context context)
    {
        super(context);
        d = false;
        e = new c();
        a();
    }

    public TrackerView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = false;
        e = new c();
        a();
    }

    public TrackerView_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = false;
        e = new c();
        a();
    }

    public static TrackerView a(Context context)
    {
        context = new TrackerView_(context);
        context.onFinishInflate();
        return context;
    }

    public static TrackerView a(Context context, AttributeSet attributeset)
    {
        context = new TrackerView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static TrackerView a(Context context, AttributeSet attributeset, int i)
    {
        context = new TrackerView_(context, attributeset, i);
        context.onFinishInflate();
        return context;
    }

    private void a()
    {
        c c1 = c.a(e);
        c.a(this);
        c.a(c1);
    }

    public void a(a a1)
    {
        c = (ImageView)a1.findViewById(0x7f110381);
        a = (TextView)a1.findViewById(0x7f110382);
        b = (TextView)a1.findViewById(0x7f110383);
    }

    public void onFinishInflate()
    {
        if (!d)
        {
            d = true;
            inflate(getContext(), 0x7f04010e, this);
            e.a(this);
        }
        super.onFinishInflate();
    }
}
