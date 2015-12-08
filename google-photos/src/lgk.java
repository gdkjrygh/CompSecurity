// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lgk extends Enum
{

    public static final lgk a;
    public static final lgk b;
    public static final lgk c;
    private static final lgk d[];

    private lgk(String s, int i)
    {
        super(s, i);
    }

    public static lgk valueOf(String s)
    {
        return (lgk)Enum.valueOf(lgk, s);
    }

    public static lgk[] values()
    {
        return (lgk[])d.clone();
    }

    static 
    {
        a = new lgk("NOT_AVAILABLE", 0);
        b = new lgk("IO_ERROR", 1);
        c = new lgk("SERVER_ERROR", 2);
        d = (new lgk[] {
            a, b, c
        });
    }
}
