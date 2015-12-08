// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oru extends Enum
{

    public static final oru a;
    public static final oru b;
    private static oru c;
    private static oru d;
    private static final oru e[];

    private oru(String s, int i)
    {
        super(s, i);
    }

    public static oru valueOf(String s)
    {
        return (oru)Enum.valueOf(oru, s);
    }

    public static oru[] values()
    {
        return (oru[])e.clone();
    }

    static 
    {
        a = new oru("TrimStart", 0);
        b = new oru("TrimEnd", 1);
        c = new oru("AudioSwapOffset", 2);
        d = new oru("AudioSwapVolume", 3);
        e = (new oru[] {
            a, b, c, d
        });
    }
}
