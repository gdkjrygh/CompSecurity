// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.util.SparseArray;
import android.view.View;

public class f
{

    public static View a(View view, int i)
    {
        SparseArray sparsearray = (SparseArray)view.getTag();
        if (sparsearray == null)
        {
            sparsearray = new SparseArray();
            view.setTag(sparsearray);
        }
        View view2 = (View)sparsearray.get(i);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = view.findViewById(i);
            sparsearray.put(i, view1);
        }
        return view1;
    }
}
