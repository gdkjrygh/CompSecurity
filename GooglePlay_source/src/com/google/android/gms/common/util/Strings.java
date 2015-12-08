// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.CharMatcher;
import java.util.regex.Pattern;

public final class Strings
{

    private static final Pattern FORMAT_PATTERN = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean isEmptyOrWhitespace(String s)
    {
        return s == null || CharMatcher.WHITESPACE.matchesAllOf(s);
    }

}
