// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kh
{

    private final Pattern a = Pattern.compile(".*?(%\\{\\w+\\}).*?");

    public kh()
    {
    }

    public String a(String s)
    {
        s = a.matcher(s);
        if (s.matches())
        {
            return s.group(1);
        } else
        {
            return null;
        }
    }

    protected boolean a(String s, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return false;
        } else
        {
            return s1.equals((new StringBuilder("%{")).append(s).append("}").toString());
        }
    }
}
