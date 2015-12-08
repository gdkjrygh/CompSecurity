// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cud extends Enum
{

    public static final cud a;
    public static final cud b;
    public static final cud c;
    public static final cud d;
    private static final cud e[];

    private cud(String s, int i)
    {
        super(s, i);
    }

    public static cud valueOf(String s)
    {
        return (cud)Enum.valueOf(cud, s);
    }

    public static cud[] values()
    {
        return (cud[])e.clone();
    }

    static 
    {
        a = new cud("PLAYING", 0);
        b = new cud("PAUSED", 1);
        c = new cud("STOPPED", 2);
        d = new cud("SINGLE_FRAME", 3);
        e = (new cud[] {
            a, b, c, d
        });
    }
}
