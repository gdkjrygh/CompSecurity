// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedReader;

final class Xc
{

    private final String a;

    Xc(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            a = s;
            return;
        }
    }

    static String b(BufferedReader bufferedreader)
    {
        String s;
        do
        {
            s = bufferedreader.readLine();
        } while (s != null && !s.matches("\"main\" .*"));
        do
        {
            s = bufferedreader.readLine();
        } while (s != null && s.matches("  \\| .*"));
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("AppNotRespondingError\n");
        for (; s != null && !s.matches(" *"); s = bufferedreader.readLine())
        {
            stringbuilder.append(s);
            stringbuilder.append('\n');
        }

        return stringbuilder.toString();
    }

    final long a(BufferedReader bufferedreader)
    {
        String s = "";
        do
        {
            String s1 = bufferedreader.readLine();
            if (s1 == null)
            {
                return -1L;
            }
            if (s1.equals((new StringBuilder("Cmd line: ")).append(a).toString()))
            {
                bufferedreader = s.split("----- .*at ")[1].split(" -----")[0];
                return ((alV) (anl.a("yyyy-MM-dd HH:mm:ss").b(bufferedreader))).a;
            }
            s = s1;
        } while (true);
    }
}
