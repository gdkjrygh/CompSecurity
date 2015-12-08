// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;


public interface bu
{
    public static final class a
    {

        protected final String a;
        protected long b;
        protected long c;

        protected final long a()
        {
            return c - b;
        }

        protected a(String s)
        {
            a = s;
            b = -1L;
            c = -1L;
        }
    }


    public abstract a a(String s);

    public abstract void a();

    public abstract void a(a a1);

    public abstract void b();
}
