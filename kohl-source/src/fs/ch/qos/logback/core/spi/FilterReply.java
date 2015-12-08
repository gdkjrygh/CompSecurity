// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.spi;


public final class FilterReply extends Enum
{

    private static final FilterReply $VALUES[];
    public static final FilterReply ACCEPT;
    public static final FilterReply DENY;
    public static final FilterReply NEUTRAL;

    private FilterReply(String s, int i)
    {
        super(s, i);
    }

    public static FilterReply valueOf(String s)
    {
        return (FilterReply)Enum.valueOf(fs/ch/qos/logback/core/spi/FilterReply, s);
    }

    public static FilterReply[] values()
    {
        return (FilterReply[])$VALUES.clone();
    }

    static 
    {
        DENY = new FilterReply("DENY", 0);
        NEUTRAL = new FilterReply("NEUTRAL", 1);
        ACCEPT = new FilterReply("ACCEPT", 2);
        $VALUES = (new FilterReply[] {
            DENY, NEUTRAL, ACCEPT
        });
    }
}
