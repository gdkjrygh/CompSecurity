// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Html;

public final class fiw
{

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Html.fromHtml(s).toString().replace('\n', ' ').trim();
        }
    }
}
