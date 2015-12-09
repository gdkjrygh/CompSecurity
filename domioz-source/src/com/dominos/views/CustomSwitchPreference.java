// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

public class CustomSwitchPreference extends SwitchPreference
{

    public CustomSwitchPreference(Context context)
    {
        super(context, null);
    }

    public CustomSwitchPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CustomSwitchPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void clearListenerInViewGroup(ViewGroup viewgroup)
    {
        if (viewgroup != null)
        {
            int j = viewgroup.getChildCount();
            int i = 0;
            while (i < j) 
            {
                View view = viewgroup.getChildAt(i);
                if (view instanceof Switch)
                {
                    ((Switch)view).setOnCheckedChangeListener(null);
                    return;
                }
                if (view instanceof ViewGroup)
                {
                    clearListenerInViewGroup((ViewGroup)view);
                }
                i++;
            }
        }
    }

    protected void onBindView(View view)
    {
        clearListenerInViewGroup((ViewGroup)view);
        super.onBindView(view);
    }
}
