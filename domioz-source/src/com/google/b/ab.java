// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.ag;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.e;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

// Referenced classes of package com.google.b:
//            aa, y, af, x, 
//            w

public final class ab
{

    public ab()
    {
    }

    private static w a(a a1)
    {
        boolean flag;
        flag = a1.p();
        a1.a(true);
        w w = ag.a(a1);
        a1.a(flag);
        return w;
        Object obj;
        obj;
        throw new aa((new StringBuilder("Failed parsing JSON source: ")).append(a1).append(" to Json").toString(), ((Throwable) (obj)));
        obj;
        a1.a(flag);
        throw obj;
        obj;
        throw new aa((new StringBuilder("Failed parsing JSON source: ")).append(a1).append(" to Json").toString(), ((Throwable) (obj)));
    }

    private static w a(Reader reader)
    {
        w w;
        try
        {
            reader = new a(reader);
            w = a(((a) (reader)));
            if (!(w instanceof y) && reader.f() != c.j)
            {
                throw new af("Did not consume the entire document.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new af(reader);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new x(reader);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new af(reader);
        }
        return w;
    }

    public static w a(String s)
    {
        return a(((Reader) (new StringReader(s))));
    }
}
