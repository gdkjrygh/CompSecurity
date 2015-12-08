// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;

public class NestedScrollingParentHelper
{

    private final ViewGroup a;
    private int b;

    public NestedScrollingParentHelper(ViewGroup viewgroup)
    {
        a = viewgroup;
    }

    public int a()
    {
        return b;
    }

    public void a(View view)
    {
        b = 0;
    }

    public void a(View view, View view1, int i)
    {
        b = i;
    }
}
