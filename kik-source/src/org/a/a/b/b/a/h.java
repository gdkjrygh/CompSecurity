// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;

import java.io.Writer;

// Referenced classes of package org.a.a.b.b.a:
//            c

public final class h extends c
{

    private final int a;
    private final int b;
    private final boolean c;

    public h()
    {
        this(0, 0x7fffffff, true);
    }

    private h(int i, int j, boolean flag)
    {
        a = i;
        b = j;
        c = flag;
    }

    public static h a()
    {
        return new h(32, 127, false);
    }

    public final boolean a(int i, Writer writer)
    {
        if (c ? i < a || i > b : i >= a && i <= b)
        {
            return false;
        }
        if (i > 65535)
        {
            writer.write((new StringBuilder("\\u")).append(a(i)).toString());
        } else
        if (i > 4095)
        {
            writer.write((new StringBuilder("\\u")).append(a(i)).toString());
        } else
        if (i > 255)
        {
            writer.write((new StringBuilder("\\u0")).append(a(i)).toString());
        } else
        if (i > 15)
        {
            writer.write((new StringBuilder("\\u00")).append(a(i)).toString());
        } else
        {
            writer.write((new StringBuilder("\\u000")).append(a(i)).toString());
        }
        return true;
    }
}
