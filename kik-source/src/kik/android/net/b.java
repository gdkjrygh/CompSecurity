// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net;

import java.io.OutputStream;
import org.c.c;

public final class b extends OutputStream
{

    private static final org.c.b d = org.c.c.a("LoggingOutputStream");
    private OutputStream a;
    private String b;
    private StringBuffer c;

    public b(OutputStream outputstream, String s)
    {
        a = outputstream;
        b = s;
        c = new StringBuffer(1024);
    }

    public final void a()
    {
        (new StringBuilder()).append(b).append(":  ").append(c.toString());
        c.delete(0, c.length());
    }

    public final void close()
    {
        super.close();
        a.close();
    }

    public final void flush()
    {
        a.flush();
    }

    public final void write(int i)
    {
        c.append((byte)i);
        a.write(i);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        c.append(new String(abyte0, i, j, "UTF-8"));
        a.write(abyte0, i, j);
    }

}
