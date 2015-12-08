// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.history;

import com.google.zxing.Result;

public final class HistoryItem
{

    private final String details;
    private final String display;
    private final Result result;

    HistoryItem(Result result1, String s, String s1)
    {
        result = result1;
        display = s;
        details = s1;
    }

    public String getDisplayAndDetails()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (display == null || display.isEmpty())
        {
            stringbuilder.append(result.getText());
        } else
        {
            stringbuilder.append(display);
        }
        if (details != null && !details.isEmpty())
        {
            stringbuilder.append(" : ").append(details);
        }
        return stringbuilder.toString();
    }

    public Result getResult()
    {
        return result;
    }
}
