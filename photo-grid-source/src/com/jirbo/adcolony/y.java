// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.jirbo.adcolony:
//            af, a, d, ADCStorage, 
//            l

class y extends af
{

    static final int a = 1024;
    String b;
    OutputStream c;
    byte d[];
    int e;
    int f;
    int g;

    y(String s)
    {
        d = new byte[1024];
        e = 0;
        b = s;
        if (a.n != 0)
        {
            g = 23;
            f = g;
        }
        try
        {
            if (a.l != null && a.l.f != null)
            {
                a.l.f.b();
            }
            c = new FileOutputStream(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a(s);
        }
    }

    y(String s, OutputStream outputstream)
    {
        d = new byte[1024];
        e = 0;
        b = s;
        c = outputstream;
    }

    public static void a(String as[])
    {
        as = new y("test.txt");
        as.b("A king who was mad at the time");
        as.b("Declared limerick writing a crime");
        as.i = ((y) (as)).i + 2;
        as.b("So late in the night");
        as.b("All the poets would write");
        as.i = ((y) (as)).i - 2;
        as.b("Verses without any rhyme or meter");
        as.d();
        as.i = ((y) (as)).i + 4;
        as.b("David\nGerrold");
        as.i = ((y) (as)).i + 2;
        as.b(4D);
        as.i = ((y) (as)).i + 2;
        as.b(0.0D);
        as.i = ((y) (as)).i + 2;
        as.b(-100023D);
        as.i = ((y) (as)).i + 2;
        as.c(-6L);
        as.i = ((y) (as)).i + 2;
        as.c(0L);
        as.i = ((y) (as)).i + 2;
        as.c(234L);
        as.i = ((y) (as)).i + 2;
        as.c(0x8000000000000000L);
        as.i = ((y) (as)).i + 2;
        as.b(true);
        as.i = ((y) (as)).i + 2;
        as.b(false);
        as.i = ((y) (as)).i + 2;
        as.b();
    }

    void a()
    {
        if (e <= 0 || c == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        c.write(d, 0, e);
        e = 0;
        c.flush();
        return;
        IOException ioexception;
        ioexception;
        e = 0;
        a(ioexception);
        return;
    }

    void a(char c1)
    {
        d[e] = (byte)(f ^ c1);
        f = f + g;
        c1 = e + 1;
        e = c1;
        if (c1 == '\u0400')
        {
            a();
        }
    }

    void a(IOException ioexception)
    {
        l.d.a("Error writing \"").a(b).b("\":");
        l.d.b(ioexception.toString());
        b();
    }

    void b()
    {
        a();
        try
        {
            if (c != null)
            {
                c.close();
                c = null;
            }
            return;
        }
        catch (IOException ioexception)
        {
            c = null;
            a(ioexception);
            return;
        }
    }
}
