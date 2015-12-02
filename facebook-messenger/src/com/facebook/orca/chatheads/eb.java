// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.view.WindowManager;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.chatheads:
//            ee, ed, ec

public class eb
{

    private final Context a;
    private final WindowManager b;
    private ee c;
    private ec d;

    public eb(Context context, WindowManager windowmanager)
    {
        a = context;
        b = windowmanager;
    }

    static ec a(eb eb1)
    {
        return eb1.d;
    }

    public void a()
    {
        boolean flag;
        if (c == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        c = new ee(b);
        c.a(new ed(this, a));
        c.a();
    }

    public void a(ec ec)
    {
        d = ec;
    }

    public void b()
    {
        if (c != null)
        {
            d = null;
            c.b();
            c = null;
        }
    }
}
