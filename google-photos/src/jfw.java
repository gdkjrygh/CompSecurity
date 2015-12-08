// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfw extends Enum
{

    public static final jfw a;
    public static final jfw b;
    public static final jfw c;
    private static final jfw e[];
    private final float d;

    private jfw(String s, int i, float f)
    {
        super(s, i);
        d = f;
    }

    static float a(jfw jfw1)
    {
        return jfw1.d;
    }

    public static jfw valueOf(String s)
    {
        return (jfw)Enum.valueOf(jfw, s);
    }

    public static jfw[] values()
    {
        return (jfw[])e.clone();
    }

    static 
    {
        a = new jfw("FULL", 0, 1.0F);
        b = new jfw("DUCKING", 1, 0.1F);
        c = new jfw("MUTE", 2, 0.0F);
        e = (new jfw[] {
            a, b, c
        });
    }
}
