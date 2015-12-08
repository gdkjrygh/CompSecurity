// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.c;

import com.google.android.libraries.translate.languages.Language;

public final class a
{

    public final Language a;
    public final Language b;

    public a(Language language, Language language1)
    {
        a = language;
        b = language1;
    }

    public final String a()
    {
        String s = String.valueOf(a.getShortName());
        String s1 = String.valueOf(",");
        String s2 = String.valueOf(b.getShortName());
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(s2).toString();
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(" \273 ");
        String s2 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(s2).toString();
    }
}
