// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.support.v7.internal.view.menu.h;

// Referenced classes of package android.support.design.internal:
//            b

private static final class c
{

    private final h a;
    private final int b;
    private final int c;

    public static c a(int i, int j)
    {
        return new <init>(null, i, j);
    }

    public static u.h a(h h1)
    {
        return new <init>(h1, 0, 0);
    }

    public final boolean a()
    {
        return a == null;
    }

    public final int b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final h d()
    {
        return a;
    }

    public final boolean e()
    {
        return a != null && !a.hasSubMenu() && a.isEnabled();
    }

    private u.h(h h1, int i, int j)
    {
        a = h1;
        b = i;
        c = j;
    }
}
