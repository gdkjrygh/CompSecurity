// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class ev extends Enum
{

    public static final ev a;
    public static final ev b;
    public static final ev c;
    private static final ev d[];

    private ev(String s, int i)
    {
        super(s, i);
    }

    public static ev valueOf(String s)
    {
        return (ev)Enum.valueOf(b/a/ev, s);
    }

    public static ev[] values()
    {
        return (ev[])d.clone();
    }

    static 
    {
        a = new ev("UNINITIALIZED", 0);
        b = new ev("ON", 1);
        c = new ev("OFF", 2);
        d = (new ev[] {
            a, b, c
        });
    }
}
