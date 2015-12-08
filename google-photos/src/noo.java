// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class noo extends Enum
{

    public static final noo a;
    public static final noo b;
    public static final noo c;
    private static final noo d[];

    private noo(String s, int i)
    {
        super(s, i);
    }

    public static noo valueOf(String s)
    {
        return (noo)Enum.valueOf(noo, s);
    }

    public static noo[] values()
    {
        return (noo[])d.clone();
    }

    static 
    {
        a = new noo("OK", 0);
        b = new noo("NO_STORYBOARD", 1);
        c = new noo("HTTP_FAILURE", 2);
        d = (new noo[] {
            a, b, c
        });
    }
}
