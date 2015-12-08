// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.io.Writer;

// Referenced classes of package com.google.a.b:
//            aj, ah

final class ai extends Writer
{

    private final Appendable a;
    private final aj b;

    private ai(Appendable appendable)
    {
        b = new aj();
        a = appendable;
    }

    ai(Appendable appendable, ah ah)
    {
        this(appendable);
    }

    public void close()
    {
    }

    public void flush()
    {
    }

    public void write(int i)
    {
        a.append((char)i);
    }

    public void write(char ac[], int i, int j)
    {
        b.a = ac;
        a.append(b, i, i + j);
    }
}
