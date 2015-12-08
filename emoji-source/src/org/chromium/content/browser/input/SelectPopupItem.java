// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import org.chromium.ui.DropdownItem;

public class SelectPopupItem
    implements DropdownItem
{

    private final String mLabel;
    private final int mType;

    public SelectPopupItem(String s, int i)
    {
        mLabel = s;
        mType = i;
    }

    public String getLabel()
    {
        return mLabel;
    }

    public String getSublabel()
    {
        return null;
    }

    public int getType()
    {
        return mType;
    }

    public boolean isEnabled()
    {
        return mType == 2 || mType == 0;
    }

    public boolean isGroupHeader()
    {
        return mType == 0;
    }
}
