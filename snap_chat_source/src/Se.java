// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Se extends Enum
{

    private static final Se $VALUES[];
    public static final Se SNAP_REPLAY;
    public static final Se UNRECOGNIZED_VALUE;
    private final String value;

    private Se(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static Se valueOf(String s)
    {
        return (Se)Enum.valueOf(Se, s);
    }

    public static Se[] values()
    {
        return (Se[])$VALUES.clone();
    }

    public final String toString()
    {
        return value;
    }

    static 
    {
        SNAP_REPLAY = new Se("SNAP_REPLAY", 0, "SNAP_REPLAY");
        UNRECOGNIZED_VALUE = new Se("UNRECOGNIZED_VALUE", 1, "UNRECOGNIZED_VALUE");
        $VALUES = (new Se[] {
            SNAP_REPLAY, UNRECOGNIZED_VALUE
        });
    }
}
