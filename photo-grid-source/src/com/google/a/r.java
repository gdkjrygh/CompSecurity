// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.d.a;
import com.google.a.d.f;

// Referenced classes of package com.google.a:
//            am

final class r extends am
{

    private am a;

    r()
    {
    }

    public final Object a(a a1)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            return a.a(a1);
        }
    }

    public final void a(am am1)
    {
        if (a != null)
        {
            throw new AssertionError();
        } else
        {
            a = am1;
            return;
        }
    }

    public final void a(f f, Object obj)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            a.a(f, obj);
            return;
        }
    }
}
