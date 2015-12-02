// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.presence;


public final class g extends Enum
{

    private static final g $VALUES[];
    public static final g BLUE_DOT;
    public static final g GONE;
    public static final g GREEN_PHONE;
    public static final g NOT_SPECIFIED;
    public static final g STROKED_GREEN_DOT;
    public static final g WHITE_PHONE;
    public static final g YELLOW_DOT;
    private String mName;

    private g(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static g fromName(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        g g1 = NOT_SPECIFIED;
_L4:
        return g1;
_L2:
        g ag[] = values();
        int j = ag.length;
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
                g g2 = ag[i];
                g1 = g2;
                if (s.equalsIgnoreCase(g2.getName()))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return NOT_SPECIFIED;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/orca/presence/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    public String getName()
    {
        return mName;
    }

    static 
    {
        NOT_SPECIFIED = new g("NOT_SPECIFIED", 0, null);
        GONE = new g("GONE", 1, "gone");
        STROKED_GREEN_DOT = new g("STROKED_GREEN_DOT", 2, "stroked_green_dot");
        YELLOW_DOT = new g("YELLOW_DOT", 3, "yellow_dot");
        BLUE_DOT = new g("BLUE_DOT", 4, "blue_dot");
        GREEN_PHONE = new g("GREEN_PHONE", 5, "green_phone");
        WHITE_PHONE = new g("WHITE_PHONE", 6, "white_phone");
        $VALUES = (new g[] {
            NOT_SPECIFIED, GONE, STROKED_GREEN_DOT, YELLOW_DOT, BLUE_DOT, GREEN_PHONE, WHITE_PHONE
        });
    }
}
