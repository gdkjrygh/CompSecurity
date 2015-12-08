// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


public class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$Type, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    static 
    {
        a = new InAppNotification.Type("UNKNOWN") {

            public final String toString()
            {
                return "*unknown_type*";
            }

        };
        b = new InAppNotification.Type("MINI") {

            public final String toString()
            {
                return "mini";
            }

        };
        c = new InAppNotification.Type("TAKEOVER") {

            public final String toString()
            {
                return "takeover";
            }

        };
        d = (new d[] {
            a, b, c
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
