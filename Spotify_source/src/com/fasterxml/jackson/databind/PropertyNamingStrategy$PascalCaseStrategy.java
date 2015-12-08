// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;


public class egyBase extends egyBase
{

    public String translate(String s)
    {
        if (s != null && s.length() != 0)
        {
            char c = s.charAt(0);
            char c1 = Character.toUpperCase(c);
            if (c != c1)
            {
                s = new StringBuilder(s);
                s.setCharAt(0, c1);
                return s.toString();
            }
        }
        return s;
    }

    public egyBase()
    {
    }
}
