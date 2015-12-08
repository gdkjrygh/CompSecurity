// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.mobeta.android.dslv:
//            c

public abstract class f extends c
{

    private int b;
    private int c;
    private LayoutInflater d;

    public f(Context context, int i, Cursor cursor)
    {
        super(context, cursor);
        c = i;
        b = i;
        d = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public f(Context context, int i, Cursor cursor, int j)
    {
        super(context, cursor, j);
        c = i;
        b = i;
        d = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public f(Context context, int i, Cursor cursor, boolean flag)
    {
        super(context, cursor, flag);
        c = i;
        b = i;
        d = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public void d(int i)
    {
        b = i;
    }

    public void e(int i)
    {
        c = i;
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return d.inflate(c, viewgroup, false);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return d.inflate(b, viewgroup, false);
    }
}
