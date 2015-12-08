// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class noa extends Enum
{

    public static final noa a;
    public static final noa b;
    public static final noa c;
    private static final noa d[];

    private noa(String s, int i)
    {
        super(s, i);
    }

    public static noa valueOf(String s)
    {
        return (noa)Enum.valueOf(noa, s);
    }

    public static noa[] values()
    {
        return (noa[])d.clone();
    }

    static 
    {
        a = new noa("PHOTO", 0);
        b = new noa("VIDEO", 1);
        c = new noa("AUDIO", 2);
        d = (new noa[] {
            a, b, c
        });
    }
}
