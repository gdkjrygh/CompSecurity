// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.dominos.android.sdk.common:
//            LogUtil

public class DateFormatUtil
{

    private static final String TAG = "DateFormatUtil";
    private static final SimpleDateFormat apiDateFormat;
    private static final SimpleDateFormat labelDateFormat;
    private static final SimpleDateFormat mUsDateFormat;

    public DateFormatUtil()
    {
    }

    public static String formatFromApiToLabelDate(String s)
    {
        String s1;
        try
        {
            s1 = labelDateFormat.format(apiDateFormat.parse(s));
        }
        catch (ParseException parseexception)
        {
            LogUtil.e("DateFormatUtil", (new StringBuilder("Failed to format date:")).append(s).toString(), new Object[0]);
            return s;
        }
        return s1;
    }

    public static String formatFromApiToUsFormat(String s)
    {
        String s1;
        try
        {
            s1 = mUsDateFormat.format(apiDateFormat.parse(s));
        }
        catch (ParseException parseexception)
        {
            LogUtil.e("DateFormatUtil", (new StringBuilder("Failed to format date:")).append(s).toString(), new Object[0]);
            return s;
        }
        return s1;
    }

    public static String formatFromLabelToApiDate(String s)
    {
        String s1;
        try
        {
            s1 = apiDateFormat.format(labelDateFormat.parse(s));
        }
        catch (ParseException parseexception)
        {
            LogUtil.e("DateFormatUtil", (new StringBuilder("Failed to format date:")).append(s).toString(), new Object[0]);
            return s;
        }
        return s1;
    }

    static 
    {
        apiDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        labelDateFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        mUsDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    }
}
