// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class l
{

    static String a(String s)
    {
        s = new File(s);
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        boolean flag = s.canRead();
        if (!flag) goto _L2; else goto _L3
_L3:
        BufferedReader bufferedreader = new BufferedReader(new FileReader(s));
        s = bufferedreader.readLine();
        if (s == null) goto _L5; else goto _L4
_L4:
        s = s.trim();
        if (bufferedreader == null) goto _L7; else goto _L6
_L6:
        bufferedreader.close();
        return s;
_L5:
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L2
_L9:
        if (bufferedreader == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        bufferedreader.close();
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
_L7:
        return s;
_L2:
        return null;
        s;
        bufferedreader = null;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
