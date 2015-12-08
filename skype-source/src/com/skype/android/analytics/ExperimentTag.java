// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


public final class ExperimentTag extends Enum
{

    public static final ExperimentTag a;
    public static final ExperimentTag b;
    public static final ExperimentTag c;
    public static final ExperimentTag d;
    public static final ExperimentTag e;
    public static final ExperimentTag f;
    public static final ExperimentTag g;
    public static final ExperimentTag h;
    public static final ExperimentTag i;
    public static final ExperimentTag j;
    private static final ExperimentTag k[];

    private ExperimentTag(String s, int l)
    {
        super(s, l);
    }

    public static ExperimentTag valueOf(String s)
    {
        return (ExperimentTag)Enum.valueOf(com/skype/android/analytics/ExperimentTag, s);
    }

    public static ExperimentTag[] values()
    {
        return (ExperimentTag[])k.clone();
    }

    static 
    {
        a = new ExperimentTag("Default_User", 0);
        b = new ExperimentTag("Control_Success", 1);
        c = new ExperimentTag("Control_User", 2);
        d = new ExperimentTag("TestA_Success", 3);
        e = new ExperimentTag("TestA_User", 4);
        f = new ExperimentTag("TestB_Success", 5);
        g = new ExperimentTag("TestB_User", 6);
        h = new ExperimentTag("TestC_User", 7);
        i = new ExperimentTag("TestD_User", 8);
        j = new ExperimentTag("TestE_User", 9);
        k = (new ExperimentTag[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
