// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import android.content.Intent;

// Referenced classes of package com.fitbit.galileo.bluetooth:
//            g, f

class a
    implements a
{

    final g a;

    public void a(f f1)
    {
        Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_STARTED");
        g.a(a, f1, intent);
    }

    public void b(f f1)
    {
        Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_COMPLETED");
        g.b(a, f1, intent);
    }

    public void c(f f1)
    {
        Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_CANCELED");
        g.b(a, f1, intent);
    }

    public void d(f f1)
    {
        Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_FAILED");
        intent.putExtra("com.fitbit.galileo.bluetooth.GalileoTaskManager.EXTRA_TASK_FAIL_REASON", f1.s());
        g.b(a, f1, intent);
    }

    public void e(f f1)
    {
        Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_SUSPENDED");
        g.a(a, f1, intent);
    }

    (g g1)
    {
        a = g1;
        super();
    }
}
