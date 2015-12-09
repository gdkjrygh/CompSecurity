// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;


public final class ActivityKind extends Enum
{

    public static final ActivityKind a;
    public static final ActivityKind b;
    public static final ActivityKind c;
    public static final ActivityKind d;
    public static final ActivityKind e;
    private static ActivityKind f;
    private static ActivityKind g;
    private static final ActivityKind h[];

    private ActivityKind(String s, int i)
    {
        super(s, i);
    }

    public static ActivityKind valueOf(String s)
    {
        return (ActivityKind)Enum.valueOf(com/adjust/sdk/ActivityKind, s);
    }

    public static ActivityKind[] values()
    {
        return (ActivityKind[])h.clone();
    }

    public final String toString()
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ActivityKind.values().length];
                try
                {
                    a[ActivityKind.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ActivityKind.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ActivityKind.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ActivityKind.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[ordinal()])
        {
        default:
            return "unknown";

        case 1: // '\001'
            return "session";

        case 2: // '\002'
            return "event";

        case 3: // '\003'
            return "click";

        case 4: // '\004'
            return "attribution";
        }
    }

    static 
    {
        a = new ActivityKind("UNKNOWN", 0);
        b = new ActivityKind("SESSION", 1);
        c = new ActivityKind("EVENT", 2);
        d = new ActivityKind("CLICK", 3);
        e = new ActivityKind("ATTRIBUTION", 4);
        f = new ActivityKind("REVENUE", 5);
        g = new ActivityKind("REATTRIBUTION", 6);
        h = (new ActivityKind[] {
            a, b, c, d, e, f, g
        });
    }
}
