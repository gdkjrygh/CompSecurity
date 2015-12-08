// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.a.i;
import com.google.a.d.a;
import com.google.a.d.f;
import java.io.IOException;

// Referenced classes of package com.google.a:
//            y, x

public abstract class am
{

    public am()
    {
    }

    public final x a(Object obj)
    {
        try
        {
            i j = new i();
            a(((f) (j)), obj);
            obj = j.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new y(((Throwable) (obj)));
        }
        return ((x) (obj));
    }

    public abstract Object a(a a1);

    public abstract void a(f f, Object obj);
}
