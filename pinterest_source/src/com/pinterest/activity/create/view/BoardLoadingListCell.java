// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.ui.listview.SolidTitleDivider;

public class BoardLoadingListCell extends RelativeLayout
{

    private SolidTitleDivider _superTitleTv;

    public BoardLoadingListCell(Context context)
    {
        this(context, null);
    }

    public BoardLoadingListCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static BoardLoadingListCell get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof BoardLoadingListCell))
        {
            return new BoardLoadingListCell(viewgroup.getContext());
        } else
        {
            return (BoardLoadingListCell)view;
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f03013f, this);
        setBackgroundResource(0x7f02028b);
        _superTitleTv = (SolidTitleDivider)findViewById(0x7f0f032f);
    }

    public SolidTitleDivider getSuperTitleView()
    {
        return _superTitleTv;
    }
}
