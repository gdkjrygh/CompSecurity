// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

// Referenced classes of package com.fitbit.widget:
//            WidgetUpdaterService_

public static class a
{

    private Context a;
    private final Intent b;
    private Fragment c;

    public Intent a()
    {
        return b;
    }

    public b a(int i)
    {
        b.setFlags(i);
        return this;
    }

    public ComponentName b()
    {
        return a.startService(b);
    }

    public boolean c()
    {
        return a.stopService(b);
    }

    public (Context context)
    {
        a = context;
        b = new Intent(context, com/fitbit/widget/WidgetUpdaterService_);
    }

    public b(Fragment fragment)
    {
        c = fragment;
        a = fragment.getActivity();
        b = new Intent(a, com/fitbit/widget/WidgetUpdaterService_);
    }
}
