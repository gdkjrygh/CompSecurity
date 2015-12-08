// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.lang.reflect.Constructor;

public final class l
{

    public static Constructor a(String s, String as[])
    {
        int j;
        s = Class.forName(s).getDeclaredConstructors();
        j = 0;
_L7:
        if (j >= s.length) goto _L2; else goto _L1
_L1:
        Class aclass[] = s[j].getParameterTypes();
        if (aclass.length == as.length) goto _L4; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i != 0)
        {
            return s[j];
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0;
        do
        {
            if (i >= aclass.length)
            {
                break;
            }
            if (!aclass[i].getName().equals(as[i]))
            {
                i = 0;
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        i = 1;
        if (true) goto _L6; else goto _L5
_L5:
        j++;
          goto _L7
_L2:
        return null;
    }
}
