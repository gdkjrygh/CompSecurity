// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.graphics.Bitmap;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af, Size

public abstract class j
{

    public final int a;
    public volatile boolean b;
    private final long c;
    private int d;

    public j(int i)
    {
        this(i, -1);
    }

    public j(int i, int k)
    {
        b = false;
        c = System.currentTimeMillis();
        d = i;
        a = k;
    }

    public int a()
    {
        return d;
    }

    public abstract Size b();

    public abstract Bitmap c();

    public abstract int d();

    public void e()
    {
        f();
        b = true;
    }

    public final void f()
    {
        if (b)
        {
            try
            {
                throw new RuntimeException();
            }
            catch (RuntimeException runtimeexception)
            {
                (new af()).f("Exception!", new Object[0]);
            }
        }
    }
}
