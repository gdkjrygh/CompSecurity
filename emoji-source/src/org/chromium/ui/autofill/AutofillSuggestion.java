// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.autofill;

import org.chromium.ui.DropdownItem;

public class AutofillSuggestion
    implements DropdownItem
{

    private final String mLabel;
    private final String mSublabel;
    private final int mSuggestionId;

    public AutofillSuggestion(String s, String s1, int i)
    {
        mLabel = s;
        mSublabel = s1;
        mSuggestionId = i;
    }

    public String getLabel()
    {
        return mLabel;
    }

    public String getSublabel()
    {
        return mSublabel;
    }

    public int getSuggestionId()
    {
        return mSuggestionId;
    }

    public boolean isEnabled()
    {
        return true;
    }

    public boolean isGroupHeader()
    {
        return false;
    }
}
