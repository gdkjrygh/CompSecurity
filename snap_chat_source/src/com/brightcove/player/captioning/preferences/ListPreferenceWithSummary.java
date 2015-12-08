// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;

public class ListPreferenceWithSummary extends ListPreference
{

    public ListPreferenceWithSummary(Context context)
    {
        super(context);
    }

    public ListPreferenceWithSummary(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setSummary(CharSequence charsequence)
    {
        super.setSummary(getEntry());
    }

    public void setValue(String s)
    {
        super.setValue(s);
        setSummary(s);
    }
}
