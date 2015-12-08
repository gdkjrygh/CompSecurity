// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import com.dominos.android.sdk.common.StringHelper;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            Ts

class <init>
{

    private Matcher matcher;

    public int extractInt(int i)
    {
        String s = matcher.group(i);
        if (s == null)
        {
            return 0;
        } else
        {
            return Integer.parseInt(s);
        }
    }

    public int extractMillis()
    {
        String s1 = matcher.group(7);
        String s = s1;
        if (StringHelper.isEmpty(s1))
        {
            return 0;
        }
        for (; s.length() < 3; s = (new StringBuilder()).append(s).append("0").toString()) { }
        return Integer.parseInt(s);
    }

    public Ts parse(String s)
    {
        matcher = Ts.access$000().matcher(s);
        if (!matcher.find())
        {
            throw new RuntimeException("Invalid date format");
        } else
        {
            return new Ts(extractInt(1), extractInt(2), extractInt(3), extractInt(4), extractInt(5), extractInt(6), extractMillis());
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
