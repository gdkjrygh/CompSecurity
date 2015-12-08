// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.networkrecognizer;


public final class c
{

    private static final String a = String.format("%%s%%s?%s=%s&%s=%%s&%s=%s&%s=%s&%s=%s", new Object[] {
        "ime", "handwriting", "app", "dbg", "0", "cs", "1", "oe", "UTF-8"
    });

    public static String a(String s, String s1, String s2)
    {
        return String.format(a, new Object[] {
            s, s1, s2
        });
    }

}
