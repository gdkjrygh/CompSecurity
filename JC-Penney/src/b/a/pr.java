// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

// Referenced classes of package b.a:
//            pg

public final class pr
{

    final pg a;
    final pg b;
    private final Writer c;
    private final int d;
    private final StringBuffer e;
    private final StringBuffer f;

    private pr(Writer writer, int i, int j, String s)
    {
        if (writer == null)
        {
            throw new NullPointerException("out == null");
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (j <= 0)
        {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        if (s == null)
        {
            throw new NullPointerException("spacer == null");
        } else
        {
            StringWriter stringwriter = new StringWriter(1000);
            StringWriter stringwriter1 = new StringWriter(1000);
            c = writer;
            d = i;
            e = stringwriter.getBuffer();
            f = stringwriter1.getBuffer();
            a = new pg(stringwriter, i);
            b = new pg(stringwriter1, j, s);
            return;
        }
    }

    public static String a(String s, int i, String s1, String s2, int j)
    {
        StringWriter stringwriter = new StringWriter((s.length() + s2.length()) * 3);
        s1 = new pr(stringwriter, i, j, s1);
        try
        {
            ((pr) (s1)).a.write(s);
            ((pr) (s1)).b.write(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("shouldn't happen", s);
        }
        s1.a();
        return stringwriter.toString();
    }

    private void a()
    {
        try
        {
            a(e, ((Writer) (a)));
            a(f, ((Writer) (b)));
            b();
            a(e, ((Writer) (a)));
            for (; e.length() != 0; b())
            {
                b.write(10);
            }

        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        a(f, ((Writer) (b)));
        for (; f.length() != 0; b())
        {
            a.write(10);
        }

    }

    private static void a(StringBuffer stringbuffer, Writer writer)
    {
        int i = stringbuffer.length();
        if (i != 0 && stringbuffer.charAt(i - 1) != '\n')
        {
            writer.write(10);
        }
    }

    private void b()
    {
_L5:
        int j = e.indexOf("\n");
        if (j >= 0) goto _L2; else goto _L1
_L1:
        int k;
        return;
_L2:
        if ((k = f.indexOf("\n")) < 0) goto _L1; else goto _L3
_L3:
        if (j != 0)
        {
            c.write(e.substring(0, j));
        }
        if (k != 0)
        {
            Writer writer = c;
            for (int i = d - j; i > 0; i--)
            {
                writer.write(32);
            }

            c.write(f.substring(0, k));
        }
        c.write(10);
        e.delete(0, j + 1);
        f.delete(0, k + 1);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
