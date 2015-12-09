// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.endless;

import java.util.Collections;
import java.util.List;

public class d
{

    private List a;
    private boolean b;

    public d()
    {
        a = Collections.emptyList();
    }

    public void a(List list)
    {
        a = list;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public List b()
    {
        return a;
    }

    public boolean c()
    {
        return b;
    }
}
