// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class guc extends Enum
{

    public static final guc a;
    public static final guc b;
    public static final guc c;
    private static final guc d[];

    private guc(String s, int i)
    {
        super(s, i);
    }

    public static guc valueOf(String s)
    {
        return (guc)Enum.valueOf(guc, s);
    }

    public static guc[] values()
    {
        return (guc[])d.clone();
    }

    static 
    {
        a = new guc("CROP", 0);
        b = new guc("EDIT", 1);
        c = new guc("TRIM", 2);
        d = (new guc[] {
            a, b, c
        });
    }
}
