// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;


public class DateTimeSuggestion
{

    private final String mLabel;
    private final String mLocalizedValue;
    private final double mValue;

    public DateTimeSuggestion(double d, String s, String s1)
    {
        mValue = d;
        mLocalizedValue = s;
        mLabel = s1;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DateTimeSuggestion)
        {
            if (mValue == ((DateTimeSuggestion) (obj = (DateTimeSuggestion)obj)).mValue && mLocalizedValue == ((DateTimeSuggestion) (obj)).mLocalizedValue && mLabel == ((DateTimeSuggestion) (obj)).mLabel)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (((int)mValue + 1147) * 37 + mLocalizedValue.hashCode()) * 37 + mLabel.hashCode();
    }

    String label()
    {
        return mLabel;
    }

    String localizedValue()
    {
        return mLocalizedValue;
    }

    double value()
    {
        return mValue;
    }
}
