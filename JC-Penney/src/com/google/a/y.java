// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.ag;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.e;
import java.io.IOException;
import java.io.Reader;

// Referenced classes of package com.google.a:
//            x, t, ab, u

public final class y
{

    public y()
    {
    }

    public t a(a a1)
    {
        boolean flag;
        flag = a1.p();
        a1.a(true);
        t t1 = ag.a(a1);
        a1.a(flag);
        return t1;
        Object obj;
        obj;
        throw new x((new StringBuilder()).append("Failed parsing JSON source: ").append(a1).append(" to Json").toString(), ((Throwable) (obj)));
        obj;
        a1.a(flag);
        throw obj;
        obj;
        throw new x((new StringBuilder()).append("Failed parsing JSON source: ").append(a1).append(" to Json").toString(), ((Throwable) (obj)));
    }

    public t a(Reader reader)
    {
        t t1;
        try
        {
            reader = new a(reader);
            t1 = a(((a) (reader)));
            if (!t1.k() && reader.f() != c.j)
            {
                throw new ab("Did not consume the entire document.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new ab(reader);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new u(reader);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new ab(reader);
        }
        return t1;
    }
}
