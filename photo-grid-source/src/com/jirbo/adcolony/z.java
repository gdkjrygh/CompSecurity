// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.PrintStream;

// Referenced classes of package com.jirbo.adcolony:
//            af

class z extends af
{

    StringBuilder a;

    z()
    {
        a = new StringBuilder();
    }

    public static void a(String as[])
    {
        as = new z();
        as.b("A king who was mad at the time");
        as.b("Declared limerick writing a crime");
        as.i = ((z) (as)).i + 2;
        as.b("So late in the night");
        as.b("All the poets would write");
        as.i = ((z) (as)).i - 2;
        as.b("Verses without any rhyme or meter");
        as.d();
        as.i = ((z) (as)).i + 4;
        as.b("David\nGerrold");
        as.i = ((z) (as)).i + 2;
        as.b(4D);
        as.i = ((z) (as)).i + 2;
        as.b(0.0D);
        as.i = ((z) (as)).i + 2;
        as.b(-100023D);
        as.i = ((z) (as)).i + 2;
        as.c(-6L);
        as.i = ((z) (as)).i + 2;
        as.c(0L);
        as.i = ((z) (as)).i + 2;
        as.c(234L);
        as.i = ((z) (as)).i + 2;
        as.c(0x8000000000000000L);
        as.i = ((z) (as)).i + 2;
        as.b(true);
        as.i = ((z) (as)).i + 2;
        as.b(false);
        as.i = ((z) (as)).i + 2;
        System.out.println(as);
    }

    void a()
    {
        a.setLength(0);
        i = 0;
    }

    void a(char c)
    {
        a.append(c);
    }

    public String toString()
    {
        return a.toString();
    }
}
