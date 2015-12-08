// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.f;
import a.a.a.a.s;

// Referenced classes of package com.b.a.a:
//            b, w

final class e
    implements Runnable
{

    final b a;

    e(b b1)
    {
        a = b1;
        super();
    }

    public final void run()
    {
        try
        {
            a.b.b();
            return;
        }
        catch (Exception exception)
        {
            f.d().b("Answers", "Failed to send events files", exception);
        }
    }
}
