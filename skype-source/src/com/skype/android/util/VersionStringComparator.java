// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.logging.Logger;

public class VersionStringComparator
    implements Serializable, Comparator
{

    private static final Logger a = Logger.getLogger("VersionStringComparator");

    public VersionStringComparator()
    {
    }

    public static int a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        int k;
        if (TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            return 1;
        }
        if (!TextUtils.isEmpty(s) && TextUtils.isEmpty(s1))
        {
            return -1;
        }
        s = a(s);
        s1 = a(s1);
        s = s.split("[\\.\\-]");
        s1 = s1.split("[\\.\\-]");
        k = 0;
_L10:
        int i;
        if (k >= 4)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k == 2)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        i = -1;
        if (k >= s.length) goto _L4; else goto _L3
_L3:
        int j = Integer.parseInt(s[k]);
        i = j;
_L7:
        j = -1;
        if (k >= s1.length) goto _L6; else goto _L5
_L5:
        int l = Integer.parseInt(s1[k]);
        j = l;
_L8:
        if (i > j)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_208;
_L4:
        i = 0;
          goto _L7
        NumberFormatException numberformatexception;
        numberformatexception;
        a.warning((new StringBuilder("Can't parse lhsVersion: ")).append(numberformatexception.getMessage()).toString());
          goto _L7
_L6:
        j = 0;
          goto _L8
        numberformatexception;
        a.warning((new StringBuilder("Can't parse rhsVersion: ")).append(numberformatexception.getMessage()).toString());
          goto _L8
        if (i < j)
        {
            return 1;
        }
        k++;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L1; else goto _L11
_L11:
    }

    private static String a(String s)
    {
        String s1 = s;
        if (s.indexOf("/") > 0)
        {
            s = s.substring(s.indexOf("/") + 1);
            s1 = s;
            if (s.indexOf("/") > 0)
            {
                s1 = s.substring(0, s.indexOf("/"));
            }
        }
        return s1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((String)obj, (String)obj1);
    }

}
