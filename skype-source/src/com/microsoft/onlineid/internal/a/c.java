// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.a;

import android.text.TextUtils;

public final class c extends Enum
{

    public static final c a;
    private static final c c[];
    private final String b;

    private c(String s, String s1)
    {
        super(s, 0);
        b = s1;
    }

    public static String a()
    {
        return TextUtils.join(",", values());
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/microsoft/onlineid/internal/a/c, s);
    }

    public static c[] values()
    {
        return (c[])c.clone();
    }

    public final String toString()
    {
        return b;
    }

    static 
    {
        a = new c("QRCodeExperiment", "MSAClient_Experiment1");
        c = (new c[] {
            a
        });
    }
}
