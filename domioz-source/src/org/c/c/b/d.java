// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.c.c.f;
import org.c.c.j;

// Referenced classes of package org.c.c.b:
//            c

final class d
    implements j
{

    final c a;
    private final f b = new f();
    private final OutputStream c;
    private boolean d;

    public d(c c1, OutputStream outputstream)
    {
        a = c1;
        super();
        d = false;
        c = outputstream;
    }

    private static byte[] a(String s)
    {
        try
        {
            s = s.getBytes("US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException(s);
        }
        return s;
    }

    public final OutputStream getBody()
    {
        if (!d)
        {
            for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext();)
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                byte abyte0[] = a((String)((java.util.Map.Entry) (obj)).getKey());
                obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    byte abyte1[] = a((String)((Iterator) (obj)).next());
                    c.write(abyte0);
                    c.write(58);
                    c.write(32);
                    c.write(abyte1);
                    org.c.c.b.c.a(c);
                }
            }

            org.c.c.b.c.a(c);
            d = true;
        }
        return c;
    }

    public final f getHeaders()
    {
        if (d)
        {
            return f.readOnlyHttpHeaders(b);
        } else
        {
            return b;
        }
    }
}
