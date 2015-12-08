// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            c

public static final class b
{

    protected volatile int a;
    protected volatile int b;

    final void a(int i)
    {
        a = i;
    }

    public final boolean a()
    {
        return a >= 0 && b >= 0;
    }

    public final int b()
    {
        return a;
    }

    final void b(int i)
    {
        b = i;
    }

    public final int c()
    {
        return b;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a).append("x").append(b);
        return stringbuilder.toString();
    }

    public ()
    {
        a = -1;
        b = -1;
    }
}
