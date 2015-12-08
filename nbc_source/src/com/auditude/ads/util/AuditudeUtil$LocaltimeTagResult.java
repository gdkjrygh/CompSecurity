// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.auditude.ads.util:
//            AuditudeUtil

public static class 
    implements 
{

    public String getResult()
    {
        String s;
        Object obj;
        String s4;
        obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(new Date());
        s4 = Integer.toString(((Calendar) (obj)).get(1));
        s = Integer.toString(((Calendar) (obj)).get(2) + 1);
_L9:
        if (s.length() < 2) goto _L2; else goto _L1
_L1:
        String s1 = Integer.toString(((Calendar) (obj)).get(5));
_L10:
        if (s1.length() < 2) goto _L4; else goto _L3
_L3:
        String s2 = Integer.toString(((Calendar) (obj)).get(11));
_L11:
        if (s2.length() < 2) goto _L6; else goto _L5
_L5:
        String s3 = Integer.toString(((Calendar) (obj)).get(12));
_L12:
        if (s3.length() < 2) goto _L8; else goto _L7
_L7:
        obj = Integer.toString(((Calendar) (obj)).get(13));
_L13:
        if (((String) (obj)).length() >= 2)
        {
            return (new StringBuilder(String.valueOf(s4))).append(s).append(s1).append(s2).append(s3).append(((String) (obj))).toString();
        }
        break MISSING_BLOCK_LABEL_259;
_L2:
        s = (new StringBuilder(String.valueOf('0'))).append(s).toString();
          goto _L9
_L4:
        s1 = (new StringBuilder(String.valueOf('0'))).append(s1).toString();
          goto _L10
_L6:
        s2 = (new StringBuilder(String.valueOf('0'))).append(s2).toString();
          goto _L11
_L8:
        s3 = (new StringBuilder(String.valueOf('0'))).append(s3).toString();
          goto _L12
        obj = (new StringBuilder(String.valueOf('0'))).append(((String) (obj))).toString();
          goto _L13
    }

    public ()
    {
    }
}
