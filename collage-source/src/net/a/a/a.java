// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.graphics.drawable.Drawable;

public class a
{

    private Drawable a;
    private String b;
    private int c;
    private boolean d;

    public a()
    {
        this(-1, null, null);
    }

    public a(int i, String s, Drawable drawable)
    {
        c = -1;
        b = s;
        a = drawable;
        c = i;
    }

    public String a()
    {
        return b;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public Drawable b()
    {
        return a;
    }

    public int c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }
}
