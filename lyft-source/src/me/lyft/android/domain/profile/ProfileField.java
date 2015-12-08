// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.profile;

import me.lyft.android.common.Strings;

public class ProfileField
{

    final String defaultValue;
    final String hint;
    final String prefix;

    public ProfileField(String s, String s1, String s2)
    {
        defaultValue = Strings.nullToEmpty(s);
        hint = Strings.nullToEmpty(s1);
        prefix = Strings.nullToEmpty(s2);
    }

    public String getDefaultValue()
    {
        return defaultValue;
    }

    public String getHint()
    {
        return hint;
    }

    public String getPrefix()
    {
        return prefix;
    }
}
