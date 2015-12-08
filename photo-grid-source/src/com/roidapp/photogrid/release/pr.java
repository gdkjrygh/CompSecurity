// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.util.List;

public final class pr
{

    public static pr a = new pr();
    private List b;

    private pr()
    {
    }

    public static pr a()
    {
        if (a == null)
        {
            a = new pr();
        }
        return a;
    }

    public static void c()
    {
        a = null;
    }

    public final void a(List list)
    {
        b = list;
    }

    public final List b()
    {
        return b;
    }

}
