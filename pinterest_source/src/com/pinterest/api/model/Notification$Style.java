// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.utils.PStringUtils;
import java.util.ArrayList;

public final class  extends Enum
{

    private static final BAL_TXT $VALUES[];
    public static final BAL_TXT BAL;
    public static final BAL_TXT BAL_TXT;

    public static  parse(String s)
    {
        try
        {
            s = valueOf(PStringUtils.toEnumUpperCase(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String requestString()
    {
        ArrayList arraylist = new ArrayList();
        UpperCase auppercase[] = values();
        int j = auppercase.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(auppercase[i].toString().toLowerCase());
        }

        return PStringUtils.concatStringArray(arraylist, ",");
    }

    public static StringArray valueOf(String s)
    {
        return (StringArray)Enum.valueOf(com/pinterest/api/model/Notification$Style, s);
    }

    public static StringArray[] values()
    {
        return (StringArray[])$VALUES.clone();
    }

    static 
    {
        BAL = new <init>("BAL", 0);
        BAL_TXT = new <init>("BAL_TXT", 1);
        $VALUES = (new .VALUES[] {
            BAL, BAL_TXT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
