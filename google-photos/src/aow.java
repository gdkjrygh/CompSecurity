// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aow extends Enum
{

    public static final aow a;
    public static final aow b;
    public static final aow c;
    private static final aow d[];

    private aow(String s, int i)
    {
        super(s, i);
    }

    public static aow valueOf(String s)
    {
        return (aow)Enum.valueOf(aow, s);
    }

    public static aow[] values()
    {
        return (aow[])d.clone();
    }

    static 
    {
        a = new aow("INITIALIZE", 0);
        b = new aow("SWITCH_TO_SOURCE_SERVICE", 1);
        c = new aow("DECODE_DATA", 2);
        d = (new aow[] {
            a, b, c
        });
    }
}
