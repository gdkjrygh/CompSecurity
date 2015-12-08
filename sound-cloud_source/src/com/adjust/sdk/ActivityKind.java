// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;


public final class ActivityKind extends Enum
{

    private static final ActivityKind $VALUES[];
    public static final ActivityKind ATTRIBUTION;
    public static final ActivityKind CLICK;
    public static final ActivityKind EVENT;
    public static final ActivityKind REATTRIBUTION;
    public static final ActivityKind REVENUE;
    public static final ActivityKind SESSION;
    public static final ActivityKind UNKNOWN;

    private ActivityKind(String s, int i)
    {
        super(s, i);
    }

    public static ActivityKind fromString(String s)
    {
        if ("session".equals(s))
        {
            return SESSION;
        }
        if ("event".equals(s))
        {
            return EVENT;
        }
        if ("click".equals(s))
        {
            return CLICK;
        }
        if ("attribution".equals(s))
        {
            return ATTRIBUTION;
        } else
        {
            return UNKNOWN;
        }
    }

    public static ActivityKind valueOf(String s)
    {
        return (ActivityKind)Enum.valueOf(com/adjust/sdk/ActivityKind, s);
    }

    public static ActivityKind[] values()
    {
        return (ActivityKind[])$VALUES.clone();
    }

    public final String toString()
    {
        switch (_cls1..SwitchMap.com.adjust.sdk.ActivityKind[ordinal()])
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
        UNKNOWN = new ActivityKind("UNKNOWN", 0);
        SESSION = new ActivityKind("SESSION", 1);
        EVENT = new ActivityKind("EVENT", 2);
        CLICK = new ActivityKind("CLICK", 3);
        ATTRIBUTION = new ActivityKind("ATTRIBUTION", 4);
        REVENUE = new ActivityKind("REVENUE", 5);
        REATTRIBUTION = new ActivityKind("REATTRIBUTION", 6);
        $VALUES = (new ActivityKind[] {
            UNKNOWN, SESSION, EVENT, CLICK, ATTRIBUTION, REVENUE, REATTRIBUTION
        });
    }

    private class _cls1
    {

        static final int $SwitchMap$com$adjust$sdk$ActivityKind[];

        static 
        {
            $SwitchMap$com$adjust$sdk$ActivityKind = new int[ActivityKind.values().length];
            try
            {
                $SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.SESSION.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.EVENT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.CLICK.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.ATTRIBUTION.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
