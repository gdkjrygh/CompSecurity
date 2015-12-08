// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.util.SparseArray;
import android.view.View;

public class ag
{

    private SparseArray a;

    public ag()
    {
        a = new SparseArray();
    }

    public View a(Integer integer)
    {
        return (View)a.get(integer.intValue());
    }

    public void a(View view, Integer integer)
    {
        a.put(integer.intValue(), view);
    }

    public void b(View view, Integer integer)
    {
        a(view.findViewById(integer.intValue()), integer);
    }
}
