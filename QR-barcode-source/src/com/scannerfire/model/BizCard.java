// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import java.io.PrintStream;

public class BizCard
{

    private static String A;
    private static String B;
    private static String C;
    private static String E;
    private static String N;
    private static String T;
    private static String X;

    public BizCard()
    {
    }

    public static String getA()
    {
        return A;
    }

    public static String getB()
    {
        return B;
    }

    public static BizCard getBizCardFromString(String s)
    {
        BizCard bizcard;
        int i;
        s = s.replace("BIZCARD:", "").split(";");
        bizcard = new BizCard();
        i = 0;
_L2:
        if (i >= s.length)
        {
            return bizcard;
        }
        System.out.println((new StringBuilder(" ")).append(s[i]).toString());
        if (!s[i].startsWith("N:"))
        {
            break; /* Loop/switch isn't completed */
        }
        N = s[i].substring(2);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (s[i].startsWith("X:"))
        {
            X = s[i].substring(2);
        } else
        if (s[i].startsWith("T:"))
        {
            T = s[i].substring(2);
        } else
        if (s[i].startsWith("C:"))
        {
            C = s[i].substring(2);
        } else
        if (s[i].startsWith("A:"))
        {
            A = s[i].substring(2);
        } else
        if (s[i].startsWith("B:"))
        {
            B = s[i].substring(2);
        } else
        if (s[i].startsWith("E:"))
        {
            E = s[i].substring(2);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static String getC()
    {
        return C;
    }

    public static String getE()
    {
        return E;
    }

    public static String getN()
    {
        return N;
    }

    public static String getString()
    {
        return (new StringBuilder(String.valueOf(N))).append(" ").append(X).toString();
    }

    public static String getT()
    {
        return T;
    }

    public static String getX()
    {
        return X;
    }

    public static void setA(String s)
    {
        A = s;
    }

    public static void setB(String s)
    {
        B = s;
    }

    public static void setC(String s)
    {
        C = s;
    }

    public static void setE(String s)
    {
        E = s;
    }

    public static void setN(String s)
    {
        N = s;
    }

    public static void setT(String s)
    {
        T = s;
    }

    public static void setX(String s)
    {
        X = s;
    }
}
