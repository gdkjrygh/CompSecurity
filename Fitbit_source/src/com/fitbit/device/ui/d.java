// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;

// Referenced classes of package com.fitbit.device.ui:
//            c

public final class d extends c
{

    private Context d;

    private d(Context context)
    {
        d = context;
        f();
    }

    public static d a(Context context)
    {
        return new d(context);
    }

    private void f()
    {
        a = d;
    }

    public void b(Context context)
    {
        d = context;
        f();
    }
}
