// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.aj.f;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g

final class d
    implements Runnable
{

    private Object a;
    private int b;
    private c c;
    private f d;
    private c e;

    public final void run()
    {
        try
        {
            e.e(a, b, c, d);
            return;
        }
        catch (Throwable throwable)
        {
            g.a.log(Level.WARNING, "Exception thrown during refresh", throwable);
            c.c(throwable);
            return;
        }
    }

    ( , Object obj, int i,  1, f f)
    {
        e = ;
        a = obj;
        b = i;
        c = 1;
        d = f;
        super();
    }
}
