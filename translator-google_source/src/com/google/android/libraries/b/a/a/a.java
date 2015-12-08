// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.b.a.a;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.au;
import com.google.f.d.a.e;
import com.google.f.d.a.j;

public final class a
{

    public final StringBuilder a = new StringBuilder();
    private boolean b;

    public a()
    {
        b = false;
    }

    public final ImmutableList a(j j1)
    {
        if (j1 == null)
        {
            return ImmutableList.of();
        }
        Object obj = ImmutableList.builder();
        e ae[] = j1.a;
        int k = ae.length;
        int i = 0;
        while (i < k) 
        {
            j1 = ae[i];
            if (j1.b())
            {
                j1 = ((e) (j1)).a;
            } else
            {
                j1 = "";
            }
            ((au) (obj)).c(j1);
            i++;
        }
        obj = ((au) (obj)).a();
        if (((ImmutableList) (obj)).isEmpty())
        {
            j1 = "";
        } else
        {
            j1 = (String)((ImmutableList) (obj)).get(0);
        }
        b = true;
        a.delete(0, a.length());
        a.append(j1);
        return ((ImmutableList) (obj));
    }
}
