// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import java.io.PrintStream;

public class MatMsg
{

    private static String BODY;
    private static String SUB;
    private static String TO;

    public MatMsg()
    {
    }

    public static String getBODY()
    {
        return BODY;
    }

    public static MatMsg getMatMsgFromString(String s)
    {
        MatMsg matmsg;
        int i;
        s = s.replace("MATMSG:", "").split("\n");
        matmsg = new MatMsg();
        i = 0;
_L2:
        if (i >= s.length)
        {
            return matmsg;
        }
        System.out.println((new StringBuilder(" ")).append(s[i]).toString());
        if (!s[i].startsWith("TO:"))
        {
            break; /* Loop/switch isn't completed */
        }
        TO = s[i].substring(3);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (s[i].startsWith("SUB:"))
        {
            SUB = s[i].substring(4);
        } else
        if (s[i].startsWith("BODY:"))
        {
            BODY = s[i].substring(5);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static String getSUB()
    {
        return SUB;
    }

    public static String getString()
    {
        return TO;
    }

    public static String getTO()
    {
        return TO;
    }

    public static void setBODY(String s)
    {
        BODY = s;
    }

    public static void setSUB(String s)
    {
        SUB = s;
    }

    public static void setTO(String s)
    {
        TO = s;
    }
}
