// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public abstract class bn extends BaseAdapter
{

    protected List a;

    public bn()
    {
        a = new ArrayList();
    }

    public void a(List list)
    {
        a.addAll(list);
        notifyDataSetChanged();
    }
}
