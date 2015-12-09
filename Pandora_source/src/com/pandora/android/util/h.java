// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;


public class h
{

    private boolean a;
    private boolean b;
    private boolean c;

    public h(boolean flag, boolean flag1)
    {
        c = flag;
        a = flag1;
        b = flag1;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean a()
    {
        if (a)
        {
            return !b;
        } else
        {
            return c;
        }
    }

    public void b(boolean flag)
    {
        b = flag;
    }

    public boolean b()
    {
        return a;
    }
}
