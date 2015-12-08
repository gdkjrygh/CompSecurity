// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nnb extends Enum
{

    public static final nnb a;
    public static final nnb b;
    public static final nnb c;
    public static final nnb d;
    private static final nnb e[];

    private nnb(String s, int i)
    {
        super(s, i);
    }

    public static nnb valueOf(String s)
    {
        return (nnb)Enum.valueOf(nnb, s);
    }

    public static nnb[] values()
    {
        return (nnb[])e.clone();
    }

    static 
    {
        a = new nnb("STANDARD", 0);
        b = new nnb("FULL", 1);
        c = new nnb("USE_MANUAL_UPLOAD_SERVER_SETTING", 2);
        d = new nnb("NO_POLICY", 3);
        e = (new nnb[] {
            a, b, c, d
        });
    }
}
