// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gav extends Enum
{

    public static final gav a;
    public static final gav b;
    private static gav c;
    private static final gav d[];

    private gav(String s, int i)
    {
        super(s, i);
    }

    public static gav valueOf(String s)
    {
        return (gav)Enum.valueOf(gav, s);
    }

    public static gav[] values()
    {
        return (gav[])d.clone();
    }

    static 
    {
        a = new gav("LOCAL", 0);
        b = new gav("REMOTE", 1);
        c = new gav("TRASH", 2);
        d = (new gav[] {
            a, b, c
        });
    }
}
