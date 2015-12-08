// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.volley.guava;

import java.util.regex.Pattern;

// Referenced classes of package com.google.android.volley.guava:
//            UrlRules

public static final class mBlock
    implements Comparable
{

    public static final mPrefix DEFAULT = new <init>();
    public final boolean mBlock;
    public final String mName;
    public final String mPrefix;
    public final String mRewrite;

    public final int compareTo(Object obj)
    {
        return ((mBlock)obj).mPrefix.compareTo(mPrefix);
    }


    private ormatException()
    {
        mName = "DEFAULT";
        mPrefix = "";
        mRewrite = null;
        mBlock = false;
    }

    public mBlock(String s, String s1)
        throws ormatException
    {
        mName = s;
        String as[] = UrlRules.access$000().split(s1);
        if (as.length == 0)
        {
            throw new ormatException("Empty rule");
        }
        mPrefix = as[0];
        s = null;
        boolean flag = false;
        for (int i = 1; i < as.length;)
        {
            String s2 = as[i].toLowerCase();
            if (s2.equals("rewrite") && i + 1 < as.length)
            {
                s = as[i + 1];
                i += 2;
            } else
            if (s2.equals("block"))
            {
                flag = true;
                i++;
            } else
            {
                throw new ormatException((new StringBuilder("Illegal rule: ")).append(s1).toString());
            }
        }

        mRewrite = s;
        mBlock = flag;
    }
}
