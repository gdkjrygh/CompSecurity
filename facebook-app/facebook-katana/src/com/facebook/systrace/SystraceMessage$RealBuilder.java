// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;


class <init> extends <init>
{

    b a;
    StringBuilder b;
    char c;

    private void b()
    {
        b.append(c);
        c = ';';
    }

    public final c a(String s, int i)
    {
        b();
        b.append(s);
        b.append('=');
        b.append(i);
        return this;
    }

    public final b a(String s, Object obj)
    {
        b();
        b.append(s);
        b.append('=');
        b.append(obj);
        return this;
    }

    final b a(b b1, String s)
    {
        a = b1;
        b.delete(0, b.length());
        b.append(s);
        c = '|';
        return this;
    }

    public final void a()
    {
        a.a(b);
    }

    private ()
    {
        b = new StringBuilder();
    }

    b(byte byte0)
    {
        this();
    }
}
