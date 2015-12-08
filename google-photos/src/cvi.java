// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cvi extends Enum
{

    public static final cvi a;
    public static final cvi b;
    public static final cvi c;
    private static final cvi d[];

    private cvi(String s, int i)
    {
        super(s, i);
    }

    public static cvi valueOf(String s)
    {
        return (cvi)Enum.valueOf(cvi, s);
    }

    public static cvi[] values()
    {
        return (cvi[])d.clone();
    }

    static 
    {
        a = new cvi("SINGLE", 0);
        b = new cvi("SEEKING", 1);
        c = new cvi("TRANSITION", 2);
        d = (new cvi[] {
            a, b, c
        });
    }
}
