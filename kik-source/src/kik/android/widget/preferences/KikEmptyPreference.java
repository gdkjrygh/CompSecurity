// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;

public class KikEmptyPreference extends Preference
{

    public KikEmptyPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setLayoutResource(0x7f030087);
        setEnabled(false);
        setSelectable(false);
    }
}
