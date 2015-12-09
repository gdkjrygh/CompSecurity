// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.aj;
import android.support.v4.app.av;
import java.util.List;

public class dg extends av
{

    private List a;

    public dg(aj aj, List list)
    {
        super(aj);
        a = list;
    }

    public Fragment a(int i)
    {
        return (Fragment)a.get(i);
    }

    public int b()
    {
        return a.size();
    }
}
