// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import android.text.TextUtils;
import java.util.Locale;

public class TextUtilsCompatJellybeanMr1
{

    public TextUtilsCompatJellybeanMr1()
    {
    }

    public static int getLayoutDirectionFromLocale(Locale locale)
    {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static String htmlEncode(String s)
    {
        return TextUtils.htmlEncode(s);
    }
}
