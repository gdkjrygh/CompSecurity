// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.j;
import b.a.a.a.a.b.w;
import b.a.a.a.d;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

// Referenced classes of package com.a.a.c:
//            S, Y, b

final class X
    implements S
{

    private final File a;
    private final int b = 0x10000;
    private w c;

    public X(File file)
    {
        a = file;
    }

    private void d()
    {
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        c = new w(a);
        return;
        IOException ioexception;
        ioexception;
        b.a.a.a.d.a();
        (new StringBuilder("Could not open log file: ")).append(a);
        return;
    }

    public final b a()
    {
        if (a.exists())
        {
            d();
            if (c != null)
            {
                int ai[] = new int[1];
                ai[0] = 0;
                byte abyte0[] = new byte[c.a()];
                try
                {
                    c.a(new Y(this, abyte0, ai));
                }
                catch (IOException ioexception)
                {
                    b.a.a.a.d.a();
                }
                return com.a.a.c.b.a(abyte0, ai[0]);
            }
        }
        return null;
    }

    public final void a(long l, String s)
    {
        d();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (s == null)
        {
            s = "null";
        }
        int i = b / 4;
        String s1 = s;
        try
        {
            if (s.length() > i)
            {
                s1 = (new StringBuilder("...")).append(s.substring(s.length() - i)).toString();
            }
            s = s1.replaceAll("\r", " ").replaceAll("\n", " ");
            s = String.format(Locale.US, "%d %s%n", new Object[] {
                Long.valueOf(l), s
            }).getBytes("UTF-8");
            c.a(s, s.length);
            for (; !c.b() && c.a() > b; c.c()) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a.a.a.d.a();
        }
    }

    public final void b()
    {
        j.a(c);
        c = null;
    }

    public final void c()
    {
        b();
        a.delete();
    }
}
