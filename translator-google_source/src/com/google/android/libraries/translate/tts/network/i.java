// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import com.google.android.libraries.translate.tts.c;
import java.util.Locale;

public final class i extends c
{

    private String a;
    private String b;
    private Locale c;

    public i(String s, String s1)
    {
        String as[] = s1.split("-", 3);
        String s3 = as[0];
        Object obj;
        String s2;
        if (as.length >= 2)
        {
            obj = as[1];
        } else
        {
            obj = "";
        }
        if (as.length >= 3)
        {
            s2 = as[2];
        } else
        {
            s2 = "";
        }
        obj = new Locale(s3, ((String) (obj)), s2);
        a = s;
        c = ((Locale) (obj));
        b = s1;
    }

    public final String a()
    {
        return c.getDisplayName();
    }
}
