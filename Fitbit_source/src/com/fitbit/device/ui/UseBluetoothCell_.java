// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.util.AttributeSet;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui:
//            UseBluetoothCell

public final class UseBluetoothCell_ extends UseBluetoothCell
    implements a
{

    private boolean a;
    private final c b;

    public UseBluetoothCell_(Context context)
    {
        super(context);
        a = false;
        b = new c();
        a();
    }

    public UseBluetoothCell_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        b = new c();
        a();
    }

    public UseBluetoothCell_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = false;
        b = new c();
        a();
    }

    public static UseBluetoothCell a(Context context)
    {
        context = new UseBluetoothCell_(context);
        context.onFinishInflate();
        return context;
    }

    public static UseBluetoothCell a(Context context, AttributeSet attributeset)
    {
        context = new UseBluetoothCell_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static UseBluetoothCell a(Context context, AttributeSet attributeset, int i)
    {
        context = new UseBluetoothCell_(context, attributeset, i);
        context.onFinishInflate();
        return context;
    }

    private void a()
    {
        c.a(c.a(b));
    }

    public void onFinishInflate()
    {
        if (!a)
        {
            a = true;
            inflate(getContext(), 0x7f04010f, this);
            b.a(this);
        }
        super.onFinishInflate();
    }
}
