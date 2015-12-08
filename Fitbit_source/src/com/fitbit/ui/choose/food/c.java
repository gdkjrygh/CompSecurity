// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import com.fitbit.ui.choose.a;
import java.util.List;

public class c
    implements a
{

    private final List a;

    public c(List list)
    {
        a = list;
    }

    public boolean a()
    {
        return a.isEmpty();
    }

    public List b()
    {
        return a;
    }
}
