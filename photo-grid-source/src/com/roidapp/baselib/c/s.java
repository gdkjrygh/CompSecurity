// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.support.v7.widget.bi;
import android.util.SparseArray;
import android.view.View;

public class s extends bi
{

    public int j;
    private final SparseArray k;

    public s(View view)
    {
        super(view);
        k = new SparseArray();
    }

    public s(View view, int i)
    {
        super(view);
        k = new SparseArray();
        j = i;
    }

    public final View b(int i)
    {
        View view1 = (View)k.get(i);
        View view = view1;
        if (view1 == null)
        {
            view = a.findViewById(i);
            k.put(i, view);
        }
        return view;
    }
}
