// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.pinterest.activity.nux.NUXCoreConceptsHelper;
import com.pinterest.ui.grid.InterestGridCell;

public class NUXInterestGridCell extends InterestGridCell
{

    private boolean _check;
    private ImageView _checkmarkOverlay;
    private boolean _inCoreConceptsExp;

    public NUXInterestGridCell(Context context)
    {
        this(context, null);
    }

    public NUXInterestGridCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NUXInterestGridCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static NUXInterestGridCell from(View view, Context context)
    {
        if (view instanceof NUXInterestGridCell)
        {
            return (NUXInterestGridCell)view;
        } else
        {
            return new NUXInterestGridCell(context);
        }
    }

    public void init()
    {
        _check = false;
        View view = LayoutInflater.from(getContext()).inflate(0x7f0301ed, null, false);
        addView(view);
        _checkmarkOverlay = (ImageView)view.findViewById(0x7f0f04af);
        _inCoreConceptsExp = NUXCoreConceptsHelper.inCoreConceptsExp();
        setDimOnTouch(true);
        setBounceOnTouch(true);
    }

    public void setChecked(boolean flag)
    {
        int i = 0x7f020235;
        _check = flag;
        if (_inCoreConceptsExp)
        {
            ImageView imageview = _checkmarkOverlay;
            if (_check)
            {
                i = 0x7f02023c;
            }
            imageview.setImageResource(i);
            return;
        }
        ImageView imageview1 = _checkmarkOverlay;
        if (_check)
        {
            i = 0x7f020236;
        }
        imageview1.setImageResource(i);
    }
}
