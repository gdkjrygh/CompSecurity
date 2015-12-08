// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

class HeaderSpannableBuilder
{

    private final Resources resources;
    private SpannableString spannedString;

    HeaderSpannableBuilder(Resources resources1)
    {
        resources = resources1;
    }

    private HeaderSpannableBuilder createSpannedString(String s, int i, int j)
    {
        spannedString = new SpannableString(s);
        spannedString.setSpan(new ForegroundColorSpan(resources.getColor(0x7f0e0088)), i, j, 33);
        return this;
    }

    private String playableString(boolean flag)
    {
        Resources resources1 = resources;
        int i;
        if (flag)
        {
            i = 0x7f07031e;
        } else
        {
            i = 0x7f070318;
        }
        return resources1.getString(i);
    }

    private int userActionTextId(boolean flag)
    {
        return !flag ? 0x7f070319 : 0x7f07031f;
    }

    HeaderSpannableBuilder actionSpannedString(String s, boolean flag)
    {
        createSpannedString(resources.getString(userActionTextId(flag), new Object[] {
            "", s
        }), 0, s.length() + 1);
        return this;
    }

    SpannableString get()
    {
        return spannedString;
    }

    HeaderSpannableBuilder promotedSpannedString(boolean flag)
    {
        String s = playableString(flag);
        String s1 = resources.getString(0x7f07031c, new Object[] {
            s
        });
        return createSpannedString(s1, 0, s1.length() - s.length());
    }

    HeaderSpannableBuilder userActionSpannedString(String s, String s1, boolean flag)
    {
        String s2 = resources.getString(userActionTextId(flag), new Object[] {
            s, s1
        });
        int i = s.length();
        int j = s1.length();
        createSpannedString(s2, s.length(), i + j + 1);
        return this;
    }
}
