// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.io.StringWriter;

final class nbd
    implements Runnable
{

    private nbc a;

    nbd(nbc nbc1)
    {
        a = nbc1;
        super();
    }

    public final void run()
    {
        String s = String.valueOf(nbc.a(a));
        (new StringBuilder(String.valueOf(s).length() + 36)).append("Out of memory while decoding image: ").append(s);
        if (a.a instanceof mvx)
        {
            StringWriter stringwriter = new StringWriter();
            ((mvx)a.a).a(new PrintWriter(stringwriter));
            b.a(4, "ImageResource", stringwriter.toString());
        }
    }
}
