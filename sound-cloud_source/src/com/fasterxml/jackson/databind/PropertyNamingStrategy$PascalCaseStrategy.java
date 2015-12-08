// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//            PropertyNamingStrategy

public static class egyBase extends egyBase
{

    public String translate(String s)
    {
        char c;
        if (s != null && s.length() != 0)
        {
            if (!Character.isUpperCase(c = s.charAt(0)))
            {
                s = new StringBuilder(s);
                s.setCharAt(0, Character.toUpperCase(c));
                return s.toString();
            }
        }
        return s;
    }

    public egyBase()
    {
    }
}
