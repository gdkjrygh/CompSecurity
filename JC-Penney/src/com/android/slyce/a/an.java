// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.e;

// Referenced classes of package com.android.slyce.a:
//            am

public abstract class an
    implements am
{

    a a;
    e b;
    private boolean c;

    public an()
    {
    }

    public void a(e e)
    {
        b = e;
    }

    protected void a(Exception exception)
    {
        if (!c)
        {
            c = true;
            if (h() != null)
            {
                h().a(exception);
                return;
            }
        }
    }

    public final void b(a a1)
    {
        a = a1;
    }

    public e f()
    {
        return b;
    }

    public final a h()
    {
        return a;
    }
}
