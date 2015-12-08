// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    int d;

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(bK$a, s);
    }

    public static lang.String[] values()
    {
        return (s[])e.clone();
    }

    static 
    {
        a = new <init>("MIPMAP_NONE", 0, 0);
        b = new <init>("MIPMAP_FULL", 1, 1);
        c = new <init>("MIPMAP_ON_SYNC_TO_TEXTURE", 2, 2);
        e = (new e[] {
            a, b, c
        });
    }

    private >(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }
}
