// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.u;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.h;
import java.io.IOException;
import java.io.Reader;

// Referenced classes of package com.google.a:
//            ab, z, ag, y, 
//            x

public final class ac
{

    public ac()
    {
    }

    private static x a(a a1)
    {
        boolean flag;
        flag = a1.p();
        a1.a(true);
        x x = u.a(a1);
        a1.a(flag);
        return x;
        Object obj;
        obj;
        throw new ab((new StringBuilder("Failed parsing JSON source: ")).append(a1).append(" to Json").toString(), ((Throwable) (obj)));
        obj;
        a1.a(flag);
        throw obj;
        obj;
        throw new ab((new StringBuilder("Failed parsing JSON source: ")).append(a1).append(" to Json").toString(), ((Throwable) (obj)));
    }

    public static x a(Reader reader)
    {
        x x;
        try
        {
            reader = new a(reader);
            x = a(((a) (reader)));
            if (!(x instanceof z) && reader.f() != e.j)
            {
                throw new ag("Did not consume the entire document.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new ag(reader);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new y(reader);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new ag(reader);
        }
        return x;
    }
}
