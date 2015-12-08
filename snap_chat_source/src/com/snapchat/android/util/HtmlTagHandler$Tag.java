// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.text.TextUtils;
import com.snapchat.android.Timber;
import java.util.Locale;

// Referenced classes of package com.snapchat.android.util:
//            HtmlTagHandler

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN LI;
    public static final UNKNOWN OL;
    public static final UNKNOWN UL;
    public static final UNKNOWN UNKNOWN;

    public static  fromValue(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return UNKNOWN;
        }
         ;
        try
        {
             = valueOf(s.toUpperCase(Locale.US));
        }
        catch (Exception exception)
        {
            Timber.e("HtmlTagHandler", (new StringBuilder("Failed to convert ")).append(s).append(" into Tag. ").append(exception).toString(), new Object[0]);
            return UNKNOWN;
        }
        return ;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/snapchat/android/util/HtmlTagHandler$Tag, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    static 
    {
        UL = new <init>("UL", 0);
        OL = new <init>("OL", 1);
        LI = new <init>("LI", 2);
        UNKNOWN = new <init>("UNKNOWN", 3);
        $VALUES = (new .VALUES[] {
            UL, OL, LI, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
