// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.ui.ViewHelper;

public class PlaceCameraCell extends RelativeLayout
{

    public PlaceCameraCell(Context context)
    {
        this(context, null);
    }

    public PlaceCameraCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static PlaceCameraCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof PlaceCameraCell)
        {
            return (PlaceCameraCell)view;
        } else
        {
            return new PlaceCameraCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030124, this, true);
    }
}
