// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.a.j;
import com.google.b.d.a;
import com.google.b.d.d;
import java.io.IOException;

// Referenced classes of package com.google.b:
//            x, w

public abstract class al
{

    public al()
    {
    }

    public final w a(Object obj)
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
            throw new x(((Throwable) (obj)));
        }
        return ((w) (obj));
    }

    public abstract Object a(a a1);

    public abstract void a(d d, Object obj);
}
