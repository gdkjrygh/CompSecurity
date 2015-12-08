// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hs extends Enum
{

    private static final hs $VALUES[];
    public static final hs SPEED;
    public static final hs TIMESTAMP;
    public static final hs WEATHER;

    private hs(String s, int i)
    {
        super(s, i);
    }

    public static hs valueOf(String s)
    {
        return (hs)Enum.valueOf(hs, s);
    }

    public static hs[] values()
    {
        return (hs[])$VALUES.clone();
    }

    static 
    {
        TIMESTAMP = new hs("TIMESTAMP", 0);
        WEATHER = new hs("WEATHER", 1);
        SPEED = new hs("SPEED", 2);
        $VALUES = (new hs[] {
            TIMESTAMP, WEATHER, SPEED
        });
    }
}
