// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.b;


public class a
{

    public a()
    {
    }

    public static String a(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        String as[];
        as = s.split("\\.");
        s1 = s;
        if (as.length != 4) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder(16);
        i = 0;
_L8:
        if (i >= 4) goto _L6; else goto _L5
_L5:
        s1 = s;
        if (as[i].length() > 3) goto _L4; else goto _L7
_L7:
        stringbuilder.append(Integer.parseInt(as[i]));
        if (i < 3)
        {
            stringbuilder.append('.');
        }
        i++;
          goto _L8
_L6:
        return stringbuilder.toString();
        NumberFormatException numberformatexception;
        numberformatexception;
        return s;
    }
}
