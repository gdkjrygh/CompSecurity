// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.e;

import android.content.Context;
import android.view.View;
import com.facebook.widget.f;
import com.google.common.base.Preconditions;

public class a extends f
{

    private Integer a;
    private int b;

    public a(Context context)
    {
        super(context);
        a = Integer.valueOf(-1);
        b = -1;
    }

    public View getEligibleContentView()
    {
        if (a == null || a.intValue() < 0)
        {
            return null;
        }
        int i = getChildCount();
        boolean flag;
        if (i <= 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "There can only be 1 wrapped child view at most!");
        if (i == 1)
        {
            return getChildAt(0);
        } else
        {
            return null;
        }
    }

    public int getPositionInListView()
    {
        return b;
    }

    public Integer getRecyleViewType()
    {
        return a;
    }

    public void setPositionInListView(int i)
    {
        b = i;
    }

    public void setRecycleViewType(Integer integer)
    {
        a = integer;
    }
}
