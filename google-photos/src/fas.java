// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fas extends Enum
{

    public static final fas a;
    public static final fas b;
    public static final fas c;
    private static final fas e[];
    final int d;

    private fas(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static fas valueOf(String s)
    {
        return (fas)Enum.valueOf(fas, s);
    }

    public static fas[] values()
    {
        return (fas[])e.clone();
    }

    static 
    {
        a = new fas("WRITE_SUCCEEDED", 0, 1);
        b = new fas("WRITE_FAILED", 1, 2);
        c = new fas("UNKNOWN", 2, 3);
        e = (new fas[] {
            a, b, c
        });
    }
}
