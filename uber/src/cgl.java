// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cgl extends Enum
{

    public static final cgl a;
    public static final cgl b;
    public static final cgl c;
    private static final cgl e[];
    final int d;

    private cgl(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static cgl valueOf(String s)
    {
        return (cgl)Enum.valueOf(cgl, s);
    }

    public static cgl[] values()
    {
        return (cgl[])e.clone();
    }

    static 
    {
        a = new cgl("MEMORY", 0, 0xff00ff00);
        b = new cgl("DISK", 1, 0xff0000ff);
        c = new cgl("NETWORK", 2, 0xffff0000);
        e = (new cgl[] {
            a, b, c
        });
    }
}
