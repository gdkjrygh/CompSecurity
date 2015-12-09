// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


final class as extends Enum
{

    public static final as a;
    public static final as b;
    public static final as c;
    public static final as d;
    public static final as e;
    private static final as g[];
    private final String f;

    private as(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static as valueOf(String s)
    {
        return (as)Enum.valueOf(com/nuance/b/b/as, s);
    }

    public static as[] values()
    {
        return (as[])g.clone();
    }

    public final String a()
    {
        return f;
    }

    static 
    {
        a = new as("TEXT_INTERPRETATION", 0, "Text");
        b = new as("SPEECH_INTERPRETATION", 1, "ASR");
        c = new as("SET_AGENT_VALUE", 2, "SetAgentValues.Execute");
        d = new as("INITIAL_STATE", 3, "Initial State");
        e = new as("DICTATION", 4, "Dictation");
        g = (new as[] {
            a, b, c, d, e
        });
    }
}
