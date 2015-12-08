// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.aj;
import android.support.v4.app.av;
import android.util.SparseArray;

public class da extends av
{

    private SparseArray a;

    public da(aj aj, SparseArray sparsearray)
    {
        super(aj);
        a = sparsearray;
    }

    public Fragment a(int i)
    {
        return (Fragment)a.get(i);
    }

    public int b()
    {
        return 2;
    }
}
