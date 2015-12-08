// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

public class AccessibleSwitchPreference extends SwitchPreference
{

    public AccessibleSwitchPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private boolean a(View view, CharSequence charsequence)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                if (a(view.getChildAt(i), charsequence))
                {
                    return true;
                }
            }

        } else
        if (view instanceof Switch)
        {
            ((Switch)view).setContentDescription(charsequence);
            return true;
        }
        return false;
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        a(view, getTitle().toString());
    }
}
