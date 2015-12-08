// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class coj extends Enum
{

    public static final coj a;
    public static final coj b;
    private static final coj c[];

    private coj(String s, int i)
    {
        super(s, i);
    }

    public static coj valueOf(String s)
    {
        return (coj)Enum.valueOf(coj, s);
    }

    public static coj[] values()
    {
        return (coj[])c.clone();
    }

    static 
    {
        a = new coj("VIDEO", 0);
        b = new coj("PHOTO", 1);
        c = (new coj[] {
            a, b
        });
    }
}
