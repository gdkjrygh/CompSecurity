// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import java.io.PrintStream;

public class VCard
{

    String A;
    String B;
    String C;
    String E;
    String N;
    String T;
    String X;

    public VCard()
    {
    }

    public static VCard getBizCardFromString(String s)
    {
        VCard vcard;
        int i;
        s = s.replace("BIZCARD:", "").split(";");
        vcard = new VCard();
        i = 0;
_L2:
        if (i >= s.length)
        {
            return vcard;
        }
        System.out.println((new StringBuilder(" ")).append(s[i]).toString());
        if (!s[i].startsWith("N:"))
        {
            break; /* Loop/switch isn't completed */
        }
        vcard.N = s[i].substring(2);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (s[i].startsWith("X:"))
        {
            vcard.X = s[i].substring(2);
        } else
        if (s[i].startsWith("T:"))
        {
            vcard.T = s[i].substring(2);
        } else
        if (s[i].startsWith("C:"))
        {
            vcard.C = s[i].substring(2);
        } else
        if (s[i].startsWith("A:"))
        {
            vcard.A = s[i].substring(2);
        } else
        if (s[i].startsWith("B:"))
        {
            vcard.B = s[i].substring(2);
        } else
        if (s[i].startsWith("E:"))
        {
            vcard.E = s[i].substring(2);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }
}
