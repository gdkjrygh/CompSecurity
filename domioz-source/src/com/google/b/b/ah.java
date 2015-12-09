// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.io.Writer;

// Referenced classes of package com.google.b.b:
//            ai

final class ah extends Writer
{

    private final Appendable a;
    private final ai b;

    private ah(Appendable appendable)
    {
        b = new ai();
        a = appendable;
    }

    ah(Appendable appendable, byte byte0)
    {
        this(appendable);
    }

    public final void close()
    {
    }

    public final void flush()
    {
    }

    public final void write(int i)
    {
        a.append((char)i);
    }

    public final void write(char ac[], int i, int j)
    {
        b.a = ac;
        a.append(b, i, i + j);
    }
}
