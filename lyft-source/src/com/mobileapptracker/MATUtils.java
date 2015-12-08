// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MATUtils
{

    public static String a(Context context, String s)
    {
        com/mobileapptracker/MATUtils;
        JVM INSTR monitorenter ;
        context = context.getSharedPreferences("com.mobileapptracking", 0).getString(s, "");
        com/mobileapptracker/MATUtils;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static String a(InputStream inputstream)
    {
        if (inputstream != null)
        {
            inputstream = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
            StringBuilder stringbuilder = new StringBuilder();
            do
            {
                String s = inputstream.readLine();
                if (s != null)
                {
                    stringbuilder.append(s).append("\n");
                } else
                {
                    inputstream.close();
                    return stringbuilder.toString();
                }
            } while (true);
        } else
        {
            return "";
        }
    }

    public static String a(byte abyte0[])
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        int j = abyte0.length;
        String s = "";
        int i = 0;
        do
        {
            s1 = s;
            if (i >= j)
            {
                continue;
            }
            if ((abyte0[i] & 0xff) < 16)
            {
                s = (new StringBuilder()).append(s).append("0").append(Integer.toHexString(abyte0[i] & 0xff)).toString();
            } else
            {
                s = (new StringBuilder()).append(s).append(Integer.toHexString(abyte0[i] & 0xff)).toString();
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Context context, String s, String s1)
    {
        com/mobileapptracker/MATUtils;
        JVM INSTR monitorenter ;
        context.getSharedPreferences("com.mobileapptracking", 0).edit().putString(s, s1).commit();
        com/mobileapptracker/MATUtils;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }
}
