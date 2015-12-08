// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Writer;

final class <init> extends Writer
{

    private final Appendable a;
    private final CurrentWrite b;

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

    private CurrentWrite(Appendable appendable)
    {
        class CurrentWrite
            implements CharSequence
        {

            char a[];

            public char charAt(int i)
            {
                return a[i];
            }

            public int length()
            {
                return a.length;
            }

            public CharSequence subSequence(int i, int j)
            {
                return new String(a, i, j - i);
            }

            CurrentWrite()
            {
            }
        }

        b = new CurrentWrite();
        a = appendable;
    }

    a(Appendable appendable, a a1)
    {
        this(appendable);
    }
}
