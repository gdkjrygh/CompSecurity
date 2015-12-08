// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.util;


// Referenced classes of package com.google.android.libraries.wordlens.util:
//            ScriptEncoding, i

public final class h
{

    public static String a(String s)
    {
        if ("ru".equals(s))
        {
            s = ScriptEncoding.CYRILLIC;
        } else
        if ("ko".equals(s))
        {
            s = ScriptEncoding.UTF16;
        } else
        if ("ja".equals(s))
        {
            s = ScriptEncoding.UTF16;
        } else
        {
            s = ScriptEncoding.LATIN_9;
        }
        switch (i.a[s.ordinal()])
        {
        default:
            s = String.valueOf(s);
            (new StringBuilder(String.valueOf(s).length() + 45)).append("Unknown ScriptEncoding: ").append(s).append(", defaulting to UTF-8");
            return "UTF-8";

        case 1: // '\001'
            return "ISO-8859-5";

        case 2: // '\002'
            return "UTF-16LE";

        case 3: // '\003'
            return "ISO-8859-15";
        }
    }
}
