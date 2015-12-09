// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmItem

public final class AlarmItem_ extends AlarmItem
    implements a, b
{

    private boolean g;
    private final c h;

    public AlarmItem_(Context context)
    {
        super(context);
        g = false;
        h = new c();
        a();
    }

    public AlarmItem_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = false;
        h = new c();
        a();
    }

    public AlarmItem_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        g = false;
        h = new c();
        a();
    }

    public static AlarmItem a(Context context)
    {
        context = new AlarmItem_(context);
        context.onFinishInflate();
        return context;
    }

    public static AlarmItem a(Context context, AttributeSet attributeset)
    {
        context = new AlarmItem_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static AlarmItem a(Context context, AttributeSet attributeset, int i)
    {
        context = new AlarmItem_(context, attributeset, i);
        context.onFinishInflate();
        return context;
    }

    private void a()
    {
        c c1 = c.a(h);
        c.a(this);
        c.a(c1);
    }

    public void a(a a1)
    {
        b = (TextView)a1.findViewById(0x7f110324);
        c = (TextView)a1.findViewById(0x7f110325);
        d = a1.findViewById(0x1020002);
        e = a1.findViewById(0x7f110323);
        f = (TextView)a1.findViewById(0x7f110326);
        a = (TextView)a1.findViewById(0x7f110145);
    }

    public void onFinishInflate()
    {
        if (!g)
        {
            g = true;
            inflate(getContext(), 0x7f0400d7, this);
            h.a(this);
        }
        super.onFinishInflate();
    }
}
