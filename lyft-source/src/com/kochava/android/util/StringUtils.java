// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringUtils
{

    public static String a(InputStream inputstream)
    {
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            String s = inputstream.readLine();
            if (s == null)
            {
                inputstream.close();
                return stringbuilder.toString();
            }
            stringbuilder.append((new StringBuilder(String.valueOf(s))).append("\n").toString());
        } while (true);
    }
}
