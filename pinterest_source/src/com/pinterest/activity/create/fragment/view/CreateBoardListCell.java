// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class CreateBoardListCell extends LinearLayout
{

    public CreateBoardListCell(Context context)
    {
        this(context, null);
    }

    public CreateBoardListCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static CreateBoardListCell get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof CreateBoardListCell))
        {
            return new CreateBoardListCell(viewgroup.getContext());
        } else
        {
            return (CreateBoardListCell)view;
        }
    }

    private void init()
    {
        setOrientation(1);
        inflate(getContext(), 0x7f03014b, this);
    }
}
