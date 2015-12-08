// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.a.j;
import com.google.a.d.a;
import com.google.a.d.d;
import java.io.IOException;

// Referenced classes of package com.google.a:
//            u, t

public abstract class af
{

    public af()
    {
    }

    public final t a(Object obj)
    {
        try
        {
            j j1 = new j();
            a(((d) (j1)), obj);
            obj = j1.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new u(((Throwable) (obj)));
        }
        return ((t) (obj));
    }

    public abstract void a(d d, Object obj);

    public abstract Object b(a a1);
}
