// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;


class i
{

    private final String a;
    private final String b;
    private final String c;

    public i(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder(a);
        if (c != null)
        {
            stringbuilder.append(", BdeFile=");
            stringbuilder.append(c);
        }
        if (b != null)
        {
            stringbuilder.append(", BdeCause=");
            stringbuilder.append(b);
        }
        return stringbuilder.toString();
    }
}
