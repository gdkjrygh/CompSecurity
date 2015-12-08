// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.fitbit.e.a;
import com.fitbit.util.service.c;

// Referenced classes of package com.fitbit.home.ui:
//            k, f

public class g extends c
    implements com.fitbit.util.service.b.b
{

    private static final String a = "NetworkOperationBinder";
    private f b;

    public g(FragmentActivity fragmentactivity, int j)
    {
        this(fragmentactivity, j, ((f) (new k(fragmentactivity))));
    }

    public g(FragmentActivity fragmentactivity, int j, f f1)
    {
        super(fragmentactivity, null, j);
        a(new com.fitbit.util.service.b.a(this));
        b = f1;
        if (!l())
        {
            b.h();
        }
    }

    public void a()
    {
        com.fitbit.e.a.a("NetworkOperationBinder", "Sync completed", new Object[0]);
        b.d();
    }

    public void a(Intent intent)
    {
        super.a(intent);
        b.c();
    }

    public void a(f f1)
    {
        b = f1;
        if (f1 != null && !l())
        {
            f1.h();
        }
    }

    public void a(Exception exception)
    {
        com.fitbit.e.a.a("NetworkOperationBinder", "Sync error: %s", exception, new Object[] {
            exception
        });
        b.a(exception);
    }

    public void b()
    {
        com.fitbit.e.a.a("NetworkOperationBinder", "Sync started", new Object[0]);
    }

    public f i()
    {
        return b;
    }
}
