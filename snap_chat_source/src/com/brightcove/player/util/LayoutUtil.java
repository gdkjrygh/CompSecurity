// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.util;


public class LayoutUtil
{

    public LayoutUtil()
    {
    }

    public static String getSpecMode(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return "MeasureSpec.UNSPECIFIED";

        case -2147483648: 
            return "MeasureSpec.AT_MOST";

        case 1073741824: 
            return "MeasureSpec.EXACTLY";
        }
    }
}
