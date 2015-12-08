// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jY extends Enum
{

    private static final jY $VALUES[];
    public static final jY EXPIRED;

    private jY(String s)
    {
        super(s, 0);
    }

    public static jY valueOf(String s)
    {
        return (jY)Enum.valueOf(jY, s);
    }

    public static jY[] values()
    {
        return (jY[])$VALUES.clone();
    }

    static 
    {
        EXPIRED = new jY("EXPIRED");
        $VALUES = (new jY[] {
            EXPIRED
        });
    }
}
