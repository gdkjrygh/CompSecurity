// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Writer;

// Referenced classes of package com.google.gson.internal:
//            Streams

static final class <init> extends Writer
{
    static final class a
        implements CharSequence
    {

        char a[];

        public final char charAt(int i)
        {
            return a[i];
        }

        public final int length()
        {
            return a.length;
        }

        public final CharSequence subSequence(int i, int j)
        {
            return new String(a, i, j - i);
        }

        a()
        {
        }
    }


    private final Appendable a;
    private final a b;

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

    private a(Appendable appendable)
    {
        b = new a();
        a = appendable;
    }

    a(Appendable appendable, byte byte0)
    {
        this(appendable);
    }
}
