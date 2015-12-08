// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;


public final class Plan extends Enum
{

    private static final Plan $VALUES[];
    public static final Plan FREE;
    public static final Plan LITE;
    public static final Plan PRO;
    public static final Plan PRO_PLUS;
    public static final Plan SOLO;
    public static final Plan UNKNOWN;
    public final int id;
    public final String name;

    private Plan(String s, int i, int j, String s1)
    {
        super(s, i);
        id = j;
        name = s1;
    }

    public static Plan fromApi(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        Plan plan = UNKNOWN;
_L4:
        return plan;
_L2:
        Plan aplan[] = values();
        int j = aplan.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                Plan plan1 = aplan[i];
                plan = plan1;
                if (plan1.name.equalsIgnoreCase(s))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return UNKNOWN;
    }

    public static Plan valueOf(String s)
    {
        return (Plan)Enum.valueOf(com/soundcloud/android/api/legacy/model/Plan, s);
    }

    public static Plan[] values()
    {
        return (Plan[])$VALUES.clone();
    }

    static 
    {
        FREE = new Plan("FREE", 0, 0, "free");
        SOLO = new Plan("SOLO", 1, 1, "solo");
        PRO = new Plan("PRO", 2, 2, "pro");
        PRO_PLUS = new Plan("PRO_PLUS", 3, 4, "pro plus");
        LITE = new Plan("LITE", 4, 8, "lite");
        UNKNOWN = new Plan("UNKNOWN", 5, -1, "unknown");
        $VALUES = (new Plan[] {
            FREE, SOLO, PRO, PRO_PLUS, LITE, UNKNOWN
        });
    }
}
