// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;


// Referenced classes of package com.fitbit.data.bl:
//            ChallengesUtils

public static final class sourceString extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    final String sourceString;

    public static sourceString valueOf(String s)
    {
        return (sourceString)Enum.valueOf(com/fitbit/data/bl/ChallengesUtils$RematchSource, s);
    }

    public static sourceString[] values()
    {
        return (sourceString[])c.clone();
    }

    static 
    {
        a = new <init>("SUMMARY_GRAPH", 0, "Summary Graph");
        b = new <init>("MESSAGE_VIEW", 1, "Message View");
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        sourceString = s1;
    }
}
