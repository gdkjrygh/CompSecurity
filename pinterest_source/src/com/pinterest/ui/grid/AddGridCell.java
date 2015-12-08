// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.ViewHelper;

public class AddGridCell extends RelativeLayout
{

    public AddGridCell(Context context)
    {
        this(context, null);
    }

    public AddGridCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static AddGridCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof AddGridCell)
        {
            return (AddGridCell)view;
        } else
        {
            return new AddGridCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030123, this, true);
        ImageView imageview = (ImageView)findViewById(0x7f0f02f3);
        imageview.setImageDrawable(DrawableUtils.tintIcon(imageview.getDrawable()));
    }
}
