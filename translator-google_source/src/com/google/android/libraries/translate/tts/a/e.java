// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.text.TextUtils;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.tts.c;
import java.util.Locale;

public final class e extends c
{

    String a;
    Locale b;
    private String c;
    private String d;
    private String e;
    private String f;

    public e(String s, String s1, String s2, String s3)
    {
        s1 = new Locale(s1, s2, s3);
        a = s;
        b = s1;
        c = com.google.android.libraries.translate.e.f.b(s1);
        d = s2;
        e = s3;
    }

    public final String a()
    {
        Object obj;
        if (TextUtils.isEmpty(f))
        {
            obj = a;
        } else
        {
            obj = f;
        }
        obj = new StringBuilder(((String) (obj)));
        ((StringBuilder) (obj)).append(": ");
        ((StringBuilder) (obj)).append(b.getDisplayName());
        return ((StringBuilder) (obj)).toString();
    }
}
